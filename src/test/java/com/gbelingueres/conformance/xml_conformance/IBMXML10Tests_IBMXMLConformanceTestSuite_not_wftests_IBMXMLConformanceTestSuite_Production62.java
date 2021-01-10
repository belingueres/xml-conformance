
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production62 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P62-ibm62n01.xml</pre>
   * Test URI: <pre>not-wf/P62/ibm62n01.xml</pre>
   * Comment: <pre>Tests includeSect with wrong key word. The string "include" is used     as a key word in the beginning sequence in the includeSect in the file      ibm62n01.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P62_ibm62n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P62/ibm62n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests includeSect with wrong key word. The string \"include\" is used     as a key word in the beginning sequence in the includeSect in the file      ibm62n01.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P62-ibm62n02.xml</pre>
   * Test URI: <pre>not-wf/P62/ibm62n02.xml</pre>
   * Comment: <pre>Tests includeSect with wrong beginning sequence. An extra "[" occurs     in the beginning sequence in the includeSect in the file ibm62n02.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P62_ibm62n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P62/ibm62n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests includeSect with wrong beginning sequence. An extra \"[\" occurs     in the beginning sequence in the includeSect in the file ibm62n02.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P62-ibm62n03.xml</pre>
   * Test URI: <pre>not-wf/P62/ibm62n03.xml</pre>
   * Comment: <pre>Tests includeSect with wrong beginning sequence. A wrong character "?"     occurs in the beginning sequence in the includeSect in the file ibm62n03.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P62_ibm62n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P62/ibm62n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests includeSect with wrong beginning sequence. A wrong character \"?\"     occurs in the beginning sequence in the includeSect in the file ibm62n03.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P62-ibm62n04.xml</pre>
   * Test URI: <pre>not-wf/P62/ibm62n04.xml</pre>
   * Comment: <pre>Tests includeSect with a required field missing. The key word      "INCLUDE" is missing in the includeSect in the file ibm62n04.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P62_ibm62n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P62/ibm62n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests includeSect with a required field missing. The key word      \"INCLUDE\" is missing in the includeSect in the file ibm62n04.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P62-ibm62n05.xml</pre>
   * Test URI: <pre>not-wf/P62/ibm62n05.xml</pre>
   * Comment: <pre>Tests includeSect with a required field missing. The "[" is missing      after the key word "INCLUDE" in the includeSect in the file ibm62n05.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P62_ibm62n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P62/ibm62n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests includeSect with a required field missing. The \"[\" is missing      after the key word \"INCLUDE\" in the includeSect in the file ibm62n05.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P62-ibm62n06.xml</pre>
   * Test URI: <pre>not-wf/P62/ibm62n06.xml</pre>
   * Comment: <pre>Tests includeSect with wrong field ordering. The two external subset     declarations occur before the key word "INCLUDE" in the includeSect in the      file ibm62n06.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P62_ibm62n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P62/ibm62n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests includeSect with wrong field ordering. The two external subset     declarations occur before the key word \"INCLUDE\" in the includeSect in the      file ibm62n06.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P62-ibm62n07.xml</pre>
   * Test URI: <pre>not-wf/P62/ibm62n07.xml</pre>
   * Comment: <pre>Tests includeSect with a required field missing. The closing sequence     "]](greater than)" is missing in the includeSect in the file ibm62n07.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P62_ibm62n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P62/ibm62n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests includeSect with a required field missing. The closing sequence     \"]](greater than)\" is missing in the includeSect in the file ibm62n07.dtd.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P62-ibm62n08.xml</pre>
   * Test URI: <pre>not-wf/P62/ibm62n08.xml</pre>
   * Comment: <pre>Tests includeSect with a required field missing. One "]" is missing      in the closing sequence in the includeSect in the file ibm62n08.dtd.</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P62_ibm62n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P62/ibm62n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests includeSect with a required field missing. One \"]\" is missing      in the closing sequence in the includeSect in the file ibm62n08.dtd.");
    }
  }
        
    
    
}
    