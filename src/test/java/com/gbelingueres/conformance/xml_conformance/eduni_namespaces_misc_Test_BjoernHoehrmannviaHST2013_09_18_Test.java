
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
 * TESCASES PROFILE: <pre>Bjoern Hoehrmann via HST 2013-09-18</pre>
 * XML test files base folder: <pre>xmlconf/eduni/namespaces/misc/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class eduni_namespaces_misc_Test_BjoernHoehrmannviaHST2013_09_18_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/eduni/namespaces/misc/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>hst-bh-001</pre>
   * Test URI: <pre>001.xml</pre>
   * Comment: <pre>decimal charref &#38;#62; 10FFFF, indeed &#38;#62; max 32 bit integer, checking for recovery from possible overflow</pre>
   * Sections: <pre>2.2 [2], 4.1 [66]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testhst_bh_001() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "001.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("decimal charref > 10FFFF, indeed > max 32 bit integer, checking for recovery from possible overflow");
    }
  }
        
    
  /**
   * Test ID: <pre>hst-bh-002</pre>
   * Test URI: <pre>002.xml</pre>
   * Comment: <pre>hex charref &#38;#62; 10FFFF, indeed &#38;#62; max 32 bit integer, checking for recovery from possible overflow</pre>
   * Sections: <pre>2.2 [2], 4.1 [66]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testhst_bh_002() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "002.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("hex charref > 10FFFF, indeed > max 32 bit integer, checking for recovery from possible overflow");
    }
  }
        
    
  /**
   * Test ID: <pre>hst-bh-003</pre>
   * Test URI: <pre>003.xml</pre>
   * Comment: <pre>decimal charref &#38;#62; 10FFFF, indeed &#38;#62; max 64 bit integer, checking for recovery from possible overflow</pre>
   * Sections: <pre>2.2 [2], 4.1 [66]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testhst_bh_003() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "003.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("decimal charref > 10FFFF, indeed > max 64 bit integer, checking for recovery from possible overflow");
    }
  }
        
    
  /**
   * Test ID: <pre>hst-bh-004</pre>
   * Test URI: <pre>004.xml</pre>
   * Comment: <pre>hex charref &#38;#62; 10FFFF, indeed &#38;#62; max 64 bit integer, checking for recovery from possible overflow</pre>
   * Sections: <pre>2.2 [2], 4.1 [66]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testhst_bh_004() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "004.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("hex charref > 10FFFF, indeed > max 64 bit integer, checking for recovery from possible overflow");
    }
  }
        
    
  /**
   * Test ID: <pre>hst-bh-005</pre>
   * Test URI: <pre>005.xml</pre>
   * Comment: <pre>xmlns:xml is an attribute as far as validation is concerned and must be declared</pre>
   * Sections: <pre>3.1 [41]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testhst_bh_005() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "005.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("xmlns:xml is an attribute as far as validation is concerned and must be declared");
    }
  }
        
    
  /**
   * Test ID: <pre>hst-bh-006</pre>
   * Test URI: <pre>006.xml</pre>
   * Comment: <pre>xmlns:foo is an attribute as far as validation is concerned and must be declared</pre>
   * Sections: <pre>3.1 [41]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testhst_bh_006() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "006.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("xmlns:foo is an attribute as far as validation is concerned and must be declared");
    }
  }
        
    
  /**
   * Test ID: <pre>hst-lhs-007</pre>
   * Test URI: <pre>007.xml</pre>
   * Comment: <pre>UTF-8 BOM plus xml decl of iso-8859-1 incompatible</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testhst_lhs_007() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "007.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("UTF-8 BOM plus xml decl of iso-8859-1 incompatible");
    }
  }
        
    
  /**
   * Test ID: <pre>hst-lhs-008</pre>
   * Test URI: <pre>008.xml</pre>
   * Comment: <pre>UTF-16 BOM plus xml decl of utf-8 (using UTF-16 coding) incompatible</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testhst_lhs_008() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "008.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("UTF-16 BOM plus xml decl of utf-8 (using UTF-16 coding) incompatible");
    }
  }
        
    
  /**
   * Test ID: <pre>hst-lhs-009</pre>
   * Test URI: <pre>009.xml</pre>
   * Comment: <pre>UTF-16 BOM plus xml decl of utf-8 (using UTF-8 coding) incompatible</pre>
   * Sections: <pre>4.3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testhst_lhs_009() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "009.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("UTF-16 BOM plus xml decl of utf-8 (using UTF-8 coding) incompatible");
    }
  }
        
    
    
}
    