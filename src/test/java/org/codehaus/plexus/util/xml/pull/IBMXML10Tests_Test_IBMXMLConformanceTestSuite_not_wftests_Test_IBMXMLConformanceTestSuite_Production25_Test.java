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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 25</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production25_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P25-ibm25n01.xml</pre>
     * Test URI: <pre>not-wf/P25/ibm25n01.xml</pre>
     * Comment: <pre>Tests eq with a wrong key word "==".</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P25_ibm25n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P25/ibm25n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests eq with a wrong key word \"==\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P25-ibm25n02.xml</pre>
     * Test URI: <pre>not-wf/P25/ibm25n02.xml</pre>
     * Comment: <pre>Tests eq with a wrong key word "eq".</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P25_ibm25n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P25/ibm25n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests eq with a wrong key word \"eq\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}