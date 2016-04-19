package designpattern.factorymethod.exam02;

public class Test01 {

  public static void main(String[] args) {
    CarFactory factory = new CarFactory();
    Car c1 = factory.createCar("tico");
    Car c2 = factory.createCar("sonata");
  }

}