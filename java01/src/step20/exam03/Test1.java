package step20.exam03;

public class Test1 {
  public static void main(String[] args) {
    Outer2.no = 20;
    Outer2.m();
    Outer2.Inner.m();
  }
}
