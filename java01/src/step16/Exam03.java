package step16;

public class Exam03 /*extends Object*/ {
  int age;
  int weight;

  public Exam03(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "sadasd";
  }

  public static void main(String[] args) {
    String s = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s == s2);
    System.out.println(s.equals(s2));

    System.out.println("----------------");

    Exam03 e = new Exam03(18, 90);
    Exam03 e2 = new Exam03(18, 90);
    System.out.println(e == e2);
    System.out.println(e.equals(e2));
  }
}
