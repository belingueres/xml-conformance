
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production50 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P50-ibm50n01.xml</pre>
   * Test URI: <pre>not-wf/P50/ibm50n01.xml</pre>
   * Comment: <pre>Tests seq with a required field missing. The two cps are missing in     the seq field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P50_ibm50n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P50/ibm50n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests seq with a required field missing. The two cps are missing in     the seq field in the fourth elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P50-ibm50n02.xml</pre>
   * Test URI: <pre>not-wf/P50/ibm50n02.xml</pre>
   * Comment: <pre>Tests seq with a required field missing. The third cp is missing in     the seq field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P50_ibm50n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P50/ibm50n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests seq with a required field missing. The third cp is missing in     the seq field in the fourth elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P50-ibm50n03.xml</pre>
   * Test URI: <pre>not-wf/P50/ibm50n03.xml</pre>
   * Comment: <pre>Tests seq with a wrong separator. The "|" is used as the separator      between a and b in the seq field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P50_ibm50n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P50/ibm50n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests seq with a wrong separator. The \"|\" is used as the separator      between a and b in the seq field in the fourth elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P50-ibm50n04.xml</pre>
   * Test URI: <pre>not-wf/P50/ibm50n04.xml</pre>
   * Comment: <pre>Tests seq with a wrong separator. The "." is used as the separator      between a and b in the seq field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P50_ibm50n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P50/ibm50n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests seq with a wrong separator. The \".\" is used as the separator      between a and b in the seq field in the fourth elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P50-ibm50n05.xml</pre>
   * Test URI: <pre>not-wf/P50/ibm50n05.xml</pre>
   * Comment: <pre>Tests seq with an extra separator. An extra "," occurs between (a|b)     and a in the seq field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P50_ibm50n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P50/ibm50n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests seq with an extra separator. An extra \",\" occurs between (a|b)     and a in the seq field in the fourth elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P50-ibm50n06.xml</pre>
   * Test URI: <pre>not-wf/P50/ibm50n06.xml</pre>
   * Comment: <pre>Tests seq with a required field missing. The separator between (a|b)      and (b|a) is missing in the seq field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P50_ibm50n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P50/ibm50n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests seq with a required field missing. The separator between (a|b)      and (b|a) is missing in the seq field in the fourth elementdecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P50-ibm50n07.xml</pre>
   * Test URI: <pre>not-wf/P50/ibm50n07.xml</pre>
   * Comment: <pre>Tests seq with wrong closing bracket. The "]" is used as the closing      bracket in the seq field in the fourth elementdecl in the DTD.</pre>
   * Sections: <pre>3.2.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P50_ibm50n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P50/ibm50n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests seq with wrong closing bracket. The \"]\" is used as the closing      bracket in the seq field in the fourth elementdecl in the DTD.");
    }
  }
        
    
    
}
    