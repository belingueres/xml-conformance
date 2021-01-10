
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production47 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P47-ibm47n01.xml</pre>
   * Test URI: <pre>not-wf/P47/ibm47n01.xml</pre>
   * Comment: <pre>Tests children with a required field missing. The "+" is used as the     choice or seq field in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P47_ibm47n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P47/ibm47n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests children with a required field missing. The \"+\" is used as the     choice or seq field in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P47-ibm47n02.xml</pre>
   * Test URI: <pre>not-wf/P47/ibm47n02.xml</pre>
   * Comment: <pre>Tests children with a required field missing. The "*" is used as the     choice or seq field in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P47_ibm47n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P47/ibm47n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests children with a required field missing. The \"*\" is used as the     choice or seq field in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P47-ibm47n03.xml</pre>
   * Test URI: <pre>not-wf/P47/ibm47n03.xml</pre>
   * Comment: <pre>Tests children with a required field missing. The "?" is used as the     choice or seq field in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P47_ibm47n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P47/ibm47n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests children with a required field missing. The \"?\" is used as the     choice or seq field in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P47-ibm47n04.xml</pre>
   * Test URI: <pre>not-wf/P47/ibm47n04.xml</pre>
   * Comment: <pre>Tests children with wrong field ordering. The "*" occurs before the      seq field (a,a) in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P47_ibm47n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P47/ibm47n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests children with wrong field ordering. The \"*\" occurs before the      seq field (a,a) in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P47-ibm47n05.xml</pre>
   * Test URI: <pre>not-wf/P47/ibm47n05.xml</pre>
   * Comment: <pre>Tests children with wrong field ordering. The "+" occurs before the      choice field (a|a) in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P47_ibm47n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P47/ibm47n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests children with wrong field ordering. The \"+\" occurs before the      choice field (a|a) in the second elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P47-ibm47n06.xml</pre>
   * Test URI: <pre>not-wf/P47/ibm47n06.xml</pre>
   * Comment: <pre>Tests children with wrong key word. The "^" occurs after the seq field     in the second elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P47_ibm47n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P47/ibm47n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests children with wrong key word. The \"^\" occurs after the seq field     in the second elementdecl in the DTD.");
    }
  }
        
    
    
}
    