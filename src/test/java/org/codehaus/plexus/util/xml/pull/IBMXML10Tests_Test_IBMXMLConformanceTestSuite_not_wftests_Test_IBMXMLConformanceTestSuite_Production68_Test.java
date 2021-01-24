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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 68</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production68_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P68-ibm68n01.xml</pre>
     * Test URI: <pre>not-wf/P68/ibm68n01.xml</pre>
     * Comment: <pre>Tests EntityRef with a required field missing. The Name is missing      in the EntityRef in the content of the element "root".</pre>
     * Sections: <pre>4.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P68_ibm68n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P68/ibm68n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityRef with a required field missing. The Name is missing      in the EntityRef in the content of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P68-ibm68n02.xml</pre>
     * Test URI: <pre>not-wf/P68/ibm68n02.xml</pre>
     * Comment: <pre>Tests EntityRef with a required field missing. The semicolon is     missing in the EntityRef in the attribute value in the element "root".</pre>
     * Sections: <pre>4.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P68_ibm68n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P68/ibm68n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityRef with a required field missing. The semicolon is     missing in the EntityRef in the attribute value in the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P68-ibm68n03.xml</pre>
     * Test URI: <pre>not-wf/P68/ibm68n03.xml</pre>
     * Comment: <pre>Tests EntityRef with an extra white space. A white space occurs      after the ampersand in the EntityRef in the content of the element "root".</pre>
     * Sections: <pre>4.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P68_ibm68n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P68/ibm68n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityRef with an extra white space. A white space occurs      after the ampersand in the EntityRef in the content of the element \"root\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P68-ibm68n04.xml</pre>
     * Test URI: <pre>not-wf/P68/ibm68n04.xml</pre>
     * Comment: <pre>Tests EntityRef which is against P68 WFC: Entity Declared. The name     "aAa" in the EntityRef in the AttValue in the STage of the element "root"      does not match the Name of any declared entity in the DTD.</pre>
     * Sections: <pre>4.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P68_ibm68n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P68/ibm68n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityRef which is against P68 WFC: Entity Declared. The name     \"aAa\" in the EntityRef in the AttValue in the STage of the element \"root\"      does not match the Name of any declared entity in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P68-ibm68n05.xml</pre>
     * Test URI: <pre>not-wf/P68/ibm68n05.xml</pre>
     * Comment: <pre>Tests EntityRef which is against P68 WFC: Entity Declared. The      entity with the name "aaa" in the EntityRef in the AttValue in the STag of      the element "root" is not declared.</pre>
     * Sections: <pre>4.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P68_ibm68n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P68/ibm68n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityRef which is against P68 WFC: Entity Declared. The      entity with the name \"aaa\" in the EntityRef in the AttValue in the STag of      the element \"root\" is not declared.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P68-ibm68n06.xml</pre>
     * Test URI: <pre>not-wf/P68/ibm68n06.xml</pre>
     * Comment: <pre>Tests EntityRef which is against P68 WFC: Entity Declared. The      entity with the name "aaa" in the EntityRef in the AttValue in the STag of      the element "root" is externally declared, but standalone is "yes".</pre>
     * Sections: <pre>4.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P68_ibm68n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P68/ibm68n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityRef which is against P68 WFC: Entity Declared. The      entity with the name \"aaa\" in the EntityRef in the AttValue in the STag of      the element \"root\" is externally declared, but standalone is \"yes\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P68-ibm68n07.xml</pre>
     * Test URI: <pre>not-wf/P68/ibm68n07.xml</pre>
     * Comment: <pre>Tests EntityRef which is against P68 WFC: Entity Declared. The      entity with the name "aaa" in the EntityRef in the AttValue in the STag of      the element "root" is referred before declared.</pre>
     * Sections: <pre>4.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P68_ibm68n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P68/ibm68n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityRef which is against P68 WFC: Entity Declared. The      entity with the name \"aaa\" in the EntityRef in the AttValue in the STag of      the element \"root\" is referred before declared.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P68-ibm68n08.xml</pre>
     * Test URI: <pre>not-wf/P68/ibm68n08.xml</pre>
     * Comment: <pre>Tests EntityRef which is against P68 WFC: Parsed Entity. The      EntityRef in the AttValue in the STag of the element "root" contains the      name "aImage" of an unparsed entity.</pre>
     * Sections: <pre>4.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P68_ibm68n08xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P68/ibm68n08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityRef which is against P68 WFC: Parsed Entity. The      EntityRef in the AttValue in the STag of the element \"root\" contains the      name \"aImage\" of an unparsed entity.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P68-ibm68n09.xml</pre>
     * Test URI: <pre>not-wf/P68/ibm68n09.xml</pre>
     * Comment: <pre>Tests EntityRef which is against P68 WFC: No Recursion. The      recursive entity reference occurs with the entity declarations for "aaa"     and "bbb" in the DTD.</pre>
     * Sections: <pre>4.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P68_ibm68n09xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P68/ibm68n09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityRef which is against P68 WFC: No Recursion. The      recursive entity reference occurs with the entity declarations for \"aaa\"     and \"bbb\" in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P68-ibm68n10.xml</pre>
     * Test URI: <pre>not-wf/P68/ibm68n10.xml</pre>
     * Comment: <pre>Tests EntityRef which is against P68 WFC: No Recursion. The      indirect recursive entity reference occurs with the entity declarations for     "aaa", "bbb", "ccc", "ddd", and "eee" in the DTD.</pre>
     * Sections: <pre>4.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P68_ibm68n10xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P68/ibm68n10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests EntityRef which is against P68 WFC: No Recursion. The      indirect recursive entity reference occurs with the entity declarations for     \"aaa\", \"bbb\", \"ccc\", \"ddd\", and \"eee\" in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}