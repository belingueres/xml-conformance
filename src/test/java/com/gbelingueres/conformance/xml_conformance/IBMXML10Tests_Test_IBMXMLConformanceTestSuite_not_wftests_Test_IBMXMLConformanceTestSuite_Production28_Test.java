
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

/**
 * Test class that execute a particular set of tests associated to a TESCASES tag from the XML W3C Conformance Tests.
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 28</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production28_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P28-ibm28n01.xml</pre>
   * Test URI: <pre>not-wf/P28/ibm28n01.xml</pre>
   * Comment: <pre>Tests doctypedecl with a required field missing. The Name "animal"      is missing in the doctypedecl.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P28_ibm28n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P28/ibm28n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests doctypedecl with a required field missing. The Name \"animal\"      is missing in the doctypedecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P28-ibm28n02.xml</pre>
   * Test URI: <pre>not-wf/P28/ibm28n02.xml</pre>
   * Comment: <pre>Tests doctypedecl with wrong field ordering. The Name      "animal" occurs after the markup declarations inside the "[]".</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P28_ibm28n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P28/ibm28n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests doctypedecl with wrong field ordering. The Name      \"animal\" occurs after the markup declarations inside the \"[]\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P28-ibm28n03.xml</pre>
   * Test URI: <pre>not-wf/P28/ibm28n03.xml</pre>
   * Comment: <pre>Tests doctypedecl with wrong field ordering. The Name      "animal" occurs after the markup declarations inside the "[]".</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P28_ibm28n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P28/ibm28n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests doctypedecl with wrong field ordering. The Name      \"animal\" occurs after the markup declarations inside the \"[]\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P28-ibm28n04.xml</pre>
   * Test URI: <pre>not-wf/P28/ibm28n04.xml</pre>
   * Comment: <pre>Tests doctypedecl with general entity reference.The      "(ampersand)generalE" occurs in the DTD.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P28_ibm28n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P28/ibm28n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests doctypedecl with general entity reference.The      \"(ampersand)generalE\" occurs in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P28-ibm28n05.xml</pre>
   * Test URI: <pre>not-wf/P28/ibm28n05.xml</pre>
   * Comment: <pre>Tests doctypedecl with wrong key word. A wrong key word "DOCtYPE"     occurs on line 2.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P28_ibm28n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P28/ibm28n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests doctypedecl with wrong key word. A wrong key word \"DOCtYPE\"     occurs on line 2.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P28-ibm28n06.xml</pre>
   * Test URI: <pre>not-wf/P28/ibm28n06.xml</pre>
   * Comment: <pre>Tests doctypedecl with mismatched brackets. The closing bracket "]"     of the DTD is missing.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P28_ibm28n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P28/ibm28n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests doctypedecl with mismatched brackets. The closing bracket \"]\"     of the DTD is missing.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P28-ibm28n07.xml</pre>
   * Test URI: <pre>not-wf/P28/ibm28n07.xml</pre>
   * Comment: <pre>Tests doctypedecl with wrong bracket. The opening bracket "{" occurs     in the DTD.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P28_ibm28n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P28/ibm28n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests doctypedecl with wrong bracket. The opening bracket \"{\" occurs     in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P28-ibm28n08.xml</pre>
   * Test URI: <pre>not-wf/P28/ibm28n08.xml</pre>
   * Comment: <pre>Tests doctypedecl with wrong opening sequence. The opening sequence     "(less than)?DOCTYPE" occurs in the DTD.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P28_ibm28n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P28/ibm28n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests doctypedecl with wrong opening sequence. The opening sequence     \"(less than)?DOCTYPE\" occurs in the DTD.");
    }
  }
        
    
    
}
    