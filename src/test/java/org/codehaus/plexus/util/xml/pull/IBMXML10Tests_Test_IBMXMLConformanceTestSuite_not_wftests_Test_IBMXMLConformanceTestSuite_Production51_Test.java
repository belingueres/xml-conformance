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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 51</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production51_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P51-ibm51n01.xml</pre>
     * Test URI: <pre>not-wf/P51/ibm51n01.xml</pre>
     * Comment: <pre>Tests Mixed with a wrong key word. The string "#pcdata" is used as the     key word in the Mixed field in the fourth elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P51_ibm51n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P51/ibm51n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Mixed with a wrong key word. The string \"#pcdata\" is used as the     key word in the Mixed field in the fourth elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P51-ibm51n02.xml</pre>
     * Test URI: <pre>not-wf/P51/ibm51n02.xml</pre>
     * Comment: <pre>Tests Mixed with wrong field ordering. The field #PCDATA does not      occur as the first component in the Mixed field in the fourth elementdecl in      the DTD.</pre>
     * Sections: <pre>3.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P51_ibm51n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P51/ibm51n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Mixed with wrong field ordering. The field #PCDATA does not      occur as the first component in the Mixed field in the fourth elementdecl in      the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P51-ibm51n03.xml</pre>
     * Test URI: <pre>not-wf/P51/ibm51n03.xml</pre>
     * Comment: <pre>Tests Mixed with a separator missing. The separator "|" is missing in     between #PCDATA and a in the Mixed field in the fourth elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P51_ibm51n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P51/ibm51n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Mixed with a separator missing. The separator \"|\" is missing in     between #PCDATA and a in the Mixed field in the fourth elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P51-ibm51n04.xml</pre>
     * Test URI: <pre>not-wf/P51/ibm51n04.xml</pre>
     * Comment: <pre>Tests Mixed with a wrong key word. The string "#CDATA" is used as the     key word in the Mixed field in the fourth elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P51_ibm51n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P51/ibm51n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Mixed with a wrong key word. The string \"#CDATA\" is used as the     key word in the Mixed field in the fourth elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P51-ibm51n05.xml</pre>
     * Test URI: <pre>not-wf/P51/ibm51n05.xml</pre>
     * Comment: <pre>Tests Mixed with a required field missing. The "*" is missing after      the ")" in the Mixed field in the fourth elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P51_ibm51n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P51/ibm51n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Mixed with a required field missing. The \"*\" is missing after      the \")\" in the Mixed field in the fourth elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P51-ibm51n06.xml</pre>
     * Test URI: <pre>not-wf/P51/ibm51n06.xml</pre>
     * Comment: <pre>Tests Mixed with wrong closing bracket. The "]" is used as the closing      bracket in the Mixed field in the fourth elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P51_ibm51n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P51/ibm51n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Mixed with wrong closing bracket. The \"]\" is used as the closing      bracket in the Mixed field in the fourth elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P51-ibm51n07.xml</pre>
     * Test URI: <pre>not-wf/P51/ibm51n07.xml</pre>
     * Comment: <pre>Tests Mixed with a required field missing. The closing bracket ")" is      missing after (#PCDATA in the Mixed field in the fourth elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P51_ibm51n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P51/ibm51n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Mixed with a required field missing. The closing bracket \")\" is      missing after (#PCDATA in the Mixed field in the fourth elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}