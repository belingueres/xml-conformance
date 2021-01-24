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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 54</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_validtests_Test_IBMXMLConformanceTestSuite_Production54_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-valid-P54-ibm54v01.xml</pre>
     * Test URI: <pre>valid/P54/ibm54v01.xml</pre>
     * Comment: <pre>Tests all AttTypes : StringType, TokenizedTypes, EnumeratedTypes in      P55,P56,P57,P58,P59.  Also tests all DefaultDecls in P60.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_valid_P54_ibm54v01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "valid/P54/ibm54v01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Tests all AttTypes : StringType, TokenizedTypes, EnumeratedTypes in      P55,P56,P57,P58,P59.  Also tests all DefaultDecls in P60.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Tests all AttTypes : StringType, TokenizedTypes, EnumeratedTypes in      P55,P56,P57,P58,P59.  Also tests all DefaultDecls in P60.");
        }
  }


    
}