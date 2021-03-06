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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 4a</pre>
 * XML test files base folder: <pre>xmlconf/ibm/xml-1.1/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML11Tests_Test_IBMValidConformanceTestsforXML11CROctober152002_Test_IBMXMLConformanceTestSuite_Production4a_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-1-1-valid-P04-ibm04av01.xml</pre>
     * Test URI: <pre>valid/P04a/ibm04av01.xml</pre>
     * Comment: <pre>This test case covers legal NameChars character ranges plus discrete legal          characters for production 04a.</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_valid_P04_ibm04av01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "valid/P04a/ibm04av01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("This test case covers legal NameChars character ranges plus discrete legal          characters for production 04a.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("This test case covers legal NameChars character ranges plus discrete legal          characters for production 04a.");
        }
  }


    
}