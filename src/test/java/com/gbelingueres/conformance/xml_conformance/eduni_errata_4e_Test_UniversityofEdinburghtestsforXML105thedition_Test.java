
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
 * TESCASES PROFILE: <pre>University of Edinburgh tests for XML 1.0 5th edition</pre>
 * XML test files base folder: <pre>xmlconf/eduni/errata-4e/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class eduni_errata_4e_Test_UniversityofEdinburghtestsforXML105thedition_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/eduni/errata-4e/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>invalid-sa-140</pre>
   * Test URI: <pre>140.xml</pre>
   * Comment: <pre>Character '&#38;#x309a;' is a CombiningChar, not a Letter, but as of 5th edition, may begin a name (c.f. xmltest/not-wf/sa/140.xml).</pre>
   * Sections: <pre>2.3 [4]</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testinvalid_sa_140() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "140.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character '&#x309a;' is a CombiningChar, not a Letter, but as of 5th edition, may begin a name (c.f. xmltest/not-wf/sa/140.xml).");
    }
  }
        
    
  /**
   * Test ID: <pre>invalid-sa-141</pre>
   * Test URI: <pre>141.xml</pre>
   * Comment: <pre>As of 5th edition, character #x0E5C is legal in XML names (c.f. xmltest/not-wf/sa/141.xml).</pre>
   * Sections: <pre>2.3 [5]</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testinvalid_sa_141() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "141.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("As of 5th edition, character #x0E5C is legal in XML names (c.f. xmltest/not-wf/sa/141.xml).");
    }
  }
        
    
  /**
   * Test ID: <pre>x-rmt-008b</pre>
   * Test URI: <pre>008.xml</pre>
   * Comment: <pre>a document with version=1.7, legal in XML 1.0 from 5th edition</pre>
   * Sections: <pre>2.8 4.3.4</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testx_rmt_008b() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "008.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("a document with version=1.7, legal in XML 1.0 from 5th edition", true);
    }
    catch (XmlPullParserException ex) {
      fail("a document with version=1.7, legal in XML 1.0 from 5th edition");
    }
  }
        
    
  /**
   * Test ID: <pre>x-rmt5-014</pre>
   * Test URI: <pre>014.xml</pre>
   * Comment: <pre>Has a "long s" in a name, legal in XML 1.1, legal in XML 1.0 5th edition</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_rmt5_014() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "014.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Has a \"long s\" in a name, legal in XML 1.1, legal in XML 1.0 5th edition");
    }
  }
        
    
  /**
   * Test ID: <pre>x-rmt5-014a</pre>
   * Test URI: <pre>014a.xml</pre>
   * Comment: <pre>Has a "long s" in a name, legal in XML 1.1, legal in XML 1.0 5th edition</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testx_rmt5_014a() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "014a.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Has a \"long s\" in a name, legal in XML 1.1, legal in XML 1.0 5th edition", true);
    }
    catch (XmlPullParserException ex) {
      fail("Has a \"long s\" in a name, legal in XML 1.1, legal in XML 1.0 5th edition");
    }
  }
        
    
  /**
   * Test ID: <pre>x-rmt5-016</pre>
   * Test URI: <pre>016.xml</pre>
   * Comment: <pre>Has a Byzantine Musical Symbol Kratimata in a name, legal in XML 1.1, legal in XML 1.0 5th edition</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_rmt5_016() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "016.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Has a Byzantine Musical Symbol Kratimata in a name, legal in XML 1.1, legal in XML 1.0 5th edition");
    }
  }
        
    
  /**
   * Test ID: <pre>x-rmt5-019</pre>
   * Test URI: <pre>019.xml</pre>
   * Comment: <pre>Has the last legal namechar in XML 1.1, legal in XML 1.0 5th edition</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_rmt5_019() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "019.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Has the last legal namechar in XML 1.1, legal in XML 1.0 5th edition");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n02.xml</pre>
   * Test URI: <pre>ibm04n02.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x333</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x333");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n03.xml</pre>
   * Test URI: <pre>ibm04n03.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x369</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x369");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n04.xml</pre>
   * Test URI: <pre>ibm04n04.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x37E</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x37E");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n05.xml</pre>
   * Test URI: <pre>ibm04n05.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2000</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2000");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n06.xml</pre>
   * Test URI: <pre>ibm04n06.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2001</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2001");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n07.xml</pre>
   * Test URI: <pre>ibm04n07.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2002</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2002");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n08.xml</pre>
   * Test URI: <pre>ibm04n08.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2005</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2005");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n09.xml</pre>
   * Test URI: <pre>ibm04n09.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x200B</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x200B");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n10.xml</pre>
   * Test URI: <pre>ibm04n10.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x200E</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x200E");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n11.xml</pre>
   * Test URI: <pre>ibm04n11.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x200F</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x200F");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n12.xml</pre>
   * Test URI: <pre>ibm04n12.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2069</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2069");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n13.xml</pre>
   * Test URI: <pre>ibm04n13.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2190</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2190");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n14.xml</pre>
   * Test URI: <pre>ibm04n14.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x23FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x23FF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n15.xml</pre>
   * Test URI: <pre>ibm04n15.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x280F</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x280F");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n16.xml</pre>
   * Test URI: <pre>ibm04n16.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2A00</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2A00");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n17.xml</pre>
   * Test URI: <pre>ibm04n17.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2EDC</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n17xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n17.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2EDC");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n18.xml</pre>
   * Test URI: <pre>ibm04n18.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2B00</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n18xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n18.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2B00");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n19.xml</pre>
   * Test URI: <pre>ibm04n19.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x2BFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n19xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n19.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x2BFF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n20.xml</pre>
   * Test URI: <pre>ibm04n20.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0x3000</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n20xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n20.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0x3000");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n21.xml</pre>
   * Test URI: <pre>ibm04n21.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xD800</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n21xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n21.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xD800");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n22.xml</pre>
   * Test URI: <pre>ibm04n22.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xD801</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n22xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n22.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xD801");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n23.xml</pre>
   * Test URI: <pre>ibm04n23.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xDAFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n23xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n23.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xDAFF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n24.xml</pre>
   * Test URI: <pre>ibm04n24.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xDFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n24xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n24.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xDFFF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n25.xml</pre>
   * Test URI: <pre>ibm04n25.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xEFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n25xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n25.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xEFFF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n26.xml</pre>
   * Test URI: <pre>ibm04n26.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xF1FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n26xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n26.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xF1FF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n27.xml</pre>
   * Test URI: <pre>ibm04n27.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xF8FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n27xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n27.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xF8FF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04-ibm04n28.xml</pre>
   * Test URI: <pre>ibm04n28.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameStartChar: #0xFFFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04_ibm04n28xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04n28.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameStartChar: #0xFFFFF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an01.xml</pre>
   * Test URI: <pre>ibm04an01.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #xB8</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #xB8");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an02.xml</pre>
   * Test URI: <pre>ibm04an02.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xA1</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xA1");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an03.xml</pre>
   * Test URI: <pre>ibm04an03.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xAF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xAF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an04.xml</pre>
   * Test URI: <pre>ibm04an04.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x37E</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x37E");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an05.xml</pre>
   * Test URI: <pre>ibm04an05.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2000</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2000");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an06.xml</pre>
   * Test URI: <pre>ibm04an06.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2001</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2001");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an07.xml</pre>
   * Test URI: <pre>ibm04an07.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2002</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2002");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an08.xml</pre>
   * Test URI: <pre>ibm04an08.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2005</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2005");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an09.xml</pre>
   * Test URI: <pre>ibm04an09.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x200B</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x200B");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an10.xml</pre>
   * Test URI: <pre>ibm04an10.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x200E</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x200E");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an11.xml</pre>
   * Test URI: <pre>ibm04an11.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2038</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2038");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an12.xml</pre>
   * Test URI: <pre>ibm04an12.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2041</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2041");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an13.xml</pre>
   * Test URI: <pre>ibm04an13.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2190</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2190");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an14.xml</pre>
   * Test URI: <pre>ibm04an14.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x23FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x23FF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an15.xml</pre>
   * Test URI: <pre>ibm04an15.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x280F</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x280F");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an16.xml</pre>
   * Test URI: <pre>ibm04an16.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2A00</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2A00");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an17.xml</pre>
   * Test URI: <pre>ibm04an17.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xFDD0</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an17xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an17.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xFDD0");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an18.xml</pre>
   * Test URI: <pre>ibm04an18.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xFDEF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an18xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an18.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xFDEF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an19.xml</pre>
   * Test URI: <pre>ibm04an19.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x2FFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an19xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an19.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x2FFF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an20.xml</pre>
   * Test URI: <pre>ibm04an20.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0x3000</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an20xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an20.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0x3000");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an21.xml</pre>
   * Test URI: <pre>ibm04an21.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xD800</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an21xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an21.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xD800");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an22.xml</pre>
   * Test URI: <pre>ibm04an22.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xD801</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an22xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an22.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xD801");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an23.xml</pre>
   * Test URI: <pre>ibm04an23.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xDAFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an23xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an23.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xDAFF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an24.xml</pre>
   * Test URI: <pre>ibm04an24.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xDFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an24xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an24.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xDFFF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an25.xml</pre>
   * Test URI: <pre>ibm04an25.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xEFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an25xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an25.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xEFFF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an26.xml</pre>
   * Test URI: <pre>ibm04an26.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xF1FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an26xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an26.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xF1FF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an27.xml</pre>
   * Test URI: <pre>ibm04an27.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xF8FF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an27xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an27.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xF8FF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P04a-ibm04an28.xml</pre>
   * Test URI: <pre>ibm04an28.xml</pre>
   * Comment: <pre>Tests an element with an illegal NameChar: #0xFFFFF</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P04a_ibm04an28xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04an28.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal NameChar: #0xFFFFF");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P05-ibm05n01.xml</pre>
   * Test URI: <pre>ibm05n01.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #0x0B</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P05_ibm05n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm05n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #0x0B");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P05-ibm05n02.xml</pre>
   * Test URI: <pre>ibm05n02.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #0x300</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P05_ibm05n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm05n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #0x300");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P05-ibm05n03.xml</pre>
   * Test URI: <pre>ibm05n03.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #0x36F</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P05_ibm05n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm05n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #0x36F");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P05-ibm05n04.xml</pre>
   * Test URI: <pre>ibm05n04.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #0x203F</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P05_ibm05n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm05n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #0x203F");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P05-ibm05n05.xml</pre>
   * Test URI: <pre>ibm05n05.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #x2040</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P05_ibm05n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm05n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #x2040");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-not-wf-P05-ibm05n06.xml</pre>
   * Test URI: <pre>ibm05n06.xml</pre>
   * Comment: <pre>Tests an element with an illegal Name containing #0xB7</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testx_ibm_1_05_not_wf_P05_ibm05n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm05n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element with an illegal Name containing #0xB7");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-valid-P04-ibm04v01.xml</pre>
   * Test URI: <pre>ibm04v01.xml</pre>
   * Comment: <pre>This test case covers legal NameStartChars character ranges plus discrete legal characters for production 04.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testx_ibm_1_05_valid_P04_ibm04v01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04v01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal NameStartChars character ranges plus discrete legal characters for production 04.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal NameStartChars character ranges plus discrete legal characters for production 04.");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-valid-P04-ibm04av01.xml</pre>
   * Test URI: <pre>ibm04av01.xml</pre>
   * Comment: <pre>This test case covers legal NameChars character ranges plus discrete legal characters for production 04a.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testx_ibm_1_05_valid_P04_ibm04av01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm04av01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal NameChars character ranges plus discrete legal characters for production 04a.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal NameChars character ranges plus discrete legal characters for production 04a.");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-valid-P05-ibm05v01.xml</pre>
   * Test URI: <pre>ibm05v01.xml</pre>
   * Comment: <pre>This test case covers legal Element Names as per production 5.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testx_ibm_1_05_valid_P05_ibm05v01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm05v01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal Element Names as per production 5.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal Element Names as per production 5.");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-valid-P05-ibm05v02.xml</pre>
   * Test URI: <pre>ibm05v02.xml</pre>
   * Comment: <pre>This test case covers legal PITarget (Names) as per production 5.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testx_ibm_1_05_valid_P05_ibm05v02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm05v02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal PITarget (Names) as per production 5.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal PITarget (Names) as per production 5.");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-valid-P05-ibm05v03.xml</pre>
   * Test URI: <pre>ibm05v03.xml</pre>
   * Comment: <pre>This test case covers legal Attribute (Names) as per production 5.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testx_ibm_1_05_valid_P05_ibm05v03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm05v03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal Attribute (Names) as per production 5.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal Attribute (Names) as per production 5.");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-valid-P05-ibm05v04.xml</pre>
   * Test URI: <pre>ibm05v04.xml</pre>
   * Comment: <pre>This test case covers legal ID/IDREF (Names) as per production 5.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testx_ibm_1_05_valid_P05_ibm05v04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm05v04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal ID/IDREF (Names) as per production 5.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal ID/IDREF (Names) as per production 5.");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-valid-P05-ibm05v05.xml</pre>
   * Test URI: <pre>ibm05v05.xml</pre>
   * Comment: <pre>This test case covers legal ENTITY (Names) as per production 5.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testx_ibm_1_05_valid_P05_ibm05v05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm05v05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal ENTITY (Names) as per production 5.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal ENTITY (Names) as per production 5.");
    }
  }
        
    
  /**
   * Test ID: <pre>x-ibm-1-0.5-valid-P047-ibm07v01.xml</pre>
   * Test URI: <pre>ibm07v01.xml</pre>
   * Comment: <pre>This test case covers legal NMTOKEN Name character ranges plus discrete legal characters for production 7.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testx_ibm_1_05_valid_P047_ibm07v01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm07v01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal NMTOKEN Name character ranges plus discrete legal characters for production 7.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal NMTOKEN Name character ranges plus discrete legal characters for production 7.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n03.xml</pre>
   * Test URI: <pre>ibm85n03.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0132         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0132         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0132         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n04.xml</pre>
   * Test URI: <pre>ibm85n04.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0133         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0133         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0133         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n05.xml</pre>
   * Test URI: <pre>ibm85n05.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x013F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x013F         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x013F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n06.xml</pre>
   * Test URI: <pre>ibm85n06.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0140         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0140         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0140         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n07.xml</pre>
   * Test URI: <pre>ibm85n07.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0149         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0149         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0149         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n08.xml</pre>
   * Test URI: <pre>ibm85n08.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x017F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x017F         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x017F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n09.xml</pre>
   * Test URI: <pre>ibm85n09.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x01c4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x01c4         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x01c4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n10.xml</pre>
   * Test URI: <pre>ibm85n10.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x01CC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x01CC         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x01CC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n100.xml</pre>
   * Test URI: <pre>ibm85n100.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0BB6     occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n100xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n100.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0BB6     occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0BB6     occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n101.xml</pre>
   * Test URI: <pre>ibm85n101.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0BBA     occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n101xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n101.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0BBA     occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0BBA     occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n102.xml</pre>
   * Test URI: <pre>ibm85n102.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0C0D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n102xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n102.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0C0D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0C0D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n103.xml</pre>
   * Test URI: <pre>ibm85n103.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0C11         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n103xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n103.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0C11         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0C11         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n104.xml</pre>
   * Test URI: <pre>ibm85n104.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0C29         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n104xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n104.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0C29         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0C29         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n105.xml</pre>
   * Test URI: <pre>ibm85n105.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0C34         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n105xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n105.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0C34         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0C34         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n106.xml</pre>
   * Test URI: <pre>ibm85n106.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0C5F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n106xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n106.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0C5F         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0C5F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n107.xml</pre>
   * Test URI: <pre>ibm85n107.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0C62         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n107xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n107.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0C62         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0C62         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n108.xml</pre>
   * Test URI: <pre>ibm85n108.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0C8D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n108xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n108.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0C8D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0C8D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n109.xml</pre>
   * Test URI: <pre>ibm85n109.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0C91         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n109xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n109.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0C91         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0C91         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n11.xml</pre>
   * Test URI: <pre>ibm85n11.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x01F1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x01F1         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x01F1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n110.xml</pre>
   * Test URI: <pre>ibm85n110.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0CA9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n110xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n110.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0CA9         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0CA9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n111.xml</pre>
   * Test URI: <pre>ibm85n111.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0CB4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n111xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n111.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0CB4         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0CB4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n112.xml</pre>
   * Test URI: <pre>ibm85n112.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0CBA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n112xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n112.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0CBA         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0CBA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n113.xml</pre>
   * Test URI: <pre>ibm85n113.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0CDF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n113xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n113.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0CDF         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0CDF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n114.xml</pre>
   * Test URI: <pre>ibm85n114.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0CE2         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n114xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n114.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0CE2         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0CE2         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n115.xml</pre>
   * Test URI: <pre>ibm85n115.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0D0D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n115xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n115.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0D0D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0D0D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n116.xml</pre>
   * Test URI: <pre>ibm85n116.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0D11         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n116xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n116.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0D11         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0D11         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n117.xml</pre>
   * Test URI: <pre>ibm85n117.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0D29         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n117xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n117.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0D29         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0D29         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n118.xml</pre>
   * Test URI: <pre>ibm85n118.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0D3A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n118xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n118.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0D3A         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0D3A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n119.xml</pre>
   * Test URI: <pre>ibm85n119.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0D62         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n119xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n119.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0D62         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0D62         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n12.xml</pre>
   * Test URI: <pre>ibm85n12.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x01F3         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x01F3         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x01F3         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n120.xml</pre>
   * Test URI: <pre>ibm85n120.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0E2F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n120xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n120.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0E2F         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0E2F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n121.xml</pre>
   * Test URI: <pre>ibm85n121.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0E31         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n121xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n121.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0E31         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0E31         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n122.xml</pre>
   * Test URI: <pre>ibm85n122.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0E34         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n122xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n122.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0E34         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0E34         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n123.xml</pre>
   * Test URI: <pre>ibm85n123.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0E46         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n123xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n123.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0E46         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0E46         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n124.xml</pre>
   * Test URI: <pre>ibm85n124.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0E83         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n124xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n124.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0E83         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0E83         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n125.xml</pre>
   * Test URI: <pre>ibm85n125.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0E85         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n125xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n125.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0E85         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0E85         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n126.xml</pre>
   * Test URI: <pre>ibm85n126.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0E89         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n126xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n126.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0E89         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0E89         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n127.xml</pre>
   * Test URI: <pre>ibm85n127.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0E8B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n127xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n127.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0E8B         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0E8B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n128.xml</pre>
   * Test URI: <pre>ibm85n128.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0E8E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n128xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n128.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0E8E         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0E8E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n129.xml</pre>
   * Test URI: <pre>ibm85n129.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0E98         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n129xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n129.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0E98         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0E98         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n13.xml</pre>
   * Test URI: <pre>ibm85n13.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x01F6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x01F6         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x01F6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n130.xml</pre>
   * Test URI: <pre>ibm85n130.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0EA0         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n130xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n130.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0EA0         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0EA0         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n131.xml</pre>
   * Test URI: <pre>ibm85n131.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0EA4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n131xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n131.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0EA4         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0EA4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n132.xml</pre>
   * Test URI: <pre>ibm85n132.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0EA6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n132xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n132.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0EA6         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0EA6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n133.xml</pre>
   * Test URI: <pre>ibm85n133.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0EA8         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n133xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n133.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0EA8         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0EA8         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n134.xml</pre>
   * Test URI: <pre>ibm85n134.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0EAC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n134xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n134.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0EAC         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0EAC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n135.xml</pre>
   * Test URI: <pre>ibm85n135.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0EAF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n135xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n135.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0EAF         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0EAF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n136.xml</pre>
   * Test URI: <pre>ibm85n136.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0EB1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n136xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n136.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0EB1         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0EB1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n137.xml</pre>
   * Test URI: <pre>ibm85n137.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0EB4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n137xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n137.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0EB4         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0EB4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n138.xml</pre>
   * Test URI: <pre>ibm85n138.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0EBE         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n138xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n138.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0EBE         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0EBE         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n139.xml</pre>
   * Test URI: <pre>ibm85n139.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0EC5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n139xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n139.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0EC5         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0EC5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n14.xml</pre>
   * Test URI: <pre>ibm85n14.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x01F9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x01F9         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x01F9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n140.xml</pre>
   * Test URI: <pre>ibm85n140.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0F48         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n140xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n140.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0F48         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0F48         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n141.xml</pre>
   * Test URI: <pre>ibm85n141.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0F6A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n141xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n141.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0F6A         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0F6A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n142.xml</pre>
   * Test URI: <pre>ibm85n142.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x10C6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n142xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n142.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x10C6         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x10C6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n143.xml</pre>
   * Test URI: <pre>ibm85n143.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x10F7         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n143xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n143.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x10F7         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x10F7         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n144.xml</pre>
   * Test URI: <pre>ibm85n144.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1011         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n144xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n144.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1011         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1011         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n145.xml</pre>
   * Test URI: <pre>ibm85n145.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1104         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n145xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n145.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1104         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1104         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n146.xml</pre>
   * Test URI: <pre>ibm85n146.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1108         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n146xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n146.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1108         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1108         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n147.xml</pre>
   * Test URI: <pre>ibm85n147.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x110A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n147xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n147.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x110A         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x110A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n148.xml</pre>
   * Test URI: <pre>ibm85n148.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x110D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n148xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n148.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x110D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x110D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n149.xml</pre>
   * Test URI: <pre>ibm85n149.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x113B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n149xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n149.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x113B         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x113B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n15.xml</pre>
   * Test URI: <pre>ibm85n15.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x01F9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x01F9         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x01F9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n150.xml</pre>
   * Test URI: <pre>ibm85n150.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x113F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n150xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n150.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x113F         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x113F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n151.xml</pre>
   * Test URI: <pre>ibm85n151.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1141         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n151xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n151.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1141         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1141         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n152.xml</pre>
   * Test URI: <pre>ibm85n152.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x114D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n152xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n152.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x114D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x114D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n153.xml</pre>
   * Test URI: <pre>ibm85n153.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x114f         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n153xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n153.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x114f         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x114f         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n154.xml</pre>
   * Test URI: <pre>ibm85n154.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1151         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n154xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n154.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1151         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1151         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n155.xml</pre>
   * Test URI: <pre>ibm85n155.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1156         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n155xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n155.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1156         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1156         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n156.xml</pre>
   * Test URI: <pre>ibm85n156.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x115A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n156xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n156.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x115A         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x115A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n157.xml</pre>
   * Test URI: <pre>ibm85n157.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1162         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n157xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n157.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1162         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1162         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n158.xml</pre>
   * Test URI: <pre>ibm85n158.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1164         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n158xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n158.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1164         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1164         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n159.xml</pre>
   * Test URI: <pre>ibm85n159.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1166         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n159xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n159.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1166         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1166         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n16.xml</pre>
   * Test URI: <pre>ibm85n16.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0230         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0230         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0230         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n160.xml</pre>
   * Test URI: <pre>ibm85n160.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x116B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n160xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n160.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x116B         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x116B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n161.xml</pre>
   * Test URI: <pre>ibm85n161.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x116F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n161xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n161.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x116F         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x116F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n162.xml</pre>
   * Test URI: <pre>ibm85n162.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1174         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n162xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n162.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1174         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1174         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n163.xml</pre>
   * Test URI: <pre>ibm85n163.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x119F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n163xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n163.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x119F         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x119F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n164.xml</pre>
   * Test URI: <pre>ibm85n164.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x11AC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n164xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n164.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x11AC         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x11AC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n165.xml</pre>
   * Test URI: <pre>ibm85n165.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x11B6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n165xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n165.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x11B6         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x11B6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n166.xml</pre>
   * Test URI: <pre>ibm85n166.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x11B9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n166xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n166.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x11B9         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x11B9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n167.xml</pre>
   * Test URI: <pre>ibm85n167.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x11BB         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n167xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n167.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x11BB         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x11BB         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n168.xml</pre>
   * Test URI: <pre>ibm85n168.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x11C3         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n168xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n168.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x11C3         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x11C3         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n169.xml</pre>
   * Test URI: <pre>ibm85n169.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x11F1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n169xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n169.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x11F1         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x11F1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n17.xml</pre>
   * Test URI: <pre>ibm85n17.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x02AF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n17xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n17.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x02AF         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x02AF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n170.xml</pre>
   * Test URI: <pre>ibm85n170.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x11FA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n170xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n170.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x11FA         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x11FA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n171.xml</pre>
   * Test URI: <pre>ibm85n171.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1E9C         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n171xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n171.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1E9C         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1E9C         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n172.xml</pre>
   * Test URI: <pre>ibm85n172.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1EFA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n172xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n172.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1EFA         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1EFA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n173.xml</pre>
   * Test URI: <pre>ibm85n173.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1F16         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n173xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n173.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1F16         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1F16         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n174.xml</pre>
   * Test URI: <pre>ibm85n174.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1F1E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n174xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n174.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1F1E         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1F1E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n175.xml</pre>
   * Test URI: <pre>ibm85n175.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1F46         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n175xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n175.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1F46         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1F46         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n176.xml</pre>
   * Test URI: <pre>ibm85n176.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1F4F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n176xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n176.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1F4F         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1F4F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n177.xml</pre>
   * Test URI: <pre>ibm85n177.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1F58         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n177xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n177.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1F58         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1F58         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n178.xml</pre>
   * Test URI: <pre>ibm85n178.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1F5A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n178xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n178.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1F5A         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1F5A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n179.xml</pre>
   * Test URI: <pre>ibm85n179.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1F5C         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n179xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n179.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1F5C         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1F5C         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n18.xml</pre>
   * Test URI: <pre>ibm85n18.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x02CF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n18xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n18.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x02CF         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x02CF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n180.xml</pre>
   * Test URI: <pre>ibm85n180.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1F5E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n180xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n180.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1F5E         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1F5E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n181.xml</pre>
   * Test URI: <pre>ibm85n181.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1F7E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n181xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n181.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1F7E         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1F7E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n182.xml</pre>
   * Test URI: <pre>ibm85n182.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1FB5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n182xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n182.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1FB5         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1FB5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n183.xml</pre>
   * Test URI: <pre>ibm85n183.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1FBD         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n183xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n183.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1FBD         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1FBD         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n184.xml</pre>
   * Test URI: <pre>ibm85n184.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1FBF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n184xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n184.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1FBF         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1FBF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n185.xml</pre>
   * Test URI: <pre>ibm85n185.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1FC5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n185xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n185.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1FC5         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1FC5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n186.xml</pre>
   * Test URI: <pre>ibm85n186.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1FCD         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n186xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n186.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1FCD         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1FCD         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n187.xml</pre>
   * Test URI: <pre>ibm85n187.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1FD5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n187xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n187.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1FD5         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1FD5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n188.xml</pre>
   * Test URI: <pre>ibm85n188.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1FDC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n188xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n188.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1FDC         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1FDC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n189.xml</pre>
   * Test URI: <pre>ibm85n189.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1FED         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n189xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n189.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1FED         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1FED         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n19.xml</pre>
   * Test URI: <pre>ibm85n19.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0387         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n19xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n19.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0387         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0387         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n190.xml</pre>
   * Test URI: <pre>ibm85n190.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1FF5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n190xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n190.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1FF5         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1FF5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n191.xml</pre>
   * Test URI: <pre>ibm85n191.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x1FFD         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n191xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n191.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x1FFD         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x1FFD         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n192.xml</pre>
   * Test URI: <pre>ibm85n192.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x2127         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n192xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n192.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x2127         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x2127         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n193.xml</pre>
   * Test URI: <pre>ibm85n193.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x212F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n193xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n193.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x212F         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x212F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n194.xml</pre>
   * Test URI: <pre>ibm85n194.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x2183         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n194xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n194.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x2183         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x2183         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n195.xml</pre>
   * Test URI: <pre>ibm85n195.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x3095         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n195xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n195.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x3095         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x3095         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n196.xml</pre>
   * Test URI: <pre>ibm85n196.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x30FB         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n196xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n196.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x30FB         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x30FB         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n197.xml</pre>
   * Test URI: <pre>ibm85n197.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x312D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n197xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n197.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x312D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x312D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n198.xml</pre>
   * Test URI: <pre>ibm85n198.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #xD7A4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n198xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n198.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #xD7A4         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #xD7A4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n20.xml</pre>
   * Test URI: <pre>ibm85n20.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x038B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n20xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n20.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x038B         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x038B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n21.xml</pre>
   * Test URI: <pre>ibm85n21.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x03A2         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n21xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n21.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x03A2         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x03A2         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n22.xml</pre>
   * Test URI: <pre>ibm85n22.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x03CF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n22xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n22.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x03CF         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x03CF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n23.xml</pre>
   * Test URI: <pre>ibm85n23.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x03D7         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n23xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n23.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x03D7         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x03D7         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n24.xml</pre>
   * Test URI: <pre>ibm85n24.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x03DD         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n24xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n24.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x03DD         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x03DD         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n25.xml</pre>
   * Test URI: <pre>ibm85n25.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x03E1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n25xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n25.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x03E1         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x03E1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n26.xml</pre>
   * Test URI: <pre>ibm85n26.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x03F4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n26xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n26.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x03F4         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x03F4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n27.xml</pre>
   * Test URI: <pre>ibm85n27.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x040D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n27xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n27.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x040D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x040D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n28.xml</pre>
   * Test URI: <pre>ibm85n28.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0450         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n28xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n28.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0450         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0450         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n29.xml</pre>
   * Test URI: <pre>ibm85n29.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x045D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n29xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n29.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x045D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x045D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n30.xml</pre>
   * Test URI: <pre>ibm85n30.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0482         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n30xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n30.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0482         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0482         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n31.xml</pre>
   * Test URI: <pre>ibm85n31.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x04C5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n31xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n31.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x04C5         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x04C5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n32.xml</pre>
   * Test URI: <pre>ibm85n32.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x04C6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n32xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n32.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x04C6         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x04C6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n33.xml</pre>
   * Test URI: <pre>ibm85n33.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x04C9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n33xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n33.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x04C9         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x04C9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n34.xml</pre>
   * Test URI: <pre>ibm85n34.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x04EC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n34xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n34.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x04EC         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x04EC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n35.xml</pre>
   * Test URI: <pre>ibm85n35.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x04ED         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n35xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n35.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x04ED         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x04ED         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n36.xml</pre>
   * Test URI: <pre>ibm85n36.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x04F6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n36xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n36.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x04F6         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x04F6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n37.xml</pre>
   * Test URI: <pre>ibm85n37.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x04FA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n37xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n37.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x04FA         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x04FA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n38.xml</pre>
   * Test URI: <pre>ibm85n38.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0557         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n38xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n38.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0557         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0557         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n39.xml</pre>
   * Test URI: <pre>ibm85n39.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0558         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n39xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n39.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0558         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0558         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n40.xml</pre>
   * Test URI: <pre>ibm85n40.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0587         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n40xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n40.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0587         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0587         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n41.xml</pre>
   * Test URI: <pre>ibm85n41.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x05EB         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n41xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n41.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x05EB         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x05EB         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n42.xml</pre>
   * Test URI: <pre>ibm85n42.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x05F3         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n42xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n42.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x05F3         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x05F3         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n43.xml</pre>
   * Test URI: <pre>ibm85n43.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0620         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n43xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n43.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0620         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0620         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n44.xml</pre>
   * Test URI: <pre>ibm85n44.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x063B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n44xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n44.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x063B         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x063B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n45.xml</pre>
   * Test URI: <pre>ibm85n45.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x064B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n45xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n45.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x064B         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x064B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n46.xml</pre>
   * Test URI: <pre>ibm85n46.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x06B8         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n46xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n46.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x06B8         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x06B8         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n47.xml</pre>
   * Test URI: <pre>ibm85n47.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x06BF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n47xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n47.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x06BF         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x06BF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n48.xml</pre>
   * Test URI: <pre>ibm85n48.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x06CF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n48xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n48.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x06CF         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x06CF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n49.xml</pre>
   * Test URI: <pre>ibm85n49.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x06D4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n49xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n49.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x06D4         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x06D4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n50.xml</pre>
   * Test URI: <pre>ibm85n50.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x06D6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n50xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n50.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x06D6         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x06D6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n51.xml</pre>
   * Test URI: <pre>ibm85n51.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x06E7         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n51xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n51.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x06E7         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x06E7         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n52.xml</pre>
   * Test URI: <pre>ibm85n52.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x093A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n52xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n52.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x093A         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x093A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n53.xml</pre>
   * Test URI: <pre>ibm85n53.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x093E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n53xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n53.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x093E         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x093E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n54.xml</pre>
   * Test URI: <pre>ibm85n54.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0962         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n54xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n54.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0962         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0962         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n55.xml</pre>
   * Test URI: <pre>ibm85n55.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x098D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n55xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n55.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x098D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x098D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n56.xml</pre>
   * Test URI: <pre>ibm85n56.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0991         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n56xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n56.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0991         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0991         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n57.xml</pre>
   * Test URI: <pre>ibm85n57.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0992         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n57xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n57.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0992         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0992         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n58.xml</pre>
   * Test URI: <pre>ibm85n58.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x09A9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n58xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n58.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x09A9         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x09A9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n59.xml</pre>
   * Test URI: <pre>ibm85n59.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x09B1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n59xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n59.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x09B1         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x09B1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n60.xml</pre>
   * Test URI: <pre>ibm85n60.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x09B5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n60xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n60.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x09B5         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x09B5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n61.xml</pre>
   * Test URI: <pre>ibm85n61.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x09BA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n61xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n61.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x09BA         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x09BA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n62.xml</pre>
   * Test URI: <pre>ibm85n62.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x09DE         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n62xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n62.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x09DE         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x09DE         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n63.xml</pre>
   * Test URI: <pre>ibm85n63.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x09E2         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n63xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n63.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x09E2         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x09E2         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n64.xml</pre>
   * Test URI: <pre>ibm85n64.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x09F2         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n64xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n64.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x09F2         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x09F2         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n65.xml</pre>
   * Test URI: <pre>ibm85n65.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0A0B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n65xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n65.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0A0B         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0A0B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n66.xml</pre>
   * Test URI: <pre>ibm85n66.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0A11         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n66xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n66.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0A11         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0A11         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n67.xml</pre>
   * Test URI: <pre>ibm85n67.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0A29         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n67xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n67.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0A29         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0A29         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n68.xml</pre>
   * Test URI: <pre>ibm85n68.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0A31         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n68xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n68.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0A31         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0A31         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n69.xml</pre>
   * Test URI: <pre>ibm85n69.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0A34         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n69xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n69.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0A34         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0A34         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n70.xml</pre>
   * Test URI: <pre>ibm85n70.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0A37         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n70xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n70.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0A37         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0A37         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n71.xml</pre>
   * Test URI: <pre>ibm85n71.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0A3A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n71xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n71.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0A3A         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0A3A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n72.xml</pre>
   * Test URI: <pre>ibm85n72.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0A5D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n72xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n72.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0A5D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0A5D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n73.xml</pre>
   * Test URI: <pre>ibm85n73.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0A70         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n73xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n73.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0A70         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0A70         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n74.xml</pre>
   * Test URI: <pre>ibm85n74.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0A75         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n74xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n74.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0A75         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0A75         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n75.xml</pre>
   * Test URI: <pre>ibm85n75.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #xA84         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n75xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n75.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #xA84         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #xA84         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n76.xml</pre>
   * Test URI: <pre>ibm85n76.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0ABC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n76xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n76.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0ABC         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0ABC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n77.xml</pre>
   * Test URI: <pre>ibm85n77.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0A92         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n77xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n77.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0A92         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0A92         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n78.xml</pre>
   * Test URI: <pre>ibm85n78.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0AA9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n78xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n78.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0AA9         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0AA9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n79.xml</pre>
   * Test URI: <pre>ibm85n79.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0AB1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n79xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n79.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0AB1         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0AB1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n80.xml</pre>
   * Test URI: <pre>ibm85n80.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0AB4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n80xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n80.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0AB4         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0AB4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n81.xml</pre>
   * Test URI: <pre>ibm85n81.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0ABA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n81xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n81.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0ABA         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0ABA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n82.xml</pre>
   * Test URI: <pre>ibm85n82.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B04         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n82xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n82.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B04         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B04         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n83.xml</pre>
   * Test URI: <pre>ibm85n83.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B0D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n83xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n83.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B0D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B0D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n84.xml</pre>
   * Test URI: <pre>ibm85n84.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B11         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n84xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n84.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B11         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B11         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n85.xml</pre>
   * Test URI: <pre>ibm85n85.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B29         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n85xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n85.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B29         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B29         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n86.xml</pre>
   * Test URI: <pre>ibm85n86.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B31         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n86xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n86.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B31         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B31         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n87.xml</pre>
   * Test URI: <pre>ibm85n87.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B34         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n87xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n87.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B34         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B34         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n88.xml</pre>
   * Test URI: <pre>ibm85n88.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B3A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n88xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n88.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B3A         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B3A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n89.xml</pre>
   * Test URI: <pre>ibm85n89.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B3E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n89xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n89.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B3E         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B3E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n90.xml</pre>
   * Test URI: <pre>ibm85n90.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B5E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n90xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n90.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B5E         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B5E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n91.xml</pre>
   * Test URI: <pre>ibm85n91.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B62         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n91xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n91.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B62         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B62         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n92.xml</pre>
   * Test URI: <pre>ibm85n92.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B8B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n92xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n92.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B8B         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B8B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n93.xml</pre>
   * Test URI: <pre>ibm85n93.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B91         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n93xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n93.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B91         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B91         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n94.xml</pre>
   * Test URI: <pre>ibm85n94.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B98         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n94xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n94.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B98         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B98         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n95.xml</pre>
   * Test URI: <pre>ibm85n95.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B9B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n95xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n95.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B9B         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B9B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n96.xml</pre>
   * Test URI: <pre>ibm85n96.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0B9D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n96xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n96.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0B9D         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0B9D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n97.xml</pre>
   * Test URI: <pre>ibm85n97.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0BA0         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n97xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n97.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0BA0         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0BA0         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n98.xml</pre>
   * Test URI: <pre>ibm85n98.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0BA7         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n98xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n98.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0BA7         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0BA7         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P85-ibm85n99.xml</pre>
   * Test URI: <pre>ibm85n99.xml</pre>
   * Comment: <pre>Tests BaseChar with an only legal per 5th edition character. The character #x0BAB         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P85_ibm85n99xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm85n99.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests BaseChar with an only legal per 5th edition character. The character #x0BAB         occurs as the first character of the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests BaseChar with an only legal per 5th edition character. The character #x0BAB         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P86-ibm86n01.xml</pre>
   * Test URI: <pre>ibm86n01.xml</pre>
   * Comment: <pre>Tests Ideographic with an only legal per 5th edition character. The character #x4CFF         occurs as the first character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P86_ibm86n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm86n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Ideographic with an only legal per 5th edition character. The character #x4CFF         occurs as the first character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Ideographic with an only legal per 5th edition character. The character #x4CFF         occurs as the first character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P86-ibm86n02.xml</pre>
   * Test URI: <pre>ibm86n02.xml</pre>
   * Comment: <pre>Tests Ideographic with an only legal per 5th edition character. The character #x9FA6         occurs as the first character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P86_ibm86n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm86n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Ideographic with an only legal per 5th edition character. The character #x9FA6         occurs as the first character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Ideographic with an only legal per 5th edition character. The character #x9FA6         occurs as the first character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P86-ibm86n03.xml</pre>
   * Test URI: <pre>ibm86n03.xml</pre>
   * Comment: <pre>Tests Ideographic with an only legal per 5th edition character. The character #x3008         occurs as the first character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P86_ibm86n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm86n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Ideographic with an only legal per 5th edition character. The character #x3008         occurs as the first character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Ideographic with an only legal per 5th edition character. The character #x3008         occurs as the first character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P86-ibm86n04.xml</pre>
   * Test URI: <pre>ibm86n04.xml</pre>
   * Comment: <pre>Tests Ideographic with an only legal per 5th edition character. The character #x302A         occurs as the first character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P86_ibm86n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm86n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Ideographic with an only legal per 5th edition character. The character #x302A         occurs as the first character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Ideographic with an only legal per 5th edition character. The character #x302A         occurs as the first character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n01.xml</pre>
   * Test URI: <pre>ibm87n01.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x02FF         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x02FF         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x02FF         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n02.xml</pre>
   * Test URI: <pre>ibm87n02.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0346         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0346         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0346         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n03.xml</pre>
   * Test URI: <pre>ibm87n03.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0362         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0362         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0362         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n04.xml</pre>
   * Test URI: <pre>ibm87n04.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0487         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0487         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0487         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n05.xml</pre>
   * Test URI: <pre>ibm87n05.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x05A2         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x05A2         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x05A2         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n06.xml</pre>
   * Test URI: <pre>ibm87n06.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x05BA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x05BA         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x05BA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n07.xml</pre>
   * Test URI: <pre>ibm87n07.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x05BE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x05BE         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x05BE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n08.xml</pre>
   * Test URI: <pre>ibm87n08.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x05C0         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x05C0         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x05C0         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n09.xml</pre>
   * Test URI: <pre>ibm87n09.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x05C3         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x05C3         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x05C3         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n10.xml</pre>
   * Test URI: <pre>ibm87n10.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0653         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0653         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0653         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n11.xml</pre>
   * Test URI: <pre>ibm87n11.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x06B8         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x06B8         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x06B8         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n12.xml</pre>
   * Test URI: <pre>ibm87n12.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x06B9         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x06B9         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x06B9         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n13.xml</pre>
   * Test URI: <pre>ibm87n13.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x06E9         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x06E9         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x06E9         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n14.xml</pre>
   * Test URI: <pre>ibm87n14.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x06EE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x06EE         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x06EE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n15.xml</pre>
   * Test URI: <pre>ibm87n15.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0904         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0904         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0904         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n16.xml</pre>
   * Test URI: <pre>ibm87n16.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x093B         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x093B         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x093B         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n17.xml</pre>
   * Test URI: <pre>ibm87n17.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x094E         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n17xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n17.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x094E         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x094E         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n18.xml</pre>
   * Test URI: <pre>ibm87n18.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0955         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n18xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n18.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0955         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0955         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n19.xml</pre>
   * Test URI: <pre>ibm87n19.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0964         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n19xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n19.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0964         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0964         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n20.xml</pre>
   * Test URI: <pre>ibm87n20.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0984         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n20xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n20.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0984         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0984         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n21.xml</pre>
   * Test URI: <pre>ibm87n21.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x09C5         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n21xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n21.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x09C5         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x09C5         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n22.xml</pre>
   * Test URI: <pre>ibm87n22.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x09C9         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n22xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n22.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x09C9         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x09C9         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n23.xml</pre>
   * Test URI: <pre>ibm87n23.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x09CE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n23xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n23.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x09CE         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x09CE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n24.xml</pre>
   * Test URI: <pre>ibm87n24.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x09D8         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n24xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n24.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x09D8         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x09D8         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n25.xml</pre>
   * Test URI: <pre>ibm87n25.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x09E4         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n25xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n25.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x09E4         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x09E4         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n26.xml</pre>
   * Test URI: <pre>ibm87n26.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0A03         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n26xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n26.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0A03         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0A03         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n27.xml</pre>
   * Test URI: <pre>ibm87n27.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0A3D         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n27xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n27.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0A3D         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0A3D         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n28.xml</pre>
   * Test URI: <pre>ibm87n28.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0A46         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n28xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n28.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0A46         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0A46         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n29.xml</pre>
   * Test URI: <pre>ibm87n29.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0A49         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n29xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n29.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0A49         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0A49         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n30.xml</pre>
   * Test URI: <pre>ibm87n30.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0A4E         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n30xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n30.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0A4E         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0A4E         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n31.xml</pre>
   * Test URI: <pre>ibm87n31.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0A80         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n31xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n31.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0A80         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0A80         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n32.xml</pre>
   * Test URI: <pre>ibm87n32.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0A84         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n32xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n32.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0A84         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0A84         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n33.xml</pre>
   * Test URI: <pre>ibm87n33.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0ABB         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n33xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n33.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0ABB         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0ABB         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n34.xml</pre>
   * Test URI: <pre>ibm87n34.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0AC6         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n34xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n34.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0AC6         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0AC6         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n35.xml</pre>
   * Test URI: <pre>ibm87n35.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0ACA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n35xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n35.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0ACA         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0ACA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n36.xml</pre>
   * Test URI: <pre>ibm87n36.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0ACE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n36xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n36.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0ACE         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0ACE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n37.xml</pre>
   * Test URI: <pre>ibm87n37.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0B04         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n37xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n37.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0B04         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0B04         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n38.xml</pre>
   * Test URI: <pre>ibm87n38.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0B3B         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n38xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n38.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0B3B         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0B3B         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n39.xml</pre>
   * Test URI: <pre>ibm87n39.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0B44         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n39xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n39.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0B44         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0B44         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n40.xml</pre>
   * Test URI: <pre>ibm87n40.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0B4A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n40xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n40.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0B4A         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0B4A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n41.xml</pre>
   * Test URI: <pre>ibm87n41.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0B4E         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n41xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n41.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0B4E         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0B4E         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n42.xml</pre>
   * Test URI: <pre>ibm87n42.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0B58         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n42xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n42.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0B58         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0B58         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n43.xml</pre>
   * Test URI: <pre>ibm87n43.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0B84         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n43xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n43.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0B84         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0B84         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n44.xml</pre>
   * Test URI: <pre>ibm87n44.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0BC3         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n44xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n44.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0BC3         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0BC3         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n45.xml</pre>
   * Test URI: <pre>ibm87n45.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0BC9         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n45xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n45.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0BC9         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0BC9         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n46.xml</pre>
   * Test URI: <pre>ibm87n46.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0BD6         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n46xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n46.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0BD6         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0BD6         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n47.xml</pre>
   * Test URI: <pre>ibm87n47.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0C0D         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n47xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n47.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0C0D         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0C0D         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n48.xml</pre>
   * Test URI: <pre>ibm87n48.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0C45         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n48xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n48.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0C45         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0C45         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n49.xml</pre>
   * Test URI: <pre>ibm87n49.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0C49         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n49xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n49.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0C49         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0C49         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n50.xml</pre>
   * Test URI: <pre>ibm87n50.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0C54         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n50xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n50.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0C54         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0C54         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n51.xml</pre>
   * Test URI: <pre>ibm87n51.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0C81         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n51xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n51.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0C81         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0C81         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n52.xml</pre>
   * Test URI: <pre>ibm87n52.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0C84         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n52xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n52.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0C84         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0C84         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n53.xml</pre>
   * Test URI: <pre>ibm87n53.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0CC5         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n53xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n53.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0CC5         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0CC5         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n54.xml</pre>
   * Test URI: <pre>ibm87n54.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0CC9         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n54xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n54.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0CC9         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0CC9         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n55.xml</pre>
   * Test URI: <pre>ibm87n55.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0CD4         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n55xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n55.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0CD4         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0CD4         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n56.xml</pre>
   * Test URI: <pre>ibm87n56.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0CD7         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n56xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n56.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0CD7         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0CD7         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n57.xml</pre>
   * Test URI: <pre>ibm87n57.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0D04         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n57xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n57.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0D04         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0D04         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n58.xml</pre>
   * Test URI: <pre>ibm87n58.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0D45         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n58xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n58.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0D45         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0D45         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n59.xml</pre>
   * Test URI: <pre>ibm87n59.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0D49         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n59xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n59.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0D49         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0D49         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n60.xml</pre>
   * Test URI: <pre>ibm87n60.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0D4E         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n60xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n60.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0D4E         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0D4E         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n61.xml</pre>
   * Test URI: <pre>ibm87n61.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0D58         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n61xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n61.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0D58         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0D58         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n62.xml</pre>
   * Test URI: <pre>ibm87n62.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0E3F         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n62xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n62.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0E3F         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0E3F         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n63.xml</pre>
   * Test URI: <pre>ibm87n63.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0E3B         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n63xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n63.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0E3B         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0E3B         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n64.xml</pre>
   * Test URI: <pre>ibm87n64.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0E4F         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n64xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n64.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0E4F         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0E4F         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n66.xml</pre>
   * Test URI: <pre>ibm87n66.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0EBA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n66xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n66.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0EBA         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0EBA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n67.xml</pre>
   * Test URI: <pre>ibm87n67.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0EBE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n67xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n67.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0EBE         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0EBE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n68.xml</pre>
   * Test URI: <pre>ibm87n68.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0ECE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n68xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n68.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0ECE         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0ECE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n69.xml</pre>
   * Test URI: <pre>ibm87n69.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0F1A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n69xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n69.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0F1A         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0F1A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n70.xml</pre>
   * Test URI: <pre>ibm87n70.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0F36         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n70xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n70.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0F36         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0F36         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n71.xml</pre>
   * Test URI: <pre>ibm87n71.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0F38         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n71xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n71.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0F38         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0F38         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n72.xml</pre>
   * Test URI: <pre>ibm87n72.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0F3B         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n72xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n72.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0F3B         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0F3B         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n73.xml</pre>
   * Test URI: <pre>ibm87n73.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0F3A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n73xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n73.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0F3A         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0F3A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n74.xml</pre>
   * Test URI: <pre>ibm87n74.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0F70         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n74xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n74.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0F70         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0F70         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n75.xml</pre>
   * Test URI: <pre>ibm87n75.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0F85         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n75xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n75.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0F85         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0F85         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n76.xml</pre>
   * Test URI: <pre>ibm87n76.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0F8C         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n76xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n76.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0F8C         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0F8C         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n77.xml</pre>
   * Test URI: <pre>ibm87n77.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0F96         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n77xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n77.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0F96         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0F96         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n78.xml</pre>
   * Test URI: <pre>ibm87n78.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0F98         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n78xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n78.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0F98         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0F98         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n79.xml</pre>
   * Test URI: <pre>ibm87n79.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0FB0         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n79xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n79.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0FB0         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0FB0         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n80.xml</pre>
   * Test URI: <pre>ibm87n80.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0FB8         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n80xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n80.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0FB8         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0FB8         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n81.xml</pre>
   * Test URI: <pre>ibm87n81.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x0FBA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n81xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n81.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x0FBA         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x0FBA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n82.xml</pre>
   * Test URI: <pre>ibm87n82.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x20DD         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n82xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n82.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x20DD         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x20DD         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n83.xml</pre>
   * Test URI: <pre>ibm87n83.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x20E2         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n83xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n83.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x20E2         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x20E2         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n84.xml</pre>
   * Test URI: <pre>ibm87n84.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x3030         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n84xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n84.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x3030         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x3030         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P87-ibm87n85.xml</pre>
   * Test URI: <pre>ibm87n85.xml</pre>
   * Comment: <pre>Tests CombiningChar with an only legal per 5th edition character. The character #x309B         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P87_ibm87n85xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm87n85.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests CombiningChar with an only legal per 5th edition character. The character #x309B         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests CombiningChar with an only legal per 5th edition character. The character #x309B         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n03.xml</pre>
   * Test URI: <pre>ibm88n03.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x066A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x066A         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x066A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n04.xml</pre>
   * Test URI: <pre>ibm88n04.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x06FA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x06FA         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x06FA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n05.xml</pre>
   * Test URI: <pre>ibm88n05.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x0970         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x0970         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x0970         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n06.xml</pre>
   * Test URI: <pre>ibm88n06.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x09F2         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x09F2         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x09F2         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n08.xml</pre>
   * Test URI: <pre>ibm88n08.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x0AF0         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x0AF0         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x0AF0         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n09.xml</pre>
   * Test URI: <pre>ibm88n09.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x0B70         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x0B70         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x0B70         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n10.xml</pre>
   * Test URI: <pre>ibm88n10.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x0C65         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x0C65         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x0C65         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n11.xml</pre>
   * Test URI: <pre>ibm88n11.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x0CE5         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x0CE5         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x0CE5         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n12.xml</pre>
   * Test URI: <pre>ibm88n12.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x0CF0         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x0CF0         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x0CF0         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n13.xml</pre>
   * Test URI: <pre>ibm88n13.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x0D70         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x0D70         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x0D70         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n14.xml</pre>
   * Test URI: <pre>ibm88n14.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x0E5A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x0E5A         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x0E5A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n15.xml</pre>
   * Test URI: <pre>ibm88n15.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x0EDA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x0EDA         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x0EDA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P88-ibm88n16.xml</pre>
   * Test URI: <pre>ibm88n16.xml</pre>
   * Comment: <pre>Tests Digit with an only legal per 5th edition character. The character #x0F2A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P88_ibm88n16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm88n16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Digit with an only legal per 5th edition character. The character #x0F2A         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Digit with an only legal per 5th edition character. The character #x0F2A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P89-ibm89n03.xml</pre>
   * Test URI: <pre>ibm89n03.xml</pre>
   * Comment: <pre>Tests Extender with an only legal per 5th edition character. The character #x02D2         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P89_ibm89n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm89n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Extender with an only legal per 5th edition character. The character #x02D2         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Extender with an only legal per 5th edition character. The character #x02D2         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P89-ibm89n04.xml</pre>
   * Test URI: <pre>ibm89n04.xml</pre>
   * Comment: <pre>Tests Extender with an only legal per 5th edition character. The character #x03FE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P89_ibm89n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm89n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Extender with an only legal per 5th edition character. The character #x03FE         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Extender with an only legal per 5th edition character. The character #x03FE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-valid-P89-ibm89n05.xml</pre>
   * Test URI: <pre>ibm89n05.xml</pre>
   * Comment: <pre>Tests Extender with an only legal per 5th edition character. The character #x065F         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P89_ibm89n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm89n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests Extender with an only legal per 5th edition character. The character #x065F         occurs as the second character in the PITarget in the PI in the DTD.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests Extender with an only legal per 5th edition character. The character #x065F         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-invalid-P89-ibm89n06.xml</pre>
   * Test URI: <pre>ibm89n06.xml</pre>
   * Comment: <pre>Tests Extender with an only legal per 5th edition character. The character #x0EC7         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_invalid_P89_ibm89n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm89n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Extender with an only legal per 5th edition character. The character #x0EC7         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-invalid-P89-ibm89n07.xml</pre>
   * Test URI: <pre>ibm89n07.xml</pre>
   * Comment: <pre>Tests Extender with an only legal per 5th edition character. The character #x3006         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_invalid_P89_ibm89n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm89n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Extender with an only legal per 5th edition character. The character #x3006         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-invalid-P89-ibm89n08.xml</pre>
   * Test URI: <pre>ibm89n08.xml</pre>
   * Comment: <pre>Tests Extender with an only legal per 5th edition character. The character #x3030         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_invalid_P89_ibm89n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm89n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Extender with an only legal per 5th edition character. The character #x3030         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-invalid-P89-ibm89n09.xml</pre>
   * Test URI: <pre>ibm89n09.xml</pre>
   * Comment: <pre>Tests Extender with an only legal per 5th edition character. The character #x3036         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_invalid_P89_ibm89n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm89n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Extender with an only legal per 5th edition character. The character #x3036         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-invalid-P89-ibm89n10.xml</pre>
   * Test URI: <pre>ibm89n10.xml</pre>
   * Comment: <pre>Tests Extender with an only legal per 5th edition character. The character #x309C         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_invalid_P89_ibm89n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm89n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Extender with an only legal per 5th edition character. The character #x309C         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-invalid-P89-ibm89n11.xml</pre>
   * Test URI: <pre>ibm89n11.xml</pre>
   * Comment: <pre>Tests Extender with an only legal per 5th edition character. The character #x309F         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_invalid_P89_ibm89n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm89n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Extender with an only legal per 5th edition character. The character #x309F         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-invalid-P89-ibm89n12.xml</pre>
   * Test URI: <pre>ibm89n12.xml</pre>
   * Comment: <pre>Tests Extender with an only legal per 5th edition character. The character #x30FF         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.</pre>
   * Sections: <pre>B.</pre>
   * Version: <pre>1.0</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_invalid_P89_ibm89n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "ibm89n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Extender with an only legal per 5th edition character. The character #x30FF         occurs as the second character in the PITarget in the PI in the prolog, and in an element name.");
    }
  }
        
    
    
}
    