package step32.sax;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.XMLReader;

public class Test01 {
  public static void main(String[] args) throws Exception {
    SAXParserFactory spf = SAXParserFactory.newInstance();
    System.out.println(spf.getClass().getName());
    spf.setNamespaceAware(true);
    SAXParser saxParser = spf.newSAXParser();
    XMLReader xmlReader = saxParser.getXMLReader();
    File f = new File("sample.xml");
    String path = f.getCanonicalPath();
    String fileURL = "file:";
    
    if (!path.startsWith("/")) 
      fileURL += "/";
    
    fileURL += path;
    System.out.println(fileURL);
    xmlReader.parse(fileURL);
    System.out.println("분석끝");
  }
}
