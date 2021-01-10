
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production4 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n01.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n01.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x21</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x21");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n02.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n02.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x28</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x28");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n03.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n03.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x29</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x29");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n04.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n04.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x2B</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x2B");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n05.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n05.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x2C</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x2C");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n06.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n06.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x2F</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x2F");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n07.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n07.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x3B</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x3B");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n08.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n08.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x3C</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x3C");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n09.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n09.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x3D</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x3D");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n10.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n10.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x3F</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x3F");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n11.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n11.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x5B</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x5B");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n12.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n12.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x5C</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x5C");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n13.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n13.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x5D</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x5D");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n14.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n14.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x5E</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x5E");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n15.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n15.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x60</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x60");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n16.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n16.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x7B</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x7B");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n17.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n17.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x7C</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n17xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n17.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x7C");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P04-ibm04n18.xml</pre>
   * Test URI: <pre>not-wf/P04/ibm04n18.xml</pre>
   * Comment: <pre>Tests an element name which contains an illegal ASCII NameChar.     "IllegalNameChar" is followed by #x7D</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P04_ibm04n18xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P04/ibm04n18.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which contains an illegal ASCII NameChar.     \"IllegalNameChar\" is followed by #x7D");
    }
  }
        
    
    
}
    