package designpattern.singleton;

public class CarFactory {
  
  private CarFactory() {
    super();
    // TODO Auto-generated constructor stub
  }
  
  static CarFactory instance;
  
  public static CarFactory newInstance() {
    if (instance == null)
      instance = new CarFactory();
    return instance;
  }

  public Car newCar(String name) {
    Car c = new Car();
    switch(name) {
    case "tico":
      c.model = "티코";
      c.cc = 800;
      return c;
    case "sonata":
      c.model = "소나타";
      c.cc = 1997;
      return c;
    default:
      return null;
    }
  }
}
