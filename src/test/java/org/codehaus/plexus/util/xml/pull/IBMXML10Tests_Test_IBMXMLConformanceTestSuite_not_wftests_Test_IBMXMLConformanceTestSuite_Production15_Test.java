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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 15</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production15_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P15-ibm15n01.xml</pre>
     * Test URI: <pre>not-wf/P15/ibm15n01.xml</pre>
     * Comment: <pre>Tests comment. The text of the second comment contains the character      "-".</pre>
     * Sections: <pre>2.5</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P15_ibm15n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P15/ibm15n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests comment. The text of the second comment contains the character      \"-\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P15-ibm15n02.xml</pre>
     * Test URI: <pre>not-wf/P15/ibm15n02.xml</pre>
     * Comment: <pre>Tests comment. The second comment has a wrong closing sequence      "-(greater than)".</pre>
     * Sections: <pre>2.5</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P15_ibm15n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P15/ibm15n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests comment. The second comment has a wrong closing sequence      \"-(greater than)\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P15-ibm15n03.xml</pre>
     * Test URI: <pre>not-wf/P15/ibm15n03.xml</pre>
     * Comment: <pre>Tests comment. The second comment has a wrong beginning sequence      "(less than)!-".</pre>
     * Sections: <pre>2.5</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P15_ibm15n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P15/ibm15n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests comment. The second comment has a wrong beginning sequence      \"(less than)!-\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P15-ibm15n04.xml</pre>
     * Test URI: <pre>not-wf/P15/ibm15n04.xml</pre>
     * Comment: <pre>Tests comment. The closing sequence is missing with the second      comment.</pre>
     * Sections: <pre>2.5</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P15_ibm15n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P15/ibm15n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests comment. The closing sequence is missing with the second      comment.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}