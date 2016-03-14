package step16;

public class Exam06 /*extends Object*/ {
  int age;
  int weight;

  public Exam06(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "[" + this.age + ", " + this.weight + "]";
  }

  @Override
  public boolean equals(Object other) {
    if ((other == null) || !(other instanceof Exam06)) { //other에 있는 instance가 Exam06에 있는 게 아니라면
      return false;
    }

    Exam06 obj = (Exam06)other;

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
    Exam06 e = new Exam06(18, 90);
    // System.out.println(e.toString());
    System.out.println(e);
  }
}
