
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production58 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P58-ibm58n01.xml</pre>
   * Test URI: <pre>not-wf/P58/ibm58n01.xml</pre>
   * Comment: <pre>Tests NotationType with wrong key word. The lower case "notation" is      used as the key word in the NotationType in the AttDef in the AttlistDecl in      the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P58_ibm58n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P58/ibm58n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationType with wrong key word. The lower case \"notation\" is      used as the key word in the NotationType in the AttDef in the AttlistDecl in      the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P58-ibm58n02.xml</pre>
   * Test URI: <pre>not-wf/P58/ibm58n02.xml</pre>
   * Comment: <pre>Tests NotationType with a required field missing. The beginning bracket      "(" is missing in the NotationType in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P58_ibm58n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P58/ibm58n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationType with a required field missing. The beginning bracket      \"(\" is missing in the NotationType in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P58-ibm58n03.xml</pre>
   * Test URI: <pre>not-wf/P58/ibm58n03.xml</pre>
   * Comment: <pre>Tests NotationType with a required field missing. The Name is missing      in the "()" in the NotationType in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P58_ibm58n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P58/ibm58n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationType with a required field missing. The Name is missing      in the \"()\" in the NotationType in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P58-ibm58n04.xml</pre>
   * Test URI: <pre>not-wf/P58/ibm58n04.xml</pre>
   * Comment: <pre>Tests NotationType with a required field missing. The closing bracket      is missing in the NotationType in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P58_ibm58n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P58/ibm58n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationType with a required field missing. The closing bracket      is missing in the NotationType in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P58-ibm58n05.xml</pre>
   * Test URI: <pre>not-wf/P58/ibm58n05.xml</pre>
   * Comment: <pre>Tests NotationType with wrong field ordering. The key word "NOTATION"     occurs after "(this)" in the NotationType in the AttDef in the AttlistDecl in      the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P58_ibm58n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P58/ibm58n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationType with wrong field ordering. The key word \"NOTATION\"     occurs after \"(this)\" in the NotationType in the AttDef in the AttlistDecl in      the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P58-ibm58n06.xml</pre>
   * Test URI: <pre>not-wf/P58/ibm58n06.xml</pre>
   * Comment: <pre>Tests NotationType with wrong separator. The "," is used as a separator     between "this" and "that" in the NotationType in the AttDef in the AttlistDecl      in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P58_ibm58n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P58/ibm58n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationType with wrong separator. The \",\" is used as a separator     between \"this\" and \"that\" in the NotationType in the AttDef in the AttlistDecl      in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P58-ibm58n07.xml</pre>
   * Test URI: <pre>not-wf/P58/ibm58n07.xml</pre>
   * Comment: <pre>Tests NotationType with a required field missing. The white space is     missing between "NOTATION" and "(this)" in the NotationType in the AttDef in the     AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P58_ibm58n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P58/ibm58n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationType with a required field missing. The white space is     missing between \"NOTATION\" and \"(this)\" in the NotationType in the AttDef in the     AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P58-ibm58n08.xml</pre>
   * Test URI: <pre>not-wf/P58/ibm58n08.xml</pre>
   * Comment: <pre>Tests NotationType with extra wrong characters. The double quote      character occurs after "(" and before ")" in the NotationType in the AttDef in      the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P58_ibm58n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P58/ibm58n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationType with extra wrong characters. The double quote      character occurs after \"(\" and before \")\" in the NotationType in the AttDef in      the AttlistDecl in the DTD.");
    }
  }
        
    
    
}
    