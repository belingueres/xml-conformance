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
 * TESCASES PROFILE: <pre>OASIS/NIST TESTS, 1-Nov-1998</pre>
 * XML test files base folder: <pre>xmlconf/oasis/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class OASIS_NISTXML10Tests_Test_OASIS_NISTTESTS1_Nov_1998_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/oasis/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>o-p01pass2</pre>
     * Test URI: <pre>p01pass2.xml</pre>
     * Comment: <pre>various Misc items where they can occur</pre>
     * Sections: <pre>2.2 [1]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p01pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p01pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("various Misc items where they can occur", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("various Misc items where they can occur");
        }
  }


    /**
     * Test ID: <pre>o-p06pass1</pre>
     * Test URI: <pre>p06pass1.xml</pre>
     * Comment: <pre>various satisfactions of the Names production in a NAMES     attribute</pre>
     * Sections: <pre>2.3 [6]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p06pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p06pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("various satisfactions of the Names production in a NAMES     attribute", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("various satisfactions of the Names production in a NAMES     attribute");
        }
  }


    /**
     * Test ID: <pre>o-p07pass1</pre>
     * Test URI: <pre>p07pass1.xml</pre>
     * Comment: <pre>various valid Nmtoken 's in an attribute list declaration.</pre>
     * Sections: <pre>2.3 [7]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p07pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p07pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("various valid Nmtoken 's in an attribute list declaration.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("various valid Nmtoken 's in an attribute list declaration.");
        }
  }


    /**
     * Test ID: <pre>o-p08pass1</pre>
     * Test URI: <pre>p08pass1.xml</pre>
     * Comment: <pre>various satisfaction of an NMTOKENS attribute value.</pre>
     * Sections: <pre>2.3 [8]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p08pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p08pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("various satisfaction of an NMTOKENS attribute value.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("various satisfaction of an NMTOKENS attribute value.");
        }
  }


    /**
     * Test ID: <pre>o-p09pass1</pre>
     * Test URI: <pre>p09pass1.xml</pre>
     * Comment: <pre>valid EntityValue's.  Except for entity references,               markup is not recognized.</pre>
     * Sections: <pre>2.3 [9]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p09pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p09pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("valid EntityValue's.  Except for entity references,               markup is not recognized.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("valid EntityValue's.  Except for entity references,               markup is not recognized.");
        }
  }


    /**
     * Test ID: <pre>o-p12pass1</pre>
     * Test URI: <pre>p12pass1.xml</pre>
     * Comment: <pre>valid public IDs.</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p12pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p12pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("valid public IDs.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("valid public IDs.");
        }
  }


    /**
     * Test ID: <pre>o-p22pass4</pre>
     * Test URI: <pre>p22pass4.xml</pre>
     * Comment: <pre>XML decl and doctypedecl</pre>
     * Sections: <pre>2.8 [22]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p22pass4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p22pass4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("XML decl and doctypedecl", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("XML decl and doctypedecl");
        }
  }


    /**
     * Test ID: <pre>o-p22pass5</pre>
     * Test URI: <pre>p22pass5.xml</pre>
     * Comment: <pre>just doctypedecl</pre>
     * Sections: <pre>2.8 [22]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p22pass5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p22pass5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("just doctypedecl", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("just doctypedecl");
        }
  }


    /**
     * Test ID: <pre>o-p22pass6</pre>
     * Test URI: <pre>p22pass6.xml</pre>
     * Comment: <pre>S between decls is not required</pre>
     * Sections: <pre>2.8 [22]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p22pass6()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p22pass6.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("S between decls is not required", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("S between decls is not required");
        }
  }


    /**
     * Test ID: <pre>o-p28pass1</pre>
     * Test URI: <pre>p28pass1.xml</pre>
     * Comment: <pre>Empty-element tag must be used for element which are declared EMPTY.</pre>
     * Sections: <pre>3.1 [43] [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p28pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p28pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Empty-element tag must be used for element which are declared EMPTY.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Empty-element tag must be used for element which are declared EMPTY.");
        }
  }


    /**
     * Test ID: <pre>o-p28pass3</pre>
     * Test URI: <pre>p28pass3.xml</pre>
     * Comment: <pre>Valid doctypedecl with Parameter entity reference.  The declaration of a parameter entity must precede any reference to it.</pre>
     * Sections: <pre>2.8 4.1 [28] [69]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p28pass3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p28pass3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid doctypedecl with Parameter entity reference.  The declaration of a parameter entity must precede any reference to it.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid doctypedecl with Parameter entity reference.  The declaration of a parameter entity must precede any reference to it.");
        }
  }


    /**
     * Test ID: <pre>o-p28pass4</pre>
     * Test URI: <pre>p28pass4.xml</pre>
     * Comment: <pre>Valid doctypedecl with ExternalID as an External Entity declaration.</pre>
     * Sections: <pre>2.8 4.2.2 [28] [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p28pass4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p28pass4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid doctypedecl with ExternalID as an External Entity declaration.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid doctypedecl with ExternalID as an External Entity declaration.");
        }
  }


    /**
     * Test ID: <pre>o-p28pass5</pre>
     * Test URI: <pre>p28pass5.xml</pre>
     * Comment: <pre>Valid doctypedecl with ExternalID as an External Entity.  A parameter entity reference is also used.</pre>
     * Sections: <pre>2.8 4.1 [28] [69]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p28pass5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p28pass5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid doctypedecl with ExternalID as an External Entity.  A parameter entity reference is also used.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid doctypedecl with ExternalID as an External Entity.  A parameter entity reference is also used.");
        }
  }


    /**
     * Test ID: <pre>o-p29pass1</pre>
     * Test URI: <pre>p29pass1.xml</pre>
     * Comment: <pre>Valid types of markupdecl.</pre>
     * Sections: <pre>2.8 [29]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p29pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p29pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid types of markupdecl.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid types of markupdecl.");
        }
  }


    /**
     * Test ID: <pre>o-p30pass1</pre>
     * Test URI: <pre>p30pass1.xml</pre>
     * Comment: <pre>Valid doctypedecl with ExternalID as an External Entity.  The external entity has an element declaration.</pre>
     * Sections: <pre>2.8 4.2.2 [30] [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p30pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p30pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid doctypedecl with ExternalID as an External Entity.  The external entity has an element declaration.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid doctypedecl with ExternalID as an External Entity.  The external entity has an element declaration.");
        }
  }


    /**
     * Test ID: <pre>o-p30pass2</pre>
     * Test URI: <pre>p30pass2.xml</pre>
     * Comment: <pre>Valid doctypedecl with ExternalID as an Enternal Entity.  The external entity begins with a Text Declaration.</pre>
     * Sections: <pre>2.8 4.2.2 4.3.1 [30] [75] [77]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p30pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p30pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid doctypedecl with ExternalID as an Enternal Entity.  The external entity begins with a Text Declaration.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid doctypedecl with ExternalID as an Enternal Entity.  The external entity begins with a Text Declaration.");
        }
  }


    /**
     * Test ID: <pre>o-p31pass1</pre>
     * Test URI: <pre>p31pass1.xml</pre>
     * Comment: <pre>external subset can be empty</pre>
     * Sections: <pre>2.8 [31]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p31pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p31pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("external subset can be empty", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("external subset can be empty");
        }
  }


    /**
     * Test ID: <pre>o-p31pass2</pre>
     * Test URI: <pre>p31pass2.xml</pre>
     * Comment: <pre>Valid doctypedecl with EXternalID as Enternal Entity.  The external entity contains a parameter entity reference and condtional sections.</pre>
     * Sections: <pre>2.8 3.4 4.2.2 [31] [62] [63] [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p31pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p31pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid doctypedecl with EXternalID as Enternal Entity.  The external entity contains a parameter entity reference and condtional sections.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid doctypedecl with EXternalID as Enternal Entity.  The external entity contains a parameter entity reference and condtional sections.");
        }
  }


    /**
     * Test ID: <pre>o-p43pass1</pre>
     * Test URI: <pre>p43pass1.xml</pre>
     * Comment: <pre>Valid use of character data, comments, processing instructions and CDATA sections within the start and end tag.</pre>
     * Sections: <pre>2.4 2.5 2.6 2.7 [15] [16] [18]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p43pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p43pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid use of character data, comments, processing instructions and CDATA sections within the start and end tag.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid use of character data, comments, processing instructions and CDATA sections within the start and end tag.");
        }
  }


    /**
     * Test ID: <pre>o-p45pass1</pre>
     * Test URI: <pre>p45pass1.xml</pre>
     * Comment: <pre>valid element declarations</pre>
     * Sections: <pre>3.2 [45]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p45pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p45pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("valid element declarations", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("valid element declarations");
        }
  }


    /**
     * Test ID: <pre>o-p46pass1</pre>
     * Test URI: <pre>p46pass1.xml</pre>
     * Comment: <pre>Valid use of contentspec, element content models, and mixed content within an element type declaration.</pre>
     * Sections: <pre>3.2 3.2.1 3.2.2 [45] [46] [47] [51]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p46pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p46pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid use of contentspec, element content models, and mixed content within an element type declaration.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid use of contentspec, element content models, and mixed content within an element type declaration.");
        }
  }


    /**
     * Test ID: <pre>o-p47pass1</pre>
     * Test URI: <pre>p47pass1.xml</pre>
     * Comment: <pre>Valid use of contentspec, element content models, choices, sequences and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.</pre>
     * Sections: <pre>3.2 3.2.1 [45] [46] [47] </pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p47pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p47pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid use of contentspec, element content models, choices, sequences and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid use of contentspec, element content models, choices, sequences and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.");
        }
  }


    /**
     * Test ID: <pre>o-p48pass1</pre>
     * Test URI: <pre>p48pass1.xml</pre>
     * Comment: <pre>Valid use of contentspec, element content models, choices, sequences and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.</pre>
     * Sections: <pre>3.2 3.2.1 [45] [46] [47]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p48pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p48pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid use of contentspec, element content models, choices, sequences and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid use of contentspec, element content models, choices, sequences and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.");
        }
  }


    /**
     * Test ID: <pre>o-p49pass1</pre>
     * Test URI: <pre>p49pass1.xml</pre>
     * Comment: <pre>Valid use of contentspec, element content models, choices, and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.  Whitespace is also valid between choices.</pre>
     * Sections: <pre>3.2 3.2.1 [45] [46] [47]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p49pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p49pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid use of contentspec, element content models, choices, and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.  Whitespace is also valid between choices.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid use of contentspec, element content models, choices, and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.  Whitespace is also valid between choices.");
        }
  }


    /**
     * Test ID: <pre>o-p50pass1</pre>
     * Test URI: <pre>p50pass1.xml</pre>
     * Comment: <pre>Valid use of contentspec, element content models, sequences and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.  Whitespace is also valid between sequences.</pre>
     * Sections: <pre>3.2 3.2.1 [45] [46] [47]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p50pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p50pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid use of contentspec, element content models, sequences and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.  Whitespace is also valid between sequences.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid use of contentspec, element content models, sequences and content particles within an element type declaration.  The optional character following a name or list governs the number of times the element or content particle may appear.  Whitespace is also valid between sequences.");
        }
  }


    /**
     * Test ID: <pre>o-p51pass1</pre>
     * Test URI: <pre>p51pass1.xml</pre>
     * Comment: <pre>valid Mixed contentspec's.</pre>
     * Sections: <pre>3.2.2 [51]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p51pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p51pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("valid Mixed contentspec's.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("valid Mixed contentspec's.");
        }
  }


    /**
     * Test ID: <pre>o-p52pass1</pre>
     * Test URI: <pre>p52pass1.xml</pre>
     * Comment: <pre>valid AttlistDecls: No AttDef's are required,     and the terminating           S is optional, multiple ATTLISTS per element are OK, and multiple           declarations of the same attribute are OK.</pre>
     * Sections: <pre>3.3 [52]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p52pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p52pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("valid AttlistDecls: No AttDef's are required,     and the terminating           S is optional, multiple ATTLISTS per element are OK, and multiple           declarations of the same attribute are OK.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("valid AttlistDecls: No AttDef's are required,     and the terminating           S is optional, multiple ATTLISTS per element are OK, and multiple           declarations of the same attribute are OK.");
        }
  }


    /**
     * Test ID: <pre>o-p53pass1</pre>
     * Test URI: <pre>p53pass1.xml</pre>
     * Comment: <pre>a valid AttDef</pre>
     * Sections: <pre>3.3 [53]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p53pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p53pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("a valid AttDef", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("a valid AttDef");
        }
  }


    /**
     * Test ID: <pre>o-p54pass1</pre>
     * Test URI: <pre>p54pass1.xml</pre>
     * Comment: <pre>the three kinds of attribute types</pre>
     * Sections: <pre>3.3.1 [54]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p54pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p54pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("the three kinds of attribute types", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("the three kinds of attribute types");
        }
  }


    /**
     * Test ID: <pre>o-p55pass1</pre>
     * Test URI: <pre>p55pass1.xml</pre>
     * Comment: <pre>StringType = "CDATA"</pre>
     * Sections: <pre>3.3.1 [55]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p55pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p55pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("StringType = \"CDATA\"", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("StringType = \"CDATA\"");
        }
  }


    /**
     * Test ID: <pre>o-p56pass1</pre>
     * Test URI: <pre>p56pass1.xml</pre>
     * Comment: <pre>the 7 tokenized attribute types</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p56pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p56pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("the 7 tokenized attribute types", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("the 7 tokenized attribute types");
        }
  }


    /**
     * Test ID: <pre>o-p57pass1</pre>
     * Test URI: <pre>p57pass1.xml</pre>
     * Comment: <pre>enumerated types are NMTOKEN or NOTATION lists</pre>
     * Sections: <pre>3.3.1 [57]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p57pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p57pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("enumerated types are NMTOKEN or NOTATION lists", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("enumerated types are NMTOKEN or NOTATION lists");
        }
  }


    /**
     * Test ID: <pre>o-p58pass1</pre>
     * Test URI: <pre>p58pass1.xml</pre>
     * Comment: <pre>NOTATION enumeration has on or more items</pre>
     * Sections: <pre>3.3.1 [58]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p58pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p58pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("NOTATION enumeration has on or more items", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("NOTATION enumeration has on or more items");
        }
  }


    /**
     * Test ID: <pre>o-p59pass1</pre>
     * Test URI: <pre>p59pass1.xml</pre>
     * Comment: <pre>NMTOKEN enumerations haveon or more items</pre>
     * Sections: <pre>3.3.1 [59]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p59pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p59pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("NMTOKEN enumerations haveon or more items", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("NMTOKEN enumerations haveon or more items");
        }
  }


    /**
     * Test ID: <pre>o-p60pass1</pre>
     * Test URI: <pre>p60pass1.xml</pre>
     * Comment: <pre>the four types of default values</pre>
     * Sections: <pre>3.3.2 [60]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p60pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p60pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("the four types of default values", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("the four types of default values");
        }
  }


    /**
     * Test ID: <pre>o-p61pass1</pre>
     * Test URI: <pre>p61pass1.xml</pre>
     * Comment: <pre>valid conditional sections are INCLUDE and IGNORE</pre>
     * Sections: <pre>3.4 [61]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p61pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p61pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("valid conditional sections are INCLUDE and IGNORE", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("valid conditional sections are INCLUDE and IGNORE");
        }
  }


    /**
     * Test ID: <pre>o-p62pass1</pre>
     * Test URI: <pre>p62pass1.xml</pre>
     * Comment: <pre>valid INCLUDE sections -- options S before and     after keyword, sections can nest</pre>
     * Sections: <pre>3.4 [62]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p62pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p62pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("valid INCLUDE sections -- options S before and     after keyword, sections can nest", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("valid INCLUDE sections -- options S before and     after keyword, sections can nest");
        }
  }


    /**
     * Test ID: <pre>o-p63pass1</pre>
     * Test URI: <pre>p63pass1.xml</pre>
     * Comment: <pre>valid IGNORE sections</pre>
     * Sections: <pre>3.4 [63]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p63pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p63pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("valid IGNORE sections", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("valid IGNORE sections");
        }
  }


    /**
     * Test ID: <pre>o-p64pass1</pre>
     * Test URI: <pre>p64pass1.xml</pre>
     * Comment: <pre>IGNOREd sections ignore everything except section delimiters</pre>
     * Sections: <pre>3.4 [64]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p64pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p64pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("IGNOREd sections ignore everything except section delimiters", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("IGNOREd sections ignore everything except section delimiters");
        }
  }


    /**
     * Test ID: <pre>o-p68pass1</pre>
     * Test URI: <pre>p68pass1.xml</pre>
     * Comment: <pre>Valid entity references.  Also ensures that a charref to           '&#38;' isn't interpreted as an entity reference open delimiter</pre>
     * Sections: <pre>4.1 [68]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p68pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p68pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid entity references.  Also ensures that a charref to           '&' isn't interpreted as an entity reference open delimiter", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid entity references.  Also ensures that a charref to           '&' isn't interpreted as an entity reference open delimiter");
        }
  }


    /**
     * Test ID: <pre>o-p69pass1</pre>
     * Test URI: <pre>p69pass1.xml</pre>
     * Comment: <pre>Valid PEReferences.</pre>
     * Sections: <pre>4.1 [69]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p69pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p69pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid PEReferences.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid PEReferences.");
        }
  }


    /**
     * Test ID: <pre>o-p70pass1</pre>
     * Test URI: <pre>p70pass1.xml</pre>
     * Comment: <pre>An EntityDecl is either a GEDecl or a PEDecl</pre>
     * Sections: <pre>4.2 [70]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p70pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p70pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("An EntityDecl is either a GEDecl or a PEDecl", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("An EntityDecl is either a GEDecl or a PEDecl");
        }
  }


    /**
     * Test ID: <pre>o-p71pass1</pre>
     * Test URI: <pre>p71pass1.xml</pre>
     * Comment: <pre>Valid GEDecls</pre>
     * Sections: <pre>4.2 [71]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p71pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p71pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid GEDecls", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid GEDecls");
        }
  }


    /**
     * Test ID: <pre>o-p72pass1</pre>
     * Test URI: <pre>p72pass1.xml</pre>
     * Comment: <pre>Valid PEDecls</pre>
     * Sections: <pre>4.2 [72]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p72pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p72pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Valid PEDecls", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Valid PEDecls");
        }
  }


    /**
     * Test ID: <pre>o-p73pass1</pre>
     * Test URI: <pre>p73pass1.xml</pre>
     * Comment: <pre>EntityDef is either Entity value or an external id,     with an optional NDataDecl</pre>
     * Sections: <pre>4.2 [73]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p73pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p73pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("EntityDef is either Entity value or an external id,     with an optional NDataDecl", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("EntityDef is either Entity value or an external id,     with an optional NDataDecl");
        }
  }


    /**
     * Test ID: <pre>o-p76pass1</pre>
     * Test URI: <pre>p76pass1.xml</pre>
     * Comment: <pre>valid NDataDecls</pre>
     * Sections: <pre>4.2.2 [76]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p76pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p76pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("valid NDataDecls", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("valid NDataDecls");
        }
  }


    /**
     * Test ID: <pre>o-p01pass1</pre>
     * Test URI: <pre>p01pass1.xml</pre>
     * Comment: <pre>no prolog</pre>
     * Sections: <pre>2.1 [1]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p01pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p01pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no prolog");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p01pass3</pre>
     * Test URI: <pre>p01pass3.xml</pre>
     * Comment: <pre>Misc items after the document</pre>
     * Sections: <pre>2.1 [1]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p01pass3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p01pass3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Misc items after the document");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03pass1</pre>
     * Test URI: <pre>p03pass1.xml</pre>
     * Comment: <pre>all valid S characters</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("all valid S characters");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p04pass1</pre>
     * Test URI: <pre>p04pass1.xml</pre>
     * Comment: <pre>names with all valid ASCII characters, and one from each               other class in NameChar</pre>
     * Sections: <pre>2.3 [4]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p04pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p04pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("names with all valid ASCII characters, and one from each               other class in NameChar");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p05pass1</pre>
     * Test URI: <pre>p05pass1.xml</pre>
     * Comment: <pre>various valid Name constructions</pre>
     * Sections: <pre>2.3 [5]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p05pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p05pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("various valid Name constructions");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p06fail1</pre>
     * Test URI: <pre>p06fail1.xml</pre>
     * Comment: <pre>Requires at least one name.</pre>
     * Sections: <pre>2.3 [6]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p06fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p06fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Requires at least one name.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p08fail1</pre>
     * Test URI: <pre>p08fail1.xml</pre>
     * Comment: <pre>at least one Nmtoken is required.</pre>
     * Sections: <pre>2.3 [8]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p08fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p08fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("at least one Nmtoken is required.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p08fail2</pre>
     * Test URI: <pre>p08fail2.xml</pre>
     * Comment: <pre>an invalid Nmtoken character.</pre>
     * Sections: <pre>2.3 [8]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p08fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p08fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("an invalid Nmtoken character.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p10pass1</pre>
     * Test URI: <pre>p10pass1.xml</pre>
     * Comment: <pre>valid attribute values</pre>
     * Sections: <pre>2.3 [10]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p10pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p10pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("valid attribute values");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p14pass1</pre>
     * Test URI: <pre>p14pass1.xml</pre>
     * Comment: <pre>valid CharData</pre>
     * Sections: <pre>2.4 [14]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p14pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p14pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("valid CharData");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p15pass1</pre>
     * Test URI: <pre>p15pass1.xml</pre>
     * Comment: <pre>valid comments</pre>
     * Sections: <pre>2.5 [15]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p15pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p15pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("valid comments");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p16pass1</pre>
     * Test URI: <pre>p16pass1.xml</pre>
     * Comment: <pre>Valid form of Processing Instruction. Shows that whitespace character data is valid before end of processing instruction.</pre>
     * Sections: <pre>2.6 [16] [17]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p16pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p16pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Valid form of Processing Instruction. Shows that whitespace character data is valid before end of processing instruction.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p16pass2</pre>
     * Test URI: <pre>p16pass2.xml</pre>
     * Comment: <pre>Valid form of Processing Instruction. Shows that whitespace character data is valid before end of processing instruction.</pre>
     * Sections: <pre>2.6 [16]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p16pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p16pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Valid form of Processing Instruction. Shows that whitespace character data is valid before end of processing instruction.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p16pass3</pre>
     * Test URI: <pre>p16pass3.xml</pre>
     * Comment: <pre>Valid form of Processing Instruction. Shows that whitespace character data is valid before end of processing instruction.</pre>
     * Sections: <pre>2.6 [16]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p16pass3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p16pass3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Valid form of Processing Instruction. Shows that whitespace character data is valid before end of processing instruction.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p18pass1</pre>
     * Test URI: <pre>p18pass1.xml</pre>
     * Comment: <pre>valid CDSect's.  Note that a CDStart in a CDSect is not               recognized as such</pre>
     * Sections: <pre>2.7 [18]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p18pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p18pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("valid CDSect's.  Note that a CDStart in a CDSect is not               recognized as such");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p22pass1</pre>
     * Test URI: <pre>p22pass1.xml</pre>
     * Comment: <pre>prolog can be empty</pre>
     * Sections: <pre>2.8 [22]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p22pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p22pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("prolog can be empty");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p22pass2</pre>
     * Test URI: <pre>p22pass2.xml</pre>
     * Comment: <pre>XML declaration only</pre>
     * Sections: <pre>2.8 [22]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p22pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p22pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("XML declaration only");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p22pass3</pre>
     * Test URI: <pre>p22pass3.xml</pre>
     * Comment: <pre>XML decl and Misc</pre>
     * Sections: <pre>2.8 [22]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p22pass3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p22pass3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("XML decl and Misc");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p23pass1</pre>
     * Test URI: <pre>p23pass1.xml</pre>
     * Comment: <pre>Test shows a valid XML declaration along with version info.</pre>
     * Sections: <pre>2.8 [23]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p23pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p23pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Test shows a valid XML declaration along with version info.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p23pass2</pre>
     * Test URI: <pre>p23pass2.xml</pre>
     * Comment: <pre>Test shows a valid XML declaration along with encoding declaration.</pre>
     * Sections: <pre>2.8 [23]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p23pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p23pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Test shows a valid XML declaration along with encoding declaration.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p23pass3</pre>
     * Test URI: <pre>p23pass3.xml</pre>
     * Comment: <pre>Test shows a valid XML declaration along with Standalone Document Declaration.</pre>
     * Sections: <pre>2.8 [23]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p23pass3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p23pass3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Test shows a valid XML declaration along with Standalone Document Declaration.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p23pass4</pre>
     * Test URI: <pre>p23pass4.xml</pre>
     * Comment: <pre>Test shows a valid XML declaration, encoding declarationand Standalone Document Declaration.</pre>
     * Sections: <pre>2.8 [23]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p23pass4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p23pass4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Test shows a valid XML declaration, encoding declarationand Standalone Document Declaration.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p24pass1</pre>
     * Test URI: <pre>p24pass1.xml</pre>
     * Comment: <pre>Test shows a prolog that has the VersionInfo delimited by double quotes.</pre>
     * Sections: <pre>2.8 [24]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p24pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p24pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Test shows a prolog that has the VersionInfo delimited by double quotes.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p24pass2</pre>
     * Test URI: <pre>p24pass2.xml</pre>
     * Comment: <pre>Test shows a prolog that has the VersionInfo delimited by single quotes.</pre>
     * Sections: <pre>2.8 [24]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p24pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p24pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Test shows a prolog that has the VersionInfo delimited by single quotes.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p24pass3</pre>
     * Test URI: <pre>p24pass3.xml</pre>
     * Comment: <pre>Test shows whitespace is allowed in prolog before version info.</pre>
     * Sections: <pre>2.8 [24]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p24pass3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p24pass3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Test shows whitespace is allowed in prolog before version info.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p24pass4</pre>
     * Test URI: <pre>p24pass4.xml</pre>
     * Comment: <pre>Test shows whitespace is allowed in prolog on both sides of equal sign.</pre>
     * Sections: <pre>2.8 [24]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p24pass4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p24pass4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Test shows whitespace is allowed in prolog on both sides of equal sign.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p25pass1</pre>
     * Test URI: <pre>p25pass1.xml</pre>
     * Comment: <pre>Test shows whitespace is NOT necessary before or after equal sign of versioninfo.</pre>
     * Sections: <pre>2.8 [25]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p25pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p25pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Test shows whitespace is NOT necessary before or after equal sign of versioninfo.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p25pass2</pre>
     * Test URI: <pre>p25pass2.xml</pre>
     * Comment: <pre>Test shows whitespace can be used on both sides of equal sign of versioninfo.</pre>
     * Sections: <pre>2.8 [25]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p25pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p25pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Test shows whitespace can be used on both sides of equal sign of versioninfo.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p26pass1</pre>
     * Test URI: <pre>p26pass1.xml</pre>
     * Comment: <pre>The valid version number.  We cannot test others because               a 1.0 processor is allowed to fail them.</pre>
     * Sections: <pre>2.8 [26]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p26pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p26pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The valid version number.  We cannot test others because               a 1.0 processor is allowed to fail them.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p27pass1</pre>
     * Test URI: <pre>p27pass1.xml</pre>
     * Comment: <pre>Comments are valid as the Misc part of the prolog.</pre>
     * Sections: <pre>2.8 [27]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p27pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p27pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Comments are valid as the Misc part of the prolog.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p27pass2</pre>
     * Test URI: <pre>p27pass2.xml</pre>
     * Comment: <pre>Processing Instructions are valid as the Misc part of the prolog.</pre>
     * Sections: <pre>2.8 [27]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p27pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p27pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Processing Instructions are valid as the Misc part of the prolog.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p27pass3</pre>
     * Test URI: <pre>p27pass3.xml</pre>
     * Comment: <pre>Whitespace is valid as the Misc part of the prolog.</pre>
     * Sections: <pre>2.8 [27]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p27pass3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p27pass3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Whitespace is valid as the Misc part of the prolog.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p27pass4</pre>
     * Test URI: <pre>p27pass4.xml</pre>
     * Comment: <pre>A combination of comments, whitespaces and processing instructions are valid as the Misc part of the prolog.</pre>
     * Sections: <pre>2.8 [27]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p27pass4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p27pass4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("A combination of comments, whitespaces and processing instructions are valid as the Misc part of the prolog.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p32pass1</pre>
     * Test URI: <pre>p32pass1.xml</pre>
     * Comment: <pre>Double quotes can be used as delimeters for the value of a Standalone Document Declaration.</pre>
     * Sections: <pre>2.9 [32]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p32pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p32pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Double quotes can be used as delimeters for the value of a Standalone Document Declaration.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p32pass2</pre>
     * Test URI: <pre>p32pass2.xml</pre>
     * Comment: <pre>Single quotes can be used as delimeters for the value of a Standalone Document Declaration.</pre>
     * Sections: <pre>2.9 [32]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p32pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p32pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Single quotes can be used as delimeters for the value of a Standalone Document Declaration.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p39pass1</pre>
     * Test URI: <pre>p39pass1.xml</pre>
     * Comment: <pre>Empty element tag may be used for any element which has no content.</pre>
     * Sections: <pre>3 3.1 [39] [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p39pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p39pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Empty element tag may be used for any element which has no content.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p39pass2</pre>
     * Test URI: <pre>p39pass2.xml</pre>
     * Comment: <pre>Character data is valid element content.</pre>
     * Sections: <pre>3 3.1 [39] [43]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p39pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p39pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Character data is valid element content.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p40pass1</pre>
     * Test URI: <pre>p40pass1.xml</pre>
     * Comment: <pre>Elements content can be empty.</pre>
     * Sections: <pre>3.1 [40]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p40pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p40pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Elements content can be empty.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p40pass2</pre>
     * Test URI: <pre>p40pass2.xml</pre>
     * Comment: <pre>Whitespace is valid within a Start-tag.</pre>
     * Sections: <pre>3.1 [40]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p40pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p40pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Whitespace is valid within a Start-tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p40pass3</pre>
     * Test URI: <pre>p40pass3.xml</pre>
     * Comment: <pre>Attributes are valid within a Start-tag.</pre>
     * Sections: <pre>3.1 [40] [41]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p40pass3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p40pass3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Attributes are valid within a Start-tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p40pass4</pre>
     * Test URI: <pre>p40pass4.xml</pre>
     * Comment: <pre>Whitespace and Multiple Attributes are valid within a Start-tag.</pre>
     * Sections: <pre>3.1 [40]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p40pass4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p40pass4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Whitespace and Multiple Attributes are valid within a Start-tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p41pass1</pre>
     * Test URI: <pre>p41pass1.xml</pre>
     * Comment: <pre>Attributes are valid within a Start-tag.</pre>
     * Sections: <pre>3.1 [41]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p41pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p41pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Attributes are valid within a Start-tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p41pass2</pre>
     * Test URI: <pre>p41pass2.xml</pre>
     * Comment: <pre>Whitespace is valid within a Start-tags Attribute.</pre>
     * Sections: <pre>3.1 [41]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p41pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p41pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Whitespace is valid within a Start-tags Attribute.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p42pass1</pre>
     * Test URI: <pre>p42pass1.xml</pre>
     * Comment: <pre>Test shows proper syntax for an End-tag.</pre>
     * Sections: <pre>3.1 [42]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p42pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p42pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Test shows proper syntax for an End-tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p42pass2</pre>
     * Test URI: <pre>p42pass2.xml</pre>
     * Comment: <pre>Whitespace is valid after name in End-tag.</pre>
     * Sections: <pre>3.1 [42]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p42pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p42pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Whitespace is valid after name in End-tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p44pass1</pre>
     * Test URI: <pre>p44pass1.xml</pre>
     * Comment: <pre>Valid display of an Empty Element Tag.</pre>
     * Sections: <pre>3.1 [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p44pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p44pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Valid display of an Empty Element Tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p44pass2</pre>
     * Test URI: <pre>p44pass2.xml</pre>
     * Comment: <pre>Empty Element Tags can contain an Attribute.</pre>
     * Sections: <pre>3.1 [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p44pass2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p44pass2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Empty Element Tags can contain an Attribute.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p44pass3</pre>
     * Test URI: <pre>p44pass3.xml</pre>
     * Comment: <pre>Whitespace is valid in an Empty Element Tag following the end of the attribute value.</pre>
     * Sections: <pre>3.1 [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p44pass3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p44pass3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Whitespace is valid in an Empty Element Tag following the end of the attribute value.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p44pass4</pre>
     * Test URI: <pre>p44pass4.xml</pre>
     * Comment: <pre>Whitespace is valid after the name in an Empty Element Tag.</pre>
     * Sections: <pre>3.1 [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p44pass4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p44pass4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Whitespace is valid after the name in an Empty Element Tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p44pass5</pre>
     * Test URI: <pre>p44pass5.xml</pre>
     * Comment: <pre>Whitespace and Multiple Attributes are valid in an Empty Element Tag.</pre>
     * Sections: <pre>3.1 [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p44pass5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p44pass5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Whitespace and Multiple Attributes are valid in an Empty Element Tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p66pass1</pre>
     * Test URI: <pre>p66pass1.xml</pre>
     * Comment: <pre>valid character references</pre>
     * Sections: <pre>4.1 [66]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p66pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p66pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("valid character references");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p74pass1</pre>
     * Test URI: <pre>p74pass1.xml</pre>
     * Comment: <pre>PEDef is either an entity value or an external id</pre>
     * Sections: <pre>4.2 [74]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p74pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p74pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("PEDef is either an entity value or an external id");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p75pass1</pre>
     * Test URI: <pre>p75pass1.xml</pre>
     * Comment: <pre>valid external identifiers</pre>
     * Sections: <pre>4.2.2 [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p75pass1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p75pass1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("valid external identifiers");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-e2</pre>
     * Test URI: <pre>e2.xml</pre>
     * Comment: <pre>Validity Constraint:  No duplicate tokens</pre>
     * Sections: <pre>3.3.1 [58] [59] Errata [E2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_e2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "e2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Validity Constraint:  No duplicate tokens");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p01fail1</pre>
     * Test URI: <pre>p01fail1.xml</pre>
     * Comment: <pre>S cannot occur before the prolog</pre>
     * Sections: <pre>2.1 [1]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p01fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p01fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S cannot occur before the prolog");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p01fail2</pre>
     * Test URI: <pre>p01fail2.xml</pre>
     * Comment: <pre>comments cannot occur before the prolog</pre>
     * Sections: <pre>2.1 [1]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p01fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p01fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("comments cannot occur before the prolog");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p01fail3</pre>
     * Test URI: <pre>p01fail3.xml</pre>
     * Comment: <pre>only one document element</pre>
     * Sections: <pre>2.1 [1]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p01fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p01fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("only one document element");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p01fail4</pre>
     * Test URI: <pre>p01fail4.xml</pre>
     * Comment: <pre>document element must be complete.</pre>
     * Sections: <pre>2.1 [1]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p01fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p01fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("document element must be complete.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail1</pre>
     * Test URI: <pre>p02fail1.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail10</pre>
     * Test URI: <pre>p02fail10.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail10()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail11</pre>
     * Test URI: <pre>p02fail11.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail11()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail12</pre>
     * Test URI: <pre>p02fail12.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail12()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail13</pre>
     * Test URI: <pre>p02fail13.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail13()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail13.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail14</pre>
     * Test URI: <pre>p02fail14.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail14()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail14.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail15</pre>
     * Test URI: <pre>p02fail15.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail15()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail15.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail16</pre>
     * Test URI: <pre>p02fail16.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail16()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail16.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail17</pre>
     * Test URI: <pre>p02fail17.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail17()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail17.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail18</pre>
     * Test URI: <pre>p02fail18.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail18()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail18.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail19</pre>
     * Test URI: <pre>p02fail19.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail19()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail19.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail2</pre>
     * Test URI: <pre>p02fail2.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail20</pre>
     * Test URI: <pre>p02fail20.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail20()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail20.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail21</pre>
     * Test URI: <pre>p02fail21.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail21()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail21.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail22</pre>
     * Test URI: <pre>p02fail22.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail22()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail22.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail23</pre>
     * Test URI: <pre>p02fail23.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail23()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail23.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail24</pre>
     * Test URI: <pre>p02fail24.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail24()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail24.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail25</pre>
     * Test URI: <pre>p02fail25.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail25()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail25.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail26</pre>
     * Test URI: <pre>p02fail26.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail26()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail26.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail27</pre>
     * Test URI: <pre>p02fail27.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail27()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail27.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail28</pre>
     * Test URI: <pre>p02fail28.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail28()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail28.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail29</pre>
     * Test URI: <pre>p02fail29.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail29()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail29.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail3</pre>
     * Test URI: <pre>p02fail3.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail30</pre>
     * Test URI: <pre>p02fail30.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail30()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail30.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail31</pre>
     * Test URI: <pre>p02fail31.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail31()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail31.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail4</pre>
     * Test URI: <pre>p02fail4.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail5</pre>
     * Test URI: <pre>p02fail5.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail6</pre>
     * Test URI: <pre>p02fail6.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail6()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail6.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail7</pre>
     * Test URI: <pre>p02fail7.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail7()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail7.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail8</pre>
     * Test URI: <pre>p02fail8.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail8()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail8.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p02fail9</pre>
     * Test URI: <pre>p02fail9.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.2 [2]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p02fail9()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p02fail9.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail1</pre>
     * Test URI: <pre>p03fail1.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail10</pre>
     * Test URI: <pre>p03fail10.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail10()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail11</pre>
     * Test URI: <pre>p03fail11.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail11()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail12</pre>
     * Test URI: <pre>p03fail12.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail12()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail13</pre>
     * Test URI: <pre>p03fail13.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail13()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail13.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail14</pre>
     * Test URI: <pre>p03fail14.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail14()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail14.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail15</pre>
     * Test URI: <pre>p03fail15.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail15()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail15.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail16</pre>
     * Test URI: <pre>p03fail16.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail16()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail16.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail17</pre>
     * Test URI: <pre>p03fail17.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail17()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail17.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail18</pre>
     * Test URI: <pre>p03fail18.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail18()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail18.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail19</pre>
     * Test URI: <pre>p03fail19.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail19()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail19.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail2</pre>
     * Test URI: <pre>p03fail2.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail20</pre>
     * Test URI: <pre>p03fail20.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail20()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail20.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail21</pre>
     * Test URI: <pre>p03fail21.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail21()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail21.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail22</pre>
     * Test URI: <pre>p03fail22.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail22()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail22.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail23</pre>
     * Test URI: <pre>p03fail23.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail23()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail23.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail24</pre>
     * Test URI: <pre>p03fail24.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail24()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail24.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail25</pre>
     * Test URI: <pre>p03fail25.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail25()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail25.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail26</pre>
     * Test URI: <pre>p03fail26.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail26()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail26.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail27</pre>
     * Test URI: <pre>p03fail27.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail27()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail27.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail28</pre>
     * Test URI: <pre>p03fail28.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail28()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail28.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail29</pre>
     * Test URI: <pre>p03fail29.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail29()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail29.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail3</pre>
     * Test URI: <pre>p03fail3.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail4</pre>
     * Test URI: <pre>p03fail4.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail5</pre>
     * Test URI: <pre>p03fail5.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail7</pre>
     * Test URI: <pre>p03fail7.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail7()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail7.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail8</pre>
     * Test URI: <pre>p03fail8.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail8()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail8.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p03fail9</pre>
     * Test URI: <pre>p03fail9.xml</pre>
     * Comment: <pre>Use of illegal character within XML document.</pre>
     * Sections: <pre>2.3 [3]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p03fail9()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p03fail9.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Use of illegal character within XML document.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p04fail1</pre>
     * Test URI: <pre>p04fail1.xml</pre>
     * Comment: <pre>Name contains invalid character.</pre>
     * Sections: <pre>2.3 [4]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p04fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p04fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Name contains invalid character.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p04fail2</pre>
     * Test URI: <pre>p04fail2.xml</pre>
     * Comment: <pre>Name contains invalid character.</pre>
     * Sections: <pre>2.3 [4]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p04fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p04fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Name contains invalid character.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p04fail3</pre>
     * Test URI: <pre>p04fail3.xml</pre>
     * Comment: <pre>Name contains invalid character.</pre>
     * Sections: <pre>2.3 [4]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p04fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p04fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Name contains invalid character.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p05fail1</pre>
     * Test URI: <pre>p05fail1.xml</pre>
     * Comment: <pre>a Name cannot start with a digit</pre>
     * Sections: <pre>2.3 [5]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p05fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p05fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("a Name cannot start with a digit");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p05fail2</pre>
     * Test URI: <pre>p05fail2.xml</pre>
     * Comment: <pre>a Name cannot start with a '.'</pre>
     * Sections: <pre>2.3 [5]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p05fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p05fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("a Name cannot start with a '.'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p05fail3</pre>
     * Test URI: <pre>p05fail3.xml</pre>
     * Comment: <pre>a Name cannot start with a "-"</pre>
     * Sections: <pre>2.3 [5]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p05fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p05fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("a Name cannot start with a \"-\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p05fail4</pre>
     * Test URI: <pre>p05fail4.xml</pre>
     * Comment: <pre>a Name cannot start with a CombiningChar</pre>
     * Sections: <pre>2.3 [5]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p05fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p05fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("a Name cannot start with a CombiningChar");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p05fail5</pre>
     * Test URI: <pre>p05fail5.xml</pre>
     * Comment: <pre>a Name cannot start with an Extender</pre>
     * Sections: <pre>2.3 [5]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p05fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p05fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("a Name cannot start with an Extender");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p09fail1</pre>
     * Test URI: <pre>p09fail1.xml</pre>
     * Comment: <pre>EntityValue excludes '%'</pre>
     * Sections: <pre>2.3 [9]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p09fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p09fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("EntityValue excludes '%'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p09fail2</pre>
     * Test URI: <pre>p09fail2.xml</pre>
     * Comment: <pre>EntityValue excludes '&#38;'</pre>
     * Sections: <pre>2.3 [9]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p09fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p09fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("EntityValue excludes '&'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p09fail3</pre>
     * Test URI: <pre>p09fail3.xml</pre>
     * Comment: <pre>incomplete character reference</pre>
     * Sections: <pre>2.3 [9]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p09fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p09fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("incomplete character reference");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p09fail4</pre>
     * Test URI: <pre>p09fail4.xml</pre>
     * Comment: <pre>quote types must match</pre>
     * Sections: <pre>2.3 [9]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p09fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p09fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("quote types must match");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p09fail5</pre>
     * Test URI: <pre>p09fail5.xml</pre>
     * Comment: <pre>quote types must match</pre>
     * Sections: <pre>2.3 [9]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p09fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p09fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("quote types must match");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p10fail1</pre>
     * Test URI: <pre>p10fail1.xml</pre>
     * Comment: <pre>attribute values exclude '&#38;#60;'</pre>
     * Sections: <pre>2.3 [10]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p10fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p10fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("attribute values exclude '<'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p10fail2</pre>
     * Test URI: <pre>p10fail2.xml</pre>
     * Comment: <pre>attribute values exclude '&#38;'</pre>
     * Sections: <pre>2.3 [10]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p10fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p10fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("attribute values exclude '&'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p10fail3</pre>
     * Test URI: <pre>p10fail3.xml</pre>
     * Comment: <pre>quote types must match</pre>
     * Sections: <pre>2.3 [10]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p10fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p10fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("quote types must match");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p11fail1</pre>
     * Test URI: <pre>p11fail1.xml</pre>
     * Comment: <pre>quote types must match</pre>
     * Sections: <pre>2.3 [11]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p11fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p11fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("quote types must match");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p11fail2</pre>
     * Test URI: <pre>p11fail2.xml</pre>
     * Comment: <pre>cannot contain delimiting quotes</pre>
     * Sections: <pre>2.3 [11]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p11fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p11fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("cannot contain delimiting quotes");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p12fail1</pre>
     * Test URI: <pre>p12fail1.xml</pre>
     * Comment: <pre>'"' excluded</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p12fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p12fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("'\"' excluded");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p12fail2</pre>
     * Test URI: <pre>p12fail2.xml</pre>
     * Comment: <pre>'\' excluded</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p12fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p12fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("'\' excluded");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p12fail3</pre>
     * Test URI: <pre>p12fail3.xml</pre>
     * Comment: <pre>entity references excluded</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p12fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p12fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("entity references excluded");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p12fail4</pre>
     * Test URI: <pre>p12fail4.xml</pre>
     * Comment: <pre>'&#38;#62;' excluded</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p12fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p12fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("'>' excluded");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p12fail5</pre>
     * Test URI: <pre>p12fail5.xml</pre>
     * Comment: <pre>'&#38;#60;' excluded</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p12fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p12fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("'<' excluded");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p12fail6</pre>
     * Test URI: <pre>p12fail6.xml</pre>
     * Comment: <pre>built-in entity refs excluded</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p12fail6()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p12fail6.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("built-in entity refs excluded");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p12fail7</pre>
     * Test URI: <pre>p12fail7.xml</pre>
     * Comment: <pre>The public ID has a tab character, which is disallowed</pre>
     * Sections: <pre>2.3 [13]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p12fail7()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p12fail7.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("The public ID has a tab character, which is disallowed");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p14fail1</pre>
     * Test URI: <pre>p14fail1.xml</pre>
     * Comment: <pre>'&#38;#60;' excluded</pre>
     * Sections: <pre>2.4 [14]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p14fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p14fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("'<' excluded");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p14fail2</pre>
     * Test URI: <pre>p14fail2.xml</pre>
     * Comment: <pre>'&#38;' excluded</pre>
     * Sections: <pre>2.4 [14]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p14fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p14fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("'&' excluded");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p14fail3</pre>
     * Test URI: <pre>p14fail3.xml</pre>
     * Comment: <pre>"]]&#38;#62;" excluded</pre>
     * Sections: <pre>2.4 [14]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p14fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p14fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("\"]]>\" excluded");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p15fail1</pre>
     * Test URI: <pre>p15fail1.xml</pre>
     * Comment: <pre>comments can't end in '-'</pre>
     * Sections: <pre>2.5 [15]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p15fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p15fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("comments can't end in '-'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p15fail2</pre>
     * Test URI: <pre>p15fail2.xml</pre>
     * Comment: <pre>one comment per comment (contrasted with SGML)</pre>
     * Sections: <pre>2.5 [15]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p15fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p15fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("one comment per comment (contrasted with SGML)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p15fail3</pre>
     * Test URI: <pre>p15fail3.xml</pre>
     * Comment: <pre>can't include 2 or more adjacent '-'s</pre>
     * Sections: <pre>2.5 [15]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p15fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p15fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("can't include 2 or more adjacent '-'s");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p16fail1</pre>
     * Test URI: <pre>p16fail1.xml</pre>
     * Comment: <pre>"xml" is an invalid PITarget</pre>
     * Sections: <pre>2.6 [16]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p16fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p16fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("\"xml\" is an invalid PITarget");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p16fail2</pre>
     * Test URI: <pre>p16fail2.xml</pre>
     * Comment: <pre>a PITarget must be present</pre>
     * Sections: <pre>2.6 [16]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p16fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p16fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("a PITarget must be present");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p16fail3</pre>
     * Test URI: <pre>p16fail3.xml</pre>
     * Comment: <pre>S after PITarget is required</pre>
     * Sections: <pre>2.6 [16]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p16fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p16fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S after PITarget is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p18fail1</pre>
     * Test URI: <pre>p18fail1.xml</pre>
     * Comment: <pre>no space before "CDATA"</pre>
     * Sections: <pre>2.7 [18]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p18fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p18fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no space before \"CDATA\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p18fail2</pre>
     * Test URI: <pre>p18fail2.xml</pre>
     * Comment: <pre>no space after "CDATA"</pre>
     * Sections: <pre>2.7 [18]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p18fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p18fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no space after \"CDATA\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p18fail3</pre>
     * Test URI: <pre>p18fail3.xml</pre>
     * Comment: <pre>CDSect's can't nest</pre>
     * Sections: <pre>2.7 [18]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p18fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p18fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("CDSect's can't nest");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p22fail1</pre>
     * Test URI: <pre>p22fail1.xml</pre>
     * Comment: <pre>prolog must start with XML decl</pre>
     * Sections: <pre>2.8 [22]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p22fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p22fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("prolog must start with XML decl");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p22fail2</pre>
     * Test URI: <pre>p22fail2.xml</pre>
     * Comment: <pre>prolog must start with XML decl</pre>
     * Sections: <pre>2.8 [22]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p22fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p22fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("prolog must start with XML decl");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p23fail1</pre>
     * Test URI: <pre>p23fail1.xml</pre>
     * Comment: <pre>"xml" must be lower-case</pre>
     * Sections: <pre>2.8 [23]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p23fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p23fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("\"xml\" must be lower-case");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p23fail2</pre>
     * Test URI: <pre>p23fail2.xml</pre>
     * Comment: <pre>VersionInfo must be supplied</pre>
     * Sections: <pre>2.8 [23]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p23fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p23fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("VersionInfo must be supplied");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p23fail3</pre>
     * Test URI: <pre>p23fail3.xml</pre>
     * Comment: <pre>VersionInfo must come first</pre>
     * Sections: <pre>2.8 [23]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p23fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p23fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("VersionInfo must come first");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p23fail4</pre>
     * Test URI: <pre>p23fail4.xml</pre>
     * Comment: <pre>SDDecl must come last</pre>
     * Sections: <pre>2.8 [23]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p23fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p23fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SDDecl must come last");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p23fail5</pre>
     * Test URI: <pre>p23fail5.xml</pre>
     * Comment: <pre>no SGML-type PIs</pre>
     * Sections: <pre>2.8 [23]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p23fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p23fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no SGML-type PIs");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p24fail1</pre>
     * Test URI: <pre>p24fail1.xml</pre>
     * Comment: <pre>quote types must match</pre>
     * Sections: <pre>2.8 [24]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p24fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p24fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("quote types must match");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p24fail2</pre>
     * Test URI: <pre>p24fail2.xml</pre>
     * Comment: <pre>quote types must match</pre>
     * Sections: <pre>2.8 [24]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p24fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p24fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("quote types must match");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p25fail1</pre>
     * Test URI: <pre>p25fail1.xml</pre>
     * Comment: <pre>Comment is illegal in VersionInfo.</pre>
     * Sections: <pre>2.8 [25]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p25fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p25fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Comment is illegal in VersionInfo.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p26fail1</pre>
     * Test URI: <pre>p26fail1.xml</pre>
     * Comment: <pre>Illegal character in VersionNum.</pre>
     * Sections: <pre>2.8 [26]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p26fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p26fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal character in VersionNum.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p26fail2</pre>
     * Test URI: <pre>p26fail2.xml</pre>
     * Comment: <pre>Illegal character in VersionNum.</pre>
     * Sections: <pre>2.8 [26]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p26fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p26fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal character in VersionNum.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p27fail1</pre>
     * Test URI: <pre>p27fail1.xml</pre>
     * Comment: <pre>References aren't allowed in Misc,     even if they would resolve to valid Misc.</pre>
     * Sections: <pre>2.8 [27]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p27fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p27fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("References aren't allowed in Misc,     even if they would resolve to valid Misc.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p28fail1</pre>
     * Test URI: <pre>p28fail1.xml</pre>
     * Comment: <pre>only declarations in DTD.</pre>
     * Sections: <pre>2.8 [28]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p28fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p28fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("only declarations in DTD.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p29fail1</pre>
     * Test URI: <pre>p29fail1.xml</pre>
     * Comment: <pre>A processor must not pass unknown declaration types.</pre>
     * Sections: <pre>2.8 [29]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p29fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p29fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("A processor must not pass unknown declaration types.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p30fail1</pre>
     * Test URI: <pre>p30fail1.xml</pre>
     * Comment: <pre>An XML declaration is not the same as a TextDecl</pre>
     * Sections: <pre>2.8 [30]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p30fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p30fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("An XML declaration is not the same as a TextDecl");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p31fail1</pre>
     * Test URI: <pre>p31fail1.xml</pre>
     * Comment: <pre>external subset excludes doctypedecl</pre>
     * Sections: <pre>2.8 [31]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p31fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p31fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("external subset excludes doctypedecl");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p32fail1</pre>
     * Test URI: <pre>p32fail1.xml</pre>
     * Comment: <pre>quote types must match</pre>
     * Sections: <pre>2.9 [32]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p32fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p32fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("quote types must match");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p32fail2</pre>
     * Test URI: <pre>p32fail2.xml</pre>
     * Comment: <pre>quote types must match</pre>
     * Sections: <pre>2.9 [32]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p32fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p32fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("quote types must match");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p32fail3</pre>
     * Test URI: <pre>p32fail3.xml</pre>
     * Comment: <pre>initial S is required</pre>
     * Sections: <pre>2.9 [32]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p32fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p32fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("initial S is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p32fail4</pre>
     * Test URI: <pre>p32fail4.xml</pre>
     * Comment: <pre>quotes are required</pre>
     * Sections: <pre>2.9 [32]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p32fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p32fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("quotes are required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p32fail5</pre>
     * Test URI: <pre>p32fail5.xml</pre>
     * Comment: <pre>yes or no must be lower case</pre>
     * Sections: <pre>2.9 [32]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p32fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p32fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("yes or no must be lower case");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p39fail1</pre>
     * Test URI: <pre>p39fail1.xml</pre>
     * Comment: <pre>start-tag requires end-tag</pre>
     * Sections: <pre>3 [39]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p39fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p39fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("start-tag requires end-tag");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p39fail2</pre>
     * Test URI: <pre>p39fail2.xml</pre>
     * Comment: <pre>end-tag requires start-tag</pre>
     * Sections: <pre>3 [39]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p39fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p39fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("end-tag requires start-tag");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p39fail3</pre>
     * Test URI: <pre>p39fail3.xml</pre>
     * Comment: <pre>XML documents contain one or more elements</pre>
     * Sections: <pre>3 [39]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p39fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p39fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("XML documents contain one or more elements");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p39fail4</pre>
     * Test URI: <pre>p39fail4.xml</pre>
     * Comment: <pre>XML declarations must be correctly terminated</pre>
     * Sections: <pre>2.8 [23]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p39fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p39fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("XML declarations must be correctly terminated");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p39fail5</pre>
     * Test URI: <pre>p39fail5.xml</pre>
     * Comment: <pre>XML declarations must be correctly terminated</pre>
     * Sections: <pre>2.8 [23]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p39fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p39fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("XML declarations must be correctly terminated");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p40fail1</pre>
     * Test URI: <pre>p40fail1.xml</pre>
     * Comment: <pre>S is required between attributes</pre>
     * Sections: <pre>3.1 [40]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p40fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p40fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S is required between attributes");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p40fail2</pre>
     * Test URI: <pre>p40fail2.xml</pre>
     * Comment: <pre>tags start with names, not nmtokens</pre>
     * Sections: <pre>3.1 [40]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p40fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p40fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("tags start with names, not nmtokens");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p40fail3</pre>
     * Test URI: <pre>p40fail3.xml</pre>
     * Comment: <pre>tags start with names, not nmtokens</pre>
     * Sections: <pre>3.1 [40]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p40fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p40fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("tags start with names, not nmtokens");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p40fail4</pre>
     * Test URI: <pre>p40fail4.xml</pre>
     * Comment: <pre>no space before name</pre>
     * Sections: <pre>3.1 [40]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p40fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p40fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no space before name");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p41fail1</pre>
     * Test URI: <pre>p41fail1.xml</pre>
     * Comment: <pre>quotes are required (contrast with SGML)</pre>
     * Sections: <pre>3.1 [41]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p41fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p41fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("quotes are required (contrast with SGML)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p41fail2</pre>
     * Test URI: <pre>p41fail2.xml</pre>
     * Comment: <pre>attribute name is required (contrast with SGML)</pre>
     * Sections: <pre>3.1 [41]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p41fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p41fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("attribute name is required (contrast with SGML)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p41fail3</pre>
     * Test URI: <pre>p41fail3.xml</pre>
     * Comment: <pre>Eq required</pre>
     * Sections: <pre>3.1 [41]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p41fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p41fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Eq required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p42fail1</pre>
     * Test URI: <pre>p42fail1.xml</pre>
     * Comment: <pre>no space before name</pre>
     * Sections: <pre>3.1 [42]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p42fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p42fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no space before name");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p42fail2</pre>
     * Test URI: <pre>p42fail2.xml</pre>
     * Comment: <pre>cannot end with "/&#38;#62;"</pre>
     * Sections: <pre>3.1 [42]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p42fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p42fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("cannot end with \"/>\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p42fail3</pre>
     * Test URI: <pre>p42fail3.xml</pre>
     * Comment: <pre>no NET (contrast with SGML)</pre>
     * Sections: <pre>3.1 [42]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p42fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p42fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no NET (contrast with SGML)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p43fail1</pre>
     * Test URI: <pre>p43fail1.xml</pre>
     * Comment: <pre>no non-comment declarations</pre>
     * Sections: <pre>3.1 [43]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p43fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p43fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no non-comment declarations");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p43fail2</pre>
     * Test URI: <pre>p43fail2.xml</pre>
     * Comment: <pre>no conditional sections</pre>
     * Sections: <pre>3.1 [43]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p43fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p43fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no conditional sections");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p43fail3</pre>
     * Test URI: <pre>p43fail3.xml</pre>
     * Comment: <pre>no conditional sections</pre>
     * Sections: <pre>3.1 [43]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p43fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p43fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no conditional sections");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p44fail1</pre>
     * Test URI: <pre>p44fail1.xml</pre>
     * Comment: <pre>Illegal space before Empty element tag.</pre>
     * Sections: <pre>3.1 [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p44fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p44fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal space before Empty element tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p44fail2</pre>
     * Test URI: <pre>p44fail2.xml</pre>
     * Comment: <pre>Illegal space after Empty element tag.</pre>
     * Sections: <pre>3.1 [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p44fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p44fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal space after Empty element tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p44fail3</pre>
     * Test URI: <pre>p44fail3.xml</pre>
     * Comment: <pre>Illegal comment in Empty element tag.</pre>
     * Sections: <pre>3.1 [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p44fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p44fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal comment in Empty element tag.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p44fail4</pre>
     * Test URI: <pre>p44fail4.xml</pre>
     * Comment: <pre>Whitespace required between attributes.</pre>
     * Sections: <pre>3.1 [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p44fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p44fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Whitespace required between attributes.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p44fail5</pre>
     * Test URI: <pre>p44fail5.xml</pre>
     * Comment: <pre>Duplicate attribute name is illegal.</pre>
     * Sections: <pre>3.1 [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p44fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p44fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Duplicate attribute name is illegal.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p45fail1</pre>
     * Test URI: <pre>p45fail1.xml</pre>
     * Comment: <pre>ELEMENT must be upper case.</pre>
     * Sections: <pre>3.2 [45]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p45fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p45fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("ELEMENT must be upper case.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p45fail2</pre>
     * Test URI: <pre>p45fail2.xml</pre>
     * Comment: <pre>S before contentspec is required.</pre>
     * Sections: <pre>3.2 [45]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p45fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p45fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S before contentspec is required.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p45fail3</pre>
     * Test URI: <pre>p45fail3.xml</pre>
     * Comment: <pre>only one content spec</pre>
     * Sections: <pre>3.2 [45]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p45fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p45fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("only one content spec");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p45fail4</pre>
     * Test URI: <pre>p45fail4.xml</pre>
     * Comment: <pre>no comments in declarations (contrast with SGML)</pre>
     * Sections: <pre>3.2 [45]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p45fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p45fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no comments in declarations (contrast with SGML)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p46fail1</pre>
     * Test URI: <pre>p46fail1.xml</pre>
     * Comment: <pre>no parens on declared content</pre>
     * Sections: <pre>3.2 [46]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p46fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p46fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no parens on declared content");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p46fail2</pre>
     * Test URI: <pre>p46fail2.xml</pre>
     * Comment: <pre>no inclusions (contrast with SGML)</pre>
     * Sections: <pre>3.2 [46]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p46fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p46fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no inclusions (contrast with SGML)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p46fail3</pre>
     * Test URI: <pre>p46fail3.xml</pre>
     * Comment: <pre>no exclusions (contrast with SGML)</pre>
     * Sections: <pre>3.2 [46]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p46fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p46fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no exclusions (contrast with SGML)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p46fail4</pre>
     * Test URI: <pre>p46fail4.xml</pre>
     * Comment: <pre>no space before occurrence</pre>
     * Sections: <pre>3.2 [46]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p46fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p46fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no space before occurrence");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p46fail5</pre>
     * Test URI: <pre>p46fail5.xml</pre>
     * Comment: <pre>single group</pre>
     * Sections: <pre>3.2 [46]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p46fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p46fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("single group");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p46fail6</pre>
     * Test URI: <pre>p46fail6.xml</pre>
     * Comment: <pre>can't be both declared and modeled</pre>
     * Sections: <pre>3.2 [46]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p46fail6()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p46fail6.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("can't be both declared and modeled");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p47fail1</pre>
     * Test URI: <pre>p47fail1.xml</pre>
     * Comment: <pre>Invalid operator '|' must match previous operator ','</pre>
     * Sections: <pre>3.2.1 [47]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p47fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p47fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Invalid operator '|' must match previous operator ','");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p47fail2</pre>
     * Test URI: <pre>p47fail2.xml</pre>
     * Comment: <pre>Illegal character '-' in Element-content model</pre>
     * Sections: <pre>3.2.1 [47]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p47fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p47fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal character '-' in Element-content model");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p47fail3</pre>
     * Test URI: <pre>p47fail3.xml</pre>
     * Comment: <pre>Optional character must follow a name or list</pre>
     * Sections: <pre>3.2.1 [47]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p47fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p47fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Optional character must follow a name or list");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p47fail4</pre>
     * Test URI: <pre>p47fail4.xml</pre>
     * Comment: <pre>Illegal space before optional character</pre>
     * Sections: <pre>3.2.1 [47]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p47fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p47fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal space before optional character");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p48fail1</pre>
     * Test URI: <pre>p48fail1.xml</pre>
     * Comment: <pre>Illegal space before optional character</pre>
     * Sections: <pre>3.2.1 [48]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p48fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p48fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal space before optional character");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p48fail2</pre>
     * Test URI: <pre>p48fail2.xml</pre>
     * Comment: <pre>Illegal space before optional character</pre>
     * Sections: <pre>3.2.1 [48]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p48fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p48fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal space before optional character");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p49fail1</pre>
     * Test URI: <pre>p49fail1.xml</pre>
     * Comment: <pre>connectors must match</pre>
     * Sections: <pre>3.2.1 [49]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p49fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p49fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("connectors must match");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p50fail1</pre>
     * Test URI: <pre>p50fail1.xml</pre>
     * Comment: <pre>connectors must match</pre>
     * Sections: <pre>3.2.1 [50]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p50fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p50fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("connectors must match");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p51fail1</pre>
     * Test URI: <pre>p51fail1.xml</pre>
     * Comment: <pre>occurrence on #PCDATA group must be *</pre>
     * Sections: <pre>3.2.2 [51]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p51fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p51fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("occurrence on #PCDATA group must be *");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p51fail2</pre>
     * Test URI: <pre>p51fail2.xml</pre>
     * Comment: <pre>occurrence on #PCDATA group must be *</pre>
     * Sections: <pre>3.2.2 [51]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p51fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p51fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("occurrence on #PCDATA group must be *");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p51fail3</pre>
     * Test URI: <pre>p51fail3.xml</pre>
     * Comment: <pre>#PCDATA must come first</pre>
     * Sections: <pre>3.2.2 [51]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p51fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p51fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("#PCDATA must come first");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p51fail4</pre>
     * Test URI: <pre>p51fail4.xml</pre>
     * Comment: <pre>occurrence on #PCDATA group must be *</pre>
     * Sections: <pre>3.2.2 [51]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p51fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p51fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("occurrence on #PCDATA group must be *");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p51fail5</pre>
     * Test URI: <pre>p51fail5.xml</pre>
     * Comment: <pre>only '|' connectors</pre>
     * Sections: <pre>3.2.2 [51]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p51fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p51fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("only '|' connectors");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p51fail6</pre>
     * Test URI: <pre>p51fail6.xml</pre>
     * Comment: <pre>Only '|' connectors and occurrence on #PCDATA group must be *</pre>
     * Sections: <pre>3.2.2 [51]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p51fail6()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p51fail6.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Only '|' connectors and occurrence on #PCDATA group must be *");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p51fail7</pre>
     * Test URI: <pre>p51fail7.xml</pre>
     * Comment: <pre>no nested groups</pre>
     * Sections: <pre>3.2.2 [51]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p51fail7()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p51fail7.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no nested groups");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p52fail1</pre>
     * Test URI: <pre>p52fail1.xml</pre>
     * Comment: <pre>A name is required</pre>
     * Sections: <pre>3.3 [52]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p52fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p52fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("A name is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p52fail2</pre>
     * Test URI: <pre>p52fail2.xml</pre>
     * Comment: <pre>A name is required</pre>
     * Sections: <pre>3.3 [52]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p52fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p52fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("A name is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p53fail1</pre>
     * Test URI: <pre>p53fail1.xml</pre>
     * Comment: <pre>S is required before default</pre>
     * Sections: <pre>3.3 [53]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p53fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p53fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S is required before default");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p53fail2</pre>
     * Test URI: <pre>p53fail2.xml</pre>
     * Comment: <pre>S is required before type</pre>
     * Sections: <pre>3.3 [53]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p53fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p53fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S is required before type");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p53fail3</pre>
     * Test URI: <pre>p53fail3.xml</pre>
     * Comment: <pre>type is required</pre>
     * Sections: <pre>3.3 [53]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p53fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p53fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("type is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p53fail4</pre>
     * Test URI: <pre>p53fail4.xml</pre>
     * Comment: <pre>default is required</pre>
     * Sections: <pre>3.3 [53]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p53fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p53fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("default is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p53fail5</pre>
     * Test URI: <pre>p53fail5.xml</pre>
     * Comment: <pre>name is requried</pre>
     * Sections: <pre>3.3 [53]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p53fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p53fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("name is requried");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p54fail1</pre>
     * Test URI: <pre>p54fail1.xml</pre>
     * Comment: <pre>don't pass unknown attribute types</pre>
     * Sections: <pre>3.3.1 [54]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p54fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p54fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("don't pass unknown attribute types");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p55fail1</pre>
     * Test URI: <pre>p55fail1.xml</pre>
     * Comment: <pre>must be upper case</pre>
     * Sections: <pre>3.3.1 [55]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p55fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p55fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("must be upper case");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p56fail1</pre>
     * Test URI: <pre>p56fail1.xml</pre>
     * Comment: <pre>no IDS type</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p56fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p56fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no IDS type");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p56fail2</pre>
     * Test URI: <pre>p56fail2.xml</pre>
     * Comment: <pre>no NUMBER type</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p56fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p56fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no NUMBER type");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p56fail3</pre>
     * Test URI: <pre>p56fail3.xml</pre>
     * Comment: <pre>no NAME type</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p56fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p56fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no NAME type");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p56fail4</pre>
     * Test URI: <pre>p56fail4.xml</pre>
     * Comment: <pre>no ENTITYS type - types must be upper case</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p56fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p56fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no ENTITYS type - types must be upper case");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p56fail5</pre>
     * Test URI: <pre>p56fail5.xml</pre>
     * Comment: <pre>types must be upper case</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p56fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p56fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("types must be upper case");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p57fail1</pre>
     * Test URI: <pre>p57fail1.xml</pre>
     * Comment: <pre>no keyword for NMTOKEN enumeration</pre>
     * Sections: <pre>3.3.1 [57]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p57fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p57fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no keyword for NMTOKEN enumeration");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p58fail1</pre>
     * Test URI: <pre>p58fail1.xml</pre>
     * Comment: <pre>at least one value required</pre>
     * Sections: <pre>3.3.1 [58]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p58fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p58fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("at least one value required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p58fail2</pre>
     * Test URI: <pre>p58fail2.xml</pre>
     * Comment: <pre>separator must be '|'</pre>
     * Sections: <pre>3.3.1 [58]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p58fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p58fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("separator must be '|'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p58fail3</pre>
     * Test URI: <pre>p58fail3.xml</pre>
     * Comment: <pre>notations are NAMEs, not NMTOKENs -- note:     Leaving the invalid           notation undeclared would cause a validating parser to fail without           checking the name syntax, so the notation is declared with an           invalid name.  A parser that reports error positions should report           an error at the AttlistDecl on line 6, before reaching the notation           declaration.</pre>
     * Sections: <pre>3.3.1 [58]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p58fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p58fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("notations are NAMEs, not NMTOKENs -- note:     Leaving the invalid           notation undeclared would cause a validating parser to fail without           checking the name syntax, so the notation is declared with an           invalid name.  A parser that reports error positions should report           an error at the AttlistDecl on line 6, before reaching the notation           declaration.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p58fail4</pre>
     * Test URI: <pre>p58fail4.xml</pre>
     * Comment: <pre>NOTATION must be upper case</pre>
     * Sections: <pre>3.3.1 [58]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p58fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p58fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("NOTATION must be upper case");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p58fail5</pre>
     * Test URI: <pre>p58fail5.xml</pre>
     * Comment: <pre>S after keyword is required</pre>
     * Sections: <pre>3.3.1 [58]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p58fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p58fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S after keyword is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p58fail6</pre>
     * Test URI: <pre>p58fail6.xml</pre>
     * Comment: <pre>parentheses are require</pre>
     * Sections: <pre>3.3.1 [58]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p58fail6()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p58fail6.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("parentheses are require");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p58fail7</pre>
     * Test URI: <pre>p58fail7.xml</pre>
     * Comment: <pre>values are unquoted</pre>
     * Sections: <pre>3.3.1 [58]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p58fail7()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p58fail7.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("values are unquoted");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p58fail8</pre>
     * Test URI: <pre>p58fail8.xml</pre>
     * Comment: <pre>values are unquoted</pre>
     * Sections: <pre>3.3.1 [58]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p58fail8()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p58fail8.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("values are unquoted");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p59fail1</pre>
     * Test URI: <pre>p59fail1.xml</pre>
     * Comment: <pre>at least one required</pre>
     * Sections: <pre>3.3.1 [59]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p59fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p59fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("at least one required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p59fail2</pre>
     * Test URI: <pre>p59fail2.xml</pre>
     * Comment: <pre>separator must be ","</pre>
     * Sections: <pre>3.3.1 [59]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p59fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p59fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("separator must be \",\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p59fail3</pre>
     * Test URI: <pre>p59fail3.xml</pre>
     * Comment: <pre>values are unquoted</pre>
     * Sections: <pre>3.3.1 [59]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p59fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p59fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("values are unquoted");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p60fail1</pre>
     * Test URI: <pre>p60fail1.xml</pre>
     * Comment: <pre>keywords must be upper case</pre>
     * Sections: <pre>3.3.2 [60]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p60fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p60fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("keywords must be upper case");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p60fail2</pre>
     * Test URI: <pre>p60fail2.xml</pre>
     * Comment: <pre>S is required after #FIXED</pre>
     * Sections: <pre>3.3.2 [60]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p60fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p60fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S is required after #FIXED");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p60fail3</pre>
     * Test URI: <pre>p60fail3.xml</pre>
     * Comment: <pre>only #FIXED has both keyword and value</pre>
     * Sections: <pre>3.3.2 [60]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p60fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p60fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("only #FIXED has both keyword and value");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p60fail4</pre>
     * Test URI: <pre>p60fail4.xml</pre>
     * Comment: <pre>#FIXED required value</pre>
     * Sections: <pre>3.3.2 [60]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p60fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p60fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("#FIXED required value");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p60fail5</pre>
     * Test URI: <pre>p60fail5.xml</pre>
     * Comment: <pre>only one default type</pre>
     * Sections: <pre>3.3.2 [60]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p60fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p60fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("only one default type");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p61fail1</pre>
     * Test URI: <pre>p61fail1.xml</pre>
     * Comment: <pre>no other types, including TEMP, which is valid in SGML</pre>
     * Sections: <pre>3.4 [61]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p61fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p61fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no other types, including TEMP, which is valid in SGML");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p62fail1</pre>
     * Test URI: <pre>p62fail1.xml</pre>
     * Comment: <pre>INCLUDE must be upper case</pre>
     * Sections: <pre>3.4 [62]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p62fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p62fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("INCLUDE must be upper case");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p62fail2</pre>
     * Test URI: <pre>p62fail2.xml</pre>
     * Comment: <pre>no spaces in terminating delimiter</pre>
     * Sections: <pre>3.4 [62]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p62fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p62fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no spaces in terminating delimiter");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p63fail1</pre>
     * Test URI: <pre>p63fail1.xml</pre>
     * Comment: <pre>IGNORE must be upper case</pre>
     * Sections: <pre>3.4 [63]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p63fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p63fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("IGNORE must be upper case");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p63fail2</pre>
     * Test URI: <pre>p63fail2.xml</pre>
     * Comment: <pre>delimiters must be balanced</pre>
     * Sections: <pre>3.4 [63]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p63fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p63fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("delimiters must be balanced");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p64fail1</pre>
     * Test URI: <pre>p64fail1.xml</pre>
     * Comment: <pre>section delimiters must balance</pre>
     * Sections: <pre>3.4 [64]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p64fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p64fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("section delimiters must balance");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p64fail2</pre>
     * Test URI: <pre>p64fail2.xml</pre>
     * Comment: <pre>section delimiters must balance</pre>
     * Sections: <pre>3.4 [64]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p64fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p64fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("section delimiters must balance");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p66fail1</pre>
     * Test URI: <pre>p66fail1.xml</pre>
     * Comment: <pre>terminating ';' is required</pre>
     * Sections: <pre>4.1 [66]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p66fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p66fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("terminating ';' is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p66fail2</pre>
     * Test URI: <pre>p66fail2.xml</pre>
     * Comment: <pre>no S after '&#38;#'</pre>
     * Sections: <pre>4.1 [66]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p66fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p66fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no S after '&#'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p66fail3</pre>
     * Test URI: <pre>p66fail3.xml</pre>
     * Comment: <pre>no hex digits in numeric reference</pre>
     * Sections: <pre>4.1 [66]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p66fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p66fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no hex digits in numeric reference");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p66fail4</pre>
     * Test URI: <pre>p66fail4.xml</pre>
     * Comment: <pre>only hex digits in hex references</pre>
     * Sections: <pre>4.1 [66]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p66fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p66fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("only hex digits in hex references");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p66fail5</pre>
     * Test URI: <pre>p66fail5.xml</pre>
     * Comment: <pre>no references to non-characters</pre>
     * Sections: <pre>4.1 [66]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p66fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p66fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no references to non-characters");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p66fail6</pre>
     * Test URI: <pre>p66fail6.xml</pre>
     * Comment: <pre>no references to non-characters</pre>
     * Sections: <pre>4.1 [66]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p66fail6()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p66fail6.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no references to non-characters");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p68fail1</pre>
     * Test URI: <pre>p68fail1.xml</pre>
     * Comment: <pre>terminating ';' is required</pre>
     * Sections: <pre>4.1 [68]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p68fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p68fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("terminating ';' is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p68fail2</pre>
     * Test URI: <pre>p68fail2.xml</pre>
     * Comment: <pre>no S after '&#38;'</pre>
     * Sections: <pre>4.1 [68]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p68fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p68fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no S after '&'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p68fail3</pre>
     * Test URI: <pre>p68fail3.xml</pre>
     * Comment: <pre>no S before ';'</pre>
     * Sections: <pre>4.1 [68]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p68fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p68fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no S before ';'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p69fail1</pre>
     * Test URI: <pre>p69fail1.xml</pre>
     * Comment: <pre>terminating ';' is required</pre>
     * Sections: <pre>4.1 [69]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p69fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p69fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("terminating ';' is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p69fail2</pre>
     * Test URI: <pre>p69fail2.xml</pre>
     * Comment: <pre>no S after '%'</pre>
     * Sections: <pre>4.1 [69]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p69fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p69fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no S after '%'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p69fail3</pre>
     * Test URI: <pre>p69fail3.xml</pre>
     * Comment: <pre>no S before ';'</pre>
     * Sections: <pre>4.1 [69]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p69fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p69fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no S before ';'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p70fail1</pre>
     * Test URI: <pre>p70fail1.xml</pre>
     * Comment: <pre>This is neither</pre>
     * Sections: <pre>4.2 [70]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p70fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p70fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("This is neither");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p71fail1</pre>
     * Test URI: <pre>p71fail1.xml</pre>
     * Comment: <pre>S is required before EntityDef</pre>
     * Sections: <pre>4.2 [71]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p71fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p71fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S is required before EntityDef");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p71fail2</pre>
     * Test URI: <pre>p71fail2.xml</pre>
     * Comment: <pre>Entity name is a Name, not an NMToken</pre>
     * Sections: <pre>4.2 [71]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p71fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p71fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Entity name is a Name, not an NMToken");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p71fail3</pre>
     * Test URI: <pre>p71fail3.xml</pre>
     * Comment: <pre>no S after "&#38;#60;!"</pre>
     * Sections: <pre>4.2 [71]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p71fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p71fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no S after \"<!\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p71fail4</pre>
     * Test URI: <pre>p71fail4.xml</pre>
     * Comment: <pre>S is required after "&#38;#60;!ENTITY"</pre>
     * Sections: <pre>4.2 [71]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p71fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p71fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S is required after \"<!ENTITY\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p72fail1</pre>
     * Test URI: <pre>p72fail1.xml</pre>
     * Comment: <pre>S is required after "&#38;#60;!ENTITY"</pre>
     * Sections: <pre>4.2 [72]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p72fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p72fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S is required after \"<!ENTITY\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p72fail2</pre>
     * Test URI: <pre>p72fail2.xml</pre>
     * Comment: <pre>S is required after '%'</pre>
     * Sections: <pre>4.2 [72]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p72fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p72fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S is required after '%'");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p72fail3</pre>
     * Test URI: <pre>p72fail3.xml</pre>
     * Comment: <pre>S is required after name</pre>
     * Sections: <pre>4.2 [72]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p72fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p72fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S is required after name");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p72fail4</pre>
     * Test URI: <pre>p72fail4.xml</pre>
     * Comment: <pre>Entity name is a name, not an NMToken</pre>
     * Sections: <pre>4.2 [72]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p72fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p72fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Entity name is a name, not an NMToken");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p73fail1</pre>
     * Test URI: <pre>p73fail1.xml</pre>
     * Comment: <pre>No typed replacement text</pre>
     * Sections: <pre>4.2 [73]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p73fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p73fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("No typed replacement text");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p73fail2</pre>
     * Test URI: <pre>p73fail2.xml</pre>
     * Comment: <pre>Only one replacement value</pre>
     * Sections: <pre>4.2 [73]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p73fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p73fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Only one replacement value");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p73fail3</pre>
     * Test URI: <pre>p73fail3.xml</pre>
     * Comment: <pre>No NDataDecl on replacement text</pre>
     * Sections: <pre>4.2 [73]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p73fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p73fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("No NDataDecl on replacement text");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p73fail4</pre>
     * Test URI: <pre>p73fail4.xml</pre>
     * Comment: <pre>Value is required</pre>
     * Sections: <pre>4.2 [73]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p73fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p73fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Value is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p73fail5</pre>
     * Test URI: <pre>p73fail5.xml</pre>
     * Comment: <pre>No NDataDecl without value</pre>
     * Sections: <pre>4.2 [73]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p73fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p73fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("No NDataDecl without value");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p74fail1</pre>
     * Test URI: <pre>p74fail1.xml</pre>
     * Comment: <pre>no NDataDecls on parameter entities</pre>
     * Sections: <pre>4.2 [74]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p74fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p74fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("no NDataDecls on parameter entities");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p74fail2</pre>
     * Test URI: <pre>p74fail2.xml</pre>
     * Comment: <pre>value is required</pre>
     * Sections: <pre>4.2 [74]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p74fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p74fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("value is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p74fail3</pre>
     * Test URI: <pre>p74fail3.xml</pre>
     * Comment: <pre>only one value</pre>
     * Sections: <pre>4.2 [74]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p74fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p74fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("only one value");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p75fail1</pre>
     * Test URI: <pre>p75fail1.xml</pre>
     * Comment: <pre>S required after "PUBLIC"</pre>
     * Sections: <pre>4.2.2 [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p75fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p75fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S required after \"PUBLIC\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p75fail2</pre>
     * Test URI: <pre>p75fail2.xml</pre>
     * Comment: <pre>S required after "SYSTEM"</pre>
     * Sections: <pre>4.2.2 [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p75fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p75fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S required after \"SYSTEM\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p75fail3</pre>
     * Test URI: <pre>p75fail3.xml</pre>
     * Comment: <pre>S required between literals</pre>
     * Sections: <pre>4.2.2 [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p75fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p75fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S required between literals");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p75fail4</pre>
     * Test URI: <pre>p75fail4.xml</pre>
     * Comment: <pre>"SYSTEM" implies only one literal</pre>
     * Sections: <pre>4.2.2 [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p75fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p75fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("\"SYSTEM\" implies only one literal");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p75fail5</pre>
     * Test URI: <pre>p75fail5.xml</pre>
     * Comment: <pre>only one keyword</pre>
     * Sections: <pre>4.2.2 [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p75fail5()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p75fail5.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("only one keyword");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p75fail6</pre>
     * Test URI: <pre>p75fail6.xml</pre>
     * Comment: <pre>"PUBLIC" requires two literals (contrast with SGML)</pre>
     * Sections: <pre>4.2.2 [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p75fail6()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p75fail6.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("\"PUBLIC\" requires two literals (contrast with SGML)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p76fail1</pre>
     * Test URI: <pre>p76fail1.xml</pre>
     * Comment: <pre>S is required before "NDATA"</pre>
     * Sections: <pre>4.2.2 [76]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p76fail1()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p76fail1.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("S is required before \"NDATA\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p76fail2</pre>
     * Test URI: <pre>p76fail2.xml</pre>
     * Comment: <pre>"NDATA" is upper-case</pre>
     * Sections: <pre>4.2.2 [76]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p76fail2()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p76fail2.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("\"NDATA\" is upper-case");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p76fail3</pre>
     * Test URI: <pre>p76fail3.xml</pre>
     * Comment: <pre>notation name is required</pre>
     * Sections: <pre>4.2.2 [76]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p76fail3()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p76fail3.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("notation name is required");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>o-p76fail4</pre>
     * Test URI: <pre>p76fail4.xml</pre>
     * Comment: <pre>notation names are Names</pre>
     * Sections: <pre>4.2.2 [76]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testo_p76fail4()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "p76fail4.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("notation names are Names");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}