package step20.exam03;

public class Test4 {
  public static void main(String[] args) {
    Outer3 p = new Outer3();
    p.no = 20;
    p.m();
    Outer3.Inner p2 = p.new Inner();
    // p.Inner p2 = p.new Inner();
    p2.m2();
  }
}
