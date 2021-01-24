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
 * XML test files base folder: <pre>xmlconf/ibm/xml-1.1/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML11Tests_Test_IBMNot_WFConformanceTestsforXML11CROctober152002_Test_IBMXMLConformanceTestSuite_Production4_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n01.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n01.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #x300</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #x300");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n02.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n02.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x333</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x333");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n03.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n03.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x369</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x369");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n04.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n04.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x37E</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x37E");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n05.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n05.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2000</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x2000");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n06.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n06.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2001</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x2001");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n07.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n07.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2002</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x2002");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n08.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n08.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2005</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n08xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x2005");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n09.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n09.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x200B</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n09xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x200B");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n10.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n10.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x200E</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n10xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x200E");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n11.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n11.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x200F</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n11xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x200F");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n12.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n12.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2069</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n12xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x2069");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n13.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n13.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2190</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n13xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n13.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x2190");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n14.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n14.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x23FF</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n14xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n14.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x23FF");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n15.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n15.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x280F</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n15xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n15.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x280F");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n16.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n16.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2A00</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n16xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n16.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x2A00");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n17.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n17.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2EDC</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n17xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n17.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x2EDC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n18.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n18.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2B00</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n18xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n18.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x2B00");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n19.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n19.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2BFF</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n19xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n19.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x2BFF");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n20.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n20.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0x3000</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n20xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n20.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0x3000");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n21.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n21.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0xD800</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n21xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n21.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0xD800");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n22.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n22.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0xD801</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n22xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n22.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0xD801");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n23.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n23.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0xDAFF</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n23xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n23.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0xDAFF");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n24.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n24.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0xDFFF</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n24xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n24.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0xDFFF");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n25.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n25.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0xEFFF</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n25xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n25.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0xEFFF");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n26.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n26.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0xF1FF</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n26xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n26.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0xF1FF");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n27.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n27.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0xF8FF</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n27xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n27.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0xF8FF");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n28.xml</pre>
     * Test URI: <pre>not-wf/P04/ibm04n28.xml</pre>
     * Comment: <pre>Tests an element with an illegal NameStartChar: #0xFFFFF</pre>
     * Sections: <pre>2.3</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P04_ibm04n28xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P04/ibm04n28.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an element with an illegal NameStartChar: #0xFFFFF");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}