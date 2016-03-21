package step20.exam03;

public class Outer3 {
  static int no;

  void m(){
    System.out.println("m()");
  }
  class Inner {
    // public static void m() {
    //   System.out.println("m()");
    // }
    public void m2() {
      System.out.println("m2()");
    }
  }
}
