
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production85 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n01.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n01.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x00D7      occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x00D7      occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n02.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n02.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x00F7         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x00F7         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n03.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n03.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0132         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0132         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n04.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n04.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0133         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0133         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n05.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n05.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x013F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x013F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n06.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n06.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0140         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0140         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n07.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n07.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0149         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0149         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n08.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n08.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x017F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x017F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n09.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n09.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x01c4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x01c4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n10.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n10.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x01CC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x01CC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n100.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n100.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0BB6     occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n100xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n100.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0BB6     occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n101.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n101.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0BBA     occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n101xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n101.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0BBA     occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n102.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n102.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0C0D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n102xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n102.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0C0D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n103.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n103.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0C11         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n103xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n103.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0C11         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n104.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n104.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0C29         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n104xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n104.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0C29         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n105.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n105.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0C34         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n105xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n105.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0C34         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n106.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n106.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0C5F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n106xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n106.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0C5F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n107.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n107.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0C62         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n107xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n107.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0C62         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n108.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n108.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0C8D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n108xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n108.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0C8D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n109.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n109.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0C91         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n109xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n109.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0C91         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n11.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n11.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x01F1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x01F1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n110.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n110.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0CA9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n110xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n110.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0CA9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n111.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n111.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0CB4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n111xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n111.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0CB4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n112.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n112.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0CBA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n112xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n112.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0CBA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n113.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n113.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0CDF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n113xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n113.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0CDF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n114.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n114.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0CE2         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n114xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n114.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0CE2         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n115.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n115.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0D0D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n115xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n115.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0D0D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n116.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n116.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0D11         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n116xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n116.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0D11         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n117.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n117.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0D29         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n117xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n117.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0D29         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n118.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n118.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0D3A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n118xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n118.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0D3A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n119.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n119.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0D62         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n119xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n119.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0D62         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n12.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n12.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x01F3         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x01F3         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n120.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n120.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0E2F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n120xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n120.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0E2F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n121.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n121.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0E31         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n121xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n121.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0E31         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n122.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n122.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0E34         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n122xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n122.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0E34         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n123.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n123.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0E46         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n123xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n123.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0E46         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n124.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n124.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0E83         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n124xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n124.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0E83         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n125.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n125.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0E85         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n125xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n125.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0E85         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n126.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n126.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0E89         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n126xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n126.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0E89         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n127.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n127.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0E8B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n127xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n127.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0E8B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n128.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n128.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0E8E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n128xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n128.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0E8E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n129.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n129.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0E98         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n129xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n129.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0E98         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n13.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n13.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x01F6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n13xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n13.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x01F6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n130.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n130.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0EA0         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n130xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n130.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0EA0         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n131.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n131.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0EA4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n131xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n131.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0EA4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n132.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n132.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0EA6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n132xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n132.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0EA6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n133.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n133.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0EA8         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n133xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n133.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0EA8         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n134.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n134.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0EAC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n134xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n134.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0EAC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n135.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n135.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0EAF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n135xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n135.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0EAF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n136.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n136.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0EB1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n136xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n136.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0EB1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n137.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n137.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0EB4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n137xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n137.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0EB4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n138.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n138.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0EBE         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n138xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n138.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0EBE         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n139.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n139.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0EC5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n139xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n139.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0EC5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n14.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n14.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x01F9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x01F9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n140.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n140.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0F48         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n140xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n140.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0F48         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n141.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n141.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0F6A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n141xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n141.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0F6A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n142.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n142.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x10C6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n142xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n142.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x10C6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n143.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n143.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x10F7         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n143xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n143.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x10F7         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n144.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n144.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1011         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n144xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n144.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1011         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n145.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n145.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1104         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n145xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n145.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1104         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n146.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n146.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1108         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n146xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n146.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1108         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n147.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n147.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x110A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n147xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n147.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x110A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n148.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n148.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x110D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n148xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n148.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x110D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n149.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n149.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x113B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n149xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n149.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x113B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n15.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n15.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x01F9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x01F9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n150.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n150.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x113F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n150xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n150.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x113F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n151.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n151.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1141         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n151xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n151.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1141         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n152.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n152.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x114D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n152xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n152.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x114D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n153.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n153.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x114f         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n153xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n153.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x114f         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n154.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n154.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1151         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n154xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n154.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1151         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n155.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n155.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1156         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n155xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n155.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1156         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n156.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n156.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x115A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n156xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n156.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x115A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n157.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n157.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1162         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n157xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n157.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1162         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n158.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n158.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1164         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n158xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n158.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1164         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n159.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n159.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1166         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n159xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n159.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1166         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n16.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n16.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0230         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0230         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n160.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n160.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x116B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n160xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n160.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x116B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n161.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n161.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x116F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n161xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n161.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x116F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n162.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n162.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1174         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n162xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n162.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1174         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n163.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n163.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x119F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n163xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n163.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x119F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n164.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n164.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x11AC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n164xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n164.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x11AC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n165.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n165.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x11B6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n165xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n165.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x11B6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n166.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n166.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x11B9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n166xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n166.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x11B9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n167.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n167.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x11BB         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n167xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n167.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x11BB         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n168.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n168.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x11C3         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n168xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n168.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x11C3         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n169.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n169.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x11F1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n169xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n169.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x11F1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n17.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n17.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x02AF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n17xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n17.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x02AF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n170.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n170.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x11FA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n170xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n170.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x11FA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n171.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n171.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1E9C         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n171xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n171.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1E9C         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n172.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n172.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1EFA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n172xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n172.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1EFA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n173.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n173.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1F16         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n173xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n173.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1F16         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n174.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n174.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1F1E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n174xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n174.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1F1E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n175.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n175.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1F46         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n175xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n175.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1F46         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n176.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n176.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1F4F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n176xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n176.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1F4F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n177.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n177.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1F58         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n177xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n177.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1F58         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n178.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n178.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1F5A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n178xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n178.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1F5A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n179.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n179.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1F5C         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n179xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n179.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1F5C         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n18.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n18.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x02CF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n18xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n18.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x02CF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n180.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n180.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1F5E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n180xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n180.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1F5E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n181.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n181.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1F7E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n181xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n181.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1F7E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n182.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n182.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1FB5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n182xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n182.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1FB5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n183.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n183.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1FBD         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n183xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n183.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1FBD         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n184.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n184.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1FBF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n184xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n184.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1FBF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n185.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n185.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1FC5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n185xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n185.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1FC5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n186.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n186.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1FCD         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n186xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n186.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1FCD         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n187.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n187.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1FD5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n187xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n187.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1FD5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n188.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n188.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1FDC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n188xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n188.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1FDC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n189.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n189.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1FED         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n189xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n189.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1FED         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n19.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n19.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0387         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n19xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n19.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0387         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n190.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n190.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1FF5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n190xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n190.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1FF5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n191.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n191.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x1FFD         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n191xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n191.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x1FFD         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n192.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n192.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x2127         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n192xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n192.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x2127         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n193.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n193.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x212F         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n193xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n193.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x212F         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n194.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n194.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x2183         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n194xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n194.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x2183         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n195.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n195.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x3095         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n195xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n195.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x3095         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n196.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n196.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x30FB         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n196xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n196.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x30FB         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n197.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n197.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x312D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n197xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n197.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x312D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n198.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n198.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #xD7A4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n198xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n198.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #xD7A4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n20.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n20.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x038B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n20xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n20.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x038B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n21.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n21.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x03A2         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n21xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n21.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x03A2         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n22.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n22.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x03CF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n22xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n22.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x03CF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n23.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n23.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x03D7         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n23xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n23.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x03D7         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n24.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n24.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x03DD         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n24xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n24.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x03DD         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n25.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n25.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x03E1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n25xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n25.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x03E1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n26.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n26.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x03F4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n26xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n26.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x03F4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n27.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n27.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x040D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n27xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n27.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x040D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n28.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n28.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0450         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n28xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n28.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0450         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n29.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n29.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x045D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n29xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n29.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x045D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n30.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n30.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0482         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n30xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n30.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0482         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n31.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n31.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x04C5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n31xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n31.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x04C5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n32.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n32.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x04C6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n32xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n32.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x04C6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n33.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n33.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x04C9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n33xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n33.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x04C9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n34.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n34.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x04EC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n34xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n34.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x04EC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n35.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n35.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x04ED         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n35xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n35.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x04ED         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n36.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n36.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x04F6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n36xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n36.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x04F6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n37.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n37.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x04FA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n37xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n37.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x04FA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n38.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n38.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0557         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n38xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n38.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0557         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n39.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n39.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0558         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n39xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n39.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0558         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n40.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n40.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0587         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n40xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n40.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0587         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n41.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n41.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x05EB         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n41xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n41.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x05EB         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n42.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n42.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x05F3         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n42xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n42.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x05F3         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n43.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n43.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0620         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n43xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n43.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0620         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n44.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n44.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x063B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n44xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n44.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x063B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n45.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n45.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x064B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n45xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n45.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x064B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n46.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n46.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x06B8         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n46xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n46.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x06B8         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n47.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n47.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x06BF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n47xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n47.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x06BF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n48.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n48.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x06CF         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n48xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n48.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x06CF         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n49.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n49.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x06D4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n49xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n49.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x06D4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n50.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n50.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x06D6         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n50xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n50.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x06D6         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n51.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n51.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x06E7         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n51xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n51.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x06E7         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n52.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n52.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x093A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n52xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n52.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x093A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n53.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n53.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x093E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n53xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n53.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x093E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n54.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n54.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0962         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n54xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n54.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0962         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n55.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n55.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x098D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n55xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n55.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x098D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n56.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n56.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0991         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n56xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n56.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0991         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n57.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n57.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0992         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n57xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n57.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0992         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n58.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n58.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x09A9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n58xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n58.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x09A9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n59.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n59.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x09B1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n59xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n59.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x09B1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n60.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n60.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x09B5         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n60xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n60.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x09B5         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n61.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n61.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x09BA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n61xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n61.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x09BA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n62.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n62.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x09DE         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n62xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n62.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x09DE         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n63.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n63.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x09E2         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n63xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n63.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x09E2         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n64.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n64.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x09F2         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n64xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n64.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x09F2         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n65.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n65.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0A0B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n65xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n65.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0A0B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n66.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n66.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0A11         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n66xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n66.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0A11         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n67.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n67.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0A29         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n67xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n67.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0A29         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n68.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n68.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0A31         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n68xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n68.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0A31         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n69.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n69.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0A34         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n69xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n69.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0A34         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n70.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n70.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0A37         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n70xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n70.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0A37         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n71.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n71.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0A3A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n71xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n71.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0A3A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n72.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n72.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0A5D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n72xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n72.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0A5D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n73.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n73.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0A70         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n73xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n73.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0A70         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n74.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n74.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0A75         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n74xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n74.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0A75         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n75.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n75.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #xA84         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n75xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n75.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #xA84         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n76.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n76.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0ABC         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n76xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n76.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0ABC         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n77.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n77.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0A92         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n77xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n77.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0A92         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n78.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n78.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0AA9         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n78xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n78.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0AA9         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n79.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n79.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0AB1         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n79xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n79.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0AB1         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n80.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n80.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0AB4         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n80xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n80.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0AB4         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n81.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n81.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0ABA         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n81xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n81.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0ABA         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n82.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n82.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B04         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n82xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n82.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B04         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n83.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n83.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B0D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n83xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n83.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B0D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n84.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n84.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B11         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n84xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n84.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B11         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n85.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n85.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B29         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n85xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n85.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B29         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n86.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n86.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B31         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n86xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n86.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B31         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n87.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n87.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B34         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n87xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n87.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B34         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n88.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n88.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B3A         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n88xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n88.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B3A         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n89.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n89.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B3E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n89xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n89.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B3E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n90.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n90.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B5E         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n90xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n90.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B5E         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n91.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n91.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B62         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n91xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n91.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B62         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n92.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n92.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B8B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n92xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n92.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B8B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n93.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n93.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B91         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n93xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n93.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B91         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n94.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n94.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B98         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n94xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n94.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B98         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n95.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n95.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B9B         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n95xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n95.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B9B         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n96.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n96.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0B9D         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n96xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n96.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0B9D         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n97.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n97.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0BA0         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n97xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n97.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0BA0         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n98.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n98.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0BA7         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n98xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n98.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0BA7         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P85-ibm85n99.xml</pre>
   * Test URI: <pre>not-wf/P85/ibm85n99.xml</pre>
   * Comment: <pre>Tests BaseChar with an illegal character. The character #x0BAB         occurs as the first character of the PITarget in the PI in the DTD.</pre>
   * Sections: <pre>B.</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P85_ibm85n99xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P85/ibm85n99.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests BaseChar with an illegal character. The character #x0BAB         occurs as the first character of the PITarget in the PI in the DTD.");
    }
  }
        
    
    
}
    