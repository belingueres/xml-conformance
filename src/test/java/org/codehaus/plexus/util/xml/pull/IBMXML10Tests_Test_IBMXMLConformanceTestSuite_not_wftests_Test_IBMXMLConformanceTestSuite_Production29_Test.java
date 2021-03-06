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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 29</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production29_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>ibm-not-wf-P29-ibm29n01.xml</pre>
     * Test URI: <pre>not-wf/P29/ibm29n01.xml</pre>
     * Comment: <pre>Tests markupdecl with an illegal markup declaration. A XMLDecl      occurs inside the DTD.</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P29_ibm29n01xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P29/ibm29n01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests markupdecl with an illegal markup declaration. A XMLDecl      occurs inside the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P29-ibm29n02.xml</pre>
     * Test URI: <pre>not-wf/P29/ibm29n02.xml</pre>
     * Comment: <pre>Tests WFC "PEs in Internal Subset". A PE reference occurs inside an      elementdecl in the DTD.</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P29_ibm29n02xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P29/ibm29n02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests WFC \"PEs in Internal Subset\". A PE reference occurs inside an      elementdecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P29-ibm29n03.xml</pre>
     * Test URI: <pre>not-wf/P29/ibm29n03.xml</pre>
     * Comment: <pre>Tests WFC "PEs in Internal Subset". A PE reference occurs inside an        ATTlistDecl in the DTD.</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P29_ibm29n03xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P29/ibm29n03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests WFC \"PEs in Internal Subset\". A PE reference occurs inside an        ATTlistDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P29-ibm29n04.xml</pre>
     * Test URI: <pre>not-wf/P29/ibm29n04.xml</pre>
     * Comment: <pre>Tests WFC "PEs in Internal Subset". A PE reference occurs inside an        EntityDecl in the DTD.</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P29_ibm29n04xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P29/ibm29n04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests WFC \"PEs in Internal Subset\". A PE reference occurs inside an        EntityDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P29-ibm29n05.xml</pre>
     * Test URI: <pre>not-wf/P29/ibm29n05.xml</pre>
     * Comment: <pre>Tests WFC "PEs in Internal Subset". A PE reference occurs inside a PI in      the DTD.</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P29_ibm29n05xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P29/ibm29n05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests WFC \"PEs in Internal Subset\". A PE reference occurs inside a PI in      the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P29-ibm29n06.xml</pre>
     * Test URI: <pre>not-wf/P29/ibm29n06.xml</pre>
     * Comment: <pre>Tests WFC "PEs in Internal Subset". A PE reference occurs inside a comment     in the DTD.</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P29_ibm29n06xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P29/ibm29n06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests WFC \"PEs in Internal Subset\". A PE reference occurs inside a comment     in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>ibm-not-wf-P29-ibm29n07.xml</pre>
     * Test URI: <pre>not-wf/P29/ibm29n07.xml</pre>
     * Comment: <pre>Tests WFC "PEs in Internal Subset". A PE reference occurs inside a        NotationDecl in the DTD.</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testibm_not_wf_P29_ibm29n07xml()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/P29/ibm29n07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests WFC \"PEs in Internal Subset\". A PE reference occurs inside a        NotationDecl in the DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}