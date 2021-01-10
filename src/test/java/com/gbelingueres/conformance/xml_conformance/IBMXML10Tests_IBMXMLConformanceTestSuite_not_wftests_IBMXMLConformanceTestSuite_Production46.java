
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production46 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P46-ibm46n01.xml</pre>
   * Test URI: <pre>not-wf/P46/ibm46n01.xml</pre>
   * Comment: <pre>Tests contentspec with wrong key word. the string "empty" is used as      the key word in the contentspec of the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P46_ibm46n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P46/ibm46n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests contentspec with wrong key word. the string \"empty\" is used as      the key word in the contentspec of the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P46-ibm46n02.xml</pre>
   * Test URI: <pre>not-wf/P46/ibm46n02.xml</pre>
   * Comment: <pre>Tests contentspec with wrong key word. the string "Empty" is used as      the key word in the contentspec of the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P46_ibm46n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P46/ibm46n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests contentspec with wrong key word. the string \"Empty\" is used as      the key word in the contentspec of the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P46-ibm46n03.xml</pre>
   * Test URI: <pre>not-wf/P46/ibm46n03.xml</pre>
   * Comment: <pre>Tests contentspec with wrong key word. the string "Any" is used as      the key word in the contentspec of the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P46_ibm46n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P46/ibm46n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests contentspec with wrong key word. the string \"Any\" is used as      the key word in the contentspec of the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P46-ibm46n04.xml</pre>
   * Test URI: <pre>not-wf/P46/ibm46n04.xml</pre>
   * Comment: <pre>Tests contentspec with wrong key word. the string "any" is used as      the key word in the contentspec of the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P46_ibm46n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P46/ibm46n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests contentspec with wrong key word. the string \"any\" is used as      the key word in the contentspec of the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P46-ibm46n05.xml</pre>
   * Test URI: <pre>not-wf/P46/ibm46n05.xml</pre>
   * Comment: <pre>Tests contentspec with a wrong option. The string "#CDATA" is used as     the contentspec in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P46_ibm46n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P46/ibm46n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests contentspec with a wrong option. The string \"#CDATA\" is used as     the contentspec in the second elementdecl in the DTD.");
    }
  }
        
    
    
}
    