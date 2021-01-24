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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 56</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production56_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P56-ibm56n01.xml</pre>
     * Test URI: <pre>not-wf/P56/ibm56n01.xml</pre>
     * Comment: <pre>Tests TokenizedType with wrong key word. The type "id" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P56_ibm56n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P56/ibm56n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests TokenizedType with wrong key word. The type \"id\" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P56-ibm56n02.xml</pre>
     * Test URI: <pre>not-wf/P56/ibm56n02.xml</pre>
     * Comment: <pre>Tests TokenizedType with wrong key word. The type "Idref" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P56_ibm56n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P56/ibm56n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests TokenizedType with wrong key word. The type \"Idref\" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P56-ibm56n03.xml</pre>
     * Test URI: <pre>not-wf/P56/ibm56n03.xml</pre>
     * Comment: <pre>Tests TokenizedType with wrong key word. The type"Idrefs" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P56_ibm56n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P56/ibm56n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests TokenizedType with wrong key word. The type\"Idrefs\" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P56-ibm56n04.xml</pre>
     * Test URI: <pre>not-wf/P56/ibm56n04.xml</pre>
     * Comment: <pre>Tests TokenizedType with wrong key word. The type "EntitY" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P56_ibm56n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P56/ibm56n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests TokenizedType with wrong key word. The type \"EntitY\" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P56-ibm56n05.xml</pre>
     * Test URI: <pre>not-wf/P56/ibm56n05.xml</pre>
     * Comment: <pre>Tests TokenizedType with wrong key word. The type "nmTOKEN" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P56_ibm56n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P56/ibm56n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests TokenizedType with wrong key word. The type \"nmTOKEN\" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P56-ibm56n06.xml</pre>
     * Test URI: <pre>not-wf/P56/ibm56n06.xml</pre>
     * Comment: <pre>Tests TokenizedType with wrong key word. The type "NMtokens" is used in     the TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P56_ibm56n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P56/ibm56n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests TokenizedType with wrong key word. The type \"NMtokens\" is used in     the TokenizedType in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P56-ibm56n07.xml</pre>
     * Test URI: <pre>not-wf/P56/ibm56n07.xml</pre>
     * Comment: <pre>Tests TokenizedType with wrong key word. The type "#ID" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P56_ibm56n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P56/ibm56n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests TokenizedType with wrong key word. The type \"#ID\" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}