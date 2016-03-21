package step20.exam04;

public class Outer1 {
  static void m() {
    Outer1.no1 = 20;
    no1 = 10;
    // no2 = 30;
    //m2();
  }

  void m2() {

  }

  static int no1;
  int no2;

  static class Inner {
    public static void test1() {
      no1 = 100;
      m();
      System.out.println(no1);
      // no2 = 29;
    }

    public void test2() {
      no1 = 100;
      m();
      System.out.println(no1);
      // no2 = 29;
    }
  }
}
