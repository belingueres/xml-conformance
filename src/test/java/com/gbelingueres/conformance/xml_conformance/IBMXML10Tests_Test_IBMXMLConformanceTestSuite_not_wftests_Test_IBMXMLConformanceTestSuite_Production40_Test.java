
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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 40</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production40_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P40-ibm40n01.xml</pre>
   * Test URI: <pre>not-wf/P40/ibm40n01.xml</pre>
   * Comment: <pre>Tests STag with a required field missing. The Name "root" is      in the STag of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P40_ibm40n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P40/ibm40n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests STag with a required field missing. The Name \"root\" is      in the STag of the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P40-ibm40n02.xml</pre>
   * Test URI: <pre>not-wf/P40/ibm40n02.xml</pre>
   * Comment: <pre>Tests STag with a required field missing. The white space between      the Name "root" and the attribute "attr1" is missing in the STag of the     element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P40_ibm40n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P40/ibm40n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests STag with a required field missing. The white space between      the Name \"root\" and the attribute \"attr1\" is missing in the STag of the     element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P40-ibm40n03.xml</pre>
   * Test URI: <pre>not-wf/P40/ibm40n03.xml</pre>
   * Comment: <pre>Tests STag with wrong field ordering. The Name "root" occurs after      the attribute "attr1" in the STag of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P40_ibm40n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P40/ibm40n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests STag with wrong field ordering. The Name \"root\" occurs after      the attribute \"attr1\" in the STag of the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P40-ibm40n04.xml</pre>
   * Test URI: <pre>not-wf/P40/ibm40n04.xml</pre>
   * Comment: <pre>Tests STag with a wrong opening sequence. The string "(less than)!" is used      as the opening sequence for the STag of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P40_ibm40n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P40/ibm40n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests STag with a wrong opening sequence. The string \"(less than)!\" is used      as the opening sequence for the STag of the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P40-ibm40n05.xml</pre>
   * Test URI: <pre>not-wf/P40/ibm40n05.xml</pre>
   * Comment: <pre>Tests STag with duplicate attribute names. The attribute name      "attr1" occurs twice in  the STag of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P40_ibm40n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P40/ibm40n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests STag with duplicate attribute names. The attribute name      \"attr1\" occurs twice in  the STag of the element \"root\".");
    }
  }
        
    
    
}
    