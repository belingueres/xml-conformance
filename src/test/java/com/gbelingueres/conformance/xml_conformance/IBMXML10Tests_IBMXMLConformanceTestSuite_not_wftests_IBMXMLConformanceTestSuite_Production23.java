
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production23 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P23-ibm23n01.xml</pre>
   * Test URI: <pre>not-wf/P23/ibm23n01.xml</pre>
   * Comment: <pre>Tests XMLDecl with a required field missing. The Versioninfo is      missing in the XMLDecl.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P23_ibm23n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P23/ibm23n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests XMLDecl with a required field missing. The Versioninfo is      missing in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P23-ibm23n02.xml</pre>
   * Test URI: <pre>not-wf/P23/ibm23n02.xml</pre>
   * Comment: <pre>Tests XMLDecl with wrong field ordering. The VersionInfo     occurs after the EncodingDecl.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P23_ibm23n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P23/ibm23n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests XMLDecl with wrong field ordering. The VersionInfo     occurs after the EncodingDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P23-ibm23n03.xml</pre>
   * Test URI: <pre>not-wf/P23/ibm23n03.xml</pre>
   * Comment: <pre>Tests XMLDecl with wrong field ordering. The VersionInfo     occurs after the SDDecl and the SDDecl occurs after the VersionInfo.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P23_ibm23n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P23/ibm23n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests XMLDecl with wrong field ordering. The VersionInfo     occurs after the SDDecl and the SDDecl occurs after the VersionInfo.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P23-ibm23n04.xml</pre>
   * Test URI: <pre>not-wf/P23/ibm23n04.xml</pre>
   * Comment: <pre>Tests XMLDecl with wrong key word. An upper case string "XML" is      used as the key word in the XMLDecl.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P23_ibm23n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P23/ibm23n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests XMLDecl with wrong key word. An upper case string \"XML\" is      used as the key word in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P23-ibm23n05.xml</pre>
   * Test URI: <pre>not-wf/P23/ibm23n05.xml</pre>
   * Comment: <pre>Tests XMLDecl with a wrong closing sequence "&#38;#62;".</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P23_ibm23n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P23/ibm23n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests XMLDecl with a wrong closing sequence \">\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P23-ibm23n06.xml</pre>
   * Test URI: <pre>not-wf/P23/ibm23n06.xml</pre>
   * Comment: <pre>Tests XMLDecl with a wrong opening sequence "(less than)!".</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P23_ibm23n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P23/ibm23n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests XMLDecl with a wrong opening sequence \"(less than)!\".");
    }
  }
        
    
    
}
    