package org.codehaus.plexus.util.xml.pull;

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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 2</pre>
 * XML test files base folder: <pre>xmlconf/ibm/xml-1.1/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML11Tests_Test_IBMValidConformanceTestsforXML11CROctober152002_Test_IBMXMLConformanceTestSuite_Production2_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-1-1-valid-P02-ibm02v01.xml</pre>
     * Test URI: <pre>valid/P02/ibm02v01.xml</pre>
     * Comment: <pre>This test case covers legal character ranges plus discrete legal characters          for production 02 of the XML1.1 sepcification.</pre>
     * Sections: <pre>2.2</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_valid_P02_ibm02v01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "valid/P02/ibm02v01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("This test case covers legal character ranges plus discrete legal characters          for production 02 of the XML1.1 sepcification.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("This test case covers legal character ranges plus discrete legal characters          for production 02 of the XML1.1 sepcification.");
        }
  }


    /**
     * Test ID: <pre>ibm-1-1-valid-P02-ibm02v02.xml</pre>
     * Test URI: <pre>valid/P02/ibm02v02.xml</pre>
     * Comment: <pre>This test case covers control characters x1 to x1F and x7F to x9F          which should only appear as character references.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_valid_P02_ibm02v02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "valid/P02/ibm02v02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("This test case covers control characters x1 to x1F and x7F to x9F          which should only appear as character references.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("This test case covers control characters x1 to x1F and x7F to x9F          which should only appear as character references.");
        }
  }


    /**
     * Test ID: <pre>ibm-1-1-valid-P02-ibm02v03.xml</pre>
     * Test URI: <pre>valid/P02/ibm02v03.xml</pre>
     * Comment: <pre>This test case covers control characters x1 to x1F and x7F to x9F          which appear as character references as an entity's replacement text.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_valid_P02_ibm02v03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "valid/P02/ibm02v03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("This test case covers control characters x1 to x1F and x7F to x9F          which appear as character references as an entity's replacement text.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("This test case covers control characters x1 to x1F and x7F to x9F          which appear as character references as an entity's replacement text.");
        }
  }


    /**
     * Test ID: <pre>ibm-1-1-valid-P02-ibm02v04.xml</pre>
     * Test URI: <pre>valid/P02/ibm02v04.xml</pre>
     * Comment: <pre>This test case contains embeded whitespace characters                   some form the range 1 - 1F.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_valid_P02_ibm02v04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "valid/P02/ibm02v04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("This test case contains embeded whitespace characters                   some form the range 1 - 1F.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("This test case contains embeded whitespace characters                   some form the range 1 - 1F.");
        }
  }


    /**
     * Test ID: <pre>ibm-1-1-valid-P02-ibm02v05.xml</pre>
     * Test URI: <pre>valid/P02/ibm02v05.xml</pre>
     * Comment: <pre>This test case contains valid char references that match the char production.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_valid_P02_ibm02v05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "valid/P02/ibm02v05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("This test case contains valid char references that match the char production.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("This test case contains valid char references that match the char production.");
        }
  }


    /**
     * Test ID: <pre>ibm-1-1-valid-P02-ibm02v06.xml</pre>
     * Test URI: <pre>valid/P02/ibm02v06.xml</pre>
     * Comment: <pre>This test case contains valid char references in the CDATA section, comment and         processing instruction of an external entity that match the char production.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_valid_P02_ibm02v06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "valid/P02/ibm02v06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("This test case contains valid char references in the CDATA section, comment and         processing instruction of an external entity that match the char production.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("This test case contains valid char references in the CDATA section, comment and         processing instruction of an external entity that match the char production.");
        }
  }


    
}