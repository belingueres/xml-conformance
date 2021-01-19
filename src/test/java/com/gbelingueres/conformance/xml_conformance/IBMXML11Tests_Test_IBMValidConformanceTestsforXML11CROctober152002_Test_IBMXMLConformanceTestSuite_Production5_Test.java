
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

/**
 * Test class that execute a particular set of tests associated to a TESCASES tag from the XML W3C Conformance Tests.
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 5</pre>
 * XML test files base folder: <pre>xmlconf/ibm/xml-1.1/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML11Tests_Test_IBMValidConformanceTestsforXML11CROctober152002_Test_IBMXMLConformanceTestSuite_Production5_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P05-ibm05v01.xml</pre>
   * Test URI: <pre>valid/P05/ibm05v01.xml</pre>
   * Comment: <pre>This test case covers legal Element Names as per production 5.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P05_ibm05v01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P05/ibm05v01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal Element Names as per production 5.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal Element Names as per production 5.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P05-ibm05v02.xml</pre>
   * Test URI: <pre>valid/P05/ibm05v02.xml</pre>
   * Comment: <pre>This test case covers legal PITarget (Names) as per production 5.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P05_ibm05v02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P05/ibm05v02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal PITarget (Names) as per production 5.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal PITarget (Names) as per production 5.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P05-ibm05v03.xml</pre>
   * Test URI: <pre>valid/P05/ibm05v03.xml</pre>
   * Comment: <pre>This test case covers legal Attribute (Names) as per production 5.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P05_ibm05v03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P05/ibm05v03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal Attribute (Names) as per production 5.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal Attribute (Names) as per production 5.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P05-ibm05v04.xml</pre>
   * Test URI: <pre>valid/P05/ibm05v04.xml</pre>
   * Comment: <pre>This test case covers legal ID/IDREF (Names) as per production 5.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P05_ibm05v04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P05/ibm05v04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal ID/IDREF (Names) as per production 5.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal ID/IDREF (Names) as per production 5.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P05-ibm05v05.xml</pre>
   * Test URI: <pre>valid/P05/ibm05v05.xml</pre>
   * Comment: <pre>This test case covers legal ENTITY (Names) as per production 5.</pre>
   * Sections: <pre>2.3</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P05_ibm05v05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P05/ibm05v05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("This test case covers legal ENTITY (Names) as per production 5.", true);
    }
    catch (XmlPullParserException ex) {
      fail("This test case covers legal ENTITY (Names) as per production 5.");
    }
  }
        
    
    
}
    