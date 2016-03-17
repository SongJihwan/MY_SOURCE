package step19;

public class Test10 {
  static void m1() {
    m2();
  }

  static void m2() {
    m3();
  }

  static void m3() {
    throw new RuntimeException("sssssssssssssss");
  }

  public static void main(String[] args) {
    try {
      m1();
    } catch (RuntimeException e) {
      System.out.println("ddddddddddddd");
    }
  }
}
