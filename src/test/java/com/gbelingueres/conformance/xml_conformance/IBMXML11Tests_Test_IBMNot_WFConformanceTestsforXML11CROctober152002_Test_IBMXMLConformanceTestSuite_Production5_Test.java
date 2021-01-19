
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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 5</pre>
 * XML test files base folder: <pre>xmlconf/ibm/xml-1.1/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML11Tests_Test_IBMNot_WFConformanceTestsforXML11CROctober152002_Test_IBMXMLConformanceTestSuite_Production5_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P05-ibm05n01.xml</pre>
   * Test URI: <pre>not-wf/P05/ibm05n01.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #0x0B</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P05_ibm05n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P05/ibm05n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #0x0B");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P05-ibm05n02.xml</pre>
   * Test URI: <pre>not-wf/P05/ibm05n02.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #0x300</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P05_ibm05n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P05/ibm05n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #0x300");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P05-ibm05n03.xml</pre>
   * Test URI: <pre>not-wf/P05/ibm05n03.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #0x36F</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P05_ibm05n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P05/ibm05n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #0x36F");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P05-ibm05n04.xml</pre>
   * Test URI: <pre>not-wf/P05/ibm05n04.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #0x203F</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P05_ibm05n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P05/ibm05n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #0x203F");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P05-ibm05n05.xml</pre>
   * Test URI: <pre>not-wf/P05/ibm05n05.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #x2040</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P05_ibm05n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P05/ibm05n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #x2040");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P05-ibm05n06.xml</pre>
   * Test URI: <pre>not-wf/P05/ibm05n06.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #0xB7</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P05_ibm05n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P05/ibm05n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #0xB7");
    }
  }
        
    
    
}
    