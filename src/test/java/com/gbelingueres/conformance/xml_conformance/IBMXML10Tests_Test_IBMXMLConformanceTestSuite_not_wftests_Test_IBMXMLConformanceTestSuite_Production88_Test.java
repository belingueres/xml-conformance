
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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 88</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production88_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n01.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n01.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x0029         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x0029         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n02.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n02.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x003B         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x003B         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n03.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n03.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x066A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x066A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n04.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n04.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x06FA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x06FA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n05.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n05.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x0970         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x0970         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n06.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n06.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x09F2         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x09F2         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n08.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n08.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x0AF0         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x0AF0         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n09.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n09.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x0B70         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x0B70         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n10.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n10.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x0C65         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x0C65         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n11.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n11.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x0CE5         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x0CE5         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n12.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n12.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x0CF0         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x0CF0         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n13.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n13.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x0D70         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x0D70         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n14.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n14.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x0E5A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x0E5A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n15.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n15.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x0EDA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x0EDA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P88-ibm88n16.xml</pre>
   * Test URI: <pre>not-wf/P88/ibm88n16.xml</pre>
   * Comment: <pre>Tests Digit with an illegal character. The character #x0F2A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P88_ibm88n16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P88/ibm88n16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Digit with an illegal character. The character #x0F2A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
    
}
    