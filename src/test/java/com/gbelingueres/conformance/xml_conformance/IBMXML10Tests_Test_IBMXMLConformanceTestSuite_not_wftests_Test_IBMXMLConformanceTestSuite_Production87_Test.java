
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
 * TESCASES PROFILE: <pre>IBM XML Conformance Test Suite - Production 87</pre>
 * XML test files base folder: <pre>xmlconf/ibm/</pre>
 * 
 * @author <a href="mailto:belingueres@gmail.com">Gabriel Belingueres</a>
 */
public class IBMXML10Tests_Test_IBMXMLConformanceTestSuite_not_wftests_Test_IBMXMLConformanceTestSuite_Production87_Test {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n01.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n01.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x02FF         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x02FF         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n02.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n02.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0346         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0346         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n03.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n03.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0362         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0362         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n04.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n04.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0487         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0487         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n05.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n05.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x05A2         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x05A2         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n06.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n06.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x05BA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x05BA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n07.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n07.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x05BE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x05BE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n08.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n08.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x05C0         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x05C0         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n09.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n09.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x05C3         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x05C3         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n10.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n10.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0653         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0653         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n11.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n11.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x06B8         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x06B8         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n12.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n12.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x06B9         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x06B9         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n13.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n13.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x06E9         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x06E9         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n14.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n14.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x06EE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x06EE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n15.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n15.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0904         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0904         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n16.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n16.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x093B         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x093B         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n17.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n17.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x094E         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n17xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n17.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x094E         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n18.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n18.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0955         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n18xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n18.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0955         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n19.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n19.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0964         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n19xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n19.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0964         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n20.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n20.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0984         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n20xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n20.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0984         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n21.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n21.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x09C5         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n21xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n21.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x09C5         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n22.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n22.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x09C9         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n22xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n22.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x09C9         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n23.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n23.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x09CE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n23xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n23.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x09CE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n24.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n24.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x09D8         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n24xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n24.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x09D8         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n25.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n25.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x09E4         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n25xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n25.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x09E4         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n26.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n26.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0A03         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n26xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n26.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0A03         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n27.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n27.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0A3D         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n27xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n27.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0A3D         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n28.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n28.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0A46         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n28xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n28.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0A46         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n29.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n29.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0A49         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n29xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n29.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0A49         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n30.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n30.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0A4E         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n30xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n30.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0A4E         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n31.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n31.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0A80         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n31xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n31.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0A80         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n32.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n32.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0A84         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n32xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n32.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0A84         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n33.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n33.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0ABB         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n33xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n33.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0ABB         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n34.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n34.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0AC6         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n34xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n34.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0AC6         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n35.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n35.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0ACA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n35xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n35.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0ACA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n36.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n36.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0ACE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n36xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n36.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0ACE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n37.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n37.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0B04         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n37xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n37.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0B04         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n38.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n38.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0B3B         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n38xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n38.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0B3B         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n39.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n39.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0B44         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n39xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n39.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0B44         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n40.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n40.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0B4A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n40xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n40.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0B4A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n41.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n41.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0B4E         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n41xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n41.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0B4E         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n42.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n42.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0B58         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n42xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n42.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0B58         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n43.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n43.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0B84         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n43xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n43.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0B84         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n44.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n44.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0BC3         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n44xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n44.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0BC3         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n45.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n45.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0BC9         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n45xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n45.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0BC9         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n46.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n46.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0BD6         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n46xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n46.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0BD6         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n47.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n47.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0C0D         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n47xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n47.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0C0D         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n48.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n48.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0C45         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n48xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n48.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0C45         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n49.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n49.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0C49         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n49xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n49.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0C49         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n50.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n50.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0C54         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n50xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n50.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0C54         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n51.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n51.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0C81         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n51xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n51.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0C81         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n52.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n52.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0C84         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n52xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n52.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0C84         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n53.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n53.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0CC5         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n53xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n53.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0CC5         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n54.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n54.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0CC9         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n54xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n54.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0CC9         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n55.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n55.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0CD4         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n55xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n55.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0CD4         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n56.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n56.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0CD7         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n56xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n56.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0CD7         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n57.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n57.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0D04         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n57xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n57.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0D04         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n58.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n58.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0D45         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n58xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n58.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0D45         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n59.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n59.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0D49         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n59xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n59.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0D49         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n60.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n60.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0D4E         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n60xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n60.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0D4E         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n61.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n61.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0D58         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n61xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n61.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0D58         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n62.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n62.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0E3F         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n62xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n62.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0E3F         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n63.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n63.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0E3B         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n63xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n63.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0E3B         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n64.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n64.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0E4F         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n64xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n64.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0E4F         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n66.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n66.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0EBA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n66xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n66.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0EBA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n67.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n67.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0EBE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n67xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n67.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0EBE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n68.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n68.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0ECE         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n68xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n68.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0ECE         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n69.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n69.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0F1A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n69xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n69.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0F1A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n70.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n70.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0F36         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n70xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n70.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0F36         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n71.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n71.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0F38         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n71xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n71.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0F38         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n72.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n72.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0F3B         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n72xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n72.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0F3B         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n73.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n73.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0F3A         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n73xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n73.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0F3A         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n74.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n74.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0F70         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n74xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n74.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0F70         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n75.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n75.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0F85         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n75xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n75.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0F85         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n76.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n76.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0F8C         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n76xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n76.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0F8C         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n77.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n77.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0F96         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n77xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n77.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0F96         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n78.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n78.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0F98         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n78xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n78.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0F98         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n79.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n79.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0FB0         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n79xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n79.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0FB0         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n80.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n80.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0FB8         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n80xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n80.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0FB8         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n81.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n81.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x0FBA         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n81xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n81.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x0FBA         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n82.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n82.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x20DD         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n82xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n82.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x20DD         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n83.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n83.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x20E2         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n83xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n83.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x20E2         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n84.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n84.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x3030         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n84xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n84.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x3030         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P87-ibm87n85.xml</pre>
   * Test URI: <pre>not-wf/P87/ibm87n85.xml</pre>
   * Comment: <pre>Tests CombiningChar with an illegal character. The character #x309B         occurs as the second character in the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P87_ibm87n85xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P87/ibm87n85.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests CombiningChar with an illegal character. The character #x309B         occurs as the second character in the PITarget in the PI in the DTD.");
    }
  }
        
    
    
}
    