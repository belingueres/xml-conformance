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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 41</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production41_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n01.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n01.xml</pre>
     * Comment: <pre>Tests Attribute with a required field missing. The attribute name      is missing in the Attribute in the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute with a required field missing. The attribute name      is missing in the Attribute in the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n02.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n02.xml</pre>
     * Comment: <pre>Tests Attribute with a required field missing. The "=" is missing     between the attribute name and the attribute value in the Attribute in the      STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute with a required field missing. The \"=\" is missing     between the attribute name and the attribute value in the Attribute in the      STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n03.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n03.xml</pre>
     * Comment: <pre>Tests Attribute with a required field missing. The AttValue is      missing in the Attribute in the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute with a required field missing. The AttValue is      missing in the Attribute in the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n04.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n04.xml</pre>
     * Comment: <pre>Tests Attribute with a required field missing. The Name and the      "=" are missing in the Attribute in the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute with a required field missing. The Name and the      \"=\" are missing in the Attribute in the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n05.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n05.xml</pre>
     * Comment: <pre>Tests Attribute with a required field missing. The "=" and the      AttValue are missing in the Attribute in the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute with a required field missing. The \"=\" and the      AttValue are missing in the Attribute in the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n06.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n06.xml</pre>
     * Comment: <pre>Tests Attribute with a required field missing. The Name and the      AttValue are missing in the Attribute in the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute with a required field missing. The Name and the      AttValue are missing in the Attribute in the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n07.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n07.xml</pre>
     * Comment: <pre>Tests Attribute with wrong field ordering. The "=" occurs after the     Name and the AttValue in the Attribute in the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute with wrong field ordering. The \"=\" occurs after the     Name and the AttValue in the Attribute in the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n08.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n08.xml</pre>
     * Comment: <pre>Tests Attribute with wrong field ordering. The Name and the AttValue     are swapped in the Attribute in the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n08xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute with wrong field ordering. The Name and the AttValue     are swapped in the Attribute in the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n09.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n09.xml</pre>
     * Comment: <pre>Tests Attribute with wrong field ordering. The "=" occurs before the      Name and the AttValue in the Attribute in the STag of the element "root".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n09xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute with wrong field ordering. The \"=\" occurs before the      Name and the AttValue in the Attribute in the STag of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n10.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n10.xml</pre>
     * Comment: <pre>Tests Attribute against WFC "no external entity references". A direct     reference to the external entity "aExternal" is contained in the value of the     attribute "attr1".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n10xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute against WFC \"no external entity references\". A direct     reference to the external entity \"aExternal\" is contained in the value of the     attribute \"attr1\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n11.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n11.xml</pre>
     * Comment: <pre>Tests Attribute against WFC "no external entity references". A indirect     reference to the external entity "aExternal" is contained in the value of the     attribute "attr1".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n11xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute against WFC \"no external entity references\". A indirect     reference to the external entity \"aExternal\" is contained in the value of the     attribute \"attr1\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n12.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n12.xml</pre>
     * Comment: <pre>Tests Attribute against WFC "no external entity references". A direct     reference to the external unparsed entity "aImage" is contained in the value      of the attribute "attr1".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n12xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute against WFC \"no external entity references\". A direct     reference to the external unparsed entity \"aImage\" is contained in the value      of the attribute \"attr1\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n13.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n13.xml</pre>
     * Comment: <pre>Tests Attribute against WFC "No (less than) character in Attribute      Values". The character "less than" is contained in the value of the      attribute "attr1".</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n13xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n13.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute against WFC \"No (less than) character in Attribute      Values\". The character \"less than\" is contained in the value of the      attribute \"attr1\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P41-ibm41n14.xml</pre>
     * Test URI: <pre>not-wf/P41/ibm41n14.xml</pre>
     * Comment: <pre>Tests Attribute against WFC "No (less than) in Attribute Values". The character     "less than" is contained in the value of the attribute "attr1" through indirect      internal entity reference.</pre>
     * Sections: <pre>3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P41_ibm41n14xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P41/ibm41n14.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Attribute against WFC \"No (less than) in Attribute Values\". The character     \"less than\" is contained in the value of the attribute \"attr1\" through indirect      internal entity reference.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}