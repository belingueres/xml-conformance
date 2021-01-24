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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 74</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production74_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P74-ibm74n01.xml</pre>
     * Test URI: <pre>not-wf/P74/ibm74n01.xml</pre>
     * Comment: <pre>Tests PEDef with extra fields. The NDataDecl occurs after the      ExternalID in the PEDef in the PEDecl in the DTD.</pre>
     * Sections: <pre>4.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P74_ibm74n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P74/ibm74n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests PEDef with extra fields. The NDataDecl occurs after the      ExternalID in the PEDef in the PEDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}