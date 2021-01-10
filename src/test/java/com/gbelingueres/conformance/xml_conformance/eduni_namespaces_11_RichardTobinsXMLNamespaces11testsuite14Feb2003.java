
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

public class eduni_namespaces_11_RichardTobinsXMLNamespaces11testsuite14Feb2003 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/eduni/namespaces/1.1/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>rmt-ns11-001</pre>
   * Test URI: <pre>001.xml</pre>
   * Comment: <pre>Namespace name test: a perfectly good http IRI that is not a URI</pre>
   * Sections: <pre>2.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testrmt_ns11_001() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "001.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Namespace name test: a perfectly good http IRI that is not a URI", true);
    }
    catch (XmlPullParserException ex) {
      fail("Namespace name test: a perfectly good http IRI that is not a URI");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns11-002</pre>
   * Test URI: <pre>002.xml</pre>
   * Comment: <pre>Namespace inequality test: different escaping of non-ascii letter</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testrmt_ns11_002() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "002.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Namespace inequality test: different escaping of non-ascii letter", true);
    }
    catch (XmlPullParserException ex) {
      fail("Namespace inequality test: different escaping of non-ascii letter");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns11-003</pre>
   * Test URI: <pre>003.xml</pre>
   * Comment: <pre>1.1 style prefix unbinding</pre>
   * Sections: <pre>6.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testrmt_ns11_003() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "003.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("1.1 style prefix unbinding", true);
    }
    catch (XmlPullParserException ex) {
      fail("1.1 style prefix unbinding");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns11-004</pre>
   * Test URI: <pre>004.xml</pre>
   * Comment: <pre>1.1 style prefix unbinding and rebinding</pre>
   * Sections: <pre>6.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testrmt_ns11_004() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "004.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("1.1 style prefix unbinding and rebinding", true);
    }
    catch (XmlPullParserException ex) {
      fail("1.1 style prefix unbinding and rebinding");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns11-005</pre>
   * Test URI: <pre>005.xml</pre>
   * Comment: <pre>Illegal use of prefix that has been unbound</pre>
   * Sections: <pre>5</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns11_005() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "005.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Illegal use of prefix that has been unbound");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns11-006</pre>
   * Test URI: <pre>006.xml</pre>
   * Comment: <pre>Test whether non-Latin-1 characters are accepted in IRIs, and whether they are correctly distinguished</pre>
   * Sections: <pre>2.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testrmt_ns11_006() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "006.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Test whether non-Latin-1 characters are accepted in IRIs, and whether they are correctly distinguished", true);
    }
    catch (XmlPullParserException ex) {
      fail("Test whether non-Latin-1 characters are accepted in IRIs, and whether they are correctly distinguished");
    }
  }
        
    
  /**
   * Test ID: <pre>ht-bh-ns11-007</pre>
   * Test URI: <pre>007.xml</pre>
   * Comment: <pre>Attempt to unbind xmlns 'namespace'</pre>
   * Sections: <pre>3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testht_bh_ns11_007() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "007.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attempt to unbind xmlns 'namespace'");
    }
  }
        
    
  /**
   * Test ID: <pre>ht-bh-ns11-008</pre>
   * Test URI: <pre>008.xml</pre>
   * Comment: <pre>Attempt to unbind xml namespace</pre>
   * Sections: <pre>3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testht_bh_ns11_008() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "008.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attempt to unbind xml namespace");
    }
  }
        
    
    
}
    