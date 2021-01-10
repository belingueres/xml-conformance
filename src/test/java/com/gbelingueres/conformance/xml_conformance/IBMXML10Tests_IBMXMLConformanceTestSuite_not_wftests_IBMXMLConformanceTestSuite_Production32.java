
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production32 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P32-ibm32n01.xml</pre>
   * Test URI: <pre>not-wf/P32/ibm32n01.xml</pre>
   * Comment: <pre>Tests SDDecl with a required field missing. The leading white space     is missing with the SDDecl in the XMLDecl.</pre>
   * Sections: <pre>2.9</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P32_ibm32n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P32/ibm32n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests SDDecl with a required field missing. The leading white space     is missing with the SDDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P32-ibm32n02.xml</pre>
   * Test URI: <pre>not-wf/P32/ibm32n02.xml</pre>
   * Comment: <pre>Tests SDDecl with a required field missing. The "=" sign is missing     in the SDDecl in the XMLDecl.</pre>
   * Sections: <pre>2.9</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P32_ibm32n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P32/ibm32n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests SDDecl with a required field missing. The \"=\" sign is missing     in the SDDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P32-ibm32n03.xml</pre>
   * Test URI: <pre>not-wf/P32/ibm32n03.xml</pre>
   * Comment: <pre>Tests SDDecl with wrong key word. The word "Standalone" occurs in      the SDDecl in the XMLDecl.</pre>
   * Sections: <pre>2.9</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P32_ibm32n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P32/ibm32n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests SDDecl with wrong key word. The word \"Standalone\" occurs in      the SDDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P32-ibm32n04.xml</pre>
   * Test URI: <pre>not-wf/P32/ibm32n04.xml</pre>
   * Comment: <pre>Tests SDDecl with wrong key word. The word "Yes" occurs in the     SDDecl in the XMLDecl.</pre>
   * Sections: <pre>2.9</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P32_ibm32n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P32/ibm32n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests SDDecl with wrong key word. The word \"Yes\" occurs in the     SDDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P32-ibm32n05.xml</pre>
   * Test URI: <pre>not-wf/P32/ibm32n05.xml</pre>
   * Comment: <pre>Tests SDDecl with wrong key word. The word "YES" occurs in the     SDDecl in the XMLDecl.</pre>
   * Sections: <pre>2.9</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P32_ibm32n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P32/ibm32n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests SDDecl with wrong key word. The word \"YES\" occurs in the     SDDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P32-ibm32n06.xml</pre>
   * Test URI: <pre>not-wf/P32/ibm32n06.xml</pre>
   * Comment: <pre>Tests SDDecl with wrong key word. The word "No" occurs in the     SDDecl in the XMLDecl.</pre>
   * Sections: <pre>2.9</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P32_ibm32n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P32/ibm32n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests SDDecl with wrong key word. The word \"No\" occurs in the     SDDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P32-ibm32n07.xml</pre>
   * Test URI: <pre>not-wf/P32/ibm32n07.xml</pre>
   * Comment: <pre>Tests SDDecl with wrong key word. The word "NO" occurs in the     SDDecl in the XMLDecl.</pre>
   * Sections: <pre>2.9</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P32_ibm32n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P32/ibm32n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests SDDecl with wrong key word. The word \"NO\" occurs in the     SDDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P32-ibm32n08.xml</pre>
   * Test URI: <pre>not-wf/P32/ibm32n08.xml</pre>
   * Comment: <pre>Tests SDDecl with wrong field ordering. The "=" sign occurs      after the key word "yes" in the SDDecl in the XMLDecl.</pre>
   * Sections: <pre>2.9</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P32_ibm32n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P32/ibm32n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests SDDecl with wrong field ordering. The \"=\" sign occurs      after the key word \"yes\" in the SDDecl in the XMLDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P32-ibm32n09.xml</pre>
   * Test URI: <pre>not-wf/P32/ibm32n09.xml</pre>
   * Comment: <pre>This is test violates WFC: Entity Declared in P68.     The standalone document declaration has the value yes, BUT there is an      external markup declaration of an entity (other than amp, lt, gt, apos,     quot), and references to this entity appear in the document.</pre>
   * Sections: <pre>2.9</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P32_ibm32n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P32/ibm32n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This is test violates WFC: Entity Declared in P68.     The standalone document declaration has the value yes, BUT there is an      external markup declaration of an entity (other than amp, lt, gt, apos,     quot), and references to this entity appear in the document.");
    }
  }
        
    
    
}
    