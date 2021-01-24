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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 48</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production48_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P48-ibm48n01.xml</pre>
     * Test URI: <pre>not-wf/P48/ibm48n01.xml</pre>
     * Comment: <pre>Tests cp with a required fields missing. The field Name|choice|seq is      missing in the second cp in the choice field in the third elementdecl in the     DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P48_ibm48n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P48/ibm48n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests cp with a required fields missing. The field Name|choice|seq is      missing in the second cp in the choice field in the third elementdecl in the     DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P48-ibm48n02.xml</pre>
     * Test URI: <pre>not-wf/P48/ibm48n02.xml</pre>
     * Comment: <pre>Tests cp with a required fields missing. The field Name|choice|seq is      missing in the cp in the third elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P48_ibm48n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P48/ibm48n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests cp with a required fields missing. The field Name|choice|seq is      missing in the cp in the third elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P48-ibm48n03.xml</pre>
     * Test URI: <pre>not-wf/P48/ibm48n03.xml</pre>
     * Comment: <pre>Tests cp with a required fields missing. The field Name|choice|seq is      missing in the first cp in the choice field in the third elementdecl in the      DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P48_ibm48n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P48/ibm48n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests cp with a required fields missing. The field Name|choice|seq is      missing in the first cp in the choice field in the third elementdecl in the      DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P48-ibm48n04.xml</pre>
     * Test URI: <pre>not-wf/P48/ibm48n04.xml</pre>
     * Comment: <pre>Tests cp with wrong field ordering. The "+" occurs before the seq (a,a)     in the first cp in the choice field in the third elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P48_ibm48n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P48/ibm48n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests cp with wrong field ordering. The \"+\" occurs before the seq (a,a)     in the first cp in the choice field in the third elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P48-ibm48n05.xml</pre>
     * Test URI: <pre>not-wf/P48/ibm48n05.xml</pre>
     * Comment: <pre>Tests cp with wrong field ordering. The "*" occurs before the choice     (a|b) in the first cp in the seq field in the third elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P48_ibm48n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P48/ibm48n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests cp with wrong field ordering. The \"*\" occurs before the choice     (a|b) in the first cp in the seq field in the third elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P48-ibm48n06.xml</pre>
     * Test URI: <pre>not-wf/P48/ibm48n06.xml</pre>
     * Comment: <pre>Tests cp with wrong field ordering. The "?" occurs before the Name "a"     in the second cp in the seq field in the third elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P48_ibm48n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P48/ibm48n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests cp with wrong field ordering. The \"?\" occurs before the Name \"a\"     in the second cp in the seq field in the third elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P48-ibm48n07.xml</pre>
     * Test URI: <pre>not-wf/P48/ibm48n07.xml</pre>
     * Comment: <pre>Tests cp with wrong key word. The "^" occurs after the Name "a" in the     first cp in the choice field in the third elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P48_ibm48n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P48/ibm48n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests cp with wrong key word. The \"^\" occurs after the Name \"a\" in the     first cp in the choice field in the third elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}