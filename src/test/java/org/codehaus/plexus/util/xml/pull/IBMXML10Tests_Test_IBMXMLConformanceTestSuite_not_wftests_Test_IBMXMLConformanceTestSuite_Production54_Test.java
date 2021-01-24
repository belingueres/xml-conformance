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
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production54_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P54-ibm54n01.xml</pre>
     * Test URI: <pre>not-wf/P54/ibm54n01.xml</pre>
     * Comment: <pre>Tests AttType with a wrong option. The string "BOGUSATTR" is used as     the AttType in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P54_ibm54n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P54/ibm54n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests AttType with a wrong option. The string \"BOGUSATTR\" is used as     the AttType in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P54-ibm54n02.xml</pre>
     * Test URI: <pre>not-wf/P54/ibm54n02.xml</pre>
     * Comment: <pre>Tests AttType with a wrong option. The string "PCDATA" is used as     the AttType in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P54_ibm54n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P54/ibm54n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests AttType with a wrong option. The string \"PCDATA\" is used as     the AttType in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}