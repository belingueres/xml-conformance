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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 62</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production62_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P62-ibm62n01.xml</pre>
     * Test URI: <pre>not-wf/P62/ibm62n01.xml</pre>
     * Comment: <pre>Tests includeSect with wrong key word. The string "include" is used     as a key word in the beginning sequence in the includeSect in the file      ibm62n01.dtd.</pre>
     * Sections: <pre>3.4</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P62_ibm62n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P62/ibm62n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests includeSect with wrong key word. The string \"include\" is used     as a key word in the beginning sequence in the includeSect in the file      ibm62n01.dtd.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P62-ibm62n02.xml</pre>
     * Test URI: <pre>not-wf/P62/ibm62n02.xml</pre>
     * Comment: <pre>Tests includeSect with wrong beginning sequence. An extra "[" occurs     in the beginning sequence in the includeSect in the file ibm62n02.dtd.</pre>
     * Sections: <pre>3.4</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P62_ibm62n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P62/ibm62n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests includeSect with wrong beginning sequence. An extra \"[\" occurs     in the beginning sequence in the includeSect in the file ibm62n02.dtd.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P62-ibm62n03.xml</pre>
     * Test URI: <pre>not-wf/P62/ibm62n03.xml</pre>
     * Comment: <pre>Tests includeSect with wrong beginning sequence. A wrong character "?"     occurs in the beginning sequence in the includeSect in the file ibm62n03.dtd.</pre>
     * Sections: <pre>3.4</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P62_ibm62n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P62/ibm62n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests includeSect with wrong beginning sequence. A wrong character \"?\"     occurs in the beginning sequence in the includeSect in the file ibm62n03.dtd.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P62-ibm62n04.xml</pre>
     * Test URI: <pre>not-wf/P62/ibm62n04.xml</pre>
     * Comment: <pre>Tests includeSect with a required field missing. The key word      "INCLUDE" is missing in the includeSect in the file ibm62n04.dtd.</pre>
     * Sections: <pre>3.4</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P62_ibm62n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P62/ibm62n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests includeSect with a required field missing. The key word      \"INCLUDE\" is missing in the includeSect in the file ibm62n04.dtd.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P62-ibm62n05.xml</pre>
     * Test URI: <pre>not-wf/P62/ibm62n05.xml</pre>
     * Comment: <pre>Tests includeSect with a required field missing. The "[" is missing      after the key word "INCLUDE" in the includeSect in the file ibm62n05.dtd.</pre>
     * Sections: <pre>3.4</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P62_ibm62n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P62/ibm62n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests includeSect with a required field missing. The \"[\" is missing      after the key word \"INCLUDE\" in the includeSect in the file ibm62n05.dtd.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P62-ibm62n06.xml</pre>
     * Test URI: <pre>not-wf/P62/ibm62n06.xml</pre>
     * Comment: <pre>Tests includeSect with wrong field ordering. The two external subset     declarations occur before the key word "INCLUDE" in the includeSect in the      file ibm62n06.dtd.</pre>
     * Sections: <pre>3.4</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P62_ibm62n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P62/ibm62n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests includeSect with wrong field ordering. The two external subset     declarations occur before the key word \"INCLUDE\" in the includeSect in the      file ibm62n06.dtd.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P62-ibm62n07.xml</pre>
     * Test URI: <pre>not-wf/P62/ibm62n07.xml</pre>
     * Comment: <pre>Tests includeSect with a required field missing. The closing sequence     "]](greater than)" is missing in the includeSect in the file ibm62n07.dtd.</pre>
     * Sections: <pre>3.4</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P62_ibm62n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P62/ibm62n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests includeSect with a required field missing. The closing sequence     \"]](greater than)\" is missing in the includeSect in the file ibm62n07.dtd.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P62-ibm62n08.xml</pre>
     * Test URI: <pre>not-wf/P62/ibm62n08.xml</pre>
     * Comment: <pre>Tests includeSect with a required field missing. One "]" is missing      in the closing sequence in the includeSect in the file ibm62n08.dtd.</pre>
     * Sections: <pre>3.4</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P62_ibm62n08xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P62/ibm62n08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests includeSect with a required field missing. One \"]\" is missing      in the closing sequence in the includeSect in the file ibm62n08.dtd.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}