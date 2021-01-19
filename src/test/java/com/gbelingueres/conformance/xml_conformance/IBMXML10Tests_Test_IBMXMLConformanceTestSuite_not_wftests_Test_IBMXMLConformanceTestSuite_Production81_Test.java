
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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 81</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production81_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P81-ibm81n01.xml</pre>
   * Test URI: <pre>not-wf/P81/ibm81n01.xml</pre>
   * Comment: <pre>Tests EncName with an illegal character. The "_" is used as the      first character in the EncName in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P81_ibm81n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P81/ibm81n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncName with an illegal character. The \"_\" is used as the      first character in the EncName in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P81-ibm81n02.xml</pre>
   * Test URI: <pre>not-wf/P81/ibm81n02.xml</pre>
   * Comment: <pre>Tests EncName with an illegal character. The "-" is used as the      first character in the EncName in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P81_ibm81n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P81/ibm81n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncName with an illegal character. The \"-\" is used as the      first character in the EncName in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P81-ibm81n03.xml</pre>
   * Test URI: <pre>not-wf/P81/ibm81n03.xml</pre>
   * Comment: <pre>Tests EncName with an illegal character. The "." is used as the      first character in the EncName in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P81_ibm81n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P81/ibm81n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncName with an illegal character. The \".\" is used as the      first character in the EncName in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P81-ibm81n04.xml</pre>
   * Test URI: <pre>not-wf/P81/ibm81n04.xml</pre>
   * Comment: <pre>Tests EncName with illegal characters. The "8-" is used as the      initial characters in the EncName in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P81_ibm81n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P81/ibm81n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncName with illegal characters. The \"8-\" is used as the      initial characters in the EncName in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P81-ibm81n05.xml</pre>
   * Test URI: <pre>not-wf/P81/ibm81n05.xml</pre>
   * Comment: <pre>Tests EncName with an illegal character. The "~" is used as one      character in the EncName in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P81_ibm81n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P81/ibm81n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncName with an illegal character. The \"~\" is used as one      character in the EncName in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P81-ibm81n06.xml</pre>
   * Test URI: <pre>not-wf/P81/ibm81n06.xml</pre>
   * Comment: <pre>Tests EncName with an illegal character. The "#" is used as one      character in the EncName in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P81_ibm81n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P81/ibm81n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncName with an illegal character. The \"#\" is used as one      character in the EncName in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P81-ibm81n07.xml</pre>
   * Test URI: <pre>not-wf/P81/ibm81n07.xml</pre>
   * Comment: <pre>Tests EncName with an illegal character. The ":" is used as one      character in the EncName in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P81_ibm81n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P81/ibm81n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncName with an illegal character. The \":\" is used as one      character in the EncName in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P81-ibm81n08.xml</pre>
   * Test URI: <pre>not-wf/P81/ibm81n08.xml</pre>
   * Comment: <pre>Tests EncName with an illegal character. The "/" is used as one      character in the EncName in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P81_ibm81n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P81/ibm81n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncName with an illegal character. The \"/\" is used as one      character in the EncName in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P81-ibm81n09.xml</pre>
   * Test URI: <pre>not-wf/P81/ibm81n09.xml</pre>
   * Comment: <pre>Tests EncName with an illegal character. The ";" is used as one      character in the EncName in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P81_ibm81n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P81/ibm81n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncName with an illegal character. The \";\" is used as one      character in the EncName in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
    
}
    