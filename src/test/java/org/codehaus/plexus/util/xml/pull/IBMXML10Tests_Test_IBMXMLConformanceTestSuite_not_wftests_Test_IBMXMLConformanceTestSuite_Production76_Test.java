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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 76</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production76_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P76-ibm76n01.xml</pre>
     * Test URI: <pre>not-wf/P76/ibm76n01.xml</pre>
     * Comment: <pre>Tests NDataDecl with wrong key word. The string "ndata" is used as      the key word in the NDataDecl in the EntityDef in the GEDecl.</pre>
     * Sections: <pre>4.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P76_ibm76n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P76/ibm76n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests NDataDecl with wrong key word. The string \"ndata\" is used as      the key word in the NDataDecl in the EntityDef in the GEDecl.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P76-ibm76n02.xml</pre>
     * Test URI: <pre>not-wf/P76/ibm76n02.xml</pre>
     * Comment: <pre>Tests NDataDecl with wrong key word. The string "NData" is used as      the key word in the NDataDecl in the EntityDef in the GEDecl.</pre>
     * Sections: <pre>4.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P76_ibm76n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P76/ibm76n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests NDataDecl with wrong key word. The string \"NData\" is used as      the key word in the NDataDecl in the EntityDef in the GEDecl.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P76-ibm76n03.xml</pre>
     * Test URI: <pre>not-wf/P76/ibm76n03.xml</pre>
     * Comment: <pre>Tests NDataDecl with a required field missing. The leading white      space is missing in the NDataDecl in the EntityDef in the GEDecl.</pre>
     * Sections: <pre>4.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P76_ibm76n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P76/ibm76n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests NDataDecl with a required field missing. The leading white      space is missing in the NDataDecl in the EntityDef in the GEDecl.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P76-ibm76n04.xml</pre>
     * Test URI: <pre>not-wf/P76/ibm76n04.xml</pre>
     * Comment: <pre>Tests NDataDecl with a required field missing. The key word "NDATA"     is missing in the NDataDecl in the EntityDef in the GEDecl.</pre>
     * Sections: <pre>4.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P76_ibm76n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P76/ibm76n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests NDataDecl with a required field missing. The key word \"NDATA\"     is missing in the NDataDecl in the EntityDef in the GEDecl.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P76-ibm76n05.xml</pre>
     * Test URI: <pre>not-wf/P76/ibm76n05.xml</pre>
     * Comment: <pre>Tests NDataDecl with a required field missing. The Name after the      key word "NDATA" is missing in the NDataDecl in the EntityDef in the GEDecl.</pre>
     * Sections: <pre>4.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P76_ibm76n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P76/ibm76n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests NDataDecl with a required field missing. The Name after the      key word \"NDATA\" is missing in the NDataDecl in the EntityDef in the GEDecl.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P76-ibm76n06.xml</pre>
     * Test URI: <pre>not-wf/P76/ibm76n06.xml</pre>
     * Comment: <pre>Tests NDataDecl with a required field missing. The white space      between "NDATA" and the Name is missing in the NDataDecl in the EntityDef      in the GEDecl.</pre>
     * Sections: <pre>4.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P76_ibm76n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P76/ibm76n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests NDataDecl with a required field missing. The white space      between \"NDATA\" and the Name is missing in the NDataDecl in the EntityDef      in the GEDecl.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P76-ibm76n07.xml</pre>
     * Test URI: <pre>not-wf/P76/ibm76n07.xml</pre>
     * Comment: <pre>Tests NDataDecl with wrong field ordering. The key word "NDATA"      occurs after the Name in the NDataDecl in the EntityDef in the GEDecl.</pre>
     * Sections: <pre>4.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P76_ibm76n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P76/ibm76n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests NDataDecl with wrong field ordering. The key word \"NDATA\"      occurs after the Name in the NDataDecl in the EntityDef in the GEDecl.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}