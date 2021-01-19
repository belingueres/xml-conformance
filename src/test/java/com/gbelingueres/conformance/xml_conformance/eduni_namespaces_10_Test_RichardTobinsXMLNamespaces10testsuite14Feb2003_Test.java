
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
 * TESCASES PROFILE: <pre>Richard Tobin's XML Namespaces 1.0 test suite 14 Feb 2003</pre>
 * XML test files base folder: <pre>xmlconf/eduni/namespaces/1.0/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class eduni_namespaces_10_Test_RichardTobinsXMLNamespaces10testsuite14Feb2003_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/eduni/namespaces/1.0/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>rmt-ns10-001</pre>
   * Test URI: <pre>001.xml</pre>
   * Comment: <pre>Namespace name test: a perfectly good http URI</pre>
   * Sections: <pre>2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testrmt_ns10_001() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "001.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Namespace name test: a perfectly good http URI", true);
    }
    catch (XmlPullParserException ex) {
      fail("Namespace name test: a perfectly good http URI");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-002</pre>
   * Test URI: <pre>002.xml</pre>
   * Comment: <pre>Namespace name test: a syntactically plausible URI with a fictitious scheme</pre>
   * Sections: <pre>2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testrmt_ns10_002() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "002.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Namespace name test: a syntactically plausible URI with a fictitious scheme", true);
    }
    catch (XmlPullParserException ex) {
      fail("Namespace name test: a syntactically plausible URI with a fictitious scheme");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-003</pre>
   * Test URI: <pre>003.xml</pre>
   * Comment: <pre>Namespace name test: a perfectly good http URI with a fragment</pre>
   * Sections: <pre>2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testrmt_ns10_003() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "003.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Namespace name test: a perfectly good http URI with a fragment", true);
    }
    catch (XmlPullParserException ex) {
      fail("Namespace name test: a perfectly good http URI with a fragment");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-007</pre>
   * Test URI: <pre>007.xml</pre>
   * Comment: <pre>Namespace inequality test: different capitalization</pre>
   * Sections: <pre>1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testrmt_ns10_007() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "007.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Namespace inequality test: different capitalization", true);
    }
    catch (XmlPullParserException ex) {
      fail("Namespace inequality test: different capitalization");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-008</pre>
   * Test URI: <pre>008.xml</pre>
   * Comment: <pre>Namespace inequality test: different escaping</pre>
   * Sections: <pre>1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testrmt_ns10_008() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "008.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Namespace inequality test: different escaping", true);
    }
    catch (XmlPullParserException ex) {
      fail("Namespace inequality test: different escaping");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-009</pre>
   * Test URI: <pre>009.xml</pre>
   * Comment: <pre>Namespace equality test: plain repetition</pre>
   * Sections: <pre>1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_009() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "009.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Namespace equality test: plain repetition");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-010</pre>
   * Test URI: <pre>010.xml</pre>
   * Comment: <pre>Namespace equality test: use of character reference</pre>
   * Sections: <pre>1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_010() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "010.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Namespace equality test: use of character reference");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-011</pre>
   * Test URI: <pre>011.xml</pre>
   * Comment: <pre>Namespace equality test: use of entity reference</pre>
   * Sections: <pre>1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_011() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "011.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Namespace equality test: use of entity reference");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-012</pre>
   * Test URI: <pre>012.xml</pre>
   * Comment: <pre>Namespace inequality test: equal after attribute value normalization</pre>
   * Sections: <pre>1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_012() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "012.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Namespace inequality test: equal after attribute value normalization");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-013</pre>
   * Test URI: <pre>013.xml</pre>
   * Comment: <pre>Bad QName syntax: multiple colons</pre>
   * Sections: <pre>3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_013() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "013.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Bad QName syntax: multiple colons");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-014</pre>
   * Test URI: <pre>014.xml</pre>
   * Comment: <pre>Bad QName syntax: colon at end</pre>
   * Sections: <pre>3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_014() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "014.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Bad QName syntax: colon at end");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-015</pre>
   * Test URI: <pre>015.xml</pre>
   * Comment: <pre>Bad QName syntax: colon at start</pre>
   * Sections: <pre>3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_015() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "015.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Bad QName syntax: colon at start");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-016</pre>
   * Test URI: <pre>016.xml</pre>
   * Comment: <pre>Bad QName syntax: xmlns:</pre>
   * Sections: <pre>2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_016() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "016.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Bad QName syntax: xmlns:");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-017</pre>
   * Test URI: <pre>017.xml</pre>
   * Comment: <pre>Simple legal case: no namespaces</pre>
   * Sections: <pre>-</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_017() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "017.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Simple legal case: no namespaces");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-018</pre>
   * Test URI: <pre>018.xml</pre>
   * Comment: <pre>Simple legal case: default namespace</pre>
   * Sections: <pre>5.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_018() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "018.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Simple legal case: default namespace");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-019</pre>
   * Test URI: <pre>019.xml</pre>
   * Comment: <pre>Simple legal case: prefixed element</pre>
   * Sections: <pre>4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_019() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "019.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Simple legal case: prefixed element");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-020</pre>
   * Test URI: <pre>020.xml</pre>
   * Comment: <pre>Simple legal case: prefixed attribute</pre>
   * Sections: <pre>4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_020() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "020.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Simple legal case: prefixed attribute");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-021</pre>
   * Test URI: <pre>021.xml</pre>
   * Comment: <pre>Simple legal case: default namespace and unbinding</pre>
   * Sections: <pre>5.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_021() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "021.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Simple legal case: default namespace and unbinding");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-022</pre>
   * Test URI: <pre>022.xml</pre>
   * Comment: <pre>Simple legal case: default namespace and rebinding</pre>
   * Sections: <pre>5.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_022() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "022.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Simple legal case: default namespace and rebinding");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-023</pre>
   * Test URI: <pre>023.xml</pre>
   * Comment: <pre>Illegal use of 1.1-style prefix unbinding in 1.0 document</pre>
   * Sections: <pre>2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_023() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "023.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Illegal use of 1.1-style prefix unbinding in 1.0 document");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-024</pre>
   * Test URI: <pre>024.xml</pre>
   * Comment: <pre>Simple legal case: prefix rebinding</pre>
   * Sections: <pre>5.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_024() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "024.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Simple legal case: prefix rebinding");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-025</pre>
   * Test URI: <pre>025.xml</pre>
   * Comment: <pre>Unbound element prefix</pre>
   * Sections: <pre>4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_025() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "025.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Unbound element prefix");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-026</pre>
   * Test URI: <pre>026.xml</pre>
   * Comment: <pre>Unbound attribute prefix</pre>
   * Sections: <pre>4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_026() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "026.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Unbound attribute prefix");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-027</pre>
   * Test URI: <pre>027.xml</pre>
   * Comment: <pre>Reserved prefixes and namespaces: using the xml prefix undeclared</pre>
   * Sections: <pre>2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_027() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "027.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Reserved prefixes and namespaces: using the xml prefix undeclared");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-028</pre>
   * Test URI: <pre>028.xml</pre>
   * Comment: <pre>Reserved prefixes and namespaces: declaring the xml prefix correctly</pre>
   * Sections: <pre>NE05</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_028() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "028.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Reserved prefixes and namespaces: declaring the xml prefix correctly");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-029</pre>
   * Test URI: <pre>029.xml</pre>
   * Comment: <pre>Reserved prefixes and namespaces: declaring the xml prefix incorrectly</pre>
   * Sections: <pre>NE05</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_029() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "029.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Reserved prefixes and namespaces: declaring the xml prefix incorrectly");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-030</pre>
   * Test URI: <pre>030.xml</pre>
   * Comment: <pre>Reserved prefixes and namespaces: binding another prefix to the xml namespace</pre>
   * Sections: <pre>NE05</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_030() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "030.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Reserved prefixes and namespaces: binding another prefix to the xml namespace");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-031</pre>
   * Test URI: <pre>031.xml</pre>
   * Comment: <pre>Reserved prefixes and namespaces: declaring the xmlns prefix with its correct URI (illegal)</pre>
   * Sections: <pre>NE05</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_031() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "031.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Reserved prefixes and namespaces: declaring the xmlns prefix with its correct URI (illegal)");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-032</pre>
   * Test URI: <pre>032.xml</pre>
   * Comment: <pre>Reserved prefixes and namespaces: declaring the xmlns prefix with an incorrect URI</pre>
   * Sections: <pre>NE05</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_032() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "032.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Reserved prefixes and namespaces: declaring the xmlns prefix with an incorrect URI");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-033</pre>
   * Test URI: <pre>033.xml</pre>
   * Comment: <pre>Reserved prefixes and namespaces: binding another prefix to the xmlns namespace</pre>
   * Sections: <pre>NE05</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_033() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "033.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Reserved prefixes and namespaces: binding another prefix to the xmlns namespace");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-034</pre>
   * Test URI: <pre>034.xml</pre>
   * Comment: <pre>Reserved prefixes and namespaces: binding a reserved prefix</pre>
   * Sections: <pre>NE05</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_034() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "034.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Reserved prefixes and namespaces: binding a reserved prefix");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-035</pre>
   * Test URI: <pre>035.xml</pre>
   * Comment: <pre>Attribute uniqueness: repeated identical attribute</pre>
   * Sections: <pre>5.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_035() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "035.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute uniqueness: repeated identical attribute");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-036</pre>
   * Test URI: <pre>036.xml</pre>
   * Comment: <pre>Attribute uniqueness: repeated attribute with different prefixes</pre>
   * Sections: <pre>5.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_036() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "036.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute uniqueness: repeated attribute with different prefixes");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-037</pre>
   * Test URI: <pre>037.xml</pre>
   * Comment: <pre>Attribute uniqueness: different attributes with same local name</pre>
   * Sections: <pre>5.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_037() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "037.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute uniqueness: different attributes with same local name");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-038</pre>
   * Test URI: <pre>038.xml</pre>
   * Comment: <pre>Attribute uniqueness: prefixed and unprefixed attributes with same local name</pre>
   * Sections: <pre>5.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_038() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "038.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute uniqueness: prefixed and unprefixed attributes with same local name");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-039</pre>
   * Test URI: <pre>039.xml</pre>
   * Comment: <pre>Attribute uniqueness: prefixed and unprefixed attributes with same local name, with default namespace</pre>
   * Sections: <pre>5.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_039() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "039.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute uniqueness: prefixed and unprefixed attributes with same local name, with default namespace");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-040</pre>
   * Test URI: <pre>040.xml</pre>
   * Comment: <pre>Attribute uniqueness: prefixed and unprefixed attributes with same local name, with default namespace and element in default namespace</pre>
   * Sections: <pre>5.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_040() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "040.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute uniqueness: prefixed and unprefixed attributes with same local name, with default namespace and element in default namespace");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-041</pre>
   * Test URI: <pre>041.xml</pre>
   * Comment: <pre>Attribute uniqueness: prefixed and unprefixed attributes with same local name, element in same namespace as prefixed attribute</pre>
   * Sections: <pre>5.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_041() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "041.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute uniqueness: prefixed and unprefixed attributes with same local name, element in same namespace as prefixed attribute");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-042</pre>
   * Test URI: <pre>042.xml</pre>
   * Comment: <pre>Colon in PI name</pre>
   * Sections: <pre>NE08</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_042() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "042.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Colon in PI name");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-043</pre>
   * Test URI: <pre>043.xml</pre>
   * Comment: <pre>Colon in entity name</pre>
   * Sections: <pre>NE08</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_043() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "043.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Colon in entity name");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-044</pre>
   * Test URI: <pre>044.xml</pre>
   * Comment: <pre>Colon in entity name</pre>
   * Sections: <pre>NE08</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_044() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "044.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Colon in entity name");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-045</pre>
   * Test URI: <pre>045.xml</pre>
   * Comment: <pre>Colon in ID attribute name</pre>
   * Sections: <pre>NE08</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_045() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "045.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Colon in ID attribute name");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns10-046</pre>
   * Test URI: <pre>046.xml</pre>
   * Comment: <pre>Colon in ID attribute name</pre>
   * Sections: <pre>NE08</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns10_046() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "046.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Colon in ID attribute name");
    }
  }
        
    
  /**
   * Test ID: <pre>ht-ns10-047</pre>
   * Test URI: <pre>047.xml</pre>
   * Comment: <pre>Reserved name: _not_ an error</pre>
   * Sections: <pre>NE03</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testht_ns10_047() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "047.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Reserved name: _not_ an error", true);
    }
    catch (XmlPullParserException ex) {
      fail("Reserved name: _not_ an error");
    }
  }
        
    
  /**
   * Test ID: <pre>ht-ns10-048</pre>
   * Test URI: <pre>048.xml</pre>
   * Comment: <pre>Reserved name: _not_ an error</pre>
   * Sections: <pre>NE03</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testht_ns10_048() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "048.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Reserved name: _not_ an error", true);
    }
    catch (XmlPullParserException ex) {
      fail("Reserved name: _not_ an error");
    }
  }
        
    
    
}
    