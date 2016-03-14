package step16;

public class Exam04 /*extends Object*/ {
  int age;
  int weight;

  public Exam04(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "sadasd";
  }

  @Override
  public boolean equals(Object other) {
    if ((other == null) || !(other instanceof Exam04)) { //other에 있는 instance가 Exam04에 있는 게 아니라면
      return false;
    }

    Exam04 obj = (Exam04)other;

    if (this.age != obj.age) {
      return false;
    }

    if (this.weight != obj.weight) {
      return false;
    }

    return true;
  }

  public static void main(String[] args) {
    Exam04 e = new Exam04(18, 90);
    Exam04 e2 = new Exam04(18, 90);
    System.out.println(e == e2);
    System.out.println(e.equals(e2));
  }
}
