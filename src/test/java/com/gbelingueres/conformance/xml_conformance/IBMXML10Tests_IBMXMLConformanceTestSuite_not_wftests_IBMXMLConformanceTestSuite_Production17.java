
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production17 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P17-ibm17n01.xml</pre>
   * Test URI: <pre>not-wf/P17/ibm17n01.xml</pre>
   * Comment: <pre>Tests PITarget. The PITarget contains the string "XML".</pre>
   * Sections: <pre>2.6</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P17_ibm17n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P17/ibm17n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PITarget. The PITarget contains the string \"XML\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P17-ibm17n02.xml</pre>
   * Test URI: <pre>not-wf/P17/ibm17n02.xml</pre>
   * Comment: <pre>Tests PITarget. The PITarget contains the string "xML".</pre>
   * Sections: <pre>2.6</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P17_ibm17n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P17/ibm17n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PITarget. The PITarget contains the string \"xML\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P17-ibm17n03.xml</pre>
   * Test URI: <pre>not-wf/P17/ibm17n03.xml</pre>
   * Comment: <pre>Tests PITarget. The PITarget contains the string "xml".</pre>
   * Sections: <pre>2.6</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P17_ibm17n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P17/ibm17n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PITarget. The PITarget contains the string \"xml\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P17-ibm17n04.xml</pre>
   * Test URI: <pre>not-wf/P17/ibm17n04.xml</pre>
   * Comment: <pre>Tests PITarget. The PITarget contains the string "xmL".</pre>
   * Sections: <pre>2.6</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P17_ibm17n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P17/ibm17n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PITarget. The PITarget contains the string \"xmL\".");
    }
  }
        
    
    
}
    