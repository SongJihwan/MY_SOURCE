package step14.exam11;

public class C extends B {
  @Override
  public void m2() {
    System.out.println("C.m2()");
  }

  public void m4() {
    System.out.println("C.m4()");
  }

  public void test() {
    this.m3();
    this.m2();
    super.m2();
    super.m1();
    //super.super.m1();
    //super.m4();
    this.m4();
  }
}
