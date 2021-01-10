
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_validtests_IBMXMLConformanceTestSuite_Production86 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-valid-P86-ibm86v01.xml</pre>
   * Test URI: <pre>valid/P86/ibm86v01.xml</pre>
   * Comment: <pre>This test case covers 2 legal character ranges plus 1 single legal      characters for IdeoGraphic in P86 using a PI target Name</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P86_ibm86v01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P86/ibm86v01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers 2 legal character ranges plus 1 single legal      characters for IdeoGraphic in P86 using a PI target Name", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers 2 legal character ranges plus 1 single legal      characters for IdeoGraphic in P86 using a PI target Name");
    }
  }
        
    
    
}
    