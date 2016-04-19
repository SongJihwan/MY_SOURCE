package step23.exam01;

public class Test {
  public static void main(String[] args) {
    String lang = System.getProperty("lang");
    String message = null;

    if ("en".equals(lang)) {
      message = new HelloEn().greet();
    } else if ("jp".equals(lang)) {
      message = new HelloJp().sayHello();
    } else {
      message = new Hello().greet();
    }

    System.out.println(message);
  }
}
