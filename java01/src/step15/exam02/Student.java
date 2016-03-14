package step15.exam02;

public class Student extends Member {
  boolean isWorking;

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("재직여부 : " + ((isWorking) ? "예" : "아니오"));
  }
}
