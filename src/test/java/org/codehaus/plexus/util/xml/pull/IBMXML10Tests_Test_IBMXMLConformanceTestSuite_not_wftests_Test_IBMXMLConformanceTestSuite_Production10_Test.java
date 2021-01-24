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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 10</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production10_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P10-ibm10n01.xml</pre>
     * Test URI: <pre>not-wf/P10/ibm10n01.xml</pre>
     * Comment: <pre>Tests an attribute with an invalid value. The value of the attribute "first"     contains the character "less than".</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P10_ibm10n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P10/ibm10n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an attribute with an invalid value. The value of the attribute \"first\"     contains the character \"less than\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P10-ibm10n02.xml</pre>
     * Test URI: <pre>not-wf/P10/ibm10n02.xml</pre>
     * Comment: <pre>Tests an attribute with an invalid value. The value of the attribute "first"     contains the character ampersand.</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P10_ibm10n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P10/ibm10n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an attribute with an invalid value. The value of the attribute \"first\"     contains the character ampersand.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P10-ibm10n03.xml</pre>
     * Test URI: <pre>not-wf/P10/ibm10n03.xml</pre>
     * Comment: <pre>Tests an attribute with an invalid value. The value of the attribute "first"     contains the double quote character in the middle.</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P10_ibm10n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P10/ibm10n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an attribute with an invalid value. The value of the attribute \"first\"     contains the double quote character in the middle.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P10-ibm10n04.xml</pre>
     * Test URI: <pre>not-wf/P10/ibm10n04.xml</pre>
     * Comment: <pre>Tests an attribute with an invalid value. The closing bracket (double quote) is     missing with The value of the attribute "first".</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P10_ibm10n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P10/ibm10n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an attribute with an invalid value. The closing bracket (double quote) is     missing with The value of the attribute \"first\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P10-ibm10n05.xml</pre>
     * Test URI: <pre>not-wf/P10/ibm10n05.xml</pre>
     * Comment: <pre>Tests an attribute with an invalid value. The value of the attribute "first"     contains the character "less than".</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P10_ibm10n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P10/ibm10n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an attribute with an invalid value. The value of the attribute \"first\"     contains the character \"less than\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P10-ibm10n06.xml</pre>
     * Test URI: <pre>not-wf/P10/ibm10n06.xml</pre>
     * Comment: <pre>Tests an attribute with an invalid value. The value of the attribute "first"     contains the character ampersand.</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P10_ibm10n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P10/ibm10n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an attribute with an invalid value. The value of the attribute \"first\"     contains the character ampersand.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P10-ibm10n07.xml</pre>
     * Test URI: <pre>not-wf/P10/ibm10n07.xml</pre>
     * Comment: <pre>Tests an attribute with an invalid value. The value of the attribute "first"     contains the double quote character in the middle.</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P10_ibm10n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P10/ibm10n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an attribute with an invalid value. The value of the attribute \"first\"     contains the double quote character in the middle.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P10-ibm10n08.xml</pre>
     * Test URI: <pre>not-wf/P10/ibm10n08.xml</pre>
     * Comment: <pre>Tests an attribute with an invalid value. The closing bracket (single quote) is     missing with the value of the attribute "first".</pre>
     * Sections: <pre>2.3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P10_ibm10n08xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P10/ibm10n08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests an attribute with an invalid value. The closing bracket (single quote) is     missing with the value of the attribute \"first\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}