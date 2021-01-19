
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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 16</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production16_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P16-ibm16n01.xml</pre>
   * Test URI: <pre>not-wf/P16/ibm16n01.xml</pre>
   * Comment: <pre>Tests PI. The content of the PI includes the sequence      "?(greater than)?".</pre>
   * Sections: <pre>2.6</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P16_ibm16n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P16/ibm16n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PI. The content of the PI includes the sequence      \"?(greater than)?\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P16-ibm16n02.xml</pre>
   * Test URI: <pre>not-wf/P16/ibm16n02.xml</pre>
   * Comment: <pre>Tests PI. The PITarget is missing in the PI.</pre>
   * Sections: <pre>2.6</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P16_ibm16n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P16/ibm16n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PI. The PITarget is missing in the PI.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P16-ibm16n03.xml</pre>
   * Test URI: <pre>not-wf/P16/ibm16n03.xml</pre>
   * Comment: <pre>Tests PI. The PI has a wrong closing sequence "&#38;#62;".</pre>
   * Sections: <pre>2.6</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P16_ibm16n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P16/ibm16n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PI. The PI has a wrong closing sequence \">\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P16-ibm16n04.xml</pre>
   * Test URI: <pre>not-wf/P16/ibm16n04.xml</pre>
   * Comment: <pre>Tests PI. The closing sequence is missing in the PI.</pre>
   * Sections: <pre>2.6</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P16_ibm16n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P16/ibm16n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PI. The closing sequence is missing in the PI.");
    }
  }
        
    
    
}
    