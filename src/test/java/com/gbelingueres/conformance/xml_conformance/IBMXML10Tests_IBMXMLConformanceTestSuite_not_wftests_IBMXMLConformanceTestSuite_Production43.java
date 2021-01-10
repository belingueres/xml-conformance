
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production43 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P43-ibm43n01.xml</pre>
   * Test URI: <pre>not-wf/P43/ibm43n01.xml</pre>
   * Comment: <pre>Tests element content with a wrong option. A NotationDecl is used as      the content of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P43_ibm43n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P43/ibm43n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests element content with a wrong option. A NotationDecl is used as      the content of the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P43-ibm43n02.xml</pre>
   * Test URI: <pre>not-wf/P43/ibm43n02.xml</pre>
   * Comment: <pre>Tests element content with a wrong option. An elementdecl is used as      the content of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P43_ibm43n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P43/ibm43n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests element content with a wrong option. An elementdecl is used as      the content of the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P43-ibm43n04.xml</pre>
   * Test URI: <pre>not-wf/P43/ibm43n04.xml</pre>
   * Comment: <pre>Tests element content with a wrong option. An entitydecl is used as      the content of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P43_ibm43n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P43/ibm43n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests element content with a wrong option. An entitydecl is used as      the content of the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P43-ibm43n05.xml</pre>
   * Test URI: <pre>not-wf/P43/ibm43n05.xml</pre>
   * Comment: <pre>Tests element content with a wrong option. An AttlistDecl is used as      the content of the element "root".</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P43_ibm43n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P43/ibm43n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests element content with a wrong option. An AttlistDecl is used as      the content of the element \"root\".");
    }
  }
        
    
    
}
    