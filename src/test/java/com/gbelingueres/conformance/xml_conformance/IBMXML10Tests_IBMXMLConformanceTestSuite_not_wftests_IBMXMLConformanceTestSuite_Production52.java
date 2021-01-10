
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production52 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P52-ibm52n01.xml</pre>
   * Test URI: <pre>not-wf/P52/ibm52n01.xml</pre>
   * Comment: <pre>Tests AttlistDecl with a required field missing. The Name is missing      in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P52_ibm52n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P52/ibm52n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttlistDecl with a required field missing. The Name is missing      in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P52-ibm52n02.xml</pre>
   * Test URI: <pre>not-wf/P52/ibm52n02.xml</pre>
   * Comment: <pre>Tests AttlistDecl with a required field missing. The white space is      missing between the beginning sequence and the name in the AttlistDecl      in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P52_ibm52n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P52/ibm52n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttlistDecl with a required field missing. The white space is      missing between the beginning sequence and the name in the AttlistDecl      in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P52-ibm52n03.xml</pre>
   * Test URI: <pre>not-wf/P52/ibm52n03.xml</pre>
   * Comment: <pre>Tests AttlistDecl with wrong field ordering. The Name "a" occurs after      the first AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P52_ibm52n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P52/ibm52n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttlistDecl with wrong field ordering. The Name \"a\" occurs after      the first AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P52-ibm52n04.xml</pre>
   * Test URI: <pre>not-wf/P52/ibm52n04.xml</pre>
   * Comment: <pre>Tests AttlistDecl with wrong key word. The string "Attlist" is used as     the key word in the beginning sequence in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P52_ibm52n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P52/ibm52n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttlistDecl with wrong key word. The string \"Attlist\" is used as     the key word in the beginning sequence in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P52-ibm52n05.xml</pre>
   * Test URI: <pre>not-wf/P52/ibm52n05.xml</pre>
   * Comment: <pre>Tests AttlistDecl with a required field missing. The closing bracket      "greater than" is missing in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P52_ibm52n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P52/ibm52n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttlistDecl with a required field missing. The closing bracket      \"greater than\" is missing in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P52-ibm52n06.xml</pre>
   * Test URI: <pre>not-wf/P52/ibm52n06.xml</pre>
   * Comment: <pre>Tests AttlistDecl with wrong beginning sequence. The string      "(less than)ATTLIST" is used as the beginning sequence in the AttlistDecl in     the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P52_ibm52n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P52/ibm52n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttlistDecl with wrong beginning sequence. The string      \"(less than)ATTLIST\" is used as the beginning sequence in the AttlistDecl in     the DTD.");
    }
  }
        
    
    
}
    