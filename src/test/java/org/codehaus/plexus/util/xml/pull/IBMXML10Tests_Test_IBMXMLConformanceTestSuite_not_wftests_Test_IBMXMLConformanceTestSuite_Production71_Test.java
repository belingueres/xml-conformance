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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 71</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production71_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P71-ibm70n01.xml</pre>
     * Test URI: <pre>not-wf/P71/ibm70n01.xml</pre>
     * Comment: <pre>Tests</pre>
     * Sections: <pre>4.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P71_ibm70n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P71/ibm70n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P71-ibm71n01.xml</pre>
     * Test URI: <pre>not-wf/P71/ibm71n01.xml</pre>
     * Comment: <pre>Tests EntityDecl with a required field missing. The white space is      missing between the beginning sequence and the Name "aaa" in the EntityDecl      in the DTD.</pre>
     * Sections: <pre>4.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P71_ibm71n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P71/ibm71n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityDecl with a required field missing. The white space is      missing between the beginning sequence and the Name \"aaa\" in the EntityDecl      in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P71-ibm71n02.xml</pre>
     * Test URI: <pre>not-wf/P71/ibm71n02.xml</pre>
     * Comment: <pre>Tests EntityDecl with a required field missing. The white space is      missing between the Name "aaa" and the EntityDef "aString" in the      EntityDecl in the DTD.</pre>
     * Sections: <pre>4.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P71_ibm71n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P71/ibm71n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityDecl with a required field missing. The white space is      missing between the Name \"aaa\" and the EntityDef \"aString\" in the      EntityDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P71-ibm71n03.xml</pre>
     * Test URI: <pre>not-wf/P71/ibm71n03.xml</pre>
     * Comment: <pre>Tests EntityDecl with a required field missing. The EntityDef is      missing in the EntityDecl with the Name "aaa" in the DTD.</pre>
     * Sections: <pre>4.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P71_ibm71n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P71/ibm71n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityDecl with a required field missing. The EntityDef is      missing in the EntityDecl with the Name \"aaa\" in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P71-ibm71n04.xml</pre>
     * Test URI: <pre>not-wf/P71/ibm71n04.xml</pre>
     * Comment: <pre>Tests EntityDecl with a required field missing. The Name is missing      in the EntityDecl with the EntityDef "aString" in the DTD.</pre>
     * Sections: <pre>4.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P71_ibm71n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P71/ibm71n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityDecl with a required field missing. The Name is missing      in the EntityDecl with the EntityDef \"aString\" in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P71-ibm71n05.xml</pre>
     * Test URI: <pre>not-wf/P71/ibm71n05.xml</pre>
     * Comment: <pre>Tests EntityDecl with wrong ordering. The Name "aaa" occurs after      the EntityDef in the EntityDecl in the DTD.</pre>
     * Sections: <pre>4.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P71_ibm71n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P71/ibm71n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityDecl with wrong ordering. The Name \"aaa\" occurs after      the EntityDef in the EntityDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P71-ibm71n06.xml</pre>
     * Test URI: <pre>not-wf/P71/ibm71n06.xml</pre>
     * Comment: <pre>Tests EntityDecl with wrong key word. The string "entity" is used      as the key word in the beginning sequence in the EntityDecl in the DTD.</pre>
     * Sections: <pre>4.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P71_ibm71n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P71/ibm71n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityDecl with wrong key word. The string \"entity\" is used      as the key word in the beginning sequence in the EntityDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P71-ibm71n07.xml</pre>
     * Test URI: <pre>not-wf/P71/ibm71n07.xml</pre>
     * Comment: <pre>Tests EntityDecl with a required field missing. The closing bracket     (greater than) is missing in the EntityDecl in the DTD.</pre>
     * Sections: <pre>4.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P71_ibm71n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P71/ibm71n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityDecl with a required field missing. The closing bracket     (greater than) is missing in the EntityDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P71-ibm71n08.xml</pre>
     * Test URI: <pre>not-wf/P71/ibm71n08.xml</pre>
     * Comment: <pre>Tests EntityDecl with a required field missing. The exclamation mark     is missing in the beginning sequence in the EntityDecl in the DTD.</pre>
     * Sections: <pre>4.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P71_ibm71n08xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P71/ibm71n08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityDecl with a required field missing. The exclamation mark     is missing in the beginning sequence in the EntityDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}