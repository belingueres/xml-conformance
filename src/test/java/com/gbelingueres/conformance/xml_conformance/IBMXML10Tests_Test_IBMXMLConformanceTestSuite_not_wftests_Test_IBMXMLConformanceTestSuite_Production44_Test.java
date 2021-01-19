
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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 44</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production44_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P44-ibm44n01.xml</pre>
   * Test URI: <pre>not-wf/P44/ibm44n01.xml</pre>
   * Comment: <pre>Tests EmptyElemTag with a required field missing. The Name "root" is      missing in the EmptyElemTag.</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P44_ibm44n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P44/ibm44n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EmptyElemTag with a required field missing. The Name \"root\" is      missing in the EmptyElemTag.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P44-ibm44n02.xml</pre>
   * Test URI: <pre>not-wf/P44/ibm44n02.xml</pre>
   * Comment: <pre>Tests EmptyElemTag with wrong field ordering. The Attribute (attri1 =      "any") occurs before the name of the element "root" in the EmptyElemTag.</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P44_ibm44n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P44/ibm44n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EmptyElemTag with wrong field ordering. The Attribute (attri1 =      \"any\") occurs before the name of the element \"root\" in the EmptyElemTag.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P44-ibm44n03.xml</pre>
   * Test URI: <pre>not-wf/P44/ibm44n03.xml</pre>
   * Comment: <pre>Tests EmptyElemTag with wrong closing sequence. The string "\\&#38;#62;" is used     as the closing sequence in the EmptyElemtag of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P44_ibm44n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P44/ibm44n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EmptyElemTag with wrong closing sequence. The string \"\\>\" is used     as the closing sequence in the EmptyElemtag of the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P44-ibm44n04.xml</pre>
   * Test URI: <pre>not-wf/P44/ibm44n04.xml</pre>
   * Comment: <pre>Tests EmptyElemTag which against the WFC "Unique Att Spec". The      attribute name "attr1" occurs twice in the EmptyElemTag of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P44_ibm44n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P44/ibm44n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EmptyElemTag which against the WFC \"Unique Att Spec\". The      attribute name \"attr1\" occurs twice in the EmptyElemTag of the element \"root\".");
    }
  }
        
    
    
}
    