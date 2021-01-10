
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production83 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P83-ibm83n01.xml</pre>
   * Test URI: <pre>not-wf/P83/ibm83n01.xml</pre>
   * Comment: <pre>Tests PublicID with wrong key word. The string "public" is used as      the key word in the PublicID in the NotationDecl in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P83_ibm83n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P83/ibm83n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PublicID with wrong key word. The string \"public\" is used as      the key word in the PublicID in the NotationDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P83-ibm83n02.xml</pre>
   * Test URI: <pre>not-wf/P83/ibm83n02.xml</pre>
   * Comment: <pre>Tests PublicID with wrong key word. The string "Public" is used as      the key word in the PublicID in the NotationDecl in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P83_ibm83n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P83/ibm83n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PublicID with wrong key word. The string \"Public\" is used as      the key word in the PublicID in the NotationDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P83-ibm83n03.xml</pre>
   * Test URI: <pre>not-wf/P83/ibm83n03.xml</pre>
   * Comment: <pre>Tests PublicID with a required field missing. The key word "PUBLIC"     is missing in the PublicID in the NotationDecl in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P83_ibm83n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P83/ibm83n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PublicID with a required field missing. The key word \"PUBLIC\"     is missing in the PublicID in the NotationDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P83-ibm83n04.xml</pre>
   * Test URI: <pre>not-wf/P83/ibm83n04.xml</pre>
   * Comment: <pre>Tests PublicID with a required field missing. The white space      between the "PUBLIC" and the PubidLiteral is missing in the PublicID in      the NotationDecl in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P83_ibm83n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P83/ibm83n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PublicID with a required field missing. The white space      between the \"PUBLIC\" and the PubidLiteral is missing in the PublicID in      the NotationDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P83-ibm83n05.xml</pre>
   * Test URI: <pre>not-wf/P83/ibm83n05.xml</pre>
   * Comment: <pre>Tests PublicID with a required field missing. The PubidLiteral is      missing in the PublicID in the NotationDecl in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P83_ibm83n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P83/ibm83n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PublicID with a required field missing. The PubidLiteral is      missing in the PublicID in the NotationDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P83-ibm83n06.xml</pre>
   * Test URI: <pre>not-wf/P83/ibm83n06.xml</pre>
   * Comment: <pre>Tests PublicID with wrong field ordering. The key word "PUBLIC"      occurs after the PubidLiteral in the PublicID in the NotationDecl.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P83_ibm83n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P83/ibm83n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PublicID with wrong field ordering. The key word \"PUBLIC\"      occurs after the PubidLiteral in the PublicID in the NotationDecl.");
    }
  }
        
    
    
}
    