package designpattern.builder.exam02;

public class Test01 {

  public static void main(String[] args) {
    CarFactory factory = new CarFactoryBuilder().build("tico,티코2,900;sonata,소나타2,1999;equs,에쿠스골드,3500");
    
    Car c1 = factory.createCar("tico");
    System.out.println(c1);
    Car c2 = factory.createCar("sonata");
    System.out.println(c2);
    Car c3 = factory.createCar("equs");
    System.out.println(c3);
    
  }

}
