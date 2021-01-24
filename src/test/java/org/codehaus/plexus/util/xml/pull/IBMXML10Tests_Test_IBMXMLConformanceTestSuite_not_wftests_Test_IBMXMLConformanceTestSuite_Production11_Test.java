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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 11</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production11_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P11-ibm11n01.xml</pre>
     * Test URI: <pre>not-wf/P11/ibm11n01.xml</pre>
     * Comment: <pre>Tests SystemLiteral. The systemLiteral for the element "student" has      a double quote character in the middle.</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P11_ibm11n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P11/ibm11n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests SystemLiteral. The systemLiteral for the element \"student\" has      a double quote character in the middle.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P11-ibm11n02.xml</pre>
     * Test URI: <pre>not-wf/P11/ibm11n02.xml</pre>
     * Comment: <pre>Tests SystemLiteral. The systemLiteral for the element "student" has      a single quote character in the middle.</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P11_ibm11n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P11/ibm11n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests SystemLiteral. The systemLiteral for the element \"student\" has      a single quote character in the middle.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P11-ibm11n03.xml</pre>
     * Test URI: <pre>not-wf/P11/ibm11n03.xml</pre>
     * Comment: <pre>Tests SystemLiteral. The closing bracket (double quote) is missing with     the systemLiteral for the element "student".</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P11_ibm11n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P11/ibm11n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests SystemLiteral. The closing bracket (double quote) is missing with     the systemLiteral for the element \"student\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P11-ibm11n04.xml</pre>
     * Test URI: <pre>not-wf/P11/ibm11n04.xml</pre>
     * Comment: <pre>Tests SystemLiteral. The closing bracket (single quote) is missing with     the systemLiteral for the element "student".</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P11_ibm11n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P11/ibm11n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests SystemLiteral. The closing bracket (single quote) is missing with     the systemLiteral for the element \"student\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}