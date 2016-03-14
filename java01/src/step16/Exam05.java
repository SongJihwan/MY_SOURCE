package step16;

public class Exam05 /*extends Object*/ {
  int age;
  int weight;

  public Exam05(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "sadasd";
  }

  @Override
  public boolean equals(Object other) {
    if ((other == null) || !(other instanceof Exam05)) { //other에 있는 instance가 Exam05에 있는 게 아니라면
      return false;
    }

    Exam05 obj = (Exam05)other;

    if (this.age != obj.age) {
      return false;
    }

    if (this.weight != obj.weight) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    StringBuffer buf = new StringBuffer();
    buf.append(Integer.toString(this.age));
    buf.append(",");
    buf.append(Integer.toString(this.weight));

    return buf.toString().hashCode();
  }

  public static void main(String[] args) {
    String s = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s == s2);
    System.out.println(s.equals(s2));
    System.out.println(Integer.toHexString(s.hashCode()) + " " + Integer.toHexString(s2.hashCode()));

    System.out.println("----------------");
    Exam05 e = new Exam05(18, 90);
    Exam05 e2 = new Exam05(18, 90);
    System.out.println(e == e2);
    System.out.println(e.equals(e2));
    System.out.println(Integer.toHexString(e.hashCode()) + " " + Integer.toHexString(e2.hashCode()));
  }
}
