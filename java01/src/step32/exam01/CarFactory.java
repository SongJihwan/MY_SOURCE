package step32.exam01;

public abstract class CarFactory {
  public CarFactory() {
    super();
    // TODO Auto-generated constructor stub
  }

  static CarFactory instance;
  
  public static CarFactory newInstance() throws Exception {
    String className = System.getProperty("CarFactory");
    Class<?> clazz = Class.forName(className);
    return (CarFactory)clazz.newInstance();
  }

  public abstract Car newCar(String name);
}
