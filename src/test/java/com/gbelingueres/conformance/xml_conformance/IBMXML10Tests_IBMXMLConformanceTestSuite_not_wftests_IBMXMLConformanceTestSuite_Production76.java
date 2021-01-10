
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production76 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P76-ibm76n01.xml</pre>
   * Test URI: <pre>not-wf/P76/ibm76n01.xml</pre>
   * Comment: <pre>Tests NDataDecl with wrong key word. The string "ndata" is used as      the key word in the NDataDecl in the EntityDef in the GEDecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P76_ibm76n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P76/ibm76n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NDataDecl with wrong key word. The string \"ndata\" is used as      the key word in the NDataDecl in the EntityDef in the GEDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P76-ibm76n02.xml</pre>
   * Test URI: <pre>not-wf/P76/ibm76n02.xml</pre>
   * Comment: <pre>Tests NDataDecl with wrong key word. The string "NData" is used as      the key word in the NDataDecl in the EntityDef in the GEDecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P76_ibm76n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P76/ibm76n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NDataDecl with wrong key word. The string \"NData\" is used as      the key word in the NDataDecl in the EntityDef in the GEDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P76-ibm76n03.xml</pre>
   * Test URI: <pre>not-wf/P76/ibm76n03.xml</pre>
   * Comment: <pre>Tests NDataDecl with a required field missing. The leading white      space is missing in the NDataDecl in the EntityDef in the GEDecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P76_ibm76n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P76/ibm76n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NDataDecl with a required field missing. The leading white      space is missing in the NDataDecl in the EntityDef in the GEDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P76-ibm76n04.xml</pre>
   * Test URI: <pre>not-wf/P76/ibm76n04.xml</pre>
   * Comment: <pre>Tests NDataDecl with a required field missing. The key word "NDATA"     is missing in the NDataDecl in the EntityDef in the GEDecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P76_ibm76n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P76/ibm76n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NDataDecl with a required field missing. The key word \"NDATA\"     is missing in the NDataDecl in the EntityDef in the GEDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P76-ibm76n05.xml</pre>
   * Test URI: <pre>not-wf/P76/ibm76n05.xml</pre>
   * Comment: <pre>Tests NDataDecl with a required field missing. The Name after the      key word "NDATA" is missing in the NDataDecl in the EntityDef in the GEDecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P76_ibm76n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P76/ibm76n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NDataDecl with a required field missing. The Name after the      key word \"NDATA\" is missing in the NDataDecl in the EntityDef in the GEDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P76-ibm76n06.xml</pre>
   * Test URI: <pre>not-wf/P76/ibm76n06.xml</pre>
   * Comment: <pre>Tests NDataDecl with a required field missing. The white space      between "NDATA" and the Name is missing in the NDataDecl in the EntityDef      in the GEDecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P76_ibm76n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P76/ibm76n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NDataDecl with a required field missing. The white space      between \"NDATA\" and the Name is missing in the NDataDecl in the EntityDef      in the GEDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P76-ibm76n07.xml</pre>
   * Test URI: <pre>not-wf/P76/ibm76n07.xml</pre>
   * Comment: <pre>Tests NDataDecl with wrong field ordering. The key word "NDATA"      occurs after the Name in the NDataDecl in the EntityDef in the GEDecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P76_ibm76n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P76/ibm76n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NDataDecl with wrong field ordering. The key word \"NDATA\"      occurs after the Name in the NDataDecl in the EntityDef in the GEDecl.");
    }
  }
        
    
    
}
    