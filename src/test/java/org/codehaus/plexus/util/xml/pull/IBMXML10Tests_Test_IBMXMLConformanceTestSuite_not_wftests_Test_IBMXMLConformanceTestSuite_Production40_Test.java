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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 40</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production40_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P40-ibm40n01.xml</pre>
     * Test URI: <pre>not-wf/P40/ibm40n01.xml</pre>
     * Comment: <pre>Tests STag with a required field missing. The Name "root" is      in the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P40_ibm40n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P40/ibm40n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests STag with a required field missing. The Name \"root\" is      in the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P40-ibm40n02.xml</pre>
     * Test URI: <pre>not-wf/P40/ibm40n02.xml</pre>
     * Comment: <pre>Tests STag with a required field missing. The white space between      the Name "root" and the attribute "attr1" is missing in the STag of the     element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P40_ibm40n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P40/ibm40n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests STag with a required field missing. The white space between      the Name \"root\" and the attribute \"attr1\" is missing in the STag of the     element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P40-ibm40n03.xml</pre>
     * Test URI: <pre>not-wf/P40/ibm40n03.xml</pre>
     * Comment: <pre>Tests STag with wrong field ordering. The Name "root" occurs after      the attribute "attr1" in the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P40_ibm40n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P40/ibm40n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests STag with wrong field ordering. The Name \"root\" occurs after      the attribute \"attr1\" in the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P40-ibm40n04.xml</pre>
     * Test URI: <pre>not-wf/P40/ibm40n04.xml</pre>
     * Comment: <pre>Tests STag with a wrong opening sequence. The string "(less than)!" is used      as the opening sequence for the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P40_ibm40n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P40/ibm40n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests STag with a wrong opening sequence. The string \"(less than)!\" is used      as the opening sequence for the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P40-ibm40n05.xml</pre>
     * Test URI: <pre>not-wf/P40/ibm40n05.xml</pre>
     * Comment: <pre>Tests STag with duplicate attribute names. The attribute name      "attr1" occurs twice in  the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P40_ibm40n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P40/ibm40n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests STag with duplicate attribute names. The attribute name      \"attr1\" occurs twice in  the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}