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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 4</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production4_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n01.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n01.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x21</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x21");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n02.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n02.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x28</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x28");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n03.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n03.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x29</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x29");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n04.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n04.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x2B</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x2B");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n05.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n05.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x2C</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x2C");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n06.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n06.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x2F</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x2F");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n07.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n07.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x3B</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x3B");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n08.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n08.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x3C</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n08xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x3C");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n09.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n09.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x3D</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n09xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x3D");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n10.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n10.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x3F</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n10xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x3F");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n11.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n11.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x5B</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n11xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x5B");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n12.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n12.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x5C</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n12xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x5C");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n13.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n13.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x5D</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n13xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n13.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x5D");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n14.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n14.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x5E</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n14xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n14.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x5E");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n15.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n15.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x60</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n15xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n15.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x60");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n16.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n16.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x7B</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n16xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n16.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x7B");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n17.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n17.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x7C</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n17xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n17.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x7C");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P04-ibm04n18.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n18.xml</pre>
     * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x7D</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P04_ibm04n18xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n18.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x7D");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}