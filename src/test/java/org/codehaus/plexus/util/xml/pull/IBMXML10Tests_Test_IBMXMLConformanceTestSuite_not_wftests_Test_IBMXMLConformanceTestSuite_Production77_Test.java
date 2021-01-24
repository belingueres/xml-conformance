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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 77</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production77_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P77-ibm77n01.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n01.xml</pre>
     * Comment: <pre>Tests TextDecl with wrong field ordering. The VersionInfo occurs      after the EncodingDecl in the TextDecl in the file "ibm77n01.ent".</pre>
     * Sections: <pre>4.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P77_ibm77n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests TextDecl with wrong field ordering. The VersionInfo occurs      after the EncodingDecl in the TextDecl in the file \"ibm77n01.ent\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P77-ibm77n02.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n02.xml</pre>
     * Comment: <pre>Tests TextDecl with wrong key word. The string "XML" is used in the     beginning sequence in the TextDecl in the file "ibm77n02.ent".</pre>
     * Sections: <pre>4.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P77_ibm77n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests TextDecl with wrong key word. The string \"XML\" is used in the     beginning sequence in the TextDecl in the file \"ibm77n02.ent\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P77-ibm77n03.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n03.xml</pre>
     * Comment: <pre>Tests TextDecl with wrong closing sequence. The character "greater      than" is used as the closing sequence in the TextDecl in the file      "ibm77n03.ent".</pre>
     * Sections: <pre>4.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P77_ibm77n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests TextDecl with wrong closing sequence. The character \"greater      than\" is used as the closing sequence in the TextDecl in the file      \"ibm77n03.ent\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P77-ibm77n04.xml</pre>
     * Test URI: <pre>not-wf/P77/ibm77n04.xml</pre>
     * Comment: <pre>Tests TextDecl with a required field missing. The closing sequence      is missing in the TextDecl in the file "ibm77n04.ent".</pre>
     * Sections: <pre>4.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P77_ibm77n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P77/ibm77n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests TextDecl with a required field missing. The closing sequence      is missing in the TextDecl in the file \"ibm77n04.ent\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}