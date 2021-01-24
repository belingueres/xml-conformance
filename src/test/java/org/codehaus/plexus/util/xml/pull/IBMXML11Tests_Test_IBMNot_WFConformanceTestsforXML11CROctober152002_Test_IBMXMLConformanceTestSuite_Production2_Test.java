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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 2</pre>
 * XML test files base folder: <pre>xmlconf/ibm/xml-1.1/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML11Tests_Test_IBMNot_WFConformanceTestsforXML11CROctober152002_Test_IBMXMLConformanceTestSuite_Production2_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n01.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n01.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x1.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x1.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n02.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n02.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x2.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x2.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n03.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n03.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x3.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x3.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n04.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n04.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x4.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x4.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n05.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n05.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x5.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x5.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n06.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n06.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x6.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x6.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n07.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n07.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x7.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x7.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n08.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n08.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x8.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n08xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x8.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n09.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n09.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x0.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n09xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x0.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n10.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n10.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x100.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n10xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x100.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n11.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n11.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x0B.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n11xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x0B.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n12.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n12.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x0C.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n12xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x0C.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n14.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n14.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x0E.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n14xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n14.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x0E.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n15.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n15.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x0F.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n15xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n15.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x0F.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n16.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n16.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x10.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n16xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n16.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x10.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n17.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n17.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x11.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n17xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n17.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x11.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n18.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n18.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x12.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n18xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n18.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x12.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n19.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n19.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x13.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n19xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n19.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x13.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n20.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n20.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x14.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n20xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n20.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x14.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n21.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n21.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x15.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n21xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n21.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x15.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n22.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n22.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x16.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n22xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n22.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x16.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n23.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n23.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x17.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n23xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n23.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x17.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n24.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n24.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x18.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n24xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n24.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x18.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n25.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n25.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x19.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n25xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n25.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x19.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n26.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n26.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x1A.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n26xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n26.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x1A.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n27.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n27.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x1B.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n27xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n27.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x1B.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n28.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n28.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x1C.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n28xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n28.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x1C.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n29.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n29.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x1D.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n29xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n29.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x1D.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n30.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n30.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x1E.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n30xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n30.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x1E.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n31.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n31.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x1F.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n31xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n31.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x1F.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n32.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n32.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x7F.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n32xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n32.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x7F.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n33.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n33.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x80.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n33xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n33.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x80.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n34.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n34.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x81.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n34xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n34.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x81.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n35.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n35.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x82.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n35xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n35.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x82.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n36.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n36.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x83.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n36xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n36.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x83.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n37.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n37.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x84.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n37xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n37.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x84.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n38.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n38.xml</pre>
     * Comment: <pre>This test contains embeded control characters  x82, x83 and x84.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n38xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n38.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control characters  x82, x83 and x84.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n39.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n39.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x86.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n39xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n39.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x86.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n40.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n40.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x87.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n40xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n40.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x87.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n41.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n41.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x88.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n41xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n41.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x88.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n42.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n42.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x89.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n42xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n42.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x89.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n43.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n43.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x8A.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n43xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n43.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x8A.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n44.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n44.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x8B.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n44xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n44.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x8B.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n45.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n45.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x8C.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n45xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n45.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x8C.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n46.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n46.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x8D.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n46xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n46.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x8D.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n47.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n47.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x8E.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n47xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n47.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x8E.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n48.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n48.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x8F.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n48xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n48.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x8F.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n49.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n49.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x90.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n49xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n49.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x90.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n50.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n50.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x91.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n50xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n50.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x91.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n51.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n51.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x92.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n51xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n51.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x92.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n52.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n52.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x93.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n52xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n52.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x93.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n53.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n53.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x94.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n53xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n53.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x94.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n54.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n54.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x95.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n54xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n54.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x95.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n55.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n55.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x96.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n55xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n55.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x96.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n56.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n56.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x97.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n56xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n56.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x97.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n57.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n57.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x98.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n57xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n57.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x98.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n58.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n58.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x99.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n58xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n58.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x99.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n59.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n59.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x9A.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n59xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n59.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x9A.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n60.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n60.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x9B.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n60xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n60.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x9B.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n61.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n61.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x9C.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n61xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n61.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x9C.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n62.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n62.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x9D.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n62xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n62.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x9D.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n63.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n63.xml</pre>
     * Comment: <pre>This test contains embeded control character 0x9E.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n63xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n63.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control character 0x9E.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n64.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n64.xml</pre>
     * Comment: <pre>This test contains embeded control characters present in an external entity.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n64xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n64.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control characters present in an external entity.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n65.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n65.xml</pre>
     * Comment: <pre>This test contains embeded control characters present in an external entity.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n65xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n65.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control characters present in an external entity.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n66.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n66.xml</pre>
     * Comment: <pre>This test contains embeded control characters present in an external entity.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n66xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n66.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded control characters present in an external entity.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n67.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n67.xml</pre>
     * Comment: <pre>This test contains embeded character 0xD800. (Invalid UTF8 sequence)</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n67xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n67.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded character 0xD800. (Invalid UTF8 sequence)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n68.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n68.xml</pre>
     * Comment: <pre>This test contains embeded character 0xFFFE.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n68xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n68.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded character 0xFFFE.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n69.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n69.xml</pre>
     * Comment: <pre>This test contains embeded character 0xFFFF.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n69xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n69.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains embeded character 0xFFFF.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n70.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n70.xml</pre>
     * Comment: <pre>This test contains a reference to character 0xFFFE.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n70xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n70.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains a reference to character 0xFFFE.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n71.xml</pre>
     * Test URI: <pre>not-wf/P02/ibm02n71.xml</pre>
     * Comment: <pre>This test contains a reference to character 0xFFFF.</pre>
     * Sections: <pre>2.2,4.1</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P02_ibm02n71xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P02/ibm02n71.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This test contains a reference to character 0xFFFF.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}