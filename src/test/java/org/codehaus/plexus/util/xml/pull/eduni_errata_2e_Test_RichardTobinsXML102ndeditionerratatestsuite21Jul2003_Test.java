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
 * TESCASES PROFILE: <pre>Richard Tobin's XML 1.0 2nd edition errata test suite 21 Jul 2003</pre>
 * XML test files base folder: <pre>xmlconf/eduni/errata-2e/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class eduni_errata_2e_Test_RichardTobinsXML102ndeditionerratatestsuite21Jul2003_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/eduni/errata-2e/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>rmt-e2e-2a</pre>
     * Test URI: <pre>E2a.xml</pre>
     * Comment: <pre>Duplicate token in enumerated attribute declaration</pre>
     * Sections: <pre>E2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_2a()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E2a.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Duplicate token in enumerated attribute declaration");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-2b</pre>
     * Test URI: <pre>E2b.xml</pre>
     * Comment: <pre>Duplicate token in NOTATION attribute declaration</pre>
     * Sections: <pre>E2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_2b()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E2b.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Duplicate token in NOTATION attribute declaration");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-9a</pre>
     * Test URI: <pre>E9a.xml</pre>
     * Comment: <pre>An unused attribute default need only be syntactically correct</pre>
     * Sections: <pre>E9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_9a()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E9a.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("An unused attribute default need only be syntactically correct", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("An unused attribute default need only be syntactically correct");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-9b</pre>
     * Test URI: <pre>E9b.xml</pre>
     * Comment: <pre>An attribute default must be syntactically correct even if unused</pre>
     * Sections: <pre>E9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_9b()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E9b.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("An attribute default must be syntactically correct even if unused");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-14</pre>
     * Test URI: <pre>E14.xml</pre>
     * Comment: <pre>Declarations mis-nested wrt parameter entities are just validity errors (but note that some parsers treat some such errors as fatal)</pre>
     * Sections: <pre>E14</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_14()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E14.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Declarations mis-nested wrt parameter entities are just validity errors (but note that some parsers treat some such errors as fatal)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-15a</pre>
     * Test URI: <pre>E15a.xml</pre>
     * Comment: <pre>Empty content can't contain an entity reference</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15a()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15a.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Empty content can't contain an entity reference");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-15b</pre>
     * Test URI: <pre>E15b.xml</pre>
     * Comment: <pre>Empty content can't contain a comment</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15b()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15b.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Empty content can't contain a comment");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-15c</pre>
     * Test URI: <pre>E15c.xml</pre>
     * Comment: <pre>Empty content can't contain a PI</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15c()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15c.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Empty content can't contain a PI");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-15d</pre>
     * Test URI: <pre>E15d.xml</pre>
     * Comment: <pre>Empty content can't contain whitespace</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15d()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15d.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Empty content can't contain whitespace");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-15e</pre>
     * Test URI: <pre>E15e.xml</pre>
     * Comment: <pre>Element content can contain entity reference if replacement text is whitespace</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15e()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15e.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Element content can contain entity reference if replacement text is whitespace", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Element content can contain entity reference if replacement text is whitespace");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-15f</pre>
     * Test URI: <pre>E15f.xml</pre>
     * Comment: <pre>Element content can contain entity reference if replacement text is whitespace, even if it came from a character reference in the literal entity value</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15f()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15f.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Element content can contain entity reference if replacement text is whitespace, even if it came from a character reference in the literal entity value", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Element content can contain entity reference if replacement text is whitespace, even if it came from a character reference in the literal entity value");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-15g</pre>
     * Test URI: <pre>E15g.xml</pre>
     * Comment: <pre>Element content can't contain character reference to whitespace</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15g()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15g.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Element content can't contain character reference to whitespace");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-15h</pre>
     * Test URI: <pre>E15h.xml</pre>
     * Comment: <pre>Element content can't contain entity reference if replacement text is character reference to whitespace</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15h()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15h.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Element content can't contain entity reference if replacement text is character reference to whitespace");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-15i</pre>
     * Test URI: <pre>E15i.xml</pre>
     * Comment: <pre>Element content can contain a comment</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15i()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15i.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Element content can contain a comment", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Element content can contain a comment");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-15j</pre>
     * Test URI: <pre>E15j.xml</pre>
     * Comment: <pre>Element content can contain a PI</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15j()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15j.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Element content can contain a PI", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Element content can contain a PI");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-15k</pre>
     * Test URI: <pre>E15k.xml</pre>
     * Comment: <pre>Mixed content can contain a comment</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15k()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15k.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Mixed content can contain a comment", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Mixed content can contain a comment");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-15l</pre>
     * Test URI: <pre>E15l.xml</pre>
     * Comment: <pre>Mixed content can contain a PI</pre>
     * Sections: <pre>E15</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_15l()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E15l.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Mixed content can contain a PI", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Mixed content can contain a PI");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-20</pre>
     * Test URI: <pre>E20.xml</pre>
     * Comment: <pre>Tokens, after normalization, must be separated by space, not other whitespace characters</pre>
     * Sections: <pre>E20</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_20()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E20.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tokens, after normalization, must be separated by space, not other whitespace characters");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-22</pre>
     * Test URI: <pre>E22.xml</pre>
     * Comment: <pre>UTF-8 entities may start with a BOM</pre>
     * Sections: <pre>E22</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_22()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E22.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("UTF-8 entities may start with a BOM", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("UTF-8 entities may start with a BOM");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-24</pre>
     * Test URI: <pre>E24.xml</pre>
     * Comment: <pre>Either the built-in entity or a character reference can be used to represent greater-than after two close-square-brackets</pre>
     * Sections: <pre>E24</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_24()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E24.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Either the built-in entity or a character reference can be used to represent greater-than after two close-square-brackets", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Either the built-in entity or a character reference can be used to represent greater-than after two close-square-brackets");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-27</pre>
     * Test URI: <pre>E27.xml</pre>
     * Comment: <pre>Contains an irregular UTF-8 sequence (i.e. a surrogate pair)</pre>
     * Sections: <pre>E27</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_27()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E27.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Contains an irregular UTF-8 sequence (i.e. a surrogate pair)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-29</pre>
     * Test URI: <pre>E29.xml</pre>
     * Comment: <pre>Three-letter language codes are allowed</pre>
     * Sections: <pre>E29</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_29()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E29.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Three-letter language codes are allowed", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Three-letter language codes are allowed");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-36</pre>
     * Test URI: <pre>E36.xml</pre>
     * Comment: <pre>An external ATTLIST declaration does not make a document non-standalone if the normalization would have been the same without the declaration</pre>
     * Sections: <pre>E36</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_36()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E36.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("An external ATTLIST declaration does not make a document non-standalone if the normalization would have been the same without the declaration", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("An external ATTLIST declaration does not make a document non-standalone if the normalization would have been the same without the declaration");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-38</pre>
     * Test URI: <pre>E38.xml</pre>
     * Comment: <pre>XML 1.0 document refers to 1.1 entity</pre>
     * Sections: <pre>E38</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_38()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E38.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("XML 1.0 document refers to 1.1 entity");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>rmt-e2e-41</pre>
     * Test URI: <pre>E41.xml</pre>
     * Comment: <pre>An xml:lang attribute may be empty</pre>
     * Sections: <pre>E41</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_41()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E41.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("An xml:lang attribute may be empty", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("An xml:lang attribute may be empty");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-48</pre>
     * Test URI: <pre>E48.xml</pre>
     * Comment: <pre>ANY content allows character data</pre>
     * Sections: <pre>E48</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_48()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E48.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("ANY content allows character data", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("ANY content allows character data");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-50</pre>
     * Test URI: <pre>E50.xml</pre>
     * Comment: <pre>All line-ends are normalized, even those not passed to the application. NB this can only be tested effectively in XML 1.1, since CR is in the S production; in 1.1 we can use NEL which isn't.</pre>
     * Sections: <pre>E50</pre>
     * Version: <pre>1.1</pre>
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_50()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E50.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("All line-ends are normalized, even those not passed to the application. NB this can only be tested effectively in XML 1.1, since CR is in the S production; in 1.1 we can use NEL which isn't.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("All line-ends are normalized, even those not passed to the application. NB this can only be tested effectively in XML 1.1, since CR is in the S production; in 1.1 we can use NEL which isn't.");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-60</pre>
     * Test URI: <pre>E60.xml</pre>
     * Comment: <pre>Conditional sections are allowed in external parameter entities referred to from the internal subset.</pre>
     * Sections: <pre>E60</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_60()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E60.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Conditional sections are allowed in external parameter entities referred to from the internal subset.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Conditional sections are allowed in external parameter entities referred to from the internal subset.");
        }
  }


    /**
     * Test ID: <pre>rmt-e2e-61</pre>
     * Test URI: <pre>E61.xml</pre>
     * Comment: <pre>(From John Cowan) An encoding declaration in ASCII specifying an encoding that is not compatible with ASCII (so the document is not in its declared encoding).  It should generate a fatal error.</pre>
     * Sections: <pre>E61</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testrmt_e2e_61()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "E61.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("(From John Cowan) An encoding declaration in ASCII specifying an encoding that is not compatible with ASCII (so the document is not in its declared encoding).  It should generate a fatal error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}