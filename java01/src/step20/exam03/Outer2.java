package step20.exam03;

public class Outer2 {
  static int no;
  public static void m(){
    System.out.println("m()");
  }
  static class Inner {
    public static void m() {
      System.out.println("m()");
    }
    public void m2() {
      System.out.println("m2()");
    }
  }
}
