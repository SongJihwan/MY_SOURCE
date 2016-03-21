package step20.exam05;

public class Outer1 {
  static int v1;
  static void m1() {}
  int v2;
  void m2() {}

  // 1) top level inner class
  static class Inner1 {
    static void test() {
      v1 = 10;
      m1();
    }
  }

  // 2) member inner class
  class Inner2 {
    void test() {
      v1 = 20;
      m1();
      v2 = 30;
      m2();
    }
  }


  public void m() {
    // 3) local inner class
    class Inner3 {}

    // 4) annonymous inner class
    Object obj = new Object() {};
  }
}


// 1), 2) Outer1클래스 하나에서만 쓰려고 만듦
// 3), 4) m()에서만 쓰려고 만듦
// 2) 인스턴스 한번만 쓰려고
// 4) 인스턴스 메소드 한번만 쓰려고
