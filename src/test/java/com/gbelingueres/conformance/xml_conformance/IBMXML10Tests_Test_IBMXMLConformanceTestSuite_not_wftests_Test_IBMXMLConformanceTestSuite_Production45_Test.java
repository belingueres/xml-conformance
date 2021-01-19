
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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 45</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production45_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P45-ibm45n01.xml</pre>
   * Test URI: <pre>not-wf/P45/ibm45n01.xml</pre>
   * Comment: <pre>Tests elementdecl with a required field missing. The Name is  missing      in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P45_ibm45n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P45/ibm45n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests elementdecl with a required field missing. The Name is  missing      in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P45-ibm45n02.xml</pre>
   * Test URI: <pre>not-wf/P45/ibm45n02.xml</pre>
   * Comment: <pre>Tests elementdecl with a required field missing. The white space is      missing between "aEle" and "(#PCDATA)" in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P45_ibm45n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P45/ibm45n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests elementdecl with a required field missing. The white space is      missing between \"aEle\" and \"(#PCDATA)\" in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P45-ibm45n03.xml</pre>
   * Test URI: <pre>not-wf/P45/ibm45n03.xml</pre>
   * Comment: <pre>Tests elementdecl with a required field missing. The contentspec is      missing in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P45_ibm45n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P45/ibm45n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests elementdecl with a required field missing. The contentspec is      missing in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P45-ibm45n04.xml</pre>
   * Test URI: <pre>not-wf/P45/ibm45n04.xml</pre>
   * Comment: <pre>Tests elementdecl with a required field missing. The contentspec and      the white space is missing in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P45_ibm45n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P45/ibm45n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests elementdecl with a required field missing. The contentspec and      the white space is missing in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P45-ibm45n05.xml</pre>
   * Test URI: <pre>not-wf/P45/ibm45n05.xml</pre>
   * Comment: <pre>Tests elementdecl with a required field missing. The Name, the white     space, and the contentspec are missing in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P45_ibm45n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P45/ibm45n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests elementdecl with a required field missing. The Name, the white     space, and the contentspec are missing in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P45-ibm45n06.xml</pre>
   * Test URI: <pre>not-wf/P45/ibm45n06.xml</pre>
   * Comment: <pre>Tests elementdecl with wrong field ordering. The Name occurs after the     contentspec in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P45_ibm45n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P45/ibm45n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests elementdecl with wrong field ordering. The Name occurs after the     contentspec in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P45-ibm45n07.xml</pre>
   * Test URI: <pre>not-wf/P45/ibm45n07.xml</pre>
   * Comment: <pre>Tests elementdecl with wrong beginning sequence. The string      "(less than)ELEMENT" is used as the beginning sequence in the second      elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P45_ibm45n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P45/ibm45n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests elementdecl with wrong beginning sequence. The string      \"(less than)ELEMENT\" is used as the beginning sequence in the second      elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P45-ibm45n08.xml</pre>
   * Test URI: <pre>not-wf/P45/ibm45n08.xml</pre>
   * Comment: <pre>Tests elementdecl with wrong key word. The string "Element" is used as     the key word in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P45_ibm45n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P45/ibm45n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests elementdecl with wrong key word. The string \"Element\" is used as     the key word in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P45-ibm45n09.xml</pre>
   * Test URI: <pre>not-wf/P45/ibm45n09.xml</pre>
   * Comment: <pre>Tests elementdecl with wrong key word. The string "element" is used as     the key word in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P45_ibm45n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P45/ibm45n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests elementdecl with wrong key word. The string \"element\" is used as     the key word in the second elementdecl in the DTD.");
    }
  }
        
    
    
}
    