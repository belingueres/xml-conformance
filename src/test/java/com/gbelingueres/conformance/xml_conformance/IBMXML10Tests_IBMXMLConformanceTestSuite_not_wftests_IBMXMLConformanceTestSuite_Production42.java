
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production42 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P42-ibm42n01.xml</pre>
   * Test URI: <pre>not-wf/P42/ibm42n01.xml</pre>
   * Comment: <pre>Tests ETag with a required field missing. The Name is missing in the      ETag of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P42_ibm42n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P42/ibm42n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ETag with a required field missing. The Name is missing in the      ETag of the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P42-ibm42n02.xml</pre>
   * Test URI: <pre>not-wf/P42/ibm42n02.xml</pre>
   * Comment: <pre>Tests ETag with a wrong beginning sequence. The string "(less than)\" is used as      a beginning sequence of the ETag of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P42_ibm42n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P42/ibm42n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ETag with a wrong beginning sequence. The string \"(less than)\" is used as      a beginning sequence of the ETag of the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P42-ibm42n03.xml</pre>
   * Test URI: <pre>not-wf/P42/ibm42n03.xml</pre>
   * Comment: <pre>Tests ETag with a wrong beginning sequence. The string "less than" is used as      a beginning sequence of the ETag of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P42_ibm42n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P42/ibm42n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ETag with a wrong beginning sequence. The string \"less than\" is used as      a beginning sequence of the ETag of the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P42-ibm42n04.xml</pre>
   * Test URI: <pre>not-wf/P42/ibm42n04.xml</pre>
   * Comment: <pre>Tests ETag with a wrong structure. An white space occurs between The      beginning sequence and the Name of the ETag of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P42_ibm42n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P42/ibm42n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ETag with a wrong structure. An white space occurs between The      beginning sequence and the Name of the ETag of the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P42-ibm42n05.xml</pre>
   * Test URI: <pre>not-wf/P42/ibm42n05.xml</pre>
   * Comment: <pre>Tests ETag with a wrong structure. The ETag of the element "root"     contains an Attribute (attr1="any").</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P42_ibm42n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P42/ibm42n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests ETag with a wrong structure. The ETag of the element \"root\"     contains an Attribute (attr1=\"any\").");
    }
  }
        
    
    
}
    