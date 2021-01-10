
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production72 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P72-ibm72n01.xml</pre>
   * Test URI: <pre>not-wf/P72/ibm72n01.xml</pre>
   * Comment: <pre>Tests PEdecl with a required field missing. The white space is      missing between the beginning sequence and the "%" in the PEDecl in the DTD.</pre>
   * Sections: <pre>4.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P72_ibm72n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P72/ibm72n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEdecl with a required field missing. The white space is      missing between the beginning sequence and the \"%\" in the PEDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P72-ibm72n02.xml</pre>
   * Test URI: <pre>not-wf/P72/ibm72n02.xml</pre>
   * Comment: <pre>Tests PEdecl with a required field missing. The Name is missing      in the PEDecl in the DTD.</pre>
   * Sections: <pre>4.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P72_ibm72n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P72/ibm72n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEdecl with a required field missing. The Name is missing      in the PEDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P72-ibm72n03.xml</pre>
   * Test URI: <pre>not-wf/P72/ibm72n03.xml</pre>
   * Comment: <pre>Tests PEdecl with a required field missing. The white space is      missing between the Name and the PEDef in the PEDecl in the DTD.</pre>
   * Sections: <pre>4.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P72_ibm72n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P72/ibm72n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEdecl with a required field missing. The white space is      missing between the Name and the PEDef in the PEDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P72-ibm72n04.xml</pre>
   * Test URI: <pre>not-wf/P72/ibm72n04.xml</pre>
   * Comment: <pre>Tests PEdecl with a required field missing. The PEDef is missing      after the Name "paaa" in the PEDecl in the DTD.</pre>
   * Sections: <pre>4.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P72_ibm72n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P72/ibm72n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEdecl with a required field missing. The PEDef is missing      after the Name \"paaa\" in the PEDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P72-ibm72n05.xml</pre>
   * Test URI: <pre>not-wf/P72/ibm72n05.xml</pre>
   * Comment: <pre>Tests PEdecl with wrong field ordering. The Name "paaa" occurs      after the PEDef in the PEDecl in the DTD.</pre>
   * Sections: <pre>4.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P72_ibm72n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P72/ibm72n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEdecl with wrong field ordering. The Name \"paaa\" occurs      after the PEDef in the PEDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P72-ibm72n06.xml</pre>
   * Test URI: <pre>not-wf/P72/ibm72n06.xml</pre>
   * Comment: <pre>Tests PEdecl with wrong field ordering. The "%" and the Name "paaa"     occurs after the PEDef in the PEDecl in the DTD.</pre>
   * Sections: <pre>4.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P72_ibm72n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P72/ibm72n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEdecl with wrong field ordering. The \"%\" and the Name \"paaa\"     occurs after the PEDef in the PEDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P72-ibm72n07.xml</pre>
   * Test URI: <pre>not-wf/P72/ibm72n07.xml</pre>
   * Comment: <pre>Tests PEdecl with wrong key word. The string "entity" is used as      the key word in the beginning sequence in the PEDecl in the DTD.</pre>
   * Sections: <pre>4.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P72_ibm72n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P72/ibm72n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEdecl with wrong key word. The string \"entity\" is used as      the key word in the beginning sequence in the PEDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P72-ibm72n08.xml</pre>
   * Test URI: <pre>not-wf/P72/ibm72n08.xml</pre>
   * Comment: <pre>Tests PEdecl with a required field missing. The closing bracket      (greater than) is missing in the PEDecl in the DTD.</pre>
   * Sections: <pre>4.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P72_ibm72n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P72/ibm72n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEdecl with a required field missing. The closing bracket      (greater than) is missing in the PEDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P72-ibm72n09.xml</pre>
   * Test URI: <pre>not-wf/P72/ibm72n09.xml</pre>
   * Comment: <pre>Tests PEdecl with wrong closing sequence. The string      "!(greater than)" is used as the closing sequence in the PEDecl in the DTD.</pre>
   * Sections: <pre>4.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P72_ibm72n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P72/ibm72n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEdecl with wrong closing sequence. The string      \"!(greater than)\" is used as the closing sequence in the PEDecl in the DTD.");
    }
  }
        
    
    
}
    