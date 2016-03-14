package step16;

public class Exam02 /*extends Object*/ {
  @Override
  public String toString() {
    return "sadasd";
  }

  public static void main(String[] args) {
    Exam02 e = new Exam02();
    Exam02 e2 = new Exam02();
    System.out.println(e.toString());
    System.out.println(Integer.toHexString(e.hashCode()));
    System.out.println(e.getClass());
    System.out.println(e.equals(e2));
  }
}
