
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

public class IBMXML11Tests_IBMNot_WFConformanceTestsforXML11CROctober152002_IBMXMLConformanceTestSuite_Production4 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n01.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n01.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #x300</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #x300");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n02.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n02.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x333</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x333");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n03.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n03.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x369</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x369");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n04.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n04.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x37E</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x37E");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n05.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n05.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2000</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2000");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n06.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n06.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2001</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2001");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n07.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n07.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2002</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2002");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n08.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n08.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2005</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2005");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n09.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n09.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x200B</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x200B");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n10.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n10.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x200E</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x200E");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n11.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n11.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x200F</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x200F");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n12.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n12.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2069</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2069");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n13.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n13.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2190</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2190");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n14.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n14.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x23FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x23FF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n15.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n15.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x280F</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x280F");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n16.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n16.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2A00</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2A00");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n17.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n17.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2EDC</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n17xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n17.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2EDC");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n18.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n18.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2B00</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n18xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n18.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2B00");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n19.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n19.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2BFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n19xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n19.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2BFF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n20.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n20.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x3000</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n20xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n20.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x3000");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n21.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n21.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xD800</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n21xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n21.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xD800");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n22.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n22.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xD801</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n22xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n22.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xD801");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n23.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n23.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xDAFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n23xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n23.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xDAFF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n24.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n24.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xDFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n24xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n24.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xDFFF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n25.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n25.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xEFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n25xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n25.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xEFFF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n26.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n26.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xF1FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n26xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n26.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xF1FF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n27.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n27.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xF8FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n27xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n27.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xF8FF");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P04-ibm04n28.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n28.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xFFFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P04_ibm04n28xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n28.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xFFFFF");
    }
  }
        
    
    
}
    