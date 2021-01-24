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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 65</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production65_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P65-ibm65n01.xml</pre>
     * Test URI: <pre>not-wf/P65/ibm65n01.xml</pre>
     * Comment: <pre>Tests Ignore with illegal string included. The string      "]](greater than)" is contained before "this" in the Ignore in the      ignoreSectContents in the file ibm65n01.dtd</pre>
     * Sections: <pre>3.4</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P65_ibm65n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P65/ibm65n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Ignore with illegal string included. The string      \"]](greater than)\" is contained before \"this\" in the Ignore in the      ignoreSectContents in the file ibm65n01.dtd");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P65-ibm65n02.xml</pre>
     * Test URI: <pre>not-wf/P65/ibm65n02.xml</pre>
     * Comment: <pre>Tests Ignore with illegal string included. The string      "(less than)![" is contained before "this" in the Ignore in the      ignoreSectContents in the file ibm65n02.dtd</pre>
     * Sections: <pre>3.4</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P65_ibm65n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P65/ibm65n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests Ignore with illegal string included. The string      \"(less than)![\" is contained before \"this\" in the Ignore in the      ignoreSectContents in the file ibm65n02.dtd");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}