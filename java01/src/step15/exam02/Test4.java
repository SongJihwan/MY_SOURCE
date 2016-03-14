package step15.exam02;

public class Test4 {
  public static void main(String[] args) {
    Member s1 = new Student();
    s1.id = "hong";
    s1.pw = "1111";

    //((Student)s1).isWorking = true;

    s1.printInfo();
  }
}
