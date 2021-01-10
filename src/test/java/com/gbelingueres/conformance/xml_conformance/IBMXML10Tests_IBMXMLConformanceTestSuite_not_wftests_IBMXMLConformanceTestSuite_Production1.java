
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production1 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P01-ibm01n01.xml</pre>
   * Test URI: <pre>not-wf/P01/ibm01n01.xml</pre>
   * Comment: <pre>Tests a document with no element. A well-formed document should have at lease     one elements.</pre>
   * Sections: <pre>2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P01_ibm01n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P01/ibm01n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests a document with no element. A well-formed document should have at lease     one elements.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P01-ibm01n02.xml</pre>
   * Test URI: <pre>not-wf/P01/ibm01n02.xml</pre>
   * Comment: <pre>Tests a document with wrong ordering of its prolog and element. The      element occurs before the xml declaration and the DTD.</pre>
   * Sections: <pre>2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P01_ibm01n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P01/ibm01n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests a document with wrong ordering of its prolog and element. The      element occurs before the xml declaration and the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P01-ibm01n03.xml</pre>
   * Test URI: <pre>not-wf/P01/ibm01n03.xml</pre>
   * Comment: <pre>Tests a document with wrong combination of misc and element. One PI occurs      between two elements.</pre>
   * Sections: <pre>2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P01_ibm01n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P01/ibm01n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests a document with wrong combination of misc and element. One PI occurs      between two elements.");
    }
  }
        
    
    
}
    