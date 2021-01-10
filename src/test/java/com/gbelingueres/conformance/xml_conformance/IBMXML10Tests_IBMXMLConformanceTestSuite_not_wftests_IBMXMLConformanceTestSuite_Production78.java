
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production78 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P78-ibm78n01.xml</pre>
   * Test URI: <pre>not-wf/P78/ibm78n01.xml</pre>
   * Comment: <pre>Tests extParsedEnt with wrong field ordering. The TextDecl occurs      after the content in the file ibm78n01.ent.</pre>
   * Sections: <pre>4.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P78_ibm78n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P78/ibm78n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests extParsedEnt with wrong field ordering. The TextDecl occurs      after the content in the file ibm78n01.ent.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P78-ibm78n02.xml</pre>
   * Test URI: <pre>not-wf/P78/ibm78n02.xml</pre>
   * Comment: <pre>Tests extParsedEnt with extra field. A blank line occurs before the     TextDecl in the file ibm78n02.ent.</pre>
   * Sections: <pre>4.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P78_ibm78n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P78/ibm78n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests extParsedEnt with extra field. A blank line occurs before the     TextDecl in the file ibm78n02.ent.");
    }
  }
        
    
    
}
    