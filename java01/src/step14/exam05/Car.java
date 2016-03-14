package step14.exam05;

public abstract class Car {
  String model = 10;
  String maker;
  int cc;
  int capacity;

  public void printInfo() {
    System.out.println("모델 : " + model);
    System.out.println( "제조사 : " + maker);
    System.out.println("cc : " + cc + "cc");
    System.out.println("최대수용인원 : " + capacity + "명");
  }
}
