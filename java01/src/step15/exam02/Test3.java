package step15.exam02;

public class Test3 {
  public static void main(String[] args) {
    Member s1 = new Member();
    s1.id = "hong";
    s1.pw = "1111";

    // s1.isWorking = true;

    Student s2 = (Student)s1;
    s2.isWorking = true;
  }
}
