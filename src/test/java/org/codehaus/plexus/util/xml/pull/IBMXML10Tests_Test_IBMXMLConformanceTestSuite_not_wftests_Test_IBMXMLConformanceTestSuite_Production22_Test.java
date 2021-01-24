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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 22</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production22_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P22-ibm22n01.xml</pre>
     * Test URI: <pre>not-wf/P22/ibm22n01.xml</pre>
     * Comment: <pre>Tests prolog with wrong field ordering. The XMLDecl occurs     after the DTD.</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P22_ibm22n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P22/ibm22n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests prolog with wrong field ordering. The XMLDecl occurs     after the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P22-ibm22n02.xml</pre>
     * Test URI: <pre>not-wf/P22/ibm22n02.xml</pre>
     * Comment: <pre>Tests prolog with wrong field ordering. The Misc (comment)     occurs before the XMLDecl.</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P22_ibm22n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P22/ibm22n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests prolog with wrong field ordering. The Misc (comment)     occurs before the XMLDecl.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P22-ibm22n03.xml</pre>
     * Test URI: <pre>not-wf/P22/ibm22n03.xml</pre>
     * Comment: <pre>Tests prolog with wrong field ordering. The XMLDecl occurs    after the DTD and a comment. The other comment occurs before the DTD.</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P22_ibm22n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P22/ibm22n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests prolog with wrong field ordering. The XMLDecl occurs    after the DTD and a comment. The other comment occurs before the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}