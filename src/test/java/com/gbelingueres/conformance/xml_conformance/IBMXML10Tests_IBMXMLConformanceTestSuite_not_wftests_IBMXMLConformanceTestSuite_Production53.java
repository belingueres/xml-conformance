
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production53 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P53-ibm53n01.xml</pre>
   * Test URI: <pre>not-wf/P53/ibm53n01.xml</pre>
   * Comment: <pre>Tests AttDef with a required field missing. The DefaultDecl is missing     in the AttDef for the name "attr1" in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P53_ibm53n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P53/ibm53n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttDef with a required field missing. The DefaultDecl is missing     in the AttDef for the name \"attr1\" in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P53-ibm53n02.xml</pre>
   * Test URI: <pre>not-wf/P53/ibm53n02.xml</pre>
   * Comment: <pre>Tests AttDef with a required field missing. The white space is missing     between (abc|def) and "def" in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P53_ibm53n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P53/ibm53n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttDef with a required field missing. The white space is missing     between (abc|def) and \"def\" in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P53-ibm53n03.xml</pre>
   * Test URI: <pre>not-wf/P53/ibm53n03.xml</pre>
   * Comment: <pre>Tests AttDef with a required field missing. The AttType is missing      for "attr1" in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P53_ibm53n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P53/ibm53n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttDef with a required field missing. The AttType is missing      for \"attr1\" in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P53-ibm53n04.xml</pre>
   * Test URI: <pre>not-wf/P53/ibm53n04.xml</pre>
   * Comment: <pre>Tests AttDef with a required field missing. The white space is missing     between "attr1" and (abc|def) in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P53_ibm53n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P53/ibm53n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttDef with a required field missing. The white space is missing     between \"attr1\" and (abc|def) in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P53-ibm53n05.xml</pre>
   * Test URI: <pre>not-wf/P53/ibm53n05.xml</pre>
   * Comment: <pre>Tests AttDef with a required field missing. The Name is missing in the     AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P53_ibm53n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P53/ibm53n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttDef with a required field missing. The Name is missing in the     AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P53-ibm53n06.xml</pre>
   * Test URI: <pre>not-wf/P53/ibm53n06.xml</pre>
   * Comment: <pre>Tests AttDef with a required field missing. The white space before the     name "attr2" is missing in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P53_ibm53n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P53/ibm53n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttDef with a required field missing. The white space before the     name \"attr2\" is missing in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P53-ibm53n07.xml</pre>
   * Test URI: <pre>not-wf/P53/ibm53n07.xml</pre>
   * Comment: <pre>Tests AttDef with wrong field ordering. The Name "attr1" occurs after     the AttType in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P53_ibm53n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P53/ibm53n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttDef with wrong field ordering. The Name \"attr1\" occurs after     the AttType in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P53-ibm53n08.xml</pre>
   * Test URI: <pre>not-wf/P53/ibm53n08.xml</pre>
   * Comment: <pre>Tests AttDef with wrong field ordering. The Name "attr1" occurs after     the AttType and "default" occurs before the AttType in the AttDef in the      AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P53_ibm53n08xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P53/ibm53n08.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests AttDef with wrong field ordering. The Name \"attr1\" occurs after     the AttType and \"default\" occurs before the AttType in the AttDef in the      AttlistDecl in the DTD.");
    }
  }
        
    
    
}
    