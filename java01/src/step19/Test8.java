package step19;

public class Test8 {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    // obj.m1();
    try {
      obj.m1();
      obj.m2();
    } catch (RuntimeException e) {
      System.out.println("m2()에서 오류발생");
    }
  }
}
