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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 17</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production17_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P17-ibm17n01.xml</pre>
     * Test URI: <pre>not-wf/P17/ibm17n01.xml</pre>
     * Comment: <pre>Tests PITarget. The PITarget contains the string "XML".</pre>
     * Sections: <pre>2.6</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P17_ibm17n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P17/ibm17n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests PITarget. The PITarget contains the string \"XML\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P17-ibm17n02.xml</pre>
     * Test URI: <pre>not-wf/P17/ibm17n02.xml</pre>
     * Comment: <pre>Tests PITarget. The PITarget contains the string "xML".</pre>
     * Sections: <pre>2.6</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P17_ibm17n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P17/ibm17n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests PITarget. The PITarget contains the string \"xML\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P17-ibm17n03.xml</pre>
     * Test URI: <pre>not-wf/P17/ibm17n03.xml</pre>
     * Comment: <pre>Tests PITarget. The PITarget contains the string "xml".</pre>
     * Sections: <pre>2.6</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P17_ibm17n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P17/ibm17n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests PITarget. The PITarget contains the string \"xml\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P17-ibm17n04.xml</pre>
     * Test URI: <pre>not-wf/P17/ibm17n04.xml</pre>
     * Comment: <pre>Tests PITarget. The PITarget contains the string "xmL".</pre>
     * Sections: <pre>2.6</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P17_ibm17n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P17/ibm17n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests PITarget. The PITarget contains the string \"xmL\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}