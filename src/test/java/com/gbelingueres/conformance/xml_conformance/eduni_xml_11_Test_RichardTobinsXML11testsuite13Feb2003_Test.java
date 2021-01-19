
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

/**
 * Test class that execute a particular set of tests associated to a TESCASES tag from the XML W3C Conformance Tests.
 * TESCASES PROFILE: <pre>Richard Tobin's XML 1.1 test suite 13 Feb 2003</pre>
 * XML test files base folder: <pre>xmlconf/eduni/xml-1.1/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class eduni_xml_11_Test_RichardTobinsXML11testsuite13Feb2003_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/eduni/xml-1.1/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>rmt-001</pre>
   * Test URI: <pre>001.xml</pre>
   * Comment: <pre>External subset has later version number</pre>
   * Sections: <pre>2.8 4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_001() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "001.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("External subset has later version number");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-002</pre>
   * Test URI: <pre>002.xml</pre>
   * Comment: <pre>External PE has later version number</pre>
   * Sections: <pre>2.8 4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_002() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "002.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("External PE has later version number");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-003</pre>
   * Test URI: <pre>003.xml</pre>
   * Comment: <pre>External general entity has later version number</pre>
   * Sections: <pre>2.8 4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_003() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "003.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("External general entity has later version number");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-004</pre>
   * Test URI: <pre>004.xml</pre>
   * Comment: <pre>External general entity has later version number (no decl means 1.0)</pre>
   * Sections: <pre>2.8 4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_004() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "004.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("External general entity has later version number (no decl means 1.0)");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-005</pre>
   * Test URI: <pre>005.xml</pre>
   * Comment: <pre>Indirect external general entity has later version number</pre>
   * Sections: <pre>2.8 4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_005() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "005.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Indirect external general entity has later version number");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-011</pre>
   * Test URI: <pre>011.xml</pre>
   * Comment: <pre>Contains a C1 control, legal in XML 1.0, illegal in XML 1.1</pre>
   * Sections: <pre>2.2</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_011() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "011.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Contains a C1 control, legal in XML 1.0, illegal in XML 1.1");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-013</pre>
   * Test URI: <pre>013.xml</pre>
   * Comment: <pre>Contains a DEL, legal in XML 1.0, illegal in XML 1.1</pre>
   * Sections: <pre>2.2</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_013() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "013.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Contains a DEL, legal in XML 1.0, illegal in XML 1.1");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-014</pre>
   * Test URI: <pre>014.xml</pre>
   * Comment: <pre>Has a "long s" in a name, legal in XML 1.1, illegal in XML 1.0 thru 4th edition</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_014() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "014.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Has a \"long s\" in a name, legal in XML 1.1, illegal in XML 1.0 thru 4th edition");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-016</pre>
   * Test URI: <pre>016.xml</pre>
   * Comment: <pre>Has a Byzantine Musical Symbol Kratimata in a name, legal in XML 1.1, illegal in XML 1.0 thru 4th edition</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_016() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "016.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Has a Byzantine Musical Symbol Kratimata in a name, legal in XML 1.1, illegal in XML 1.0 thru 4th edition");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-019</pre>
   * Test URI: <pre>019.xml</pre>
   * Comment: <pre>Has the last legal namechar in XML 1.1, illegal in XML 1.0 thru 4th edition</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_019() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "019.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Has the last legal namechar in XML 1.1, illegal in XML 1.0 thru 4th edition");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-020</pre>
   * Test URI: <pre>020.xml</pre>
   * Comment: <pre>Has the first character after the last legal namechar in XML 1.1, illegal in both XML 1.0 and 1.1</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_020() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "020.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Has the first character after the last legal namechar in XML 1.1, illegal in both XML 1.0 and 1.1");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-021</pre>
   * Test URI: <pre>021.xml</pre>
   * Comment: <pre>Has the first character after the last legal namechar in XML 1.1, illegal in both XML 1.0 and 1.1</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_021() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "021.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Has the first character after the last legal namechar in XML 1.1, illegal in both XML 1.0 and 1.1");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-038</pre>
   * Test URI: <pre>038.xml</pre>
   * Comment: <pre>Contains a C0 control character (form-feed), illegal in both XML 1.0 and 1.1</pre>
   * Sections: <pre>2.2</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_038() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "038.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Contains a C0 control character (form-feed), illegal in both XML 1.0 and 1.1");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-039</pre>
   * Test URI: <pre>039.xml</pre>
   * Comment: <pre>Contains a C0 control character (form-feed), illegal in both XML 1.0 and 1.1</pre>
   * Sections: <pre>2.2</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_039() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "039.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Contains a C0 control character (form-feed), illegal in both XML 1.0 and 1.1");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-041</pre>
   * Test URI: <pre>041.xml</pre>
   * Comment: <pre>Contains a C1 control character (partial line up), legal in XML 1.0 but not 1.1</pre>
   * Sections: <pre>2.2</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_041() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "041.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Contains a C1 control character (partial line up), legal in XML 1.0 but not 1.1");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-042</pre>
   * Test URI: <pre>042.xml</pre>
   * Comment: <pre>Contains a character reference to a C0 control character (form-feed), legal in XML 1.1 but not 1.0</pre>
   * Sections: <pre>4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_042() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "042.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Contains a character reference to a C0 control character (form-feed), legal in XML 1.1 but not 1.0");
    }
  }
        
    
    
}
    