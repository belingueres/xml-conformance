
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production82 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P82-ibm82n01.xml</pre>
   * Test URI: <pre>not-wf/P82/ibm82n01.xml</pre>
   * Comment: <pre>Tests NotationDecl with a required field missing. The white space      after the beginning sequence of the NotationDecl is missing in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P82_ibm82n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P82/ibm82n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationDecl with a required field missing. The white space      after the beginning sequence of the NotationDecl is missing in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P82-ibm82n02.xml</pre>
   * Test URI: <pre>not-wf/P82/ibm82n02.xml</pre>
   * Comment: <pre>Tests NotationDecl with a required field missing. The Name in the      NotationDecl is missing in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P82_ibm82n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P82/ibm82n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationDecl with a required field missing. The Name in the      NotationDecl is missing in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P82-ibm82n03.xml</pre>
   * Test URI: <pre>not-wf/P82/ibm82n03.xml</pre>
   * Comment: <pre>Tests NotationDecl with a required field missing. The externalID or     the PublicID is missing in the NotationDecl in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P82_ibm82n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P82/ibm82n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationDecl with a required field missing. The externalID or     the PublicID is missing in the NotationDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P82-ibm82n04.xml</pre>
   * Test URI: <pre>not-wf/P82/ibm82n04.xml</pre>
   * Comment: <pre>Tests NotationDecl with wrong field ordering. The Name occurs after     the "SYSTEM" and the externalID in the NotationDecl in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P82_ibm82n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P82/ibm82n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationDecl with wrong field ordering. The Name occurs after     the \"SYSTEM\" and the externalID in the NotationDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P82-ibm82n05.xml</pre>
   * Test URI: <pre>not-wf/P82/ibm82n05.xml</pre>
   * Comment: <pre>Tests NotationDecl with wrong key word. The string "notation" is      used as a key word in the NotationDecl in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P82_ibm82n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P82/ibm82n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationDecl with wrong key word. The string \"notation\" is      used as a key word in the NotationDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P82-ibm82n06.xml</pre>
   * Test URI: <pre>not-wf/P82/ibm82n06.xml</pre>
   * Comment: <pre>Tests NotationDecl with a required field missing. The closing      bracket (the greater than character) is missing in the NotationDecl.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P82_ibm82n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P82/ibm82n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationDecl with a required field missing. The closing      bracket (the greater than character) is missing in the NotationDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P82-ibm82n07.xml</pre>
   * Test URI: <pre>not-wf/P82/ibm82n07.xml</pre>
   * Comment: <pre>Tests NotationDecl with wrong beginning sequence. The "!" is missing     in the beginning sequence in the NotationDecl in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P82_ibm82n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P82/ibm82n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationDecl with wrong beginning sequence. The \"!\" is missing     in the beginning sequence in the NotationDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P82-ibm82n08.xml</pre>
   * Test URI: <pre>not-wf/P82/ibm82n08.xml</pre>
   * Comment: <pre>Tests NotationDecl with wrong closing sequence. The extra "!" occurs     in the closing sequence in the NotationDecl in the DTD.</pre>
   * Sections: <pre>4.7</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P82_ibm82n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P82/ibm82n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests NotationDecl with wrong closing sequence. The extra \"!\" occurs     in the closing sequence in the NotationDecl in the DTD.");
    }
  }
        
    
    
}
    