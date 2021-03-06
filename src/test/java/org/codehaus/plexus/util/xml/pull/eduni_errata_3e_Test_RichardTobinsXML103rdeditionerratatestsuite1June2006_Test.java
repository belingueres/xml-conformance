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
 * TESCASES PROFILE: <pre>Richard Tobin's XML 1.0 3rd edition errata test suite 1 June 2006</pre>
 * XML test files base folder: <pre>xmlconf/eduni/errata-3e/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class eduni_errata_3e_Test_RichardTobinsXML103rdeditionerratatestsuite1June2006_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/eduni/errata-3e/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>rmt-e3e-05a</pre>
     * Test URI: <pre>E05a.xml</pre>
     * Comment: <pre>CDATA sections may occur in Mixed content.</pre>
     * Sections: <pre>E05</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_05a()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E05a.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("CDATA sections may occur in Mixed content.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("CDATA sections may occur in Mixed content.");
        }
  }


    /**
     * Test ID: <pre>rmt-e3e-05b</pre>
     * Test URI: <pre>E05b.xml</pre>
     * Comment: <pre>CDATA sections, comments and PIs may occur in ANY content.</pre>
     * Sections: <pre>E05</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_05b()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E05b.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("CDATA sections, comments and PIs may occur in ANY content.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("CDATA sections, comments and PIs may occur in ANY content.");
        }
  }


    /**
     * Test ID: <pre>rmt-e3e-06a</pre>
     * Test URI: <pre>E06a.xml</pre>
     * Comment: <pre>Default values for IDREF attributes must match Name.</pre>
     * Sections: <pre>E06</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_06a()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E06a.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Default values for IDREF attributes must match Name.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e3e-06b</pre>
     * Test URI: <pre>E06b.xml</pre>
     * Comment: <pre>Default values for ENTITY attributes must match Name.</pre>
     * Sections: <pre>E06</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_06b()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E06b.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Default values for ENTITY attributes must match Name.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e3e-06c</pre>
     * Test URI: <pre>E06c.xml</pre>
     * Comment: <pre>Default values for IDREFS attributes must match Names.</pre>
     * Sections: <pre>E06</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_06c()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E06c.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Default values for IDREFS attributes must match Names.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e3e-06d</pre>
     * Test URI: <pre>E06d.xml</pre>
     * Comment: <pre>Default values for ENTITIES attributes must match Names.</pre>
     * Sections: <pre>E06</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_06d()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E06d.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Default values for ENTITIES attributes must match Names.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e3e-06e</pre>
     * Test URI: <pre>E06e.xml</pre>
     * Comment: <pre>Default values for NMTOKEN attributes must match Nmtoken.</pre>
     * Sections: <pre>E06</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_06e()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E06e.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Default values for NMTOKEN attributes must match Nmtoken.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e3e-06f</pre>
     * Test URI: <pre>E06f.xml</pre>
     * Comment: <pre>Default values for NMTOKENS attributes must match Nmtokens.</pre>
     * Sections: <pre>E06</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_06f()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E06f.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Default values for NMTOKENS attributes must match Nmtokens.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e3e-06g</pre>
     * Test URI: <pre>E06g.xml</pre>
     * Comment: <pre>Default values for NOTATION attributes must match one of the enumerated values.</pre>
     * Sections: <pre>E06</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_06g()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E06g.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Default values for NOTATION attributes must match one of the enumerated values.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e3e-06h</pre>
     * Test URI: <pre>E06h.xml</pre>
     * Comment: <pre>Default values for enumerated attributes must match one of the enumerated values.</pre>
     * Sections: <pre>E06</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_06h()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E06h.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Default values for enumerated attributes must match one of the enumerated values.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e3e-06i</pre>
     * Test URI: <pre>E06i.xml</pre>
     * Comment: <pre>Non-syntactic validity errors in default attributes only happen if the attribute is in fact defaulted.</pre>
     * Sections: <pre>E06</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_06i()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E06i.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Non-syntactic validity errors in default attributes only happen if the attribute is in fact defaulted.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Non-syntactic validity errors in default attributes only happen if the attribute is in fact defaulted.");
        }
  }


    /**
     * Test ID: <pre>rmt-e3e-12</pre>
     * Test URI: <pre>E12.xml</pre>
     * Comment: <pre>Default values for attributes may not contain references to external entities.</pre>
     * Sections: <pre>E12</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_12()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Default values for attributes may not contain references to external entities.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e3e-13</pre>
     * Test URI: <pre>E13.xml</pre>
     * Comment: <pre>Even internal parameter entity references are enough to make undeclared entities into mere validity errors rather than well-formedness errors.</pre>
     * Sections: <pre>E13</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e3e_13()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E13.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Even internal parameter entity references are enough to make undeclared entities into mere validity errors rather than well-formedness errors.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}