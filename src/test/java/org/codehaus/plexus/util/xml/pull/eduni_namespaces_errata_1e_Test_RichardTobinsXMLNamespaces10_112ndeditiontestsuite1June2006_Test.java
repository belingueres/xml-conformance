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
 * TESCASES PROFILE: <pre>Richard Tobin's XML Namespaces 1.0/1.1 2nd edition test suite 1 June 2006</pre>
 * XML test files base folder: <pre>xmlconf/eduni/namespaces/errata-1e/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class eduni_namespaces_errata_1e_Test_RichardTobinsXMLNamespaces10_112ndeditiontestsuite1June2006_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/eduni/namespaces/errata-1e/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>rmt-ns-e1.0-13a</pre>
     * Test URI: <pre>NE13a.xml</pre>
     * Comment: <pre>The xml namespace must not be declared as the default namespace.</pre>
     * Sections: <pre>NE13</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_ns_e10_13a()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "NE13a.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The xml namespace must not be declared as the default namespace.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-ns-e1.0-13b</pre>
     * Test URI: <pre>NE13b.xml</pre>
     * Comment: <pre>The xmlns namespace must not be declared as the default namespace.</pre>
     * Sections: <pre>NE13</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_ns_e10_13b()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "NE13b.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The xmlns namespace must not be declared as the default namespace.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-ns-e1.0-13c</pre>
     * Test URI: <pre>NE13c.xml</pre>
     * Comment: <pre>Elements must not have the prefix xmlns.</pre>
     * Sections: <pre>NE13</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_ns_e10_13c()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "NE13c.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Elements must not have the prefix xmlns.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}