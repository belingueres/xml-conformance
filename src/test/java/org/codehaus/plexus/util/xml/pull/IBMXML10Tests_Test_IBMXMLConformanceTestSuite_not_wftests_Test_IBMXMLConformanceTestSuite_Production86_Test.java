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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 86</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production86_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P86-ibm86n01.xml</pre>
     * Test URI: <pre>not-wf/P86/ibm86n01.xml</pre>
     * Comment: <pre>Tests Ideographic with an illegal character. The character #x4CFF         occurs as the first character in the PITarget in the PI in the DTD.</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P86_ibm86n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P86/ibm86n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Ideographic with an illegal character. The character #x4CFF         occurs as the first character in the PITarget in the PI in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P86-ibm86n02.xml</pre>
     * Test URI: <pre>not-wf/P86/ibm86n02.xml</pre>
     * Comment: <pre>Tests Ideographic with an illegal character. The character #x9FA6         occurs as the first character in the PITarget in the PI in the DTD.</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P86_ibm86n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P86/ibm86n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Ideographic with an illegal character. The character #x9FA6         occurs as the first character in the PITarget in the PI in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P86-ibm86n03.xml</pre>
     * Test URI: <pre>not-wf/P86/ibm86n03.xml</pre>
     * Comment: <pre>Tests Ideographic with an illegal character. The character #x3008         occurs as the first character in the PITarget in the PI in the DTD.</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P86_ibm86n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P86/ibm86n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Ideographic with an illegal character. The character #x3008         occurs as the first character in the PITarget in the PI in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P86-ibm86n04.xml</pre>
     * Test URI: <pre>not-wf/P86/ibm86n04.xml</pre>
     * Comment: <pre>Tests Ideographic with an illegal character. The character #x302A         occurs as the first character in the PITarget in the PI in the DTD.</pre>
     * Sections: <pre>B.</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P86_ibm86n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P86/ibm86n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Ideographic with an illegal character. The character #x302A         occurs as the first character in the PITarget in the PI in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}