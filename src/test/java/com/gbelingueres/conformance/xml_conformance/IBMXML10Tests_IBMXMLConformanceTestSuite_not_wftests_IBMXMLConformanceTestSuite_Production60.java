
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production60 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P60-ibm60n01.xml</pre>
   * Test URI: <pre>not-wf/P60/ibm60n01.xml</pre>
   * Comment: <pre>Tests DefaultDecl with wrong key word. The string "#required" is      used as the key word in the DefaultDecl in the AttDef in the AttlistDecl      in the DTD.</pre>
   * Sections: <pre>3.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P60_ibm60n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P60/ibm60n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests DefaultDecl with wrong key word. The string \"#required\" is      used as the key word in the DefaultDecl in the AttDef in the AttlistDecl      in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P60-ibm60n02.xml</pre>
   * Test URI: <pre>not-wf/P60/ibm60n02.xml</pre>
   * Comment: <pre>Tests DefaultDecl with wrong key word. The string "Implied" is      used as the key word in the DefaultDecl in the AttDef in the AttlistDecl      in the DTD.</pre>
   * Sections: <pre>3.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P60_ibm60n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P60/ibm60n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests DefaultDecl with wrong key word. The string \"Implied\" is      used as the key word in the DefaultDecl in the AttDef in the AttlistDecl      in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P60-ibm60n03.xml</pre>
   * Test URI: <pre>not-wf/P60/ibm60n03.xml</pre>
   * Comment: <pre>Tests DefaultDecl with wrong key word. The string "!IMPLIED" is      used as the key word in the DefaultDecl in the AttDef in the AttlistDecl      in the DTD.</pre>
   * Sections: <pre>3.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P60_ibm60n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P60/ibm60n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests DefaultDecl with wrong key word. The string \"!IMPLIED\" is      used as the key word in the DefaultDecl in the AttDef in the AttlistDecl      in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P60-ibm60n04.xml</pre>
   * Test URI: <pre>not-wf/P60/ibm60n04.xml</pre>
   * Comment: <pre>Tests DefaultDecl with a required field missing. There is no      attribute value specified after the key word "#FIXED" in the DefaultDecl in     the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P60_ibm60n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P60/ibm60n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests DefaultDecl with a required field missing. There is no      attribute value specified after the key word \"#FIXED\" in the DefaultDecl in     the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P60-ibm60n05.xml</pre>
   * Test URI: <pre>not-wf/P60/ibm60n05.xml</pre>
   * Comment: <pre>Tests DefaultDecl with a required field missing. The white space is      missing between the key word "#FIXED" and the attribute value in the      DefaultDecl in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P60_ibm60n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P60/ibm60n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests DefaultDecl with a required field missing. The white space is      missing between the key word \"#FIXED\" and the attribute value in the      DefaultDecl in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P60-ibm60n06.xml</pre>
   * Test URI: <pre>not-wf/P60/ibm60n06.xml</pre>
   * Comment: <pre>Tests DefaultDecl with wrong field ordering. The key word "#FIXED"      occurs after the attribute value "introduction" in the DefaultDecl in the      AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P60_ibm60n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P60/ibm60n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests DefaultDecl with wrong field ordering. The key word \"#FIXED\"      occurs after the attribute value \"introduction\" in the DefaultDecl in the      AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P60-ibm60n07.xml</pre>
   * Test URI: <pre>not-wf/P60/ibm60n07.xml</pre>
   * Comment: <pre>Tests DefaultDecl against WFC of P60. The text replacement of the      entity "avalue" contains the "less than" character in the DefaultDecl in the     AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P60_ibm60n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P60/ibm60n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests DefaultDecl against WFC of P60. The text replacement of the      entity \"avalue\" contains the \"less than\" character in the DefaultDecl in the     AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P60-ibm60n08.xml</pre>
   * Test URI: <pre>not-wf/P60/ibm60n08.xml</pre>
   * Comment: <pre>Tests DefaultDecl with more than one key word. The "#REQUIRED" and     the "#IMPLIED" are used as the key words in the DefaultDecl in the AttDef      in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P60_ibm60n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P60/ibm60n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests DefaultDecl with more than one key word. The \"#REQUIRED\" and     the \"#IMPLIED\" are used as the key words in the DefaultDecl in the AttDef      in the AttlistDecl in the DTD.");
    }
  }
        
    
    
}
    