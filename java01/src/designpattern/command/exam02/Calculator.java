package designpattern.command.exam02;

public class Calculator {
  public void plus(int a, int b) {
    System.out.println(a + " + " +  b + " = "  + (a + b));
  }
  
  public void minus(int a, int b) {
    System.out.println(a + " - " +  b + " = "  + (a - b));
  }
  
  public void mul(int a, int b) {
    System.out.println(a + " * " +  b + " = "  + (a * b));
  }
}
