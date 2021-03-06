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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 59</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production59_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P59-ibm59n01.xml</pre>
     * Test URI: <pre>not-wf/P59/ibm59n01.xml</pre>
     * Comment: <pre>Tests Enumeration with required fields missing. The Nmtokens and "|"s are     missing in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P59_ibm59n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P59/ibm59n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Enumeration with required fields missing. The Nmtokens and \"|\"s are     missing in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P59-ibm59n02.xml</pre>
     * Test URI: <pre>not-wf/P59/ibm59n02.xml</pre>
     * Comment: <pre>Tests Enumeration with a required field missing. The closing bracket ")" is     missing in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P59_ibm59n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P59/ibm59n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Enumeration with a required field missing. The closing bracket \")\" is     missing in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P59-ibm59n03.xml</pre>
     * Test URI: <pre>not-wf/P59/ibm59n03.xml</pre>
     * Comment: <pre>Tests Enumeration with wrong separator. The "," is used as the separator in      the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P59_ibm59n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P59/ibm59n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Enumeration with wrong separator. The \",\" is used as the separator in      the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P59-ibm59n04.xml</pre>
     * Test URI: <pre>not-wf/P59/ibm59n04.xml</pre>
     * Comment: <pre>Tests Enumeration with illegal presence. The double quotes occur around the      Enumeration value in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P59_ibm59n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P59/ibm59n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Enumeration with illegal presence. The double quotes occur around the      Enumeration value in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P59-ibm59n05.xml</pre>
     * Test URI: <pre>not-wf/P59/ibm59n05.xml</pre>
     * Comment: <pre>Tests Enumeration with a required field missing. The white space is missing     between  in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P59_ibm59n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P59/ibm59n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Enumeration with a required field missing. The white space is missing     between  in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P59-ibm59n06.xml</pre>
     * Test URI: <pre>not-wf/P59/ibm59n06.xml</pre>
     * Comment: <pre>Tests Enumeration with a required field missing. The beginning bracket "(" is     missing in the AttDef in the AttlistDecl in the DTD.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P59_ibm59n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P59/ibm59n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Enumeration with a required field missing. The beginning bracket \"(\" is     missing in the AttDef in the AttlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}