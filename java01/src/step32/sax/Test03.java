package step32.sax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class Test03 {
  static class BookHandler extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
      System.out.println("XML데이터 분석 시작...");
      super.startDocument();
    }
    
    @Override
    public void endDocument() throws SAXException {
      System.out.println("XML데이터 분석 종료...");
      super.endDocument();
    }
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//      System.out.println(uri + ", " + localName + ", " + qName + ", " + attributes);
      System.out.println("<" + localName + ">\n");
    }
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
      System.out.println("</" + localName + ">\n");
    }
    
  }
  
  public static void main(String[] args) throws Exception {
    SAXParserFactory spf = SAXParserFactory.newInstance();
    spf.setNamespaceAware(true);
    SAXParser saxParser = spf.newSAXParser();
    XMLReader xmlReader = saxParser.getXMLReader();
    xmlReader.setContentHandler(new BookHandler());
    xmlReader.parse(convertToFileURL("./sample.xml"));
  }

  private static String convertToFileURL(String filename) throws IOException {
    File f = new File(filename);
    String path = f.getCanonicalPath();
    String fileURL = "file:";
    
    if (!path.startsWith("/")) 
      fileURL += "/";
    
    fileURL += path;
    return fileURL;
  }
}
