
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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 63</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production63_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P63-ibm63n01.xml</pre>
   * Test URI: <pre>not-wf/P63/ibm63n01.xml</pre>
   * Comment: <pre>Tests ignoreSect with wrong key word. The string "ignore" is used     as a key word in the beginning sequence in the ignoreSect in the file      ibm63n01.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P63_ibm63n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P63/ibm63n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ignoreSect with wrong key word. The string \"ignore\" is used     as a key word in the beginning sequence in the ignoreSect in the file      ibm63n01.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P63-ibm63n02.xml</pre>
   * Test URI: <pre>not-wf/P63/ibm63n02.xml</pre>
   * Comment: <pre>Tests ignoreSect with wrong beginning sequence. An extra "[" occurs     in the beginning sequence in the ignoreSect in the file ibm63n02.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P63_ibm63n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P63/ibm63n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ignoreSect with wrong beginning sequence. An extra \"[\" occurs     in the beginning sequence in the ignoreSect in the file ibm63n02.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P63-ibm63n03.xml</pre>
   * Test URI: <pre>not-wf/P63/ibm63n03.xml</pre>
   * Comment: <pre>Tests ignoreSect with wrong beginning sequence. A wrong character "?"     occurs in the beginning sequence in the ignoreSect in the file ibm63n03.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P63_ibm63n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P63/ibm63n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ignoreSect with wrong beginning sequence. A wrong character \"?\"     occurs in the beginning sequence in the ignoreSect in the file ibm63n03.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P63-ibm63n04.xml</pre>
   * Test URI: <pre>not-wf/P63/ibm63n04.xml</pre>
   * Comment: <pre>Tests ignoreSect with a required field missing. The key word      "IGNORE" is missing in the ignoreSect in the file ibm63n04.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P63_ibm63n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P63/ibm63n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ignoreSect with a required field missing. The key word      \"IGNORE\" is missing in the ignoreSect in the file ibm63n04.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P63-ibm63n05.xml</pre>
   * Test URI: <pre>not-wf/P63/ibm63n05.xml</pre>
   * Comment: <pre>Tests ignoreSect with a required field missing. The "[" is missing      after the key word "IGNORE" in the ignoreSect in the file ibm63n05.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P63_ibm63n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P63/ibm63n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ignoreSect with a required field missing. The \"[\" is missing      after the key word \"IGNORE\" in the ignoreSect in the file ibm63n05.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P63-ibm63n06.xml</pre>
   * Test URI: <pre>not-wf/P63/ibm63n06.xml</pre>
   * Comment: <pre>Tests includeSect with wrong field ordering. The two external subset     declarations occur before the key word "IGNORE" in the ignoreSect in the      file ibm63n06.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P63_ibm63n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P63/ibm63n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests includeSect with wrong field ordering. The two external subset     declarations occur before the key word \"IGNORE\" in the ignoreSect in the      file ibm63n06.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P63-ibm63n07.xml</pre>
   * Test URI: <pre>not-wf/P63/ibm63n07.xml</pre>
   * Comment: <pre>Tests ignoreSect with a required field missing. The closing sequence     "]](greater than)" is missing in the ignoreSect in the file ibm63n07.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P63_ibm63n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P63/ibm63n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ignoreSect with a required field missing. The closing sequence     \"]](greater than)\" is missing in the ignoreSect in the file ibm63n07.dtd.");
    }
  }
        
    
    
}
    