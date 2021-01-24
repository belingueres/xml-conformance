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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 77</pre>
 * XML test files base folder: <pre>xmlconf/ibm/xml-1.1/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML11Tests_Test_IBMNot_WFConformanceTestsforXML11CROctober152002_Test_IBMXMLConformanceTestSuite_Production77_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n01.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n01.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and that of the external dtd 1.0.          The external dtd contains the invalid XML1.1 but valid XML 1.0 character #x7F.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and that of the external dtd 1.0.          The external dtd contains the invalid XML1.1 but valid XML 1.0 character #x7F.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n02.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n02.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and that of the external dtd 1.0.          The external dtd contains a comment with the invalid XML1.1 but valid XML 1.0          character #x80.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and that of the external dtd 1.0.          The external dtd contains a comment with the invalid XML1.1 but valid XML 1.0          character #x80.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n03.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n03.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and that of the external dtd 1.0.          The external dtd contains a PI with the invalid XML1.1 but valid XML 1.0          character #x9F.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and that of the external dtd 1.0.          The external dtd contains a PI with the invalid XML1.1 but valid XML 1.0          character #x9F.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n04.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n04.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and that of the external entity 1.0.          The external entity the contains invalid XML1.1 but valid XML 1.0 character #x89.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and that of the external entity 1.0.          The external entity the contains invalid XML1.1 but valid XML 1.0 character #x89.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n05.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n05.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and that of the external entity 1.0.          The external entity contains the invalid XML1.1 but valid XML 1.0 character #x94.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and that of the external entity 1.0.          The external entity contains the invalid XML1.1 but valid XML 1.0 character #x94.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n06.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n06.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and that of the external entity 1.0.          The external entity contains the invalid XML1.1 but valid XML 1.0 character #x9F.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and that of the external entity 1.0.          The external entity contains the invalid XML1.1 but valid XML 1.0 character #x9F.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n07.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n07.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and the external dtd does not contain         a textDecl.  The external entity contains the invalid XML1.1 but valid XML 1.0          character #x7F.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and the external dtd does not contain         a textDecl.  The external entity contains the invalid XML1.1 but valid XML 1.0          character #x7F.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n08.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n08.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and the external dtd does not contain         a VersionNum in the textDecl.  The external entity contains the invalid XML1.1 but          valid XML 1.0 character #x9B.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n08xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and the external dtd does not contain         a VersionNum in the textDecl.  The external entity contains the invalid XML1.1 but          valid XML 1.0 character #x9B.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n09.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n09.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and the external dtd does not contain         a textDecl.  The external entity contains the invalid XML1.1 but valid XML 1.0          character #x8D.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n09xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and the external dtd does not contain         a textDecl.  The external entity contains the invalid XML1.1 but valid XML 1.0          character #x8D.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n10.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n10.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and the external dtd does not contain         a VersionNum in the textDecl.  The external entity contains the invalid XML 1.1 but          valid XML 1.0 character #x84.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n10xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and the external dtd does not contain         a VersionNum in the textDecl.  The external entity contains the invalid XML 1.1 but          valid XML 1.0 character #x84.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n11.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n11.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and the external dtd does not contain         a textDecl.  The external entity contains the invalid XML 1.1 but          valid XML 1.0 character #x88.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n11xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and the external dtd does not contain         a textDecl.  The external entity contains the invalid XML 1.1 but          valid XML 1.0 character #x88.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n12.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n12.xml</pre>
     * Comment: <pre>The VersionNum of the document entity is 1.1 and the external dtd does not contain         a textDecl.  The external entity contains the invalid XML 1.1 but          valid XML 1.0 character #x8E.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n12xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the document entity is 1.1 and the external dtd does not contain         a textDecl.  The external entity contains the invalid XML 1.1 but          valid XML 1.0 character #x8E.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n13.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n13.xml</pre>
     * Comment: <pre>The VersionNum of the primary document entity is 1.0 and that of the external   		dtd is 1.0.  The external dtd contains an external entity whose VersionNum is 1.1.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n13xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n13.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the primary document entity is 1.0 and that of the external   		dtd is 1.0.  The external dtd contains an external entity whose VersionNum is 1.1.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n14.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n14.xml</pre>
     * Comment: <pre>The VersionNum of the primary document entity is 1.1 and that of the external   		dtd is 1.0.  The external dtd contains an element declaration with an invalid  		XML 1.1 and 1.0 name.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n14xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n14.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the primary document entity is 1.1 and that of the external   		dtd is 1.0.  The external dtd contains an element declaration with an invalid  		XML 1.1 and 1.0 name.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n15.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n15.xml</pre>
     * Comment: <pre>The VersionNum of the primary document entity is 1.1 and testDecl of the external   		dtd is absent.  The external dtd contains an external entity whose VersionNum is   		1.1 containing a valid XML1.0 but an invalid XML 1.1 character #x7F.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n15xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n15.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the primary document entity is 1.1 and testDecl of the external   		dtd is absent.  The external dtd contains an external entity whose VersionNum is   		1.1 containing a valid XML1.0 but an invalid XML 1.1 character #x7F.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n16.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n16.xml</pre>
     * Comment: <pre>The VersionNum of the primary document entity is 1.0 and VersioNum of the external   		entity is absent.  The replacement text of the entity contains an element followed   		by the valid XML 1.1 of line character NEL  #x85 in its empty elem tag.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n16xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n16.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the primary document entity is 1.0 and VersioNum of the external   		entity is absent.  The replacement text of the entity contains an element followed   		by the valid XML 1.1 of line character NEL  #x85 in its empty elem tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n17.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n17.xml</pre>
     * Comment: <pre>The VersionNum of the primary document entity is absent and that of the external   		entity is 1.0.  The textDecl in the external entity contains an invalid XML1.0  		but valid XML 1.1 enf of line character NEL #x85.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n17xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n17.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the primary document entity is absent and that of the external   		entity is 1.0.  The textDecl in the external entity contains an invalid XML1.0  		but valid XML 1.1 enf of line character NEL #x85.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n18.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n18.xml</pre>
     * Comment: <pre>The VersionNum of the primary document entity is absent and that of the external   		entity is 1.0.  The textDecl in the external entity contains an invalid XML1.0  		but valid XML 1.1 of line character Unicode line separator #x2028.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n18xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n18.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the primary document entity is absent and that of the external   		entity is 1.0.  The textDecl in the external entity contains an invalid XML1.0  		but valid XML 1.1 of line character Unicode line separator #x2028.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n19.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n19.xml</pre>
     * Comment: <pre>The VersionNum of the primary document entity is 1.1 and that of the external   		dtd is absent.  The external dtd contains an external entity whose VersionNum is   		absent and it contains a valid XML 1.0 but an invalid XML 1.1 character #x94.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n19xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n19.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the primary document entity is 1.1 and that of the external   		dtd is absent.  The external dtd contains an external entity whose VersionNum is   		absent and it contains a valid XML 1.0 but an invalid XML 1.1 character #x94.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n20.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n20.xml</pre>
     * Comment: <pre>The VersionNum of the primary document entity is 1.1 and that of the external   		dtd is 1.1.  The external dtd contains an external entity whose VersionNum is   		absent and it contains a valid XML 1.0 but an invalid XML 1.1 character #x8F.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n20xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n20.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the primary document entity is 1.1 and that of the external   		dtd is 1.1.  The external dtd contains an external entity whose VersionNum is   		absent and it contains a valid XML 1.0 but an invalid XML 1.1 character #x8F.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-not-wf-P77-ibm77n21.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n21.xml</pre>
     * Comment: <pre>The VersionNum of the primary document entity is 1.1 and the texlDecl of the   		external dtd is absent.  The external dtd contains a reference to an external   		parameter entity whose VersionNum is absent from the textDecl and it contains   		an invalid XML 1.1 character #x8F.</pre>
     * Sections: <pre>4.3.4</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_not_wf_P77_ibm77n21xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n21.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The VersionNum of the primary document entity is 1.1 and the texlDecl of the   		external dtd is absent.  The external dtd contains a reference to an external   		parameter entity whose VersionNum is absent from the textDecl and it contains   		an invalid XML 1.1 character #x8F.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}