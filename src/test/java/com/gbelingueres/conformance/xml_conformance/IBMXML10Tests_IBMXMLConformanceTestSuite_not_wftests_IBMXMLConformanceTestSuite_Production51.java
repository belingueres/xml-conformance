
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production51 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P51-ibm51n01.xml</pre>
   * Test URI: <pre>not-wf/P51/ibm51n01.xml</pre>
   * Comment: <pre>Tests Mixed with a wrong key word. The string "#pcdata" is used as the     key word in the Mixed field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P51_ibm51n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P51/ibm51n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Mixed with a wrong key word. The string \"#pcdata\" is used as the     key word in the Mixed field in the fourth elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P51-ibm51n02.xml</pre>
   * Test URI: <pre>not-wf/P51/ibm51n02.xml</pre>
   * Comment: <pre>Tests Mixed with wrong field ordering. The field #PCDATA does not      occur as the first component in the Mixed field in the fourth elementdecl in      the DTD.</pre>
   * Sections: <pre>3.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P51_ibm51n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P51/ibm51n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Mixed with wrong field ordering. The field #PCDATA does not      occur as the first component in the Mixed field in the fourth elementdecl in      the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P51-ibm51n03.xml</pre>
   * Test URI: <pre>not-wf/P51/ibm51n03.xml</pre>
   * Comment: <pre>Tests Mixed with a separator missing. The separator "|" is missing in     between #PCDATA and a in the Mixed field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P51_ibm51n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P51/ibm51n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Mixed with a separator missing. The separator \"|\" is missing in     between #PCDATA and a in the Mixed field in the fourth elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P51-ibm51n04.xml</pre>
   * Test URI: <pre>not-wf/P51/ibm51n04.xml</pre>
   * Comment: <pre>Tests Mixed with a wrong key word. The string "#CDATA" is used as the     key word in the Mixed field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P51_ibm51n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P51/ibm51n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Mixed with a wrong key word. The string \"#CDATA\" is used as the     key word in the Mixed field in the fourth elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P51-ibm51n05.xml</pre>
   * Test URI: <pre>not-wf/P51/ibm51n05.xml</pre>
   * Comment: <pre>Tests Mixed with a required field missing. The "*" is missing after      the ")" in the Mixed field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P51_ibm51n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P51/ibm51n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Mixed with a required field missing. The \"*\" is missing after      the \")\" in the Mixed field in the fourth elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P51-ibm51n06.xml</pre>
   * Test URI: <pre>not-wf/P51/ibm51n06.xml</pre>
   * Comment: <pre>Tests Mixed with wrong closing bracket. The "]" is used as the closing      bracket in the Mixed field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P51_ibm51n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P51/ibm51n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Mixed with wrong closing bracket. The \"]\" is used as the closing      bracket in the Mixed field in the fourth elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P51-ibm51n07.xml</pre>
   * Test URI: <pre>not-wf/P51/ibm51n07.xml</pre>
   * Comment: <pre>Tests Mixed with a required field missing. The closing bracket ")" is      missing after (#PCDATA in the Mixed field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P51_ibm51n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P51/ibm51n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Mixed with a required field missing. The closing bracket \")\" is      missing after (#PCDATA in the Mixed field in the fourth elementdecl in the DTD.");
    }
  }
        
    
    
}
    