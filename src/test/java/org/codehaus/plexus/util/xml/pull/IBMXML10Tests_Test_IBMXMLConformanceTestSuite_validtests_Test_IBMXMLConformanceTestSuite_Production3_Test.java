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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 3</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_validtests_Test_IBMXMLConformanceTestSuite_Production3_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-valid-P03-ibm03v01.xml</pre>
     * Test URI: <pre>valid/P03/ibm03v01.xml</pre>
     * Comment: <pre>Tests all 4 legal white space characters - #x20 #x9 #xD #xA</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_valid_P03_ibm03v01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "valid/P03/ibm03v01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Tests all 4 legal white space characters - #x20 #x9 #xD #xA", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Tests all 4 legal white space characters - #x20 #x9 #xD #xA");
        }
  }


    
}