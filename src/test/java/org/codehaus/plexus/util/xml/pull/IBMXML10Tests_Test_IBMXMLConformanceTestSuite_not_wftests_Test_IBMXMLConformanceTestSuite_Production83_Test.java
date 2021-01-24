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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 83</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production83_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P83-ibm83n01.xml</pre>
     * Test URI: <pre>not-wf/P83/ibm83n01.xml</pre>
     * Comment: <pre>Tests PublicID with wrong key word. The string "public" is used as      the key word in the PublicID in the NotationDecl in the DTD.</pre>
     * Sections: <pre>4.7</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P83_ibm83n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P83/ibm83n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests PublicID with wrong key word. The string \"public\" is used as      the key word in the PublicID in the NotationDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P83-ibm83n02.xml</pre>
     * Test URI: <pre>not-wf/P83/ibm83n02.xml</pre>
     * Comment: <pre>Tests PublicID with wrong key word. The string "Public" is used as      the key word in the PublicID in the NotationDecl in the DTD.</pre>
     * Sections: <pre>4.7</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P83_ibm83n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P83/ibm83n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests PublicID with wrong key word. The string \"Public\" is used as      the key word in the PublicID in the NotationDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P83-ibm83n03.xml</pre>
     * Test URI: <pre>not-wf/P83/ibm83n03.xml</pre>
     * Comment: <pre>Tests PublicID with a required field missing. The key word "PUBLIC"     is missing in the PublicID in the NotationDecl in the DTD.</pre>
     * Sections: <pre>4.7</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P83_ibm83n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P83/ibm83n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests PublicID with a required field missing. The key word \"PUBLIC\"     is missing in the PublicID in the NotationDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P83-ibm83n04.xml</pre>
     * Test URI: <pre>not-wf/P83/ibm83n04.xml</pre>
     * Comment: <pre>Tests PublicID with a required field missing. The white space      between the "PUBLIC" and the PubidLiteral is missing in the PublicID in      the NotationDecl in the DTD.</pre>
     * Sections: <pre>4.7</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P83_ibm83n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P83/ibm83n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests PublicID with a required field missing. The white space      between the \"PUBLIC\" and the PubidLiteral is missing in the PublicID in      the NotationDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P83-ibm83n05.xml</pre>
     * Test URI: <pre>not-wf/P83/ibm83n05.xml</pre>
     * Comment: <pre>Tests PublicID with a required field missing. The PubidLiteral is      missing in the PublicID in the NotationDecl in the DTD.</pre>
     * Sections: <pre>4.7</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P83_ibm83n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P83/ibm83n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests PublicID with a required field missing. The PubidLiteral is      missing in the PublicID in the NotationDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P83-ibm83n06.xml</pre>
     * Test URI: <pre>not-wf/P83/ibm83n06.xml</pre>
     * Comment: <pre>Tests PublicID with wrong field ordering. The key word "PUBLIC"      occurs after the PubidLiteral in the PublicID in the NotationDecl.</pre>
     * Sections: <pre>4.7</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P83_ibm83n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P83/ibm83n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests PublicID with wrong field ordering. The key word \"PUBLIC\"      occurs after the PubidLiteral in the PublicID in the NotationDecl.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}