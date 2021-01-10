
package com.gbelingueres.conformance.xml_conformance;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.codehaus.plexus.util.xml.pull.MXParser;
import org.codehaus.plexus.util.xml.pull.XmlPullParser;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.junit.Before;
import org.junit.Test;

public class IBMXML11Tests_IBMValidConformanceTestsforXML11CROctober152002_IBMXMLConformanceTestSuite_Production4a {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P04-ibm04av01.xml</pre>
   * Test URI: <pre>valid/P04a/ibm04av01.xml</pre>
   * Comment: <pre>This test case covers legal NameChars character ranges plus discrete legal          characters for production 04a.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P04_ibm04av01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P04a/ibm04av01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal NameChars character ranges plus discrete legal          characters for production 04a.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal NameChars character ranges plus discrete legal          characters for production 04a.");
    }
  }
        
    
    
}
    