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
 * TESCASES PROFILE: <pre>Fuji Xerox Japanese Text Tests</pre>
 * XML test files base folder: <pre>xmlconf/japanese/</pre>
 *
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class FujiXeroxJapaneseTextTestsXML10Tests_Test_FujiXeroxJapaneseTextTests_Test
{

    final static File testResourcesDir = new File("src/test/resources/", "xmlconf/japanese/");

    MXParser parser;

    @Before
    public void setUp()
    {
        parser = new MXParser();
    }
    
    /**
     * Test ID: <pre>pr-xml-little</pre>
     * Test URI: <pre>pr-xml-little-endian.xml</pre>
     * Comment: <pre>Test support for little-endian UTF-16 text 	which relies on Japanese characters. 	(Also requires ability to process a moderately complex DTD.)</pre>
     * Sections: <pre>4.3.3 [4,84]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testpr_xml_little()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "pr-xml-little-endian.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Test support for little-endian UTF-16 text 	which relies on Japanese characters. 	(Also requires ability to process a moderately complex DTD.)", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Test support for little-endian UTF-16 text 	which relies on Japanese characters. 	(Also requires ability to process a moderately complex DTD.)");
        }
  }


    /**
     * Test ID: <pre>pr-xml-utf-16</pre>
     * Test URI: <pre>pr-xml-utf-16.xml</pre>
     * Comment: <pre>Test support UTF-16 text which relies on Japanese characters. 	(Also requires ability to process a moderately complex DTD.)</pre>
     * Sections: <pre>4.3.3 [4,84]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testpr_xml_utf_16()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "pr-xml-utf-16.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Test support UTF-16 text which relies on Japanese characters. 	(Also requires ability to process a moderately complex DTD.)", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Test support UTF-16 text which relies on Japanese characters. 	(Also requires ability to process a moderately complex DTD.)");
        }
  }


    /**
     * Test ID: <pre>pr-xml-utf-8</pre>
     * Test URI: <pre>pr-xml-utf-8.xml</pre>
     * Comment: <pre>Test support for UTF-8 text which relies on Japanese characters. 	(Also requires ability to process a moderately complex DTD.)</pre>
     * Sections: <pre>4.3.3 [4,84]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testpr_xml_utf_8()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "pr-xml-utf-8.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Test support for UTF-8 text which relies on Japanese characters. 	(Also requires ability to process a moderately complex DTD.)", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Test support for UTF-8 text which relies on Japanese characters. 	(Also requires ability to process a moderately complex DTD.)");
        }
  }


    /**
     * Test ID: <pre>weekly-little</pre>
     * Test URI: <pre>weekly-little-endian.xml</pre>
     * Comment: <pre>Test support for little-endian UTF-16 encoding, and 	XML names which contain Japanese characters.</pre>
     * Sections: <pre>4.3.3 [4,84]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testweekly_little()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "weekly-little-endian.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Test support for little-endian UTF-16 encoding, and 	XML names which contain Japanese characters.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Test support for little-endian UTF-16 encoding, and 	XML names which contain Japanese characters.");
        }
  }


    /**
     * Test ID: <pre>weekly-utf-16</pre>
     * Test URI: <pre>weekly-utf-16.xml</pre>
     * Comment: <pre>Test support for UTF-16 encoding, and 	XML names which contain Japanese characters.</pre>
     * Sections: <pre>4.3.3 [4,84]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testweekly_utf_16()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "weekly-utf-16.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Test support for UTF-16 encoding, and 	XML names which contain Japanese characters.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Test support for UTF-16 encoding, and 	XML names which contain Japanese characters.");
        }
  }


    /**
     * Test ID: <pre>weekly-utf-8</pre>
     * Test URI: <pre>weekly-utf-8.xml</pre>
     * Comment: <pre>Test support for UTF-8 encoding and 	XML names which contain Japanese characters.</pre>
     * Sections: <pre>4.3.3 [4,84]</pre>
     * Version:
     *
     * @throws IOException if there is an I/O error
     */
    @Test
    public void testweekly_utf_8()
        throws IOException
    {
        try( Reader reader = new FileReader( new File( testResourcesDir, "weekly-utf-8.xml" ) ) )
        {
            parser.setInput(reader);
            while (parser.nextToken() != XmlPullParser.END_DOCUMENT)
                ;
            assertTrue("Test support for UTF-8 encoding and 	XML names which contain Japanese characters.", true);
        }
        catch (XmlPullParserException ex)
        {
            fail("Test support for UTF-8 encoding and 	XML names which contain Japanese characters.");
        }
  }


    
}