
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production5 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P05-ibm05n01.xml</pre>
   * Test URI: <pre>not-wf/P05/ibm05n01.xml</pre>
   * Comment: <pre>Tests an element name which has an illegal first character. An illegal      first character "." is followed by "A_name-starts_with.".</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P05_ibm05n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P05/ibm05n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which has an illegal first character. An illegal      first character \".\" is followed by \"A_name-starts_with.\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P05-ibm05n02.xml</pre>
   * Test URI: <pre>not-wf/P05/ibm05n02.xml</pre>
   * Comment: <pre>Tests an element name which has an illegal first character. An illegal      first character "-" is followed by "A_name-starts_with-".</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P05_ibm05n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P05/ibm05n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which has an illegal first character. An illegal      first character \"-\" is followed by \"A_name-starts_with-\".");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P05-ibm05n03.xml</pre>
   * Test URI: <pre>not-wf/P05/ibm05n03.xml</pre>
   * Comment: <pre>Tests an element name which has an illegal first character. An illegal      first character "5" is followed by "A_name-starts_with_digit".</pre>
   * Sections: <pre>2.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P05_ibm05n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P05/ibm05n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests an element name which has an illegal first character. An illegal      first character \"5\" is followed by \"A_name-starts_with_digit\".");
    }
  }
        
    
    
}
    