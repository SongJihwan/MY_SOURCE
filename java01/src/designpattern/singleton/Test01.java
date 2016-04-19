package designpattern.singleton;

public class Test01 {

  public static void main(String[] args) {
    CarFactory factory = CarFactory.newInstance();
    CarFactory factory2 = CarFactory.newInstance();
    CarFactory factory3 = CarFactory.newInstance();
    
    if (factory == factory2 || factory2 == factory3)
      System.out.println("factory, factory2, factory3는 같은 인스턴스이다.");
    
    Car c1 = factory.newCar("tico");
    Car c2 = factory.newCar("sonata");
  }

}
