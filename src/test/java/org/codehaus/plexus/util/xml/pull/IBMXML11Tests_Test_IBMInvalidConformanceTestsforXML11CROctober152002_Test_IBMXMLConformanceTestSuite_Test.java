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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite</pre>
 * XML test files base folder: <pre>xmlconf/ibm/xml-1.1/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML11Tests_Test_IBMInvalidConformanceTestsforXML11CROctober152002_Test_IBMXMLConformanceTestSuite_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-1-1-valid-P46-ibm46i01.xml</pre>
     * Test URI: <pre>invalid/P46/ibm46i01.xml</pre>
     * Comment: <pre>An element with Element-Only content contains the character #x85 (NEL not a          whitespace character as defined by S).</pre>
     * Sections: <pre>3.2.1, 2.2</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_valid_P46_ibm46i01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/P46/ibm46i01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("An element with Element-Only content contains the character #x85 (NEL not a          whitespace character as defined by S).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-1-1-valid-P46-ibm46i02.xml</pre>
     * Test URI: <pre>invalid/P46/ibm46i02.xml</pre>
     * Comment: <pre>An element with Element-Only content contains the character #x2028 (LESP not a          whitespace character as defined by S).</pre>
     * Sections: <pre>3.2.1, 2.2</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_1_1_valid_P46_ibm46i02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/P46/ibm46i02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("An element with Element-Only content contains the character #x2028 (LESP not a          whitespace character as defined by S).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}