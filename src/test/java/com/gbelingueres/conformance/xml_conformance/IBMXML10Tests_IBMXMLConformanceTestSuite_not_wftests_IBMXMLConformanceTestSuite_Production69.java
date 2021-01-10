
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production69 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P69-ibm69n01.xml</pre>
   * Test URI: <pre>not-wf/P69/ibm69n01.xml</pre>
   * Comment: <pre>Tests PEReference with a required field missing. The Name "paaa" is      missing in the PEReference in the DTD.</pre>
   * Sections: <pre>4.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P69_ibm69n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P69/ibm69n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEReference with a required field missing. The Name \"paaa\" is      missing in the PEReference in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P69-ibm69n02.xml</pre>
   * Test URI: <pre>not-wf/P69/ibm69n02.xml</pre>
   * Comment: <pre>Tests PEReference with a required field missing. The semicolon is      missing in the PEReference "%paaa" in the DTD.</pre>
   * Sections: <pre>4.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P69_ibm69n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P69/ibm69n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEReference with a required field missing. The semicolon is      missing in the PEReference \"%paaa\" in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P69-ibm69n03.xml</pre>
   * Test URI: <pre>not-wf/P69/ibm69n03.xml</pre>
   * Comment: <pre>Tests PEReference with an extra white space. There is an extra      white space occurs before ";" in the PEReference in the DTD.</pre>
   * Sections: <pre>4.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P69_ibm69n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P69/ibm69n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEReference with an extra white space. There is an extra      white space occurs before \";\" in the PEReference in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P69-ibm69n04.xml</pre>
   * Test URI: <pre>not-wf/P69/ibm69n04.xml</pre>
   * Comment: <pre>Tests PEReference with an extra white space. There is an extra      white space occurs after "%" in the PEReference in the DTD.</pre>
   * Sections: <pre>4.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P69_ibm69n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P69/ibm69n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEReference with an extra white space. There is an extra      white space occurs after \"%\" in the PEReference in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P69-ibm69n06.xml</pre>
   * Test URI: <pre>not-wf/P69/ibm69n06.xml</pre>
   * Comment: <pre>Tests PEReference which is against P69 WFC: No Recursion. The      recursive PE reference occurs with the entity declarations for "paaa" and      "bbb" in the DTD.</pre>
   * Sections: <pre>4.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P69_ibm69n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P69/ibm69n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEReference which is against P69 WFC: No Recursion. The      recursive PE reference occurs with the entity declarations for \"paaa\" and      \"bbb\" in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P69-ibm69n07.xml</pre>
   * Test URI: <pre>not-wf/P69/ibm69n07.xml</pre>
   * Comment: <pre>Tests PEReference which is against P69 WFC: No Recursion. The      indirect recursive PE reference occurs with the entity declarations for      "paaa", "bbb", "ccc", "ddd", and "eee" in the DTD.</pre>
   * Sections: <pre>4.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P69_ibm69n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P69/ibm69n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests PEReference which is against P69 WFC: No Recursion. The      indirect recursive PE reference occurs with the entity declarations for      \"paaa\", \"bbb\", \"ccc\", \"ddd\", and \"eee\" in the DTD.");
    }
  }
        
    
    
}
    