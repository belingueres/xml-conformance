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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 87</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_validtests_Test_IBMXMLConformanceTestSuite_Production87_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-valid-P87-ibm87v01.xml</pre>
     * Test URI: <pre>valid/P87/ibm87v01.xml</pre>
     * Comment: <pre>This test case covers 65 legal character ranges plus 30 single legal      characters for CombiningChar in P87 using a PI target Name</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_valid_P87_ibm87v01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "valid/P87/ibm87v01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("This test case covers 65 legal character ranges plus 30 single legal      characters for CombiningChar in P87 using a PI target Name", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("This test case covers 65 legal character ranges plus 30 single legal      characters for CombiningChar in P87 using a PI target Name");
        }
  }


    
}