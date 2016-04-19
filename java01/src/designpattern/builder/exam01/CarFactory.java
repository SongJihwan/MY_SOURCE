package designpattern.builder.exam01;

import java.util.HashMap;

public class CarFactory {
  HashMap<String, Car> carMap = new HashMap<>();

  public void setCarMap(HashMap<String, Car> carMap) {
    this.carMap = carMap;
  }
  
  public Car createCar(String name) {
    return carMap.get(name);
  }
}
