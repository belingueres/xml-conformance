
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_validtests_IBMXMLConformanceTestSuite_Production54 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-valid-P54-ibm54v01.xml</pre>
   * Test URI: <pre>valid/P54/ibm54v01.xml</pre>
   * Comment: <pre>Tests all AttTypes : StringType, TokenizedTypes, EnumeratedTypes in      P55,P56,P57,P58,P59.  Also tests all DefaultDecls in P60.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_valid_P54_ibm54v01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P54/ibm54v01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("Tests all AttTypes : StringType, TokenizedTypes, EnumeratedTypes in      P55,P56,P57,P58,P59.  Also tests all DefaultDecls in P60.", true);
    }
    catch (XmlPullParserException ex) {
      fail("Tests all AttTypes : StringType, TokenizedTypes, EnumeratedTypes in      P55,P56,P57,P58,P59.  Also tests all DefaultDecls in P60.");
    }
  }
        
    
    
}
    