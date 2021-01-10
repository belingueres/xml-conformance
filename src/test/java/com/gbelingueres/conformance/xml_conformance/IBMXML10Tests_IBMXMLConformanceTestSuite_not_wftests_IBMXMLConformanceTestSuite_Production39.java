
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production39 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P39-ibm39n01.xml</pre>
   * Test URI: <pre>not-wf/P39/ibm39n01.xml</pre>
   * Comment: <pre>Tests element with a required field missing. The ETag is missing      for the element "root".</pre>
   * Sections: <pre>3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P39_ibm39n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P39/ibm39n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests element with a required field missing. The ETag is missing      for the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P39-ibm39n02.xml</pre>
   * Test URI: <pre>not-wf/P39/ibm39n02.xml</pre>
   * Comment: <pre>Tests element with a required field missing. The STag is missing      for the element "root".</pre>
   * Sections: <pre>3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P39_ibm39n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P39/ibm39n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests element with a required field missing. The STag is missing      for the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P39-ibm39n03.xml</pre>
   * Test URI: <pre>not-wf/P39/ibm39n03.xml</pre>
   * Comment: <pre>Tests element with required fields missing. Both the content and      the ETag are missing in the element "root".</pre>
   * Sections: <pre>3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P39_ibm39n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P39/ibm39n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests element with required fields missing. Both the content and      the ETag are missing in the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P39-ibm39n04.xml</pre>
   * Test URI: <pre>not-wf/P39/ibm39n04.xml</pre>
   * Comment: <pre>Tests element with required fields missing. Both the content and      the STag are missing in the element "root".</pre>
   * Sections: <pre>3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P39_ibm39n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P39/ibm39n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests element with required fields missing. Both the content and      the STag are missing in the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P39-ibm39n05.xml</pre>
   * Test URI: <pre>not-wf/P39/ibm39n05.xml</pre>
   * Comment: <pre>Tests element with wrong field ordering. The STag and the ETag are     swapped in the element "root".</pre>
   * Sections: <pre>3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P39_ibm39n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P39/ibm39n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests element with wrong field ordering. The STag and the ETag are     swapped in the element \"root\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P39-ibm39n06.xml</pre>
   * Test URI: <pre>not-wf/P39/ibm39n06.xml</pre>
   * Comment: <pre>Tests element with wrong field ordering. The content occurs after      the ETag of the element "root".</pre>
   * Sections: <pre>3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P39_ibm39n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P39/ibm39n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests element with wrong field ordering. The content occurs after      the ETag of the element \"root\".");
    }
  }
        
    
    
}
    