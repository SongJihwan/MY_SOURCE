package step32.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class Test01 {

  public static void main(String[] args) throws Exception {
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    System.out.println(dbf.getClass().getName());

    DocumentBuilder db = dbf.newDocumentBuilder();

    Document doc = db.parse(new File("./sample.xml"));

    NodeList bookList = doc.getElementsByTagName("book");

    for (int i = 0; i < bookList.getLength(); i++) {
      printBookInfo((Element) bookList.item(i));
    }
  }

  private static void printBookInfo(Element element) {
    Element title = (Element) element.getElementsByTagName("title").item(0);
    Element price = (Element) element.getElementsByTagName("price").item(0);
    
    System.out.println("-----------------------------------------------------");
    if (title != null) {
      Text titleText = (Text) title.getFirstChild();
      System.out.println("제목 : " + titleText.getWholeText());
    }
    if (price != null) {
      Text priceText = (Text) price.getFirstChild();
      System.out.println("가격 : " + priceText.getWholeText());
    }
  }

}
