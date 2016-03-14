package step16;

public class Exam01 /*extends Object*/ {
  public static void main(String[] args) {
    Exam01 e = new Exam01();
    Exam01 e2 = new Exam01();
    System.out.println(e.toString());
    System.out.println(Integer.toHexString(e.hashCode()));
    System.out.println(e.getClass());
    System.out.println(e.equals(e2));
  }
}
