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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 89</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production89_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n01.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n01.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x00B6         occurs as the second character in the PITarget in the PI in the DTD.</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x00B6         occurs as the second character in the PITarget in the PI in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n02.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n02.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x00B8         occurs as the second character in the PITarget in the PI in the DTD.</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x00B8         occurs as the second character in the PITarget in the PI in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n03.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n03.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x02D2         occurs as the second character in the PITarget in the PI in the DTD.</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x02D2         occurs as the second character in the PITarget in the PI in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n04.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n04.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x03FE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x03FE         occurs as the second character in the PITarget in the PI in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n05.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n05.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x065F         occurs as the second character in the PITarget in the PI in the DTD.</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x065F         occurs as the second character in the PITarget in the PI in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n06.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n06.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x0EC7         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x0EC7         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n07.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n07.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x3006         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x3006         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n08.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n08.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x3030         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n08xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x3030         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n09.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n09.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x3036         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n09xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x3036         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n10.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n10.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x309C         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n10xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x309C         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n11.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n11.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x309F         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n11xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x309F         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P89-ibm89n12.xml</pre>
     * Test URI: <pre>not-wf/P89/ibm89n12.xml</pre>
     * Comment: <pre>Tests Extender with an illegal character. The character #x30FF         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P89_ibm89n12xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P89/ibm89n12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Extender with an illegal character. The character #x30FF         occurs as the second character in the PITarget in the PI in the DTD.       [Also contains two top-level elements -- one should be removed]");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}