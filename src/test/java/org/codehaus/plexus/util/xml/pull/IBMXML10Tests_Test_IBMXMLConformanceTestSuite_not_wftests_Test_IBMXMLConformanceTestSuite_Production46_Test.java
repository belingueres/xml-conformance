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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 46</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production46_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P46-ibm46n01.xml</pre>
     * Test URI: <pre>not-wf/P46/ibm46n01.xml</pre>
     * Comment: <pre>Tests contentspec with wrong key word. the string "empty" is used as      the key word in the contentspec of the second elementdecl in the DTD.</pre>
     * Sections: <pre>3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P46_ibm46n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P46/ibm46n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests contentspec with wrong key word. the string \"empty\" is used as      the key word in the contentspec of the second elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P46-ibm46n02.xml</pre>
     * Test URI: <pre>not-wf/P46/ibm46n02.xml</pre>
     * Comment: <pre>Tests contentspec with wrong key word. the string "Empty" is used as      the key word in the contentspec of the second elementdecl in the DTD.</pre>
     * Sections: <pre>3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P46_ibm46n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P46/ibm46n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests contentspec with wrong key word. the string \"Empty\" is used as      the key word in the contentspec of the second elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P46-ibm46n03.xml</pre>
     * Test URI: <pre>not-wf/P46/ibm46n03.xml</pre>
     * Comment: <pre>Tests contentspec with wrong key word. the string "Any" is used as      the key word in the contentspec of the second elementdecl in the DTD.</pre>
     * Sections: <pre>3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P46_ibm46n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P46/ibm46n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests contentspec with wrong key word. the string \"Any\" is used as      the key word in the contentspec of the second elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P46-ibm46n04.xml</pre>
     * Test URI: <pre>not-wf/P46/ibm46n04.xml</pre>
     * Comment: <pre>Tests contentspec with wrong key word. the string "any" is used as      the key word in the contentspec of the second elementdecl in the DTD.</pre>
     * Sections: <pre>3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P46_ibm46n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P46/ibm46n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests contentspec with wrong key word. the string \"any\" is used as      the key word in the contentspec of the second elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P46-ibm46n05.xml</pre>
     * Test URI: <pre>not-wf/P46/ibm46n05.xml</pre>
     * Comment: <pre>Tests contentspec with a wrong option. The string "#CDATA" is used as     the contentspec in the second elementdecl in the DTD.</pre>
     * Sections: <pre>3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P46_ibm46n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P46/ibm46n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests contentspec with a wrong option. The string \"#CDATA\" is used as     the contentspec in the second elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}