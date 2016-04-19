package step24.exam05;

public class Test implements A, B {
  public void m1() {
    System.out.println(WOMAN);
    System.out.println(A.MAN);
    System.out.println(B.MAN);
    System.out.println("m1()..");
  }

  public static void main(String[] args) {
    Test p = new Test();
    p.m1();
  }
}
