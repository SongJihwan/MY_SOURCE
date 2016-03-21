package step20.exam03;

public class Outer4 {
  static int no;

  void m(){
    class Inner {
      // public static void m() {
      //   System.out.println("m()");
      // }
      public void m2() {
        System.out.println("m2()");
      }
    }

    Inner p = new Inner();
    p.m2();
  }
}
