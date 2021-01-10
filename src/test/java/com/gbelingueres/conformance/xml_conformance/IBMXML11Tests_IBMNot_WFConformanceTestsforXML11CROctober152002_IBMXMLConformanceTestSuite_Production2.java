
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

public class IBMXML11Tests_IBMNot_WFConformanceTestsforXML11CROctober152002_IBMXMLConformanceTestSuite_Production2 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/xml-1.1/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n01.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n01.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x1.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x1.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n02.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n02.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x2.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x2.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n03.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n03.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x3.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x3.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n04.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n04.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x4.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x4.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n05.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n05.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x5.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x5.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n06.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n06.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x6.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x6.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n07.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n07.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x7.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x7.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n08.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n08.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x8.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x8.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n09.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n09.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x0.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n09xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n09.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x0.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n10.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n10.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x100.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n10xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n10.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x100.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n11.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n11.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x0B.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n11xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n11.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x0B.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n12.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n12.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x0C.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n12xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n12.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x0C.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n14.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n14.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x0E.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n14xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n14.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x0E.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n15.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n15.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x0F.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n15xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n15.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x0F.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n16.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n16.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x10.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n16xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n16.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x10.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n17.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n17.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x11.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n17xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n17.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x11.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n18.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n18.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x12.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n18xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n18.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x12.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n19.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n19.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x13.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n19xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n19.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x13.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n20.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n20.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x14.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n20xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n20.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x14.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n21.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n21.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x15.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n21xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n21.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x15.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n22.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n22.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x16.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n22xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n22.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x16.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n23.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n23.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x17.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n23xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n23.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x17.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n24.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n24.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x18.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n24xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n24.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x18.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n25.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n25.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x19.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n25xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n25.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x19.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n26.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n26.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x1A.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n26xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n26.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x1A.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n27.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n27.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x1B.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n27xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n27.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x1B.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n28.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n28.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x1C.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n28xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n28.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x1C.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n29.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n29.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x1D.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n29xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n29.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x1D.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n30.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n30.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x1E.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n30xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n30.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x1E.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n31.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n31.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x1F.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n31xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n31.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x1F.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n32.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n32.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x7F.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n32xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n32.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x7F.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n33.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n33.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x80.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n33xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n33.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x80.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n34.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n34.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x81.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n34xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n34.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x81.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n35.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n35.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x82.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n35xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n35.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x82.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n36.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n36.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x83.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n36xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n36.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x83.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n37.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n37.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x84.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n37xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n37.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x84.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n38.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n38.xml</pre>
   * Comment: <pre>This test contains embeded control characters  x82, x83 and x84.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n38xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n38.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control characters  x82, x83 and x84.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n39.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n39.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x86.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n39xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n39.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x86.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n40.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n40.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x87.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n40xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n40.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x87.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n41.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n41.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x88.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n41xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n41.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x88.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n42.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n42.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x89.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n42xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n42.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x89.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n43.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n43.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x8A.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n43xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n43.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x8A.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n44.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n44.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x8B.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n44xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n44.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x8B.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n45.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n45.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x8C.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n45xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n45.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x8C.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n46.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n46.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x8D.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n46xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n46.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x8D.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n47.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n47.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x8E.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n47xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n47.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x8E.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n48.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n48.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x8F.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n48xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n48.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x8F.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n49.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n49.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x90.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n49xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n49.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x90.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n50.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n50.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x91.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n50xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n50.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x91.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n51.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n51.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x92.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n51xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n51.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x92.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n52.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n52.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x93.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n52xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n52.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x93.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n53.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n53.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x94.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n53xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n53.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x94.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n54.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n54.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x95.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n54xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n54.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x95.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n55.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n55.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x96.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n55xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n55.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x96.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n56.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n56.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x97.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n56xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n56.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x97.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n57.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n57.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x98.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n57xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n57.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x98.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n58.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n58.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x99.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n58xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n58.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x99.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n59.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n59.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x9A.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n59xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n59.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x9A.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n60.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n60.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x9B.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n60xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n60.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x9B.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n61.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n61.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x9C.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n61xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n61.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x9C.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n62.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n62.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x9D.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n62xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n62.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x9D.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n63.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n63.xml</pre>
   * Comment: <pre>This test contains embeded control character 0x9E.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n63xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n63.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control character 0x9E.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n64.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n64.xml</pre>
   * Comment: <pre>This test contains embeded control characters present in an external entity.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n64xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n64.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control characters present in an external entity.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n65.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n65.xml</pre>
   * Comment: <pre>This test contains embeded control characters present in an external entity.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n65xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n65.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control characters present in an external entity.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n66.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n66.xml</pre>
   * Comment: <pre>This test contains embeded control characters present in an external entity.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n66xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n66.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded control characters present in an external entity.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n67.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n67.xml</pre>
   * Comment: <pre>This test contains embeded character 0xD800. (Invalid UTF8 sequence)</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n67xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n67.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded character 0xD800. (Invalid UTF8 sequence)");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n68.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n68.xml</pre>
   * Comment: <pre>This test contains embeded character 0xFFFE.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n68xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n68.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded character 0xFFFE.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n69.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n69.xml</pre>
   * Comment: <pre>This test contains embeded character 0xFFFF.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n69xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n69.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains embeded character 0xFFFF.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n70.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n70.xml</pre>
   * Comment: <pre>This test contains a reference to character 0xFFFE.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n70xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n70.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains a reference to character 0xFFFE.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-1-1-not-wf-P02-ibm02n71.xml</pre>
   * Test URI: <pre>not-wf/P02/ibm02n71.xml</pre>
   * Comment: <pre>This test contains a reference to character 0xFFFF.</pre>
   * Sections: <pre>2.2,4.1</pre>
   * Version: <pre>1.1</pre>
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_1_1_not_wf_P02_ibm02n71xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P02/ibm02n71.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("This test contains a reference to character 0xFFFF.");
    }
  }
        
    
    
}
    