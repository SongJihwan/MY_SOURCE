package step23.exam02;

public class Test {
  public static void main(String[] args) {
    String lang = System.getProperty("lang");

    Hello obj = null;
    if ("en".equals(lang)) {
      obj = new HelloEn();
    } else if ("jp".equals(lang)) {
      obj = new HelloJp();
    } else {
      obj = new HelloKo();
    }

    System.out.println(obj.greet());
  }
}
