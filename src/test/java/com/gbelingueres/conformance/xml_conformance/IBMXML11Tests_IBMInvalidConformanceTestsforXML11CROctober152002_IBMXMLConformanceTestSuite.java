
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

public class IBMXML11Tests_IBMInvalidConformanceTestsforXML11CROctober152002_IBMXMLConformanceTestSuite {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P46-ibm46i01.xml</pre>
   * Test URI: <pre>invalid/P46/ibm46i01.xml</pre>
   * Comment: <pre>An element with Element-Only content contains the character #x85 (NEL not a          whitespace character as defined by S).</pre>
   * Sections: <pre>3.2.1, 2.2</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_valid_P46_ibm46i01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "invalid/P46/ibm46i01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("An element with Element-Only content contains the character #x85 (NEL not a          whitespace character as defined by S).");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P46-ibm46i02.xml</pre>
   * Test URI: <pre>invalid/P46/ibm46i02.xml</pre>
   * Comment: <pre>An element with Element-Only content contains the character #x2028 (LESP not a          whitespace character as defined by S).</pre>
   * Sections: <pre>3.2.1, 2.2</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_valid_P46_ibm46i02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "invalid/P46/ibm46i02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("An element with Element-Only content contains the character #x2028 (LESP not a          whitespace character as defined by S).");
    }
  }
        
    
    
}
    