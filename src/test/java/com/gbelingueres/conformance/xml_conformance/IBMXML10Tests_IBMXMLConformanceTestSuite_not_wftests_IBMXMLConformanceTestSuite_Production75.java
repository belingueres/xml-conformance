
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production75 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n01.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n01.xml</pre>
   * Comment: <pre>Tests ExternalID with wrong key word. The string "system" is used     as the key word in the ExternalID in the EntityDef in the EntityDecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with wrong key word. The string \"system\" is used     as the key word in the ExternalID in the EntityDef in the EntityDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n02.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n02.xml</pre>
   * Comment: <pre>Tests ExternalID with wrong key word. The string "public" is used     as the key word in the ExternalID in the doctypedecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with wrong key word. The string \"public\" is used     as the key word in the ExternalID in the doctypedecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n03.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n03.xml</pre>
   * Comment: <pre>Tests ExternalID with wrong key word. The string "Public" is used     as the key word in the ExternalID in the doctypedecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with wrong key word. The string \"Public\" is used     as the key word in the ExternalID in the doctypedecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n04.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n04.xml</pre>
   * Comment: <pre>Tests ExternalID with wrong field ordering. The key word "PUBLIC"      occurs after the PublicLiteral and the SystemLiteral in the ExternalID in      the doctypedecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with wrong field ordering. The key word \"PUBLIC\"      occurs after the PublicLiteral and the SystemLiteral in the ExternalID in      the doctypedecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n05.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n05.xml</pre>
   * Comment: <pre>Tests ExternalID with a required field missing. The white space      between "SYSTEM" and the Systemliteral is missing in the ExternalID in the      EntityDef in the EntityDecl in the DTD.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with a required field missing. The white space      between \"SYSTEM\" and the Systemliteral is missing in the ExternalID in the      EntityDef in the EntityDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n06.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n06.xml</pre>
   * Comment: <pre>Tests ExternalID with a required field missing. The Systemliteral      is missing after "SYSTEM" in the ExternalID in the EntityDef in the      EntityDecl in the DTD.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with a required field missing. The Systemliteral      is missing after \"SYSTEM\" in the ExternalID in the EntityDef in the      EntityDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n07.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n07.xml</pre>
   * Comment: <pre>Tests ExternalID with a required field missing. The white space      between the PublicLiteral and the Systemliteral is missing in the ExternalID     in the doctypedecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with a required field missing. The white space      between the PublicLiteral and the Systemliteral is missing in the ExternalID     in the doctypedecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n08.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n08.xml</pre>
   * Comment: <pre>Tests ExternalID with a required field missing. The key word      "PUBLIC" is missing in the ExternalID in the doctypedecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with a required field missing. The key word      \"PUBLIC\" is missing in the ExternalID in the doctypedecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n09.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n09.xml</pre>
   * Comment: <pre>Tests ExternalID with a required field missing. The white space      between "PUBLIC" and the PublicLiteral is missing in the ExternalID in the      doctypedecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with a required field missing. The white space      between \"PUBLIC\" and the PublicLiteral is missing in the ExternalID in the      doctypedecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n10.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n10.xml</pre>
   * Comment: <pre>Tests ExternalID with a required field missing. The PublicLiteral     is missing in the ExternalID in the doctypedecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with a required field missing. The PublicLiteral     is missing in the ExternalID in the doctypedecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n11.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n11.xml</pre>
   * Comment: <pre>Tests ExternalID with a required field missing. The PublicLiteral     is missing in the ExternalID in the doctypedecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with a required field missing. The PublicLiteral     is missing in the ExternalID in the doctypedecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n12.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n12.xml</pre>
   * Comment: <pre>Tests ExternalID with a required field missing. The SystemLiteral     is missing in the ExternalID in the doctypedecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with a required field missing. The SystemLiteral     is missing in the ExternalID in the doctypedecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P75-ibm75n13.xml</pre>
   * Test URI: <pre>not-wf/P75/ibm75n13.xml</pre>
   * Comment: <pre>Tests ExternalID with wrong field ordering. The key word "PUBLIC"      occurs after the PublicLiteral in the ExternalID in the doctypedecl.</pre>
   * Sections: <pre>4.2.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P75_ibm75n13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P75/ibm75n13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ExternalID with wrong field ordering. The key word \"PUBLIC\"      occurs after the PublicLiteral in the ExternalID in the doctypedecl.");
    }
  }
        
    
    
}
    