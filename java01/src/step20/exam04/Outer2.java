package step20.exam04;

public class Outer2 {
  static void m() {
  }

  void m2() {
    Outer1.no1 = 20;
    no1 = 10;
    no2 = 30;
    m2();
  }

  static int no1;
  int no2;

  class Inner {
    public void test2() {
      no1 = 100;
      m();
      System.out.println(no1);
      no2 = 29;
      System.out.println(no2);
    }
  }
}
