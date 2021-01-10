
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production59 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P59-ibm59n01.xml</pre>
   * Test URI: <pre>not-wf/P59/ibm59n01.xml</pre>
   * Comment: <pre>Tests Enumeration with required fields missing. The Nmtokens and "|"s are     missing in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P59_ibm59n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P59/ibm59n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Enumeration with required fields missing. The Nmtokens and \"|\"s are     missing in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P59-ibm59n02.xml</pre>
   * Test URI: <pre>not-wf/P59/ibm59n02.xml</pre>
   * Comment: <pre>Tests Enumeration with a required field missing. The closing bracket ")" is     missing in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P59_ibm59n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P59/ibm59n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Enumeration with a required field missing. The closing bracket \")\" is     missing in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P59-ibm59n03.xml</pre>
   * Test URI: <pre>not-wf/P59/ibm59n03.xml</pre>
   * Comment: <pre>Tests Enumeration with wrong separator. The "," is used as the separator in      the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P59_ibm59n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P59/ibm59n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Enumeration with wrong separator. The \",\" is used as the separator in      the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P59-ibm59n04.xml</pre>
   * Test URI: <pre>not-wf/P59/ibm59n04.xml</pre>
   * Comment: <pre>Tests Enumeration with illegal presence. The double quotes occur around the      Enumeration value in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P59_ibm59n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P59/ibm59n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Enumeration with illegal presence. The double quotes occur around the      Enumeration value in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P59-ibm59n05.xml</pre>
   * Test URI: <pre>not-wf/P59/ibm59n05.xml</pre>
   * Comment: <pre>Tests Enumeration with a required field missing. The white space is missing     between  in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P59_ibm59n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P59/ibm59n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Enumeration with a required field missing. The white space is missing     between  in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P59-ibm59n06.xml</pre>
   * Test URI: <pre>not-wf/P59/ibm59n06.xml</pre>
   * Comment: <pre>Tests Enumeration with a required field missing. The beginning bracket "(" is     missing in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P59_ibm59n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P59/ibm59n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Enumeration with a required field missing. The beginning bracket \"(\" is     missing in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
    
}
    