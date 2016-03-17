package step19;

public class Test3 {
  public static void main(String[] args)  {
    Calculator1 calc = new Calculator1();
    calc.plus(10);

    try {
      calc.div(0);
      System.out.println("---------------------------------------------------");
      System.out.println(calc.result);
      System.out.println("---------------------------------------------------");
    } catch (ArithmeticException e) {
      System.out.println("나누기 오류 발생");
      System.out.println(e.getMessage());
      System.out.println("---------------------------------------------------");
      e.printStackTrace();
      System.out.println("---------------------------------------------------");
    }
  }
}
