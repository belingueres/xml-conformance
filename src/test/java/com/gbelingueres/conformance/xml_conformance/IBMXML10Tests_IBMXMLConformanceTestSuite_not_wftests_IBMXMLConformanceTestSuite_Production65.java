
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production65 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P65-ibm65n01.xml</pre>
   * Test URI: <pre>not-wf/P65/ibm65n01.xml</pre>
   * Comment: <pre>Tests Ignore with illegal string included. The string      "]](greater than)" is contained before "this" in the Ignore in the      ignoreSectContents in the file ibm65n01.dtd</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P65_ibm65n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P65/ibm65n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Ignore with illegal string included. The string      \"]](greater than)\" is contained before \"this\" in the Ignore in the      ignoreSectContents in the file ibm65n01.dtd");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P65-ibm65n02.xml</pre>
   * Test URI: <pre>not-wf/P65/ibm65n02.xml</pre>
   * Comment: <pre>Tests Ignore with illegal string included. The string      "(less than)![" is contained before "this" in the Ignore in the      ignoreSectContents in the file ibm65n02.dtd</pre>
   * Sections: <pre>3.4</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P65_ibm65n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P65/ibm65n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests Ignore with illegal string included. The string      \"(less than)![\" is contained before \"this\" in the Ignore in the      ignoreSectContents in the file ibm65n02.dtd");
    }
  }
        
    
    
}
    