
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

public class eduni_namespaces_errata_1e_RichardTobinsXMLNamespaces10_112ndeditiontestsuite1June2006 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/eduni/namespaces/errata-1e/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>rmt-ns-e1.0-13a</pre>
   * Test URI: <pre>NE13a.xml</pre>
   * Comment: <pre>The xml namespace must not be declared as the default namespace.</pre>
   * Sections: <pre>NE13</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns_e10_13a() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "NE13a.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("The xml namespace must not be declared as the default namespace.");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns-e1.0-13b</pre>
   * Test URI: <pre>NE13b.xml</pre>
   * Comment: <pre>The xmlns namespace must not be declared as the default namespace.</pre>
   * Sections: <pre>NE13</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns_e10_13b() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "NE13b.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("The xmlns namespace must not be declared as the default namespace.");
    }
  }
        
    
  /**
   * Test ID: <pre>rmt-ns-e1.0-13c</pre>
   * Test URI: <pre>NE13c.xml</pre>
   * Comment: <pre>Elements must not have the prefix xmlns.</pre>
   * Sections: <pre>NE13</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testrmt_ns_e10_13c() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "NE13c.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Elements must not have the prefix xmlns.");
    }
  }
        
    
    
}
    