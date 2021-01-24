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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 49</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production49_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P49-ibm49n01.xml</pre>
     * Test URI: <pre>not-wf/P49/ibm49n01.xml</pre>
     * Comment: <pre>Tests choice with a required field missing. The two cps are missing in     the choice field in the third elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P49_ibm49n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P49/ibm49n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests choice with a required field missing. The two cps are missing in     the choice field in the third elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P49-ibm49n02.xml</pre>
     * Test URI: <pre>not-wf/P49/ibm49n02.xml</pre>
     * Comment: <pre>Tests choice with a required field missing. The third cp is missing in     the choice field in the fourth elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P49_ibm49n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P49/ibm49n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests choice with a required field missing. The third cp is missing in     the choice field in the fourth elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P49-ibm49n03.xml</pre>
     * Test URI: <pre>not-wf/P49/ibm49n03.xml</pre>
     * Comment: <pre>Tests choice with a wrong separator. The "!" is used as the separator      in the choice field in the fourth elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P49_ibm49n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P49/ibm49n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests choice with a wrong separator. The \"!\" is used as the separator      in the choice field in the fourth elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P49-ibm49n04.xml</pre>
     * Test URI: <pre>not-wf/P49/ibm49n04.xml</pre>
     * Comment: <pre>Tests choice with a required field missing. The separator "|" is      missing in the choice field (a b)+ in the fourth elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P49_ibm49n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P49/ibm49n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests choice with a required field missing. The separator \"|\" is      missing in the choice field (a b)+ in the fourth elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P49-ibm49n05.xml</pre>
     * Test URI: <pre>not-wf/P49/ibm49n05.xml</pre>
     * Comment: <pre>Tests choice with an extra separator. An extra "|" occurs between a      and b in the choice field in the fourth elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P49_ibm49n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P49/ibm49n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests choice with an extra separator. An extra \"|\" occurs between a      and b in the choice field in the fourth elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P49-ibm49n06.xml</pre>
     * Test URI: <pre>not-wf/P49/ibm49n06.xml</pre>
     * Comment: <pre>Tests choice with a required field missing. The closing bracket ")" is      missing in the choice field (a |b * in the fourth elementdecl in the DTD.</pre>
     * Sections: <pre>3.2.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P49_ibm49n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P49/ibm49n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests choice with a required field missing. The closing bracket \")\" is      missing in the choice field (a |b * in the fourth elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}