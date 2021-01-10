
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

public class IBMXML10Tests_IBMXMLConformanceTestSuite_not_wftests_IBMXMLConformanceTestSuite_Production56 {

  final static File testResourcesDir = new File("src/test/resources/", "xmlconf/ibm/");

  MXParser parser;
  
  @Before
  public void setUp() {
    parser = new MXParser();
  }
    
  /**
   * Test ID: <pre>ibm-not-wf-P56-ibm56n01.xml</pre>
   * Test URI: <pre>not-wf/P56/ibm56n01.xml</pre>
   * Comment: <pre>Tests TokenizedType with wrong key word. The type "id" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P56_ibm56n01xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P56/ibm56n01.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests TokenizedType with wrong key word. The type \"id\" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P56-ibm56n02.xml</pre>
   * Test URI: <pre>not-wf/P56/ibm56n02.xml</pre>
   * Comment: <pre>Tests TokenizedType with wrong key word. The type "Idref" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P56_ibm56n02xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P56/ibm56n02.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests TokenizedType with wrong key word. The type \"Idref\" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P56-ibm56n03.xml</pre>
   * Test URI: <pre>not-wf/P56/ibm56n03.xml</pre>
   * Comment: <pre>Tests TokenizedType with wrong key word. The type"Idrefs" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P56_ibm56n03xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P56/ibm56n03.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests TokenizedType with wrong key word. The type\"Idrefs\" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P56-ibm56n04.xml</pre>
   * Test URI: <pre>not-wf/P56/ibm56n04.xml</pre>
   * Comment: <pre>Tests TokenizedType with wrong key word. The type "EntitY" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P56_ibm56n04xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P56/ibm56n04.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests TokenizedType with wrong key word. The type \"EntitY\" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P56-ibm56n05.xml</pre>
   * Test URI: <pre>not-wf/P56/ibm56n05.xml</pre>
   * Comment: <pre>Tests TokenizedType with wrong key word. The type "nmTOKEN" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P56_ibm56n05xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P56/ibm56n05.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests TokenizedType with wrong key word. The type \"nmTOKEN\" is used in      the TokenizedType in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P56-ibm56n06.xml</pre>
   * Test URI: <pre>not-wf/P56/ibm56n06.xml</pre>
   * Comment: <pre>Tests TokenizedType with wrong key word. The type "NMtokens" is used in     the TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P56_ibm56n06xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P56/ibm56n06.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests TokenizedType with wrong key word. The type \"NMtokens\" is used in     the TokenizedType in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
  /**
   * Test ID: <pre>ibm-not-wf-P56-ibm56n07.xml</pre>
   * Test URI: <pre>not-wf/P56/ibm56n07.xml</pre>
   * Comment: <pre>Tests TokenizedType with wrong key word. The type "#ID" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.</pre>
   * Sections: <pre>3.3.1</pre>
   * Version: 
   *
   * @throws XmlPullParserException if there is a problem parsing the XML file
   * @throws FileNotFoundException if the testing XML file is not found
   * @throws IOException if there is an I/O error
   */
   
  @Test(expected=XmlPullParserException.class)
  public void testibm_not_wf_P56_ibm56n07xml() throws FileNotFoundException, IOException, XmlPullParserException {
    try(Reader reader = new FileReader(new File(testResourcesDir, "not-wf/P56/ibm56n07.xml"))) {
      parser.setInput(reader);
      while (parser.nextToken() != XmlPullParser.END_DOCUMENT);
      fail("Tests TokenizedType with wrong key word. The type \"#ID\" is used in the     TokenizedType in the AttDef in the AttlistDecl in the DTD.");
    }
  }
        
    
    
}
    