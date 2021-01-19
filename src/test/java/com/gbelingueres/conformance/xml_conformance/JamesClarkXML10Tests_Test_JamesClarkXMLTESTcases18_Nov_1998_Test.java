
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
 * TESCASES PROFILE: <pre>James Clark XMLTEST cases, 18-Nov-1998</pre>
 * XML test files base folder: <pre>xmlconf/xmltest/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class JamesClarkXML10Tests_Test_JamesClarkXMLTESTcases18_Nov_1998_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/xmltest/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>not-wf-sa-001</pre>
   * Test URI: <pre>not-wf/sa/001.xml</pre>
   * Comment: <pre>Attribute values must start with attribute names, not "?".</pre>
   * Sections: <pre>3.1 [41]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_001() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/001.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute values must start with attribute names, not \"?\".");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-002</pre>
   * Test URI: <pre>not-wf/sa/002.xml</pre>
   * Comment: <pre>Names may not start with "."; it's not a Letter.</pre>
   * Sections: <pre>2.3 [4]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_002() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/002.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Names may not start with \".\"; it's not a Letter.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-003</pre>
   * Test URI: <pre>not-wf/sa/003.xml</pre>
   * Comment: <pre>Processing Instruction target name is required.</pre>
   * Sections: <pre>2.6 [16]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_003() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/003.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Processing Instruction target name is required.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-004</pre>
   * Test URI: <pre>not-wf/sa/004.xml</pre>
   * Comment: <pre>SGML-ism:  processing instructions end in '?&#38;#62;' not '&#38;#62;'.</pre>
   * Sections: <pre>2.6 [16]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_004() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/004.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("SGML-ism:  processing instructions end in '?>' not '>'.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-005</pre>
   * Test URI: <pre>not-wf/sa/005.xml</pre>
   * Comment: <pre>Processing instructions end in '?&#38;#62;' not '?'.</pre>
   * Sections: <pre>2.6 [16]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_005() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/005.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Processing instructions end in '?>' not '?'.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-006</pre>
   * Test URI: <pre>not-wf/sa/006.xml</pre>
   * Comment: <pre>XML comments may not contain "--"</pre>
   * Sections: <pre>2.5 [16]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_006() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/006.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("XML comments may not contain \"--\"");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-007</pre>
   * Test URI: <pre>not-wf/sa/007.xml</pre>
   * Comment: <pre>General entity references have no whitespace after the     entity name and before the semicolon.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_007() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/007.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("General entity references have no whitespace after the     entity name and before the semicolon.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-008</pre>
   * Test URI: <pre>not-wf/sa/008.xml</pre>
   * Comment: <pre>Entity references must include names, which don't begin     with '.' (it's not a Letter or other name start character).</pre>
   * Sections: <pre>2.3 [5]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_008() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/008.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Entity references must include names, which don't begin     with '.' (it's not a Letter or other name start character).");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-009</pre>
   * Test URI: <pre>not-wf/sa/009.xml</pre>
   * Comment: <pre>Character references may have only decimal or numeric strings.</pre>
   * Sections: <pre>4.1 [66]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_009() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/009.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character references may have only decimal or numeric strings.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-010</pre>
   * Test URI: <pre>not-wf/sa/010.xml</pre>
   * Comment: <pre>Ampersand may only appear as part of a general entity reference.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_010() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/010.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Ampersand may only appear as part of a general entity reference.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-011</pre>
   * Test URI: <pre>not-wf/sa/011.xml</pre>
   * Comment: <pre>SGML-ism:  attribute values must be explicitly assigned a     value, it can't act as a boolean toggle.</pre>
   * Sections: <pre>3.1 [41]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_011() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/011.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("SGML-ism:  attribute values must be explicitly assigned a     value, it can't act as a boolean toggle.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-012</pre>
   * Test URI: <pre>not-wf/sa/012.xml</pre>
   * Comment: <pre>SGML-ism:  attribute values must be quoted in all cases.</pre>
   * Sections: <pre>2.3 [10]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_012() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/012.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("SGML-ism:  attribute values must be quoted in all cases.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-013</pre>
   * Test URI: <pre>not-wf/sa/013.xml</pre>
   * Comment: <pre>The quotes on both ends of an attribute value must match.</pre>
   * Sections: <pre>2.3 [10]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_013() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/013.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("The quotes on both ends of an attribute value must match.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-014</pre>
   * Test URI: <pre>not-wf/sa/014.xml</pre>
   * Comment: <pre>Attribute values may not contain literal '&#38;#60;' characters.</pre>
   * Sections: <pre>2.3 [10]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_014() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/014.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute values may not contain literal '<' characters.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-015</pre>
   * Test URI: <pre>not-wf/sa/015.xml</pre>
   * Comment: <pre>Attribute values need a value, not just an equals sign.</pre>
   * Sections: <pre>3.1 [41]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_015() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/015.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute values need a value, not just an equals sign.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-016</pre>
   * Test URI: <pre>not-wf/sa/016.xml</pre>
   * Comment: <pre>Attribute values need an associated name.</pre>
   * Sections: <pre>3.1 [41]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_016() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/016.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute values need an associated name.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-017</pre>
   * Test URI: <pre>not-wf/sa/017.xml</pre>
   * Comment: <pre>CDATA sections need a terminating ']]&#38;#62;'.</pre>
   * Sections: <pre>2.7 [18]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_017() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/017.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("CDATA sections need a terminating ']]>'.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-018</pre>
   * Test URI: <pre>not-wf/sa/018.xml</pre>
   * Comment: <pre>CDATA sections begin with a literal '&#38;#60;![CDATA[', no space.</pre>
   * Sections: <pre>2.7 [19]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_018() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/018.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("CDATA sections begin with a literal '<![CDATA[', no space.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-019</pre>
   * Test URI: <pre>not-wf/sa/019.xml</pre>
   * Comment: <pre>End tags may not be abbreviated as '&#38;#60;/&#38;#62;'.</pre>
   * Sections: <pre>3.1 [42]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_019() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/019.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("End tags may not be abbreviated as '</>'.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-020</pre>
   * Test URI: <pre>not-wf/sa/020.xml</pre>
   * Comment: <pre>Attribute values may not contain literal '&#38;'     characters except as part of an entity reference.</pre>
   * Sections: <pre>2.3 [10]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_020() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/020.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute values may not contain literal '&'     characters except as part of an entity reference.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-021</pre>
   * Test URI: <pre>not-wf/sa/021.xml</pre>
   * Comment: <pre>Attribute values may not contain literal '&#38;'     characters except as part of an entity reference.</pre>
   * Sections: <pre>2.3 [10]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_021() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/021.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute values may not contain literal '&'     characters except as part of an entity reference.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-022</pre>
   * Test URI: <pre>not-wf/sa/022.xml</pre>
   * Comment: <pre>Character references end with semicolons, always!</pre>
   * Sections: <pre>4.1 [66]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_022() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/022.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character references end with semicolons, always!");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-023</pre>
   * Test URI: <pre>not-wf/sa/023.xml</pre>
   * Comment: <pre>Digits are not valid name start characters.</pre>
   * Sections: <pre>2.3 [5]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_023() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/023.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Digits are not valid name start characters.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-024</pre>
   * Test URI: <pre>not-wf/sa/024.xml</pre>
   * Comment: <pre>Digits are not valid name start characters.</pre>
   * Sections: <pre>2.3 [5]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_024() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/024.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Digits are not valid name start characters.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-025</pre>
   * Test URI: <pre>not-wf/sa/025.xml</pre>
   * Comment: <pre>Text may not contain a literal ']]&#38;#62;' sequence.</pre>
   * Sections: <pre>2.4 [14]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_025() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/025.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Text may not contain a literal ']]>' sequence.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-026</pre>
   * Test URI: <pre>not-wf/sa/026.xml</pre>
   * Comment: <pre>Text may not contain a literal ']]&#38;#62;' sequence.</pre>
   * Sections: <pre>2.4 [14]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_026() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/026.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Text may not contain a literal ']]>' sequence.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-027</pre>
   * Test URI: <pre>not-wf/sa/027.xml</pre>
   * Comment: <pre>Comments must be terminated with "--&#38;#62;".</pre>
   * Sections: <pre>2.5 [15]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_027() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/027.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Comments must be terminated with \"-->\".");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-028</pre>
   * Test URI: <pre>not-wf/sa/028.xml</pre>
   * Comment: <pre>Processing instructions must end with '?&#38;#62;'.</pre>
   * Sections: <pre>2.6 [16]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_028() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/028.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Processing instructions must end with '?>'.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-029</pre>
   * Test URI: <pre>not-wf/sa/029.xml</pre>
   * Comment: <pre>Text may not contain a literal ']]&#38;#62;' sequence.</pre>
   * Sections: <pre>2.4 [14]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_029() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/029.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Text may not contain a literal ']]>' sequence.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-030</pre>
   * Test URI: <pre>not-wf/sa/030.xml</pre>
   * Comment: <pre>A form feed is not a legal XML character.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_030() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/030.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("A form feed is not a legal XML character.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-031</pre>
   * Test URI: <pre>not-wf/sa/031.xml</pre>
   * Comment: <pre>A form feed is not a legal XML character.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_031() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/031.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("A form feed is not a legal XML character.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-032</pre>
   * Test URI: <pre>not-wf/sa/032.xml</pre>
   * Comment: <pre>A form feed is not a legal XML character.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_032() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/032.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("A form feed is not a legal XML character.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-033</pre>
   * Test URI: <pre>not-wf/sa/033.xml</pre>
   * Comment: <pre>An ESC (octal 033) is not a legal XML character.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_033() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/033.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("An ESC (octal 033) is not a legal XML character.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-034</pre>
   * Test URI: <pre>not-wf/sa/034.xml</pre>
   * Comment: <pre>A form feed is not a legal XML character.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_034() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/034.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("A form feed is not a legal XML character.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-035</pre>
   * Test URI: <pre>not-wf/sa/035.xml</pre>
   * Comment: <pre>The '&#38;#60;' character is a markup delimiter and must     start an element, CDATA section, PI, or comment.</pre>
   * Sections: <pre>3.1 [43]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_035() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/035.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("The '<' character is a markup delimiter and must     start an element, CDATA section, PI, or comment.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-036</pre>
   * Test URI: <pre>not-wf/sa/036.xml</pre>
   * Comment: <pre>Text may not appear after the root element.</pre>
   * Sections: <pre>2.8 [27]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_036() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/036.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Text may not appear after the root element.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-037</pre>
   * Test URI: <pre>not-wf/sa/037.xml</pre>
   * Comment: <pre>Character references may not appear after the root element.</pre>
   * Sections: <pre>2.8 [27]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_037() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/037.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character references may not appear after the root element.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-038</pre>
   * Test URI: <pre>not-wf/sa/038.xml</pre>
   * Comment: <pre>Tests the "Unique Att Spec" WF constraint by providing     multiple values for an attribute.</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_038() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/038.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests the \"Unique Att Spec\" WF constraint by providing     multiple values for an attribute.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-039</pre>
   * Test URI: <pre>not-wf/sa/039.xml</pre>
   * Comment: <pre>Tests the Element Type Match WFC - end tag name must     match start tag name.</pre>
   * Sections: <pre>3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_039() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/039.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests the Element Type Match WFC - end tag name must     match start tag name.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-040</pre>
   * Test URI: <pre>not-wf/sa/040.xml</pre>
   * Comment: <pre>Provides two document elements.</pre>
   * Sections: <pre>2.8 [27]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_040() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/040.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Provides two document elements.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-041</pre>
   * Test URI: <pre>not-wf/sa/041.xml</pre>
   * Comment: <pre>Provides two document elements.</pre>
   * Sections: <pre>2.8 [27]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_041() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/041.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Provides two document elements.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-042</pre>
   * Test URI: <pre>not-wf/sa/042.xml</pre>
   * Comment: <pre>Invalid End Tag</pre>
   * Sections: <pre>3.1 [42]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_042() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/042.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid End Tag");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-043</pre>
   * Test URI: <pre>not-wf/sa/043.xml</pre>
   * Comment: <pre>Provides #PCDATA text after the document element.</pre>
   * Sections: <pre>2.8 [27]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_043() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/043.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Provides #PCDATA text after the document element.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-044</pre>
   * Test URI: <pre>not-wf/sa/044.xml</pre>
   * Comment: <pre>Provides two document elements.</pre>
   * Sections: <pre>2.8 [27]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_044() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/044.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Provides two document elements.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-045</pre>
   * Test URI: <pre>not-wf/sa/045.xml</pre>
   * Comment: <pre>Invalid Empty Element Tag</pre>
   * Sections: <pre>3.1 [44]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_045() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/045.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid Empty Element Tag");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-046</pre>
   * Test URI: <pre>not-wf/sa/046.xml</pre>
   * Comment: <pre>This start (or empty element) tag was not terminated correctly.</pre>
   * Sections: <pre>3.1 [40]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_046() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/046.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This start (or empty element) tag was not terminated correctly.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-047</pre>
   * Test URI: <pre>not-wf/sa/047.xml</pre>
   * Comment: <pre>Invalid empty element tag invalid whitespace</pre>
   * Sections: <pre>3.1 [44]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_047() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/047.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid empty element tag invalid whitespace");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-048</pre>
   * Test URI: <pre>not-wf/sa/048.xml</pre>
   * Comment: <pre>Provides a CDATA section after the root element.</pre>
   * Sections: <pre>2.8 [27]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_048() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/048.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Provides a CDATA section after the root element.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-049</pre>
   * Test URI: <pre>not-wf/sa/049.xml</pre>
   * Comment: <pre>Missing start tag</pre>
   * Sections: <pre>3.1 [40]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_049() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/049.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Missing start tag");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-050</pre>
   * Test URI: <pre>not-wf/sa/050.xml</pre>
   * Comment: <pre>Empty document, with no root element.</pre>
   * Sections: <pre>2.1 [1]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_050() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/050.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Empty document, with no root element.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-051</pre>
   * Test URI: <pre>not-wf/sa/051.xml</pre>
   * Comment: <pre>CDATA is invalid at top level of document.</pre>
   * Sections: <pre>2.7 [18]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_051() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/051.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("CDATA is invalid at top level of document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-052</pre>
   * Test URI: <pre>not-wf/sa/052.xml</pre>
   * Comment: <pre>Invalid character reference.</pre>
   * Sections: <pre>4.1 [66]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_052() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/052.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid character reference.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-053</pre>
   * Test URI: <pre>not-wf/sa/053.xml</pre>
   * Comment: <pre>End tag does not match start tag.</pre>
   * Sections: <pre>3.1 [42]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_053() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/053.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("End tag does not match start tag.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-054</pre>
   * Test URI: <pre>not-wf/sa/054.xml</pre>
   * Comment: <pre>PUBLIC requires two literals.</pre>
   * Sections: <pre>4.2.2 [75]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_054() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/054.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("PUBLIC requires two literals.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-055</pre>
   * Test URI: <pre>not-wf/sa/055.xml</pre>
   * Comment: <pre>Invalid Document Type Definition format.</pre>
   * Sections: <pre>2.8 [28]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_055() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/055.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid Document Type Definition format.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-056</pre>
   * Test URI: <pre>not-wf/sa/056.xml</pre>
   * Comment: <pre>Invalid Document Type Definition format - misplaced comment.</pre>
   * Sections: <pre>2.8 [28]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_056() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/056.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid Document Type Definition format - misplaced comment.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-057</pre>
   * Test URI: <pre>not-wf/sa/057.xml</pre>
   * Comment: <pre>This isn't SGML; comments can't exist in declarations.</pre>
   * Sections: <pre>3.2 [45]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_057() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/057.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This isn't SGML; comments can't exist in declarations.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-058</pre>
   * Test URI: <pre>not-wf/sa/058.xml</pre>
   * Comment: <pre>Invalid character , in ATTLIST enumeration</pre>
   * Sections: <pre>3.3.1 [54]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_058() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/058.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid character , in ATTLIST enumeration");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-059</pre>
   * Test URI: <pre>not-wf/sa/059.xml</pre>
   * Comment: <pre>String literal must be in quotes.</pre>
   * Sections: <pre>3.3.1 [59]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_059() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/059.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("String literal must be in quotes.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-060</pre>
   * Test URI: <pre>not-wf/sa/060.xml</pre>
   * Comment: <pre>Invalid type NAME defined in ATTLIST.</pre>
   * Sections: <pre>3.3.1 [56]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_060() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/060.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid type NAME defined in ATTLIST.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-061</pre>
   * Test URI: <pre>not-wf/sa/061.xml</pre>
   * Comment: <pre>External entity declarations require whitespace between public     and system IDs.</pre>
   * Sections: <pre>4.2.2 [75]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_061() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/061.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("External entity declarations require whitespace between public     and system IDs.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-062</pre>
   * Test URI: <pre>not-wf/sa/062.xml</pre>
   * Comment: <pre>Entity declarations need space after the entity name.</pre>
   * Sections: <pre>4.2 [71]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_062() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/062.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Entity declarations need space after the entity name.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-063</pre>
   * Test URI: <pre>not-wf/sa/063.xml</pre>
   * Comment: <pre>Conditional sections may only appear in the external     DTD subset.</pre>
   * Sections: <pre>2.8 [29]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_063() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/063.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Conditional sections may only appear in the external     DTD subset.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-064</pre>
   * Test URI: <pre>not-wf/sa/064.xml</pre>
   * Comment: <pre>Space is required between attribute type and default values     in &#38;#60;!ATTLIST...&#38;#62; declarations.</pre>
   * Sections: <pre>3.3 [53]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_064() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/064.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Space is required between attribute type and default values     in <!ATTLIST...> declarations.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-065</pre>
   * Test URI: <pre>not-wf/sa/065.xml</pre>
   * Comment: <pre>Space is required between attribute name and type     in &#38;#60;!ATTLIST...&#38;#62; declarations.</pre>
   * Sections: <pre>3.3 [53]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_065() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/065.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Space is required between attribute name and type     in <!ATTLIST...> declarations.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-066</pre>
   * Test URI: <pre>not-wf/sa/066.xml</pre>
   * Comment: <pre>Required whitespace is missing.</pre>
   * Sections: <pre>3.3 [52]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_066() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/066.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Required whitespace is missing.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-067</pre>
   * Test URI: <pre>not-wf/sa/067.xml</pre>
   * Comment: <pre>Space is required between attribute type and default values     in &#38;#60;!ATTLIST...&#38;#62; declarations.</pre>
   * Sections: <pre>3.3 [53]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_067() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/067.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Space is required between attribute type and default values     in <!ATTLIST...> declarations.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-068</pre>
   * Test URI: <pre>not-wf/sa/068.xml</pre>
   * Comment: <pre>Space is required between NOTATION keyword and list of     enumerated choices in &#38;#60;!ATTLIST...&#38;#62; declarations.</pre>
   * Sections: <pre>3.3.1 [58]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_068() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/068.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Space is required between NOTATION keyword and list of     enumerated choices in <!ATTLIST...> declarations.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-069</pre>
   * Test URI: <pre>not-wf/sa/069.xml</pre>
   * Comment: <pre>Space is required before an NDATA entity annotation.</pre>
   * Sections: <pre>4.2.2 [76]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_069() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/069.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Space is required before an NDATA entity annotation.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-070</pre>
   * Test URI: <pre>not-wf/sa/070.xml</pre>
   * Comment: <pre>XML comments may not contain "--"</pre>
   * Sections: <pre>2.5 [16]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_070() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/070.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("XML comments may not contain \"--\"");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-071</pre>
   * Test URI: <pre>not-wf/sa/071.xml</pre>
   * Comment: <pre>ENTITY can't reference itself directly or indirectly.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_071() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/071.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("ENTITY can't reference itself directly or indirectly.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-072</pre>
   * Test URI: <pre>not-wf/sa/072.xml</pre>
   * Comment: <pre>Undefined ENTITY foo.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_072() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/072.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Undefined ENTITY foo.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-073</pre>
   * Test URI: <pre>not-wf/sa/073.xml</pre>
   * Comment: <pre>Undefined ENTITY f.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_073() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/073.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Undefined ENTITY f.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-074</pre>
   * Test URI: <pre>not-wf/sa/074.xml</pre>
   * Comment: <pre>Internal general parsed entities are only well formed if     they match the "content" production.</pre>
   * Sections: <pre>4.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_074() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/074.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Internal general parsed entities are only well formed if     they match the \"content\" production.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-075</pre>
   * Test URI: <pre>not-wf/sa/075.xml</pre>
   * Comment: <pre>ENTITY can't reference itself directly or indirectly.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_075() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/075.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("ENTITY can't reference itself directly or indirectly.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-076</pre>
   * Test URI: <pre>not-wf/sa/076.xml</pre>
   * Comment: <pre>Undefined ENTITY foo.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_076() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/076.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Undefined ENTITY foo.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-077</pre>
   * Test URI: <pre>not-wf/sa/077.xml</pre>
   * Comment: <pre>Undefined ENTITY bar.</pre>
   * Sections: <pre>41. [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_077() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/077.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Undefined ENTITY bar.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-078</pre>
   * Test URI: <pre>not-wf/sa/078.xml</pre>
   * Comment: <pre>Undefined ENTITY foo.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_078() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/078.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Undefined ENTITY foo.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-079</pre>
   * Test URI: <pre>not-wf/sa/079.xml</pre>
   * Comment: <pre>ENTITY can't reference itself directly or indirectly.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_079() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/079.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("ENTITY can't reference itself directly or indirectly.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-080</pre>
   * Test URI: <pre>not-wf/sa/080.xml</pre>
   * Comment: <pre>ENTITY can't reference itself directly or indirectly.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_080() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/080.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("ENTITY can't reference itself directly or indirectly.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-081</pre>
   * Test URI: <pre>not-wf/sa/081.xml</pre>
   * Comment: <pre>This tests the No External Entity References WFC,     since the entity is referred to within an attribute.</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_081() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/081.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This tests the No External Entity References WFC,     since the entity is referred to within an attribute.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-082</pre>
   * Test URI: <pre>not-wf/sa/082.xml</pre>
   * Comment: <pre>This tests the No External Entity References WFC,     since the entity is referred to within an attribute.</pre>
   * Sections: <pre>3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_082() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/082.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This tests the No External Entity References WFC,     since the entity is referred to within an attribute.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-083</pre>
   * Test URI: <pre>not-wf/sa/083.xml</pre>
   * Comment: <pre>Undefined NOTATION n.</pre>
   * Sections: <pre>4.2.2 [76]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_083() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/083.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Undefined NOTATION n.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-084</pre>
   * Test URI: <pre>not-wf/sa/084.xml</pre>
   * Comment: <pre>Tests the Parsed Entity WFC by referring to an     unparsed entity.  (This precedes the error of not declaring     that entity's notation, which may be detected any time before     the DTD parsing is completed.)</pre>
   * Sections: <pre>4.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_084() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/084.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests the Parsed Entity WFC by referring to an     unparsed entity.  (This precedes the error of not declaring     that entity's notation, which may be detected any time before     the DTD parsing is completed.)");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-085</pre>
   * Test URI: <pre>not-wf/sa/085.xml</pre>
   * Comment: <pre>Public IDs may not contain "[".</pre>
   * Sections: <pre>2.3 [13]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_085() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/085.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Public IDs may not contain \"[\".");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-086</pre>
   * Test URI: <pre>not-wf/sa/086.xml</pre>
   * Comment: <pre>Public IDs may not contain "[".</pre>
   * Sections: <pre>2.3 [13]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_086() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/086.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Public IDs may not contain \"[\".");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-087</pre>
   * Test URI: <pre>not-wf/sa/087.xml</pre>
   * Comment: <pre>Public IDs may not contain "[".</pre>
   * Sections: <pre>2.3 [13]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_087() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/087.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Public IDs may not contain \"[\".");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-088</pre>
   * Test URI: <pre>not-wf/sa/088.xml</pre>
   * Comment: <pre>Attribute values are terminated by literal quote characters,     and any entity expansion is done afterwards.</pre>
   * Sections: <pre>2.3 [10]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_088() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/088.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attribute values are terminated by literal quote characters,     and any entity expansion is done afterwards.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-089</pre>
   * Test URI: <pre>not-wf/sa/089.xml</pre>
   * Comment: <pre>Parameter entities "are" always parsed; NDATA annotations     are not permitted.</pre>
   * Sections: <pre>4.2 [74]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_089() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/089.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Parameter entities \"are\" always parsed; NDATA annotations     are not permitted.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-090</pre>
   * Test URI: <pre>not-wf/sa/090.xml</pre>
   * Comment: <pre>Attributes may not contain a literal "&#38;#60;" character;     this one has one because of reference expansion.</pre>
   * Sections: <pre>2.3 [10]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_090() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/090.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Attributes may not contain a literal \"<\" character;     this one has one because of reference expansion.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-091</pre>
   * Test URI: <pre>not-wf/sa/091.xml</pre>
   * Comment: <pre>Parameter entities "are" always parsed; NDATA annotations     are not permitted.</pre>
   * Sections: <pre>4.2 [74]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_091() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/091.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Parameter entities \"are\" always parsed; NDATA annotations     are not permitted.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-092</pre>
   * Test URI: <pre>not-wf/sa/092.xml</pre>
   * Comment: <pre>The replacement text of this entity has an illegal reference,     because the character reference is expanded immediately.</pre>
   * Sections: <pre>4.5</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_092() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/092.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("The replacement text of this entity has an illegal reference,     because the character reference is expanded immediately.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-093</pre>
   * Test URI: <pre>not-wf/sa/093.xml</pre>
   * Comment: <pre>Hexadecimal character references may not use the uppercase 'X'.</pre>
   * Sections: <pre>4.1 [66]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_093() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/093.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Hexadecimal character references may not use the uppercase 'X'.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-094</pre>
   * Test URI: <pre>not-wf/sa/094.xml</pre>
   * Comment: <pre>Prolog VERSION must be lowercase.</pre>
   * Sections: <pre>2.8 [24]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_094() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/094.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Prolog VERSION must be lowercase.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-095</pre>
   * Test URI: <pre>not-wf/sa/095.xml</pre>
   * Comment: <pre>VersionInfo must come before EncodingDecl.</pre>
   * Sections: <pre>2.8 [23]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_095() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/095.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("VersionInfo must come before EncodingDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-096</pre>
   * Test URI: <pre>not-wf/sa/096.xml</pre>
   * Comment: <pre>Space is required before the standalone declaration.</pre>
   * Sections: <pre>2.9 [32]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_096() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/096.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Space is required before the standalone declaration.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-097</pre>
   * Test URI: <pre>not-wf/sa/097.xml</pre>
   * Comment: <pre>Both quotes surrounding VersionNum must be the same.</pre>
   * Sections: <pre>2.8 [24]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_097() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/097.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Both quotes surrounding VersionNum must be the same.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-098</pre>
   * Test URI: <pre>not-wf/sa/098.xml</pre>
   * Comment: <pre>Only one "version=..." string may appear in an XML declaration.</pre>
   * Sections: <pre>2.8 [23]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_098() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/098.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Only one \"version=...\" string may appear in an XML declaration.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-099</pre>
   * Test URI: <pre>not-wf/sa/099.xml</pre>
   * Comment: <pre>Only three pseudo-attributes are in the XML declaration,     and "valid=..." is not one of them.</pre>
   * Sections: <pre>2.8 [23]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_099() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/099.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Only three pseudo-attributes are in the XML declaration,     and \"valid=...\" is not one of them.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-100</pre>
   * Test URI: <pre>not-wf/sa/100.xml</pre>
   * Comment: <pre>Only "yes" and "no" are permitted as values of "standalone".</pre>
   * Sections: <pre>2.9 [32]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_100() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/100.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Only \"yes\" and \"no\" are permitted as values of \"standalone\".");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-101</pre>
   * Test URI: <pre>not-wf/sa/101.xml</pre>
   * Comment: <pre>Space is not permitted in an encoding name.</pre>
   * Sections: <pre>4.3.3 [81]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_101() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/101.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Space is not permitted in an encoding name.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-102</pre>
   * Test URI: <pre>not-wf/sa/102.xml</pre>
   * Comment: <pre>Provides an illegal XML version number; spaces are illegal.</pre>
   * Sections: <pre>2.8 [26]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_102() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/102.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Provides an illegal XML version number; spaces are illegal.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-103</pre>
   * Test URI: <pre>not-wf/sa/103.xml</pre>
   * Comment: <pre>End-tag required for element foo.</pre>
   * Sections: <pre>4.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_103() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/103.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("End-tag required for element foo.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-104</pre>
   * Test URI: <pre>not-wf/sa/104.xml</pre>
   * Comment: <pre>Internal general parsed entities are only well formed if     they match the "content" production.</pre>
   * Sections: <pre>4.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_104() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/104.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Internal general parsed entities are only well formed if     they match the \"content\" production.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-105</pre>
   * Test URI: <pre>not-wf/sa/105.xml</pre>
   * Comment: <pre>Invalid placement of CDATA section.</pre>
   * Sections: <pre>2.7 </pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_105() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/105.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid placement of CDATA section.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-106</pre>
   * Test URI: <pre>not-wf/sa/106.xml</pre>
   * Comment: <pre>Invalid placement of entity declaration.</pre>
   * Sections: <pre>4.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_106() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/106.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid placement of entity declaration.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-107</pre>
   * Test URI: <pre>not-wf/sa/107.xml</pre>
   * Comment: <pre>Invalid document type declaration.  CDATA alone is invalid.</pre>
   * Sections: <pre>2.8 [28]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_107() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/107.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid document type declaration.  CDATA alone is invalid.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-108</pre>
   * Test URI: <pre>not-wf/sa/108.xml</pre>
   * Comment: <pre>No space in '&#38;#60;![CDATA['.</pre>
   * Sections: <pre>2.7 [19]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_108() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/108.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("No space in '<![CDATA['.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-109</pre>
   * Test URI: <pre>not-wf/sa/109.xml</pre>
   * Comment: <pre>Tags invalid within EntityDecl.</pre>
   * Sections: <pre>4.2 [70]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_109() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/109.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tags invalid within EntityDecl.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-110</pre>
   * Test URI: <pre>not-wf/sa/110.xml</pre>
   * Comment: <pre>Entity reference must be in content of element.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_110() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/110.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Entity reference must be in content of element.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-111</pre>
   * Test URI: <pre>not-wf/sa/111.xml</pre>
   * Comment: <pre>Entiry reference must be in content of element not Start-tag.</pre>
   * Sections: <pre>3.1 [43]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_111() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/111.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Entiry reference must be in content of element not Start-tag.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-112</pre>
   * Test URI: <pre>not-wf/sa/112.xml</pre>
   * Comment: <pre>CDATA sections start '&#38;#60;![CDATA[', not '&#38;#60;!cdata['.</pre>
   * Sections: <pre>2.7 [19]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_112() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/112.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("CDATA sections start '<![CDATA[', not '<!cdata['.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-113</pre>
   * Test URI: <pre>not-wf/sa/113.xml</pre>
   * Comment: <pre>Parameter entity values must use valid reference syntax;     this reference is malformed.</pre>
   * Sections: <pre>2.3 [9]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_113() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/113.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Parameter entity values must use valid reference syntax;     this reference is malformed.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-114</pre>
   * Test URI: <pre>not-wf/sa/114.xml</pre>
   * Comment: <pre>General entity values must use valid reference syntax;     this reference is malformed.</pre>
   * Sections: <pre>2.3 [9]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_114() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/114.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("General entity values must use valid reference syntax;     this reference is malformed.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-115</pre>
   * Test URI: <pre>not-wf/sa/115.xml</pre>
   * Comment: <pre>The replacement text of this entity is an illegal character     reference, which must be rejected when it is parsed in the     context of an attribute value.</pre>
   * Sections: <pre>4.5</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_115() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/115.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("The replacement text of this entity is an illegal character     reference, which must be rejected when it is parsed in the     context of an attribute value.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-116</pre>
   * Test URI: <pre>not-wf/sa/116.xml</pre>
   * Comment: <pre>Internal general parsed entities are only well formed if     they match the "content" production.  This is a partial     character reference, not a full one.</pre>
   * Sections: <pre>4.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_116() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/116.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Internal general parsed entities are only well formed if     they match the \"content\" production.  This is a partial     character reference, not a full one.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-117</pre>
   * Test URI: <pre>not-wf/sa/117.xml</pre>
   * Comment: <pre>Internal general parsed entities are only well formed if     they match the "content" production.  This is a partial     character reference, not a full one.</pre>
   * Sections: <pre>4.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_117() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/117.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Internal general parsed entities are only well formed if     they match the \"content\" production.  This is a partial     character reference, not a full one.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-118</pre>
   * Test URI: <pre>not-wf/sa/118.xml</pre>
   * Comment: <pre>Entity reference expansion is not recursive.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_118() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/118.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Entity reference expansion is not recursive.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-119</pre>
   * Test URI: <pre>not-wf/sa/119.xml</pre>
   * Comment: <pre>Internal general parsed entities are only well formed if     they match the "content" production.  This is a partial     character reference, not a full one.</pre>
   * Sections: <pre>4.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_119() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/119.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Internal general parsed entities are only well formed if     they match the \"content\" production.  This is a partial     character reference, not a full one.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-120</pre>
   * Test URI: <pre>not-wf/sa/120.xml</pre>
   * Comment: <pre>Character references are expanded in the replacement text of     an internal entity, which is then parsed as usual.  Accordingly,     &#38; must be doubly quoted - encoded either as &#38;amp;     or as &#38;#38;#38;.</pre>
   * Sections: <pre>4.5</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_120() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/120.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character references are expanded in the replacement text of     an internal entity, which is then parsed as usual.  Accordingly,     & must be doubly quoted - encoded either as &amp;     or as &#38;#38;.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-121</pre>
   * Test URI: <pre>not-wf/sa/121.xml</pre>
   * Comment: <pre>A name of an ENTITY was started with an invalid character.</pre>
   * Sections: <pre>4.1 [68]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_121() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/121.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("A name of an ENTITY was started with an invalid character.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-122</pre>
   * Test URI: <pre>not-wf/sa/122.xml</pre>
   * Comment: <pre>Invalid syntax mixed connectors are used.</pre>
   * Sections: <pre>3.2.1 [47]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_122() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/122.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax mixed connectors are used.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-123</pre>
   * Test URI: <pre>not-wf/sa/123.xml</pre>
   * Comment: <pre>Invalid syntax mismatched parenthesis.</pre>
   * Sections: <pre>3.2.1 [48]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_123() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/123.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax mismatched parenthesis.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-124</pre>
   * Test URI: <pre>not-wf/sa/124.xml</pre>
   * Comment: <pre>Invalid format of Mixed-content declaration.</pre>
   * Sections: <pre>3.2.2 [51]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_124() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/124.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid format of Mixed-content declaration.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-125</pre>
   * Test URI: <pre>not-wf/sa/125.xml</pre>
   * Comment: <pre>Invalid syntax extra set of parenthesis not necessary.</pre>
   * Sections: <pre>3.2.2 [51]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_125() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/125.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax extra set of parenthesis not necessary.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-126</pre>
   * Test URI: <pre>not-wf/sa/126.xml</pre>
   * Comment: <pre>Invalid syntax Mixed-content must be defined as zero or more.</pre>
   * Sections: <pre>3.2.2 [51]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_126() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/126.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax Mixed-content must be defined as zero or more.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-127</pre>
   * Test URI: <pre>not-wf/sa/127.xml</pre>
   * Comment: <pre>Invalid syntax Mixed-content must be defined as zero or more.</pre>
   * Sections: <pre>3.2.2 [51]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_127() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/127.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax Mixed-content must be defined as zero or more.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-128</pre>
   * Test URI: <pre>not-wf/sa/128.xml</pre>
   * Comment: <pre>Invalid CDATA syntax.</pre>
   * Sections: <pre>2.7 [18]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_128() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/128.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid CDATA syntax.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-129</pre>
   * Test URI: <pre>not-wf/sa/129.xml</pre>
   * Comment: <pre>Invalid syntax for Element Type Declaration.</pre>
   * Sections: <pre>3.2 [45]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_129() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/129.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax for Element Type Declaration.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-130</pre>
   * Test URI: <pre>not-wf/sa/130.xml</pre>
   * Comment: <pre>Invalid syntax for Element Type Declaration.</pre>
   * Sections: <pre>3.2 [45]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_130() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/130.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax for Element Type Declaration.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-131</pre>
   * Test URI: <pre>not-wf/sa/131.xml</pre>
   * Comment: <pre>Invalid syntax for Element Type Declaration.</pre>
   * Sections: <pre>3.2 [45]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_131() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/131.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax for Element Type Declaration.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-132</pre>
   * Test URI: <pre>not-wf/sa/132.xml</pre>
   * Comment: <pre>Invalid syntax mixed connectors used.</pre>
   * Sections: <pre>3.2.1 [50]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_132() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/132.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax mixed connectors used.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-133</pre>
   * Test URI: <pre>not-wf/sa/133.xml</pre>
   * Comment: <pre>Illegal whitespace before optional character causes syntax error.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_133() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/133.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Illegal whitespace before optional character causes syntax error.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-134</pre>
   * Test URI: <pre>not-wf/sa/134.xml</pre>
   * Comment: <pre>Illegal whitespace before optional character causes syntax error.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_134() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/134.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Illegal whitespace before optional character causes syntax error.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-135</pre>
   * Test URI: <pre>not-wf/sa/135.xml</pre>
   * Comment: <pre>Invalid character used as connector.</pre>
   * Sections: <pre>3.2.1 [47]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_135() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/135.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid character used as connector.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-136</pre>
   * Test URI: <pre>not-wf/sa/136.xml</pre>
   * Comment: <pre>Tag omission is invalid in XML.</pre>
   * Sections: <pre>3.2 [45]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_136() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/136.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tag omission is invalid in XML.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-137</pre>
   * Test URI: <pre>not-wf/sa/137.xml</pre>
   * Comment: <pre>Space is required before a content model.</pre>
   * Sections: <pre>3.2 [45]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_137() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/137.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Space is required before a content model.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-138</pre>
   * Test URI: <pre>not-wf/sa/138.xml</pre>
   * Comment: <pre>Invalid syntax for content particle.</pre>
   * Sections: <pre>3.2.1 [48]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_138() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/138.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax for content particle.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-139</pre>
   * Test URI: <pre>not-wf/sa/139.xml</pre>
   * Comment: <pre>The element-content model should not be empty.</pre>
   * Sections: <pre>3.2.1 [46]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_139() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/139.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("The element-content model should not be empty.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-140</pre>
   * Test URI: <pre>not-wf/sa/140.xml</pre>
   * Comment: <pre>Character '&#38;#x309a;' is a CombiningChar, not a     Letter, and so may not begin a name.</pre>
   * Sections: <pre>2.3 [4]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_140() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/140.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character '&#x309a;' is a CombiningChar, not a     Letter, and so may not begin a name.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-141</pre>
   * Test URI: <pre>not-wf/sa/141.xml</pre>
   * Comment: <pre>Character #x0E5C is not legal in XML names.</pre>
   * Sections: <pre>2.3 [5]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_141() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/141.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character #x0E5C is not legal in XML names.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-142</pre>
   * Test URI: <pre>not-wf/sa/142.xml</pre>
   * Comment: <pre>Character #x0000 is not legal anywhere in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_142() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/142.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character #x0000 is not legal anywhere in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-143</pre>
   * Test URI: <pre>not-wf/sa/143.xml</pre>
   * Comment: <pre>Character #x001F is not legal anywhere in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_143() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/143.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character #x001F is not legal anywhere in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-144</pre>
   * Test URI: <pre>not-wf/sa/144.xml</pre>
   * Comment: <pre>Character #xFFFF is not legal anywhere in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_144() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/144.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character #xFFFF is not legal anywhere in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-145</pre>
   * Test URI: <pre>not-wf/sa/145.xml</pre>
   * Comment: <pre>Character #xD800 is not legal anywhere in an XML document.  (If it     appeared in a UTF-16 surrogate pair, it'd represent half of a UCS-4     character and so wouldn't really be in the document.)</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_145() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/145.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character #xD800 is not legal anywhere in an XML document.  (If it     appeared in a UTF-16 surrogate pair, it'd represent half of a UCS-4     character and so wouldn't really be in the document.)");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-146</pre>
   * Test URI: <pre>not-wf/sa/146.xml</pre>
   * Comment: <pre>Character references must also refer to legal XML characters;     #x00110000 is one more than the largest legal character.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_146() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/146.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character references must also refer to legal XML characters;     #x00110000 is one more than the largest legal character.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-147</pre>
   * Test URI: <pre>not-wf/sa/147.xml</pre>
   * Comment: <pre>XML Declaration may not be preceded by whitespace.</pre>
   * Sections: <pre>2.8 [22]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_147() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/147.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("XML Declaration may not be preceded by whitespace.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-148</pre>
   * Test URI: <pre>not-wf/sa/148.xml</pre>
   * Comment: <pre>XML Declaration may not be preceded by comments or whitespace.</pre>
   * Sections: <pre>2.8 [22]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_148() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/148.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("XML Declaration may not be preceded by comments or whitespace.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-149</pre>
   * Test URI: <pre>not-wf/sa/149.xml</pre>
   * Comment: <pre>XML Declaration may not be within a DTD.</pre>
   * Sections: <pre>2.8 [28]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_149() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/149.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("XML Declaration may not be within a DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-150</pre>
   * Test URI: <pre>not-wf/sa/150.xml</pre>
   * Comment: <pre>XML declarations may not be within element content.</pre>
   * Sections: <pre>3.1 [43]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_150() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/150.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("XML declarations may not be within element content.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-151</pre>
   * Test URI: <pre>not-wf/sa/151.xml</pre>
   * Comment: <pre>XML declarations may not follow document content.</pre>
   * Sections: <pre>2.8 [27]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_151() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/151.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("XML declarations may not follow document content.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-152</pre>
   * Test URI: <pre>not-wf/sa/152.xml</pre>
   * Comment: <pre>XML declarations must include the "version=..." string.</pre>
   * Sections: <pre>2.8 [22]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_152() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/152.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("XML declarations must include the \"version=...\" string.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-153</pre>
   * Test URI: <pre>not-wf/sa/153.xml</pre>
   * Comment: <pre>Text declarations may not begin internal parsed entities;     they may only appear at the beginning of external parsed     (parameter or general) entities.</pre>
   * Sections: <pre>4.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_153() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/153.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Text declarations may not begin internal parsed entities;     they may only appear at the beginning of external parsed     (parameter or general) entities.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-154</pre>
   * Test URI: <pre>not-wf/sa/154.xml</pre>
   * Comment: <pre>'&#38;#60;?XML ...?&#38;#62;' is neither an XML declaration     nor a legal processing instruction target name.</pre>
   * Sections: <pre>2.8 2.6 [23, 17]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_154() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/154.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("'<?XML ...?>' is neither an XML declaration     nor a legal processing instruction target name.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-155</pre>
   * Test URI: <pre>not-wf/sa/155.xml</pre>
   * Comment: <pre>'&#38;#60;?xmL ...?&#38;#62;' is neither an XML declaration     nor a legal processing instruction target name.</pre>
   * Sections: <pre>2.8 2.6 [23, 17]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_155() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/155.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("'<?xmL ...?>' is neither an XML declaration     nor a legal processing instruction target name.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-156</pre>
   * Test URI: <pre>not-wf/sa/156.xml</pre>
   * Comment: <pre>'&#38;#60;?xMl ...?&#38;#62;' is neither an XML declaration     nor a legal processing instruction target name.</pre>
   * Sections: <pre>2.8 2.6 [23, 17]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_156() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/156.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("'<?xMl ...?>' is neither an XML declaration     nor a legal processing instruction target name.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-157</pre>
   * Test URI: <pre>not-wf/sa/157.xml</pre>
   * Comment: <pre>'&#38;#60;?xmL ...?&#38;#62;' is not a legal processing instruction     target name.</pre>
   * Sections: <pre>2.6 [17]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_157() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/157.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("'<?xmL ...?>' is not a legal processing instruction     target name.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-158</pre>
   * Test URI: <pre>not-wf/sa/158.xml</pre>
   * Comment: <pre>SGML-ism:  "#NOTATION gif" can't have attributes.</pre>
   * Sections: <pre>3.3 [52]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_158() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/158.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("SGML-ism:  \"#NOTATION gif\" can't have attributes.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-159</pre>
   * Test URI: <pre>not-wf/sa/159.xml</pre>
   * Comment: <pre>Uses '&#38;' unquoted in an entity declaration,     which is illegal syntax for an entity reference.</pre>
   * Sections: <pre>2.3 [9]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_159() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/159.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Uses '&' unquoted in an entity declaration,     which is illegal syntax for an entity reference.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-160</pre>
   * Test URI: <pre>not-wf/sa/160.xml</pre>
   * Comment: <pre>Violates the PEs in Internal Subset WFC     by using a PE reference within a declaration.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_160() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/160.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Violates the PEs in Internal Subset WFC     by using a PE reference within a declaration.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-161</pre>
   * Test URI: <pre>not-wf/sa/161.xml</pre>
   * Comment: <pre>Violates the PEs in Internal Subset WFC     by using a PE reference within a declaration.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_161() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/161.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Violates the PEs in Internal Subset WFC     by using a PE reference within a declaration.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-162</pre>
   * Test URI: <pre>not-wf/sa/162.xml</pre>
   * Comment: <pre>Violates the PEs in Internal Subset WFC     by using a PE reference within a declaration.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_162() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/162.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Violates the PEs in Internal Subset WFC     by using a PE reference within a declaration.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-163</pre>
   * Test URI: <pre>not-wf/sa/163.xml</pre>
   * Comment: <pre>Invalid placement of Parameter entity reference.</pre>
   * Sections: <pre>4.1 [69]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_163() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/163.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid placement of Parameter entity reference.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-164</pre>
   * Test URI: <pre>not-wf/sa/164.xml</pre>
   * Comment: <pre>Invalid placement of Parameter entity reference.</pre>
   * Sections: <pre>4.1 [69]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_164() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/164.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid placement of Parameter entity reference.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-165</pre>
   * Test URI: <pre>not-wf/sa/165.xml</pre>
   * Comment: <pre>Parameter entity declarations must have a space before     the '%'.</pre>
   * Sections: <pre>4.2 [72]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_165() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/165.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Parameter entity declarations must have a space before     the '%'.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-166</pre>
   * Test URI: <pre>not-wf/sa/166.xml</pre>
   * Comment: <pre>Character FFFF is not legal anywhere in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_166() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/166.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character FFFF is not legal anywhere in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-167</pre>
   * Test URI: <pre>not-wf/sa/167.xml</pre>
   * Comment: <pre>Character FFFE is not legal anywhere in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_167() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/167.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character FFFE is not legal anywhere in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-168</pre>
   * Test URI: <pre>not-wf/sa/168.xml</pre>
   * Comment: <pre>An unpaired surrogate (D800) is not legal anywhere     in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_168() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/168.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("An unpaired surrogate (D800) is not legal anywhere     in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-169</pre>
   * Test URI: <pre>not-wf/sa/169.xml</pre>
   * Comment: <pre>An unpaired surrogate (DC00) is not legal anywhere     in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_169() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/169.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("An unpaired surrogate (DC00) is not legal anywhere     in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-170</pre>
   * Test URI: <pre>not-wf/sa/170.xml</pre>
   * Comment: <pre>Four byte UTF-8 encodings can encode UCS-4 characters     which are beyond the range of legal XML characters     (and can't be expressed in Unicode surrogate pairs).     This document holds such a character.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_170() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/170.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Four byte UTF-8 encodings can encode UCS-4 characters     which are beyond the range of legal XML characters     (and can't be expressed in Unicode surrogate pairs).     This document holds such a character.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-171</pre>
   * Test URI: <pre>not-wf/sa/171.xml</pre>
   * Comment: <pre>Character FFFF is not legal anywhere in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_171() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/171.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character FFFF is not legal anywhere in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-172</pre>
   * Test URI: <pre>not-wf/sa/172.xml</pre>
   * Comment: <pre>Character FFFF is not legal anywhere in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_172() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/172.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character FFFF is not legal anywhere in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-173</pre>
   * Test URI: <pre>not-wf/sa/173.xml</pre>
   * Comment: <pre>Character FFFF is not legal anywhere in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_173() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/173.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character FFFF is not legal anywhere in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-174</pre>
   * Test URI: <pre>not-wf/sa/174.xml</pre>
   * Comment: <pre>Character FFFF is not legal anywhere in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_174() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/174.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character FFFF is not legal anywhere in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-175</pre>
   * Test URI: <pre>not-wf/sa/175.xml</pre>
   * Comment: <pre>Character FFFF is not legal anywhere in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_175() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/175.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character FFFF is not legal anywhere in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-176</pre>
   * Test URI: <pre>not-wf/sa/176.xml</pre>
   * Comment: <pre>Start tags must have matching end tags.</pre>
   * Sections: <pre>3 [39]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_176() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/176.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Start tags must have matching end tags.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-177</pre>
   * Test URI: <pre>not-wf/sa/177.xml</pre>
   * Comment: <pre>Character FFFF is not legal anywhere in an XML document.</pre>
   * Sections: <pre>2.2 [2]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_177() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/177.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Character FFFF is not legal anywhere in an XML document.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-178</pre>
   * Test URI: <pre>not-wf/sa/178.xml</pre>
   * Comment: <pre>Invalid syntax matching double quote is missing.</pre>
   * Sections: <pre>3.1 [41]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_178() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/178.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax matching double quote is missing.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-179</pre>
   * Test URI: <pre>not-wf/sa/179.xml</pre>
   * Comment: <pre>Invalid syntax matching double quote is missing.</pre>
   * Sections: <pre>4.1 [66]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_179() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/179.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Invalid syntax matching double quote is missing.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-180</pre>
   * Test URI: <pre>not-wf/sa/180.xml</pre>
   * Comment: <pre>The Entity Declared WFC requires entities to be declared     before they are used in an attribute list declaration.</pre>
   * Sections: <pre>4.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_180() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/180.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("The Entity Declared WFC requires entities to be declared     before they are used in an attribute list declaration.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-181</pre>
   * Test URI: <pre>not-wf/sa/181.xml</pre>
   * Comment: <pre>Internal parsed entities must match the content     production to be well formed.</pre>
   * Sections: <pre>4.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_181() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/181.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Internal parsed entities must match the content     production to be well formed.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-182</pre>
   * Test URI: <pre>not-wf/sa/182.xml</pre>
   * Comment: <pre>Internal parsed entities must match the content     production to be well formed.</pre>
   * Sections: <pre>4.3.2</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_182() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/182.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Internal parsed entities must match the content     production to be well formed.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-183</pre>
   * Test URI: <pre>not-wf/sa/183.xml</pre>
   * Comment: <pre>Mixed content declarations may not include content particles.</pre>
   * Sections: <pre>3.2.2 [51]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_183() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/183.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Mixed content declarations may not include content particles.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-184</pre>
   * Test URI: <pre>not-wf/sa/184.xml</pre>
   * Comment: <pre>In mixed content models, element names must not be     parenthesized.</pre>
   * Sections: <pre>3.2.2 [51]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_184() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/184.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("In mixed content models, element names must not be     parenthesized.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-185</pre>
   * Test URI: <pre>not-wf/sa/185.xml</pre>
   * Comment: <pre>Tests the Entity Declared WFC.     Note:  a nonvalidating parser is permitted not to report     this WFC violation, since it would need to read an external     parameter entity to distinguish it from a violation of     the Standalone Declaration VC.</pre>
   * Sections: <pre>4.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_185() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/185.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests the Entity Declared WFC.     Note:  a nonvalidating parser is permitted not to report     this WFC violation, since it would need to read an external     parameter entity to distinguish it from a violation of     the Standalone Declaration VC.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-sa-186</pre>
   * Test URI: <pre>not-wf/sa/186.xml</pre>
   * Comment: <pre>Whitespace is required between attribute/value pairs.</pre>
   * Sections: <pre>3.1 [44]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_sa_186() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/sa/186.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Whitespace is required between attribute/value pairs.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-not-sa-001</pre>
   * Test URI: <pre>not-wf/not-sa/001.xml</pre>
   * Comment: <pre>Conditional sections must be properly terminated ("]&#38;#62;" used     instead of "]]&#38;#62;").</pre>
   * Sections: <pre>3.4 [62]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_not_sa_001() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/not-sa/001.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Conditional sections must be properly terminated (\"]>\" used     instead of \"]]>\").");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-not-sa-002</pre>
   * Test URI: <pre>not-wf/not-sa/002.xml</pre>
   * Comment: <pre>Processing instruction target names may not be "XML"      in any combination of cases.</pre>
   * Sections: <pre>2.6 [17]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_not_sa_002() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/not-sa/002.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Processing instruction target names may not be \"XML\"      in any combination of cases.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-not-sa-003</pre>
   * Test URI: <pre>not-wf/not-sa/003.xml</pre>
   * Comment: <pre>Conditional sections must be properly terminated ("]]&#38;#62;" omitted).</pre>
   * Sections: <pre>3.4 [62]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_not_sa_003() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/not-sa/003.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Conditional sections must be properly terminated (\"]]>\" omitted).");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-not-sa-004</pre>
   * Test URI: <pre>not-wf/not-sa/004.xml</pre>
   * Comment: <pre>Conditional sections must be properly terminated ("]]&#38;#62;" omitted).</pre>
   * Sections: <pre>3.4 [62]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_not_sa_004() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/not-sa/004.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Conditional sections must be properly terminated (\"]]>\" omitted).");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-not-sa-006</pre>
   * Test URI: <pre>not-wf/not-sa/006.xml</pre>
   * Comment: <pre>Conditional sections need a '[' after the INCLUDE or IGNORE.</pre>
   * Sections: <pre>3.4 [62]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_not_sa_006() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/not-sa/006.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Conditional sections need a '[' after the INCLUDE or IGNORE.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-not-sa-007</pre>
   * Test URI: <pre>not-wf/not-sa/007.xml</pre>
   * Comment: <pre>A &#38;#60;!DOCTYPE ...&#38;#62; declaration may not begin any external     entity; it's only found once, in the document entity.</pre>
   * Sections: <pre>4.3.2 [79]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_not_sa_007() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/not-sa/007.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("A <!DOCTYPE ...> declaration may not begin any external     entity; it's only found once, in the document entity.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-not-sa-008</pre>
   * Test URI: <pre>not-wf/not-sa/008.xml</pre>
   * Comment: <pre>In DTDs, the '%' character must be part of a parameter     entity reference.</pre>
   * Sections: <pre>4.1 [69]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_not_sa_008() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/not-sa/008.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("In DTDs, the '%' character must be part of a parameter     entity reference.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-not-sa-009</pre>
   * Test URI: <pre>not-wf/not-sa/009.xml</pre>
   * Comment: <pre>This test violates WFC:PE Between Declarations in Production 28a.       The last character of a markup declaration is not contained in the same      parameter-entity text replacement.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_not_sa_009() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/not-sa/009.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test violates WFC:PE Between Declarations in Production 28a.       The last character of a markup declaration is not contained in the same      parameter-entity text replacement.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-ext-sa-001</pre>
   * Test URI: <pre>not-wf/ext-sa/001.xml</pre>
   * Comment: <pre>Tests the No Recursion WFC by having an external general     entity be self-recursive.</pre>
   * Sections: <pre>4.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_ext_sa_001() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/ext-sa/001.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests the No Recursion WFC by having an external general     entity be self-recursive.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-ext-sa-002</pre>
   * Test URI: <pre>not-wf/ext-sa/002.xml</pre>
   * Comment: <pre>External entities have "text declarations", which do     not permit the "standalone=..." attribute that's allowed     in XML declarations.</pre>
   * Sections: <pre>4.3.1 4.3.2 [77, 78]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_ext_sa_002() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/ext-sa/002.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("External entities have \"text declarations\", which do     not permit the \"standalone=...\" attribute that's allowed     in XML declarations.");
    }
  }
        
    
  /**
   * Test ID: <pre>not-wf-ext-sa-003</pre>
   * Test URI: <pre>not-wf/ext-sa/003.xml</pre>
   * Comment: <pre>Only one text declaration is permitted; a second one     looks like an illegal processing instruction (target names     of "xml" in any case are not allowed).</pre>
   * Sections: <pre>2.6 [17]</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testnot_wf_ext_sa_003() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/ext-sa/003.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Only one text declaration is permitted; a second one     looks like an illegal processing instruction (target names     of \"xml\" in any case are not allowed).");
    }
  }
        
    
  /**
   * Test ID: <pre>invalid--002</pre>
   * Test URI: <pre>invalid/002.xml</pre>
   * Comment: <pre>Tests the "Proper Group/PE Nesting" validity constraint by     fragmenting a content model between two parameter entities.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testinvalid__002() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "invalid/002.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests the \"Proper Group/PE Nesting\" validity constraint by     fragmenting a content model between two parameter entities.");
    }
  }
        
    
  /**
   * Test ID: <pre>invalid--005</pre>
   * Test URI: <pre>invalid/005.xml</pre>
   * Comment: <pre>Tests the "Proper Declaration/PE Nesting" validity constraint by     fragmenting an element declaration between two parameter entities.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testinvalid__005() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "invalid/005.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests the \"Proper Declaration/PE Nesting\" validity constraint by     fragmenting an element declaration between two parameter entities.");
    }
  }
        
    
  /**
   * Test ID: <pre>invalid--006</pre>
   * Test URI: <pre>invalid/006.xml</pre>
   * Comment: <pre>Tests the "Proper Declaration/PE Nesting" validity constraint by     fragmenting an element declaration between two parameter entities.</pre>
   * Sections: <pre>2.8</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testinvalid__006() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "invalid/006.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests the \"Proper Declaration/PE Nesting\" validity constraint by     fragmenting an element declaration between two parameter entities.");
    }
  }
        
    
    
}
    