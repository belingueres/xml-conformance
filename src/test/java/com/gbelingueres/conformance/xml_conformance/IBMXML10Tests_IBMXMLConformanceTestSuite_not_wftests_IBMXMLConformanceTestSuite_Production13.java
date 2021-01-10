
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production13 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P13-ibm13n01.xml</pre>
   * Test URI: <pre>not-wf/P13/ibm13n01.xml</pre>
   * Comment: <pre>Tests PubidChar. The pubidChar of the PubidLiteral for the entity      "info" contains the character "{".</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P13_ibm13n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P13/ibm13n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PubidChar. The pubidChar of the PubidLiteral for the entity      \"info\" contains the character \"{\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P13-ibm13n02.xml</pre>
   * Test URI: <pre>not-wf/P13/ibm13n02.xml</pre>
   * Comment: <pre>Tests PubidChar. The pubidChar of the PubidLiteral for the entity      "info" contains the character "~".</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P13_ibm13n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P13/ibm13n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PubidChar. The pubidChar of the PubidLiteral for the entity      \"info\" contains the character \"~\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P13-ibm13n03.xml</pre>
   * Test URI: <pre>not-wf/P13/ibm13n03.xml</pre>
   * Comment: <pre>Tests PubidChar. The pubidChar of the PubidLiteral for the entity      "info" contains the character double quote in the middle.</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P13_ibm13n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P13/ibm13n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PubidChar. The pubidChar of the PubidLiteral for the entity      \"info\" contains the character double quote in the middle.");
    }
  }
        
    
    
}
    