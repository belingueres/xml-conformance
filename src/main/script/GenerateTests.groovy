class GenerateTests {

  final static JavaPackage = "org.codehaus.plexus.util.xml.pull"
  final static JavaPackageDir = JavaPackage.replace('.', '/')

  final static BaseResourceTestDir = "xmlconf/"
  final static BaseDir = "src/test/resources/${BaseResourceTestDir}"
  final static BaseDirJava = "src/test/java/"
  
  static void main(String[] args) {
    def generator = new GenerateTests()
    generator.process()
  }
  
  public void process() {
    def dir = new File(BaseDirJava, JavaPackageDir)
    dir.deleteDir()
  
    def parser = new XmlSlurper()
    parser.setFeature("http://apache.org/xml/features/disallow-doctype-decl", false)
    parser.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false)
    
    def testsuite = parser.parse(BaseDir + "xmlconf.xml")

    processTESTCASESElements(testsuite.TESTCASES, "", "")
  }
  
  public void processTESTCASESElements(Object testcasesElements, String parentTestcasesClassName, String parentBasePath) {
    testcasesElements.each { testcases ->
      processTESTCASES(testcases, parentTestcasesClassName, parentBasePath)
    }
  }
  
  public void processTESTCASES(Object testcases, String parentTestcasesClassName, String parentBasePath) {
    String profile = testcases.'@PROFILE'
    String basePath = parentBasePath + testcases.'@xml:base'
    String testClassName = getClassName(profile, basePath);
    testClassName = parentTestcasesClassName.isEmpty() ? testClassName : parentTestcasesClassName + '_' + testClassName

    println testClassName +" => " + testcases.TEST.size()

    if (testcases.TESTCASES.size() > 0) {
      processTESTCASESElements(testcases.TESTCASES, testClassName, basePath)
    }
    
    if (testcases.TEST.size() > 0) {
      generateTestClass(testcases, testClassName, basePath)
    }
  }
  
  public void generateTestClass(Object xmlTESTCASES, String testClassName, String basePath) {
    String strClass = 
"""package ${JavaPackage};

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class that execute a particular set of tests associated to a TESCASES tag from the XML W3C Conformance Tests.
 * TESCASES PROFILE: <pre>${xmlTESTCASES.'@PROFILE'}</pre>
 * XML test files base folder: <pre>${BaseResourceTestDir}${basePath}</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class ${testClassName}
{

    final static File testResourcesDir = new File("src/test/resources/", "${BaseResourceTestDir}${basePath}");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    """

    String testMethods = "";

    xmlTESTCASES.TEST.each { test ->
      if (test.'@OUTPUT'.isEmpty()) {
        // do not generate 'Output Tests'
      
        String testType = test.'@TYPE'
        switch (testType) {
        case 'not-wf':
        case 'invalid':
          testMethods += generateTestClassNotWellFormed(test, basePath)
          break;
        case 'valid':
          testMethods += generateTestClassValid(test, basePath)
          break;
        }
      }
    }
    
    if (testMethods.isEmpty()) {
      // no generated class
      return;
    }
    
    strClass += testMethods + """
    
}"""
    
    saveClassFile(testClassName, strClass)
  }
  
  
  public void saveClassFile(String testClassName, String strClass) {
    def dir = new File(BaseDirJava, JavaPackageDir)
    dir.mkdirs()
    def file = new File(dir, testClassName + '.java')
    file.write(strClass)
  }
  
  
  public String generateTestClassNotWellFormed(Object xmlTest, String basePath) {
    String testID = xmlTest.@ID
    testID = testID.replace('-', '_').replace('.', '')
    String testURI = xmlTest.@URI
    String testComment = xmlTest.text().replace('\n', ' ').replace('\\"','\"').replace('"','\\"').replace('\\>', '\\\\>').trim()
    String testMethod = generateJavadoc(xmlTest) +
"""
    @Test
    public void test${testID}()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "${testURI}" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("${testComment}");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }

"""
    return testMethod
  }

  public String generateTestClassValid(Object xmlTest, String basePath) {
    String testID = xmlTest.@ID
    testID = testID.replace('-', '_').replace('.', '')
    String testURI = xmlTest.@URI
    String testComment = xmlTest.text().replace('\n', ' ').replace('\\"','\"').replace('"','\\"').replace('\\>', '\\\\>').trim()
    String testMethod = generateJavadoc(xmlTest) +
"""
    @Test
    public void test${testID}()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "${testURI}" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("${testComment}", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("${testComment}");
        }
  }

"""
    return testMethod
  }
  
  public String generateJavadoc(Object xmlTest) {
    String testID = xmlTest.@ID
    String testURI = xmlTest.@URI
    String testComment = xmlTest.text().replace('\n', ' ').replace('\\>', '\\\\>').replace('>', '&#62;').replace('<', '&#60;').replace('&', '&#38;').trim()
    String testVersion = xmlTest.@VERSION
    testVersion = testVersion.isEmpty() ? testVersion : " <pre>${testVersion}</pre>"
    String javadoc =
"""
    /**
     * Test ID: <pre>${testID}</pre>
     * Test URI: <pre>${testURI}</pre>
     * Comment: <pre>${testComment}</pre>
     * Sections: <pre>${xmlTest.@SECTIONS}</pre>
     * Version:${testVersion}
     *
     * @throws IOException if there is an I/O error
     */"""
   return javadoc
  }

  public String getClassName(String profile, String basePath) {
    if (profile.isEmpty()) {
      String str = basePath.replace(' ', '').replace('.', '').replace(',', '').replace('\'', '').replace('/', '_').replace('-', '_')
      return str + 'Test'
    }
    return profile.replace(' ', '').replace('.', '').replace(',', '').replace('\'', '').replace('/', '_').replace('-', '_') + '_Test'
  }
  
}
