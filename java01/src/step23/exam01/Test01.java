package step23.exam01;

public class Test01 {
  public static void main(String[] args) {
    String lang = System.getProperty("lang");
    String message = null;

    if ("en".equals(lang)) {
      message = new HelloEn().greet();
    } else {
      message = new Hello().greet();
    }

    System.out.println(message);
  }
}
