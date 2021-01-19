
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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 77</pre>
 * XML test files base folder: <pre>xmlconf/ibm/xml-1.1/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML11Tests_Test_IBMValidConformanceTestsforXML11CROctober152002_Test_IBMXMLConformanceTestSuite_Production77_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v01.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v01.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          DTD is 1.0.  The character #xC0 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          DTD is 1.0.  The character #xC0 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          DTD is 1.0.  The character #xC0 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v02.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v02.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          DTD is 1.0.  The character #x1FFF which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          DTD is 1.0.  The character #x1FFF which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          DTD is 1.0.  The character #x1FFF which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v03.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v03.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          DTD is 1.0.  The character #xF901 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          DTD is 1.0.  The character #xF901 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          DTD is 1.0.  The character #xF901 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v04.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v04.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          entity is 1.0.  The character #xD6 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          entity is 1.0.  The character #xD6 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          entity is 1.0.  The character #xD6 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v05.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v05.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          entity is 1.0.  The character #x1FFF which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          entity is 1.0.  The character #x1FFF which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          entity is 1.0.  The character #x1FFF which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v06.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v06.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          entity is 1.0.  The character #xF901 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          entity is 1.0.  The character #xF901 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 whereas the VersionNum of the external          entity is 1.0.  The character #xF901 which is a valid XML 1.1 but an invalid XML 1.0          character is present in both documents.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v07.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v07.xml</pre>
   * Comment: <pre>The VersionNum of the document and external dtd is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xD8.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and external dtd is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xD8.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and external dtd is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xD8.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v08.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v08.xml</pre>
   * Comment: <pre>The VersionNum of the document and external dtd is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #x1FFF.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and external dtd is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #x1FFF.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and external dtd is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #x1FFF.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v09.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v09.xml</pre>
   * Comment: <pre>The VersionNum of the document and external dtd is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xF901.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and external dtd is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xF901.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and external dtd is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xF901.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v10.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v10.xml</pre>
   * Comment: <pre>The VersionNum of the document and external entity is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xF6.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and external entity is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xF6.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and external entity is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xF6.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v11.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v11.xml</pre>
   * Comment: <pre>The VersionNum of the document and external entity is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #x1FFF.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and external entity is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #x1FFF.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and external entity is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #x1FFF.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v12.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v12.xml</pre>
   * Comment: <pre>The VersionNum of the document and external entity is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xF901.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and external entity is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xF901.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and external entity is 1.1 and both contain the          valid XML1.1 but invalid XML1.0 character #xF901.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v13.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v13.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 but the external dtd does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #xF8.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 but the external dtd does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #xF8.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 but the external dtd does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #xF8.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v14.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v14.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 but the external dtd does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #x1FFF.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 but the external dtd does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #x1FFF.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 but the external dtd does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #x1FFF.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v15.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v15.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 but the external dtd does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #xF901.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 but the external dtd does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #xF901.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 but the external dtd does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #xF901.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v16.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v16.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 but the external entity does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #x2FF.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 but the external entity does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #x2FF.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 but the external entity does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #x2FF.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v17.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v17.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 but the external entity does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #x1FFF.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v17xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v17.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 but the external entity does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #x1FFF.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 but the external entity does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #x1FFF.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v18.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v18.xml</pre>
   * Comment: <pre>The VersionNum of the document entity is 1.1 but the external entity does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #xF901.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v18xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v18.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document entity is 1.1 but the external entity does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #xF901.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document entity is 1.1 but the external entity does not          contain a textDecl and both contain the valid XML1.1 but invalid XML1.0 character          #xF901.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v19.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v19.xml</pre>
   * Comment: <pre>The VersionNum of the document and external dtd is 1.1.  The replacement          text of an entity declared in the external DTD contains a reference to the          character #x7F.  This entity is not referenced in the document entity.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v19xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v19.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and external dtd is 1.1.  The replacement          text of an entity declared in the external DTD contains a reference to the          character #x7F.  This entity is not referenced in the document entity.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and external dtd is 1.1.  The replacement          text of an entity declared in the external DTD contains a reference to the          character #x7F.  This entity is not referenced in the document entity.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v20.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v20.xml</pre>
   * Comment: <pre>The VersionNum of the document and external dtd is 1.1.  The replacement          text of an entity declared in the external DTD contains a reference to the          character #x80.  This entity is not referenced in the document entity.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v20xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v20.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and external dtd is 1.1.  The replacement          text of an entity declared in the external DTD contains a reference to the          character #x80.  This entity is not referenced in the document entity.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and external dtd is 1.1.  The replacement          text of an entity declared in the external DTD contains a reference to the          character #x80.  This entity is not referenced in the document entity.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v21.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v21.xml</pre>
   * Comment: <pre>The VersionNum of the document and external dtd is 1.1.  The replacement          text of an entity declared in the external DTD contains a reference to the          character #x9F.  This entity is not referenced in the document entity.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v21xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v21.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and external dtd is 1.1.  The replacement          text of an entity declared in the external DTD contains a reference to the          character #x9F.  This entity is not referenced in the document entity.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and external dtd is 1.1.  The replacement          text of an entity declared in the external DTD contains a reference to the          character #x9F.  This entity is not referenced in the document entity.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v22.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v22.xml</pre>
   * Comment: <pre>The VersionNum of the document and the external entity is 1.1.  The entity contains          a reference to the character #x7F.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v22xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v22.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and the external entity is 1.1.  The entity contains          a reference to the character #x7F.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and the external entity is 1.1.  The entity contains          a reference to the character #x7F.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v23.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v23.xml</pre>
   * Comment: <pre>The VersionNum of the document and the external entity is 1.1.  The entity contains          a reference to the character #x80.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v23xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v23.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and the external entity is 1.1.  The entity contains          a reference to the character #x80.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and the external entity is 1.1.  The entity contains          a reference to the character #x80.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v24.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v24.xml</pre>
   * Comment: <pre>The VersionNum of the document and the external entity is 1.1.  The entity contains          a reference to the character #x9F.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v24xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v24.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document and the external entity is 1.1.  The entity contains          a reference to the character #x9F.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document and the external entity is 1.1.  The entity contains          a reference to the character #x9F.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v25.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v25.xml</pre>
   * Comment: <pre>The VersionNum of the document is 1.1 and the textDecl is missing in the external          DTD.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x7F, #x8F.  This entity is not referenced in the          document entity.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v25xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v25.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document is 1.1 and the textDecl is missing in the external          DTD.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x7F, #x8F.  This entity is not referenced in the          document entity.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document is 1.1 and the textDecl is missing in the external          DTD.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x7F, #x8F.  This entity is not referenced in the          document entity.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v26.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v26.xml</pre>
   * Comment: <pre>The VersionNum of the document is 1.1 and the textDecl is missing in the external          DTD.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x80, #x90.  This entity is not referenced in the          document entity.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v26xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v26.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document is 1.1 and the textDecl is missing in the external          DTD.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x80, #x90.  This entity is not referenced in the          document entity.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document is 1.1 and the textDecl is missing in the external          DTD.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x80, #x90.  This entity is not referenced in the          document entity.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v27.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v27.xml</pre>
   * Comment: <pre>The VersionNum of the document is 1.1 and the textDecl is missing in the external          DTD.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x81, #x9F.  This entity is not referenced in the          document entity.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v27xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v27.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document is 1.1 and the textDecl is missing in the external          DTD.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x81, #x9F.  This entity is not referenced in the          document entity.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document is 1.1 and the textDecl is missing in the external          DTD.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x81, #x9F.  This entity is not referenced in the          document entity.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v28.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v28.xml</pre>
   * Comment: <pre>The VersionNum of the document is 1.1 and the textDecl is missing in the external          entity.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x7F, #x80, #x9F.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v28xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v28.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document is 1.1 and the textDecl is missing in the external          entity.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x7F, #x80, #x9F.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document is 1.1 and the textDecl is missing in the external          entity.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x7F, #x80, #x9F.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v29.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v29.xml</pre>
   * Comment: <pre>The VersionNum of the document is 1.1 and the textDecl is missing in the external          entity.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x85, #x8F.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v29xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v29.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document is 1.1 and the textDecl is missing in the external          entity.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x85, #x8F.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document is 1.1 and the textDecl is missing in the external          entity.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x85, #x8F.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-valid-P77-ibm77v30.xml</pre>
   * Test URI: <pre>valid/P77/ibm77v30.xml</pre>
   * Comment: <pre>The VersionNum of the document is 1.1 and the textDecl is missing in the external          entity.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x1, #x7F.</pre>
   * Sections: <pre>4.3.4</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test
  public void testibm_1_1_valid_P77_ibm77v30xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "valid/P77/ibm77v30.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      assertTrue("The VersionNum of the document is 1.1 and the textDecl is missing in the external          entity.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x1, #x7F.", true);
    }
    catch (XmlPullParserException ex) {
      fail("The VersionNum of the document is 1.1 and the textDecl is missing in the external          entity.  The replacement text of an entity declared in the external DTD contains a          reference to the character #x1, #x7F.");
    }
  }
        
    
    
}
    