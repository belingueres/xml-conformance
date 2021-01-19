
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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 4a</pre>
 * XML test files base folder: <pre>xmlconf/ibm/xml-1.1/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML11Tests_Test_IBMNot_WFConformanceTestsforXML11CROctober152002_Test_IBMXMLConformanceTestSuite_Production4a_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an01.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an01.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #xB8</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #xB8");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an02.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an02.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xA1</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xA1");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an03.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an03.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xAF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xAF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an04.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an04.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x37E</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x37E");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an05.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an05.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2000</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2000");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an06.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an06.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2001</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2001");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an07.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an07.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2002</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2002");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an08.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an08.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2005</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2005");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an09.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an09.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x200B</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x200B");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an10.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an10.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x200E</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x200E");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an11.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an11.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2038</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2038");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an12.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an12.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2041</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2041");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an13.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an13.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2190</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2190");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an14.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an14.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x23FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x23FF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an15.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an15.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x280F</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x280F");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an16.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an16.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2A00</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2A00");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an17.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an17.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xFDD0</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an17xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an17.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xFDD0");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an18.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an18.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xFDEF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an18xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an18.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xFDEF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an19.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an19.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2FFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an19xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an19.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2FFF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an20.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an20.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x3000</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an20xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an20.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x3000");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an21.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an21.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xD800</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an21xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an21.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xD800");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an22.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an22.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xD801</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an22xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an22.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xD801");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an23.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an23.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xDAFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an23xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an23.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xDAFF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an24.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an24.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xDFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an24xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an24.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xDFFF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an25.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an25.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xEFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an25xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an25.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xEFFF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an26.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an26.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xF1FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an26xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an26.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xF1FF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an27.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an27.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xF8FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an27xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an27.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xF8FF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04a-ibm04an28.xml</pre>
   * Test URI: <pre>not-wf/P04a/ibm04an28.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xFFFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04a_ibm04an28xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04a/ibm04an28.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xFFFFF");
    }
  }
        
    
    
}
    