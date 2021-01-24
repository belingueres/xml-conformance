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
 * TESCASES PROFILE: <pre>Sun Microsystems XML Tests</pre>
 * XML test files base folder: <pre>xmlconf/sun/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class SunMicrosystemsXMLTests_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/sun/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>pe01</pre>
     * Test URI: <pre>valid/pe01.xml</pre>
     * Comment: <pre>Parameter entities references are NOT RECOGNIZED in default attribute     values.</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testpe01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "valid/pe01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Parameter entities references are NOT RECOGNIZED in default attribute     values.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Parameter entities references are NOT RECOGNIZED in default attribute     values.");
        }
  }


    /**
     * Test ID: <pre>inv-dtd01</pre>
     * Test URI: <pre>invalid/dtd01.xml</pre>
     * Comment: <pre>Tests the No Duplicate Types VC</pre>
     * Sections: <pre>3.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_dtd01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/dtd01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the No Duplicate Types VC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-dtd02</pre>
     * Test URI: <pre>invalid/dtd02.xml</pre>
     * Comment: <pre>Tests the "Notation Declared" VC by using an undeclared     notation name.</pre>
     * Sections: <pre>4.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_dtd02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/dtd02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Notation Declared\" VC by using an undeclared     notation name.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-dtd03</pre>
     * Test URI: <pre>invalid/dtd03.xml</pre>
     * Comment: <pre>Tests the "Element Valid" VC (clause 2)     by omitting a required element.</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_dtd03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/dtd03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Element Valid\" VC (clause 2)     by omitting a required element.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>el01</pre>
     * Test URI: <pre>invalid/el01.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 4)     by including an undeclared child element.</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testel01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/el01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 4)     by including an undeclared child element.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>el02</pre>
     * Test URI: <pre>invalid/el02.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 1)     by including elements in an EMPTY content model.</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testel02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/el02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 1)     by including elements in an EMPTY content model.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>el03</pre>
     * Test URI: <pre>invalid/el03.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 3) by including a child element     not permitted by a mixed content model.</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testel03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/el03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 3) by including a child element     not permitted by a mixed content model.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>el04</pre>
     * Test URI: <pre>invalid/el04.xml</pre>
     * Comment: <pre>Tests the Unique Element Type Declaration VC.</pre>
     * Sections: <pre>3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testel04()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/el04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Unique Element Type Declaration VC.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>el05</pre>
     * Test URI: <pre>invalid/el05.xml</pre>
     * Comment: <pre>Tests the No Duplicate Types VC.</pre>
     * Sections: <pre>3.2.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testel05()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/el05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the No Duplicate Types VC.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>el06</pre>
     * Test URI: <pre>invalid/el06.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 1),     using one of the predefined internal entities     inside an EMPTY content model.</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testel06()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/el06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 1),     using one of the predefined internal entities     inside an EMPTY content model.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>id01</pre>
     * Test URI: <pre>invalid/id01.xml</pre>
     * Comment: <pre>Tests the ID (is a Name) VC</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testid01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/id01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the ID (is a Name) VC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>id02</pre>
     * Test URI: <pre>invalid/id02.xml</pre>
     * Comment: <pre>Tests the ID (appears once) VC</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testid02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/id02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the ID (appears once) VC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>id03</pre>
     * Test URI: <pre>invalid/id03.xml</pre>
     * Comment: <pre>Tests the One ID per Element Type VC</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testid03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/id03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the One ID per Element Type VC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>id04</pre>
     * Test URI: <pre>invalid/id04.xml</pre>
     * Comment: <pre>Tests the ID Attribute Default VC</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testid04()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/id04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the ID Attribute Default VC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>id05</pre>
     * Test URI: <pre>invalid/id05.xml</pre>
     * Comment: <pre>Tests the ID Attribute Default VC</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testid05()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/id05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the ID Attribute Default VC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>id06</pre>
     * Test URI: <pre>invalid/id06.xml</pre>
     * Comment: <pre>Tests the IDREF (is a Name) VC</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testid06()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/id06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the IDREF (is a Name) VC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>id07</pre>
     * Test URI: <pre>invalid/id07.xml</pre>
     * Comment: <pre>Tests the IDREFS (is a Names) VC</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testid07()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/id07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the IDREFS (is a Names) VC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>id08</pre>
     * Test URI: <pre>invalid/id08.xml</pre>
     * Comment: <pre>Tests the IDREF (matches an ID) VC</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testid08()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/id08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the IDREF (matches an ID) VC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>id09</pre>
     * Test URI: <pre>invalid/id09.xml</pre>
     * Comment: <pre>Tests the IDREF (IDREFS matches an ID) VC</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testid09()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/id09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the IDREF (IDREFS matches an ID) VC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa01</pre>
     * Test URI: <pre>invalid/not-sa01.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     optional whitespace causes a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     optional whitespace causes a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa02</pre>
     * Test URI: <pre>invalid/not-sa02.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     attributes needing normalization cause a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     attributes needing normalization cause a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa04</pre>
     * Test URI: <pre>invalid/not-sa04.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     attributes needing defaulting cause a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa04()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     attributes needing defaulting cause a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa05</pre>
     * Test URI: <pre>invalid/not-sa05.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     a token attribute that needs normalization causes a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa05()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     a token attribute that needs normalization causes a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa06</pre>
     * Test URI: <pre>invalid/not-sa06.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     a NOTATION attribute that needs normalization     causes a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa06()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     a NOTATION attribute that needs normalization     causes a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa07</pre>
     * Test URI: <pre>invalid/not-sa07.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     an NMTOKEN attribute needing normalization     causes a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa07()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     an NMTOKEN attribute needing normalization     causes a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa08</pre>
     * Test URI: <pre>invalid/not-sa08.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     an NMTOKENS attribute needing normalization     causes a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa08()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     an NMTOKENS attribute needing normalization     causes a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa09</pre>
     * Test URI: <pre>invalid/not-sa09.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     an ID attribute needing normalization causes a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa09()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     an ID attribute needing normalization causes a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa10</pre>
     * Test URI: <pre>invalid/not-sa10.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     an IDREF attribute needing normalization causes a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa10()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     an IDREF attribute needing normalization causes a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa11</pre>
     * Test URI: <pre>invalid/not-sa11.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     an IDREFS attribute needing normalization causes a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa11()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     an IDREFS attribute needing normalization causes a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa12</pre>
     * Test URI: <pre>invalid/not-sa12.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     an ENTITY attribute needing normalization causes a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa12()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     an ENTITY attribute needing normalization causes a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa13</pre>
     * Test URI: <pre>invalid/not-sa13.xml</pre>
     * Comment: <pre>Tests the Standalone Document Declaration VC, ensuring that     an ENTITIES attribute needing normalization causes a validity error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa13()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa13.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Standalone Document Declaration VC, ensuring that     an ENTITIES attribute needing normalization causes a validity error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-not-sa14</pre>
     * Test URI: <pre>invalid/not-sa14.xml</pre>
     * Comment: <pre>CDATA sections containing only whitespace do not match the nonterminal S, and cannot      appear in these positions.</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_not_sa14()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/not-sa14.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("CDATA sections containing only whitespace do not match the nonterminal S, and cannot      appear in these positions.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional01</pre>
     * Test URI: <pre>invalid/optional01.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing no children where     one is required.</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing no children where     one is required.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional02</pre>
     * Test URI: <pre>invalid/optional02.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     two children where one is required.</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     two children where one is required.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional03</pre>
     * Test URI: <pre>invalid/optional03.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     no children where two are required.</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     no children where two are required.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional04</pre>
     * Test URI: <pre>invalid/optional04.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     three children where two are required.</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional04()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     three children where two are required.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional05</pre>
     * Test URI: <pre>invalid/optional05.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     no children where one or two are     required (one construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional05()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     no children where one or two are     required (one construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional06</pre>
     * Test URI: <pre>invalid/optional06.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     no children where one or two are     required (a second construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional06()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     no children where one or two are     required (a second construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional07</pre>
     * Test URI: <pre>invalid/optional07.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     no children where one or two are     required (a third construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional07()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     no children where one or two are     required (a third construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional08</pre>
     * Test URI: <pre>invalid/optional08.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     no children where one or two are     required (a fourth construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional08()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     no children where one or two are     required (a fourth construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional09</pre>
     * Test URI: <pre>invalid/optional09.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     no children where one or two are     required (a fifth construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional09()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     no children where one or two are     required (a fifth construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional10</pre>
     * Test URI: <pre>invalid/optional10.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     three children where one or two are     required (a basic construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional10()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     three children where one or two are     required (a basic construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional11</pre>
     * Test URI: <pre>invalid/optional11.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     three children where one or two are     required (a second construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional11()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     three children where one or two are     required (a second construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional12</pre>
     * Test URI: <pre>invalid/optional12.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     three children where one or two are     required (a third construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional12()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     three children where one or two are     required (a third construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional13</pre>
     * Test URI: <pre>invalid/optional13.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     three children where one or two are     required (a fourth construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional13()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional13.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     three children where one or two are     required (a fourth construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional14</pre>
     * Test URI: <pre>invalid/optional14.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     three children where one or two are     required (a fifth construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional14()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional14.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     three children where one or two are     required (a fifth construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional20</pre>
     * Test URI: <pre>invalid/optional20.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     no children where one or more are     required (a sixth construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional20()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional20.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     no children where one or more are     required (a sixth construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional21</pre>
     * Test URI: <pre>invalid/optional21.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     no children where one or more are     required (a seventh construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional21()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional21.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     no children where one or more are     required (a seventh construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional22</pre>
     * Test URI: <pre>invalid/optional22.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     no children where one or more are     required (an eigth construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional22()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional22.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     no children where one or more are     required (an eigth construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional23</pre>
     * Test URI: <pre>invalid/optional23.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     no children where one or more are     required (a ninth construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional23()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional23.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     no children where one or more are     required (a ninth construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional24</pre>
     * Test URI: <pre>invalid/optional24.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     no children where one or more are     required (a tenth construction of that model).</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional24()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional24.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     no children where one or more are     required (a tenth construction of that model).");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>optional25</pre>
     * Test URI: <pre>invalid/optional25.xml</pre>
     * Comment: <pre>Tests the Element Valid VC (clause 2) for one     instance of "children" content model, providing     text content where one or more elements are     required.</pre>
     * Sections: <pre>3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testoptional25()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/optional25.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Element Valid VC (clause 2) for one     instance of \"children\" content model, providing     text content where one or more elements are     required.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-required00</pre>
     * Test URI: <pre>invalid/required00.xml</pre>
     * Comment: <pre>Tests the Required Attribute VC.</pre>
     * Sections: <pre>3.3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_required00()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/required00.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Required Attribute VC.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-required01</pre>
     * Test URI: <pre>invalid/required01.xml</pre>
     * Comment: <pre>Tests the Attribute Value Type (declared)     VC for the xml:space attribute</pre>
     * Sections: <pre>3.1 2.10</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_required01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/required01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Attribute Value Type (declared)     VC for the xml:space attribute");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>inv-required02</pre>
     * Test URI: <pre>invalid/required02.xml</pre>
     * Comment: <pre>Tests the Attribute Value Type (declared)     VC for the xml:lang attribute</pre>
     * Sections: <pre>3.1 2.12</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testinv_required02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/required02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Attribute Value Type (declared)     VC for the xml:lang attribute");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>root</pre>
     * Test URI: <pre>invalid/root.xml</pre>
     * Comment: <pre>Tests the Root Element Type VC</pre>
     * Sections: <pre>2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testroot()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/root.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Root Element Type VC");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr01</pre>
     * Test URI: <pre>invalid/attr01.xml</pre>
     * Comment: <pre>Tests the "Entity Name" VC for the ENTITY attribute type.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Entity Name\" VC for the ENTITY attribute type.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr02</pre>
     * Test URI: <pre>invalid/attr02.xml</pre>
     * Comment: <pre>Tests the "Entity Name" VC for the ENTITIES attribute type.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Entity Name\" VC for the ENTITIES attribute type.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr03</pre>
     * Test URI: <pre>invalid/attr03.xml</pre>
     * Comment: <pre>Tests the "Notation Attributes" VC for the     NOTATION attribute type, first clause:  value must be one     of the ones that's declared.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Notation Attributes\" VC for the     NOTATION attribute type, first clause:  value must be one     of the ones that's declared.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr04</pre>
     * Test URI: <pre>invalid/attr04.xml</pre>
     * Comment: <pre>Tests the "Notation Attributes" VC for the     NOTATION attribute type, second clause:  the names in the     declaration must all be declared.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr04()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Notation Attributes\" VC for the     NOTATION attribute type, second clause:  the names in the     declaration must all be declared.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr05</pre>
     * Test URI: <pre>invalid/attr05.xml</pre>
     * Comment: <pre>Tests the "Name Token" VC for the NMTOKEN attribute type.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr05()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Name Token\" VC for the NMTOKEN attribute type.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr06</pre>
     * Test URI: <pre>invalid/attr06.xml</pre>
     * Comment: <pre>Tests the "Name Token" VC for the NMTOKENS attribute type.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr06()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Name Token\" VC for the NMTOKENS attribute type.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr07</pre>
     * Test URI: <pre>invalid/attr07.xml</pre>
     * Comment: <pre>Tests the "Enumeration" VC by providing     a value which wasn't one of the choices.</pre>
     * Sections: <pre>3.3.1</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr07()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Enumeration\" VC by providing     a value which wasn't one of the choices.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr08</pre>
     * Test URI: <pre>invalid/attr08.xml</pre>
     * Comment: <pre>Tests the "Fixed Attribute Default" VC by     providing the wrong value.</pre>
     * Sections: <pre>3.3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr08()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Fixed Attribute Default\" VC by     providing the wrong value.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr09</pre>
     * Test URI: <pre>invalid/attr09.xml</pre>
     * Comment: <pre>Tests the "Attribute Default Legal" VC by     providing an illegal IDREF value.</pre>
     * Sections: <pre>3.3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr09()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Attribute Default Legal\" VC by     providing an illegal IDREF value.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr10</pre>
     * Test URI: <pre>invalid/attr10.xml</pre>
     * Comment: <pre>Tests the "Attribute Default Legal" VC by     providing an illegal IDREFS value.</pre>
     * Sections: <pre>3.3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr10()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Attribute Default Legal\" VC by     providing an illegal IDREFS value.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr11</pre>
     * Test URI: <pre>invalid/attr11.xml</pre>
     * Comment: <pre>Tests the "Attribute Default Legal" VC by     providing an illegal ENTITY value.</pre>
     * Sections: <pre>3.3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr11()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Attribute Default Legal\" VC by     providing an illegal ENTITY value.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr12</pre>
     * Test URI: <pre>invalid/attr12.xml</pre>
     * Comment: <pre>Tests the "Attribute Default Legal" VC by     providing an illegal ENTITIES value.</pre>
     * Sections: <pre>3.3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr12()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Attribute Default Legal\" VC by     providing an illegal ENTITIES value.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr13</pre>
     * Test URI: <pre>invalid/attr13.xml</pre>
     * Comment: <pre>Tests the "Attribute Default Legal" VC by     providing an illegal NMTOKEN value.</pre>
     * Sections: <pre>3.3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr13()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr13.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Attribute Default Legal\" VC by     providing an illegal NMTOKEN value.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr14</pre>
     * Test URI: <pre>invalid/attr14.xml</pre>
     * Comment: <pre>Tests the "Attribute Default Legal" VC by     providing an illegal NMTOKENS value.</pre>
     * Sections: <pre>3.3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr14()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr14.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Attribute Default Legal\" VC by     providing an illegal NMTOKENS value.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr15</pre>
     * Test URI: <pre>invalid/attr15.xml</pre>
     * Comment: <pre>Tests the "Attribute Default Legal" VC by     providing an illegal NOTATIONS value.</pre>
     * Sections: <pre>3.3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr15()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr15.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Attribute Default Legal\" VC by     providing an illegal NOTATIONS value.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attr16</pre>
     * Test URI: <pre>invalid/attr16.xml</pre>
     * Comment: <pre>Tests the "Attribute Default Legal" VC by     providing an illegal enumeration value.</pre>
     * Sections: <pre>3.3.2</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattr16()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/attr16.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the \"Attribute Default Legal\" VC by     providing an illegal enumeration value.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>utf16b</pre>
     * Test URI: <pre>invalid/utf16b.xml</pre>
     * Comment: <pre>Tests reading an invalid "big endian" UTF-16 document</pre>
     * Sections: <pre>4.3.3 2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testutf16b()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/utf16b.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests reading an invalid \"big endian\" UTF-16 document");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>utf16l</pre>
     * Test URI: <pre>invalid/utf16l.xml</pre>
     * Comment: <pre>Tests reading an invalid "little endian" UTF-16 document</pre>
     * Sections: <pre>4.3.3 2.8</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testutf16l()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/utf16l.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests reading an invalid \"little endian\" UTF-16 document");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>empty</pre>
     * Test URI: <pre>invalid/empty.xml</pre>
     * Comment: <pre>CDATA section containing only white space does not match the nonterminal S, and cannot      appear in these positions.</pre>
     * Sections: <pre>2.4 2.7 [18] 3</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testempty()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "invalid/empty.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("CDATA section containing only white space does not match the nonterminal S, and cannot      appear in these positions.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>not-wf-sa03</pre>
     * Test URI: <pre>not-wf/not-sa03.xml</pre>
     * Comment: <pre>Tests the Entity Declared WFC, ensuring that     a reference to externally defined entity causes a well-formedness error.</pre>
     * Sections: <pre>2.9</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testnot_wf_sa03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/not-sa03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Tests the Entity Declared WFC, ensuring that     a reference to externally defined entity causes a well-formedness error.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attlist01</pre>
     * Test URI: <pre>not-wf/attlist01.xml</pre>
     * Comment: <pre>SGML's NUTOKEN is not allowed.</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattlist01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/attlist01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML's NUTOKEN is not allowed.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attlist02</pre>
     * Test URI: <pre>not-wf/attlist02.xml</pre>
     * Comment: <pre>SGML's NUTOKENS attribute type is not allowed.</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattlist02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/attlist02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML's NUTOKENS attribute type is not allowed.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attlist03</pre>
     * Test URI: <pre>not-wf/attlist03.xml</pre>
     * Comment: <pre>Comma doesn't separate enumerations, unlike in SGML.</pre>
     * Sections: <pre>3.3.1 [59]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattlist03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/attlist03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Comma doesn't separate enumerations, unlike in SGML.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attlist04</pre>
     * Test URI: <pre>not-wf/attlist04.xml</pre>
     * Comment: <pre>SGML's NUMBER attribute type is not allowed.</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattlist04()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/attlist04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML's NUMBER attribute type is not allowed.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attlist05</pre>
     * Test URI: <pre>not-wf/attlist05.xml</pre>
     * Comment: <pre>SGML's NUMBERS attribute type is not allowed.</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattlist05()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/attlist05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML's NUMBERS attribute type is not allowed.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attlist06</pre>
     * Test URI: <pre>not-wf/attlist06.xml</pre>
     * Comment: <pre>SGML's NAME attribute type is not allowed.</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattlist06()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/attlist06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML's NAME attribute type is not allowed.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attlist07</pre>
     * Test URI: <pre>not-wf/attlist07.xml</pre>
     * Comment: <pre>SGML's NAMES attribute type is not allowed.</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattlist07()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/attlist07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML's NAMES attribute type is not allowed.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attlist08</pre>
     * Test URI: <pre>not-wf/attlist08.xml</pre>
     * Comment: <pre>SGML's #CURRENT is not allowed.</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattlist08()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/attlist08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML's #CURRENT is not allowed.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attlist09</pre>
     * Test URI: <pre>not-wf/attlist09.xml</pre>
     * Comment: <pre>SGML's #CONREF is not allowed.</pre>
     * Sections: <pre>3.3.1 [56]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattlist09()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/attlist09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML's #CONREF is not allowed.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attlist10</pre>
     * Test URI: <pre>not-wf/attlist10.xml</pre>
     * Comment: <pre>Whitespace required between attributes</pre>
     * Sections: <pre>3.1 [40]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattlist10()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/attlist10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Whitespace required between attributes");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>attlist11</pre>
     * Test URI: <pre>not-wf/attlist11.xml</pre>
     * Comment: <pre>Whitespace required between attributes</pre>
     * Sections: <pre>3.1 [44]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testattlist11()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/attlist11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Whitespace required between attributes");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>cond01</pre>
     * Test URI: <pre>not-wf/cond01.xml</pre>
     * Comment: <pre>Only INCLUDE and IGNORE are conditional section keywords</pre>
     * Sections: <pre>3.4 [61]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testcond01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/cond01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Only INCLUDE and IGNORE are conditional section keywords");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>cond02</pre>
     * Test URI: <pre>not-wf/cond02.xml</pre>
     * Comment: <pre>Must have keyword in conditional sections</pre>
     * Sections: <pre>3.4 [61]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testcond02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/cond02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Must have keyword in conditional sections");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>content01</pre>
     * Test URI: <pre>not-wf/content01.xml</pre>
     * Comment: <pre>No whitespace before "?" in content model</pre>
     * Sections: <pre>3.2.1 [48]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testcontent01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/content01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("No whitespace before \"?\" in content model");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>content02</pre>
     * Test URI: <pre>not-wf/content02.xml</pre>
     * Comment: <pre>No whitespace before "*" in content model</pre>
     * Sections: <pre>3.2.1 [48]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testcontent02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/content02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("No whitespace before \"*\" in content model");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>content03</pre>
     * Test URI: <pre>not-wf/content03.xml</pre>
     * Comment: <pre>No whitespace before "+" in content model</pre>
     * Sections: <pre>3.2.1 [48]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testcontent03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/content03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("No whitespace before \"+\" in content model");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>decl01</pre>
     * Test URI: <pre>not-wf/decl01.xml</pre>
     * Comment: <pre>External entities may not have standalone decls.</pre>
     * Sections: <pre>4.3.1 [77]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testdecl01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/decl01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("External entities may not have standalone decls.");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>nwf-dtd00</pre>
     * Test URI: <pre>not-wf/dtd00.xml</pre>
     * Comment: <pre>Comma mandatory in content model</pre>
     * Sections: <pre>3.2.1 [55]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testnwf_dtd00()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/dtd00.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Comma mandatory in content model");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>nwf-dtd01</pre>
     * Test URI: <pre>not-wf/dtd01.xml</pre>
     * Comment: <pre>Can't mix comma and vertical bar in content models</pre>
     * Sections: <pre>3.2.1 [55]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testnwf_dtd01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/dtd01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Can't mix comma and vertical bar in content models");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>dtd02</pre>
     * Test URI: <pre>not-wf/dtd02.xml</pre>
     * Comment: <pre>PE name immediately after "%"</pre>
     * Sections: <pre>4.1 [69]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testdtd02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/dtd02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("PE name immediately after \"%\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>dtd03</pre>
     * Test URI: <pre>not-wf/dtd03.xml</pre>
     * Comment: <pre>PE name immediately followed by ";"</pre>
     * Sections: <pre>4.1 [69]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testdtd03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/dtd03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("PE name immediately followed by \";\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>dtd04</pre>
     * Test URI: <pre>not-wf/dtd04.xml</pre>
     * Comment: <pre>PUBLIC literal must be quoted</pre>
     * Sections: <pre>4.2.2 [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testdtd04()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/dtd04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("PUBLIC literal must be quoted");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>dtd05</pre>
     * Test URI: <pre>not-wf/dtd05.xml</pre>
     * Comment: <pre>SYSTEM identifier must be quoted</pre>
     * Sections: <pre>4.2.2 [75]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testdtd05()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/dtd05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SYSTEM identifier must be quoted");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>dtd07</pre>
     * Test URI: <pre>not-wf/dtd07.xml</pre>
     * Comment: <pre>Text declarations (which optionally begin any external entity)     are required to have "encoding=...".</pre>
     * Sections: <pre>4.3.1 [77]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testdtd07()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/dtd07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Text declarations (which optionally begin any external entity)     are required to have \"encoding=...\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>element00</pre>
     * Test URI: <pre>not-wf/element00.xml</pre>
     * Comment: <pre>EOF in middle of incomplete ETAG</pre>
     * Sections: <pre>3.1 [42]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testelement00()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/element00.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("EOF in middle of incomplete ETAG");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>element01</pre>
     * Test URI: <pre>not-wf/element01.xml</pre>
     * Comment: <pre>EOF in middle of incomplete ETAG</pre>
     * Sections: <pre>3.1 [42]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testelement01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/element01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("EOF in middle of incomplete ETAG");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>element02</pre>
     * Test URI: <pre>not-wf/element02.xml</pre>
     * Comment: <pre>Illegal markup (&#38;#60;%@ ... %&#38;#62;)</pre>
     * Sections: <pre>3.1 [43]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testelement02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/element02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal markup (<%@ ... %>)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>element03</pre>
     * Test URI: <pre>not-wf/element03.xml</pre>
     * Comment: <pre>Illegal markup (&#38;#60;% ... %&#38;#62;)</pre>
     * Sections: <pre>3.1 [43]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testelement03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/element03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal markup (<% ... %>)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>element04</pre>
     * Test URI: <pre>not-wf/element04.xml</pre>
     * Comment: <pre>Illegal markup (&#38;#60;!ELEMENT ... &#38;#62;)</pre>
     * Sections: <pre>3.1 [43]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testelement04()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/element04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal markup (<!ELEMENT ... >)");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>encoding01</pre>
     * Test URI: <pre>not-wf/encoding01.xml</pre>
     * Comment: <pre>Illegal character " " in encoding name</pre>
     * Sections: <pre>4.3.3 [81]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testencoding01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/encoding01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal character \" \" in encoding name");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>encoding02</pre>
     * Test URI: <pre>not-wf/encoding02.xml</pre>
     * Comment: <pre>Illegal character "/" in encoding name</pre>
     * Sections: <pre>4.3.3 [81]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testencoding02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/encoding02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal character \"/\" in encoding name");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>encoding03</pre>
     * Test URI: <pre>not-wf/encoding03.xml</pre>
     * Comment: <pre>Illegal character reference in encoding name</pre>
     * Sections: <pre>4.3.3 [81]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testencoding03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/encoding03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal character reference in encoding name");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>encoding04</pre>
     * Test URI: <pre>not-wf/encoding04.xml</pre>
     * Comment: <pre>Illegal character ":" in encoding name</pre>
     * Sections: <pre>4.3.3 [81]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testencoding04()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/encoding04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal character \":\" in encoding name");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>encoding05</pre>
     * Test URI: <pre>not-wf/encoding05.xml</pre>
     * Comment: <pre>Illegal character "@" in encoding name</pre>
     * Sections: <pre>4.3.3 [81]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testencoding05()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/encoding05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal character \"@\" in encoding name");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>encoding06</pre>
     * Test URI: <pre>not-wf/encoding06.xml</pre>
     * Comment: <pre>Illegal character "+" in encoding name</pre>
     * Sections: <pre>4.3.3 [81]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testencoding06()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/encoding06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal character \"+\" in encoding name");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>encoding07</pre>
     * Test URI: <pre>not-wf/encoding07.xml</pre>
     * Comment: <pre>Text declarations (which optionally begin any external entity)     are required to have "encoding=...".</pre>
     * Sections: <pre>4.3.1 [77]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testencoding07()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/encoding07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Text declarations (which optionally begin any external entity)     are required to have \"encoding=...\".");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>pi</pre>
     * Test URI: <pre>not-wf/pi.xml</pre>
     * Comment: <pre>No space between PI target name and data</pre>
     * Sections: <pre>2.6 [16]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testpi()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/pi.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("No space between PI target name and data");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>pubid01</pre>
     * Test URI: <pre>not-wf/pubid01.xml</pre>
     * Comment: <pre>Illegal entity ref in public ID</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testpubid01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/pubid01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal entity ref in public ID");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>pubid02</pre>
     * Test URI: <pre>not-wf/pubid02.xml</pre>
     * Comment: <pre>Illegal characters in public ID</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testpubid02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/pubid02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal characters in public ID");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>pubid03</pre>
     * Test URI: <pre>not-wf/pubid03.xml</pre>
     * Comment: <pre>Illegal characters in public ID</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testpubid03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/pubid03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal characters in public ID");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>pubid04</pre>
     * Test URI: <pre>not-wf/pubid04.xml</pre>
     * Comment: <pre>Illegal characters in public ID</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testpubid04()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/pubid04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Illegal characters in public ID");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>pubid05</pre>
     * Test URI: <pre>not-wf/pubid05.xml</pre>
     * Comment: <pre>SGML-ism:  public ID without system ID</pre>
     * Sections: <pre>2.3 [12]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testpubid05()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/pubid05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML-ism:  public ID without system ID");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml01</pre>
     * Test URI: <pre>not-wf/sgml01.xml</pre>
     * Comment: <pre>SGML-ism: omitted end tag for EMPTY content</pre>
     * Sections: <pre>3 [39]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml01()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml01.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML-ism: omitted end tag for EMPTY content");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml02</pre>
     * Test URI: <pre>not-wf/sgml02.xml</pre>
     * Comment: <pre>XML declaration must be at the very beginning of a document;   it"s not a processing instruction</pre>
     * Sections: <pre>2.8 </pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml02()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml02.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("XML declaration must be at the very beginning of a document;   it\"s not a processing instruction");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml03</pre>
     * Test URI: <pre>not-wf/sgml03.xml</pre>
     * Comment: <pre>Comments may not contain "--"</pre>
     * Sections: <pre>2.5 [15]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml03()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml03.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("Comments may not contain \"--\"");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml04</pre>
     * Test URI: <pre>not-wf/sgml04.xml</pre>
     * Comment: <pre>ATTLIST declarations apply to only one element, unlike SGML</pre>
     * Sections: <pre>3.3 [52]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml04()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml04.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("ATTLIST declarations apply to only one element, unlike SGML");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml05</pre>
     * Test URI: <pre>not-wf/sgml05.xml</pre>
     * Comment: <pre>ELEMENT declarations apply to only one element, unlike SGML</pre>
     * Sections: <pre>3.2 [45]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml05()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml05.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("ELEMENT declarations apply to only one element, unlike SGML");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml06</pre>
     * Test URI: <pre>not-wf/sgml06.xml</pre>
     * Comment: <pre>ATTLIST declarations are never global, unlike in SGML</pre>
     * Sections: <pre>3.3 [52]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml06()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml06.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("ATTLIST declarations are never global, unlike in SGML");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml07</pre>
     * Test URI: <pre>not-wf/sgml07.xml</pre>
     * Comment: <pre>SGML Tag minimization specifications are not allowed</pre>
     * Sections: <pre>3.2 [45]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml07()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml07.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML Tag minimization specifications are not allowed");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml08</pre>
     * Test URI: <pre>not-wf/sgml08.xml</pre>
     * Comment: <pre>SGML Tag minimization specifications are not allowed</pre>
     * Sections: <pre>3.2 [45]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml08()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml08.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML Tag minimization specifications are not allowed");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml09</pre>
     * Test URI: <pre>not-wf/sgml09.xml</pre>
     * Comment: <pre>SGML Content model exception specifications are not allowed</pre>
     * Sections: <pre>3.2 [45]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml09()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml09.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML Content model exception specifications are not allowed");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml10</pre>
     * Test URI: <pre>not-wf/sgml10.xml</pre>
     * Comment: <pre>SGML Content model exception specifications are not allowed</pre>
     * Sections: <pre>3.2 [45]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml10()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml10.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML Content model exception specifications are not allowed");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml11</pre>
     * Test URI: <pre>not-wf/sgml11.xml</pre>
     * Comment: <pre>CDATA is not a valid content model spec</pre>
     * Sections: <pre>3.2 [46]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml11()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml11.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("CDATA is not a valid content model spec");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml12</pre>
     * Test URI: <pre>not-wf/sgml12.xml</pre>
     * Comment: <pre>RCDATA is not a valid content model spec</pre>
     * Sections: <pre>3.2 [46]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml12()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml12.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("RCDATA is not a valid content model spec");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    /**
     * Test ID: <pre>sgml13</pre>
     * Test URI: <pre>not-wf/sgml13.xml</pre>
     * Comment: <pre>SGML Unordered content models not allowed</pre>
     * Sections: <pre>3.2.1 [47]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testsgml13()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "not-wf/sgml13.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            fail("SGML Unordered content models not allowed");
        }
        catch ( XmlPullParserException e )
        {
            assertTrue( true );
        }
    }


    
}