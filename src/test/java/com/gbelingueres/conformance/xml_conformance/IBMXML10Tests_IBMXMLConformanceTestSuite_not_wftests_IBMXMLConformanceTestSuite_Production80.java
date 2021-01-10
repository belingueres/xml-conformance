
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production80 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P80-ibm80n01.xml</pre>
   * Test URI: <pre>not-wf/P80/ibm80n01.xml</pre>
   * Comment: <pre>Tests EncodingDecl with a required field missing. The leading white      space is missing in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P80_ibm80n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P80/ibm80n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncodingDecl with a required field missing. The leading white      space is missing in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P80-ibm80n02.xml</pre>
   * Test URI: <pre>not-wf/P80/ibm80n02.xml</pre>
   * Comment: <pre>Tests EncodingDecl with a required field missing. The "=" sign is      missing in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P80_ibm80n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P80/ibm80n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncodingDecl with a required field missing. The \"=\" sign is      missing in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P80-ibm80n03.xml</pre>
   * Test URI: <pre>not-wf/P80/ibm80n03.xml</pre>
   * Comment: <pre>Tests EncodingDecl with a required field missing. The double quoted      EncName are missing in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P80_ibm80n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P80/ibm80n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncodingDecl with a required field missing. The double quoted      EncName are missing in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P80-ibm80n04.xml</pre>
   * Test URI: <pre>not-wf/P80/ibm80n04.xml</pre>
   * Comment: <pre>Tests EncodingDecl with wrong field ordering. The string "encoding="    occurs after the double quoted EncName in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P80_ibm80n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P80/ibm80n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncodingDecl with wrong field ordering. The string \"encoding=\"    occurs after the double quoted EncName in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P80-ibm80n05.xml</pre>
   * Test URI: <pre>not-wf/P80/ibm80n05.xml</pre>
   * Comment: <pre>Tests EncodingDecl with wrong field ordering. The "encoding" occurs     after the double quoted EncName in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P80_ibm80n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P80/ibm80n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncodingDecl with wrong field ordering. The \"encoding\" occurs     after the double quoted EncName in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P80-ibm80n06.xml</pre>
   * Test URI: <pre>not-wf/P80/ibm80n06.xml</pre>
   * Comment: <pre>Tests EncodingDecl with wrong key word. The string "Encoding" is      used as the key word in the EncodingDecl in the XMLDecl.</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P80_ibm80n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P80/ibm80n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests EncodingDecl with wrong key word. The string \"Encoding\" is      used as the key word in the EncodingDecl in the XMLDecl.");
    }
  }
        
    
    
}
    