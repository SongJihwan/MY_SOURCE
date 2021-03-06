package designpattern.builder.exam02;

import java.util.HashMap;

public class CarFactoryBuilder {
  public CarFactory build(String blueprint) {
    String[] carinfos = blueprint.split(";");
    HashMap<String, Car> carMap = new HashMap<>();
    for (String carinfo : carinfos) {
      carMap.put(getKey(carinfo), generate(carinfo));
    }
    
    CarFactory factory = new CarFactory();
    factory.setCarMap(carMap);;
    return factory;
  }
  
  private String getKey(String carinfo) {
    return carinfo.split(",")[0];
  }
  
  private Car generate(String carinfo) {
    String[] values = carinfo.split(",");
    Car c = new Car();
    c.model = values[1];
    c.cc = Integer.parseInt(values[2]);
    
    return c;
  }
}
