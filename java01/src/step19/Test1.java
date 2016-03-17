package step19;

public class Test1 {
  public static void main(String[] args) {
    Calculator1 calc = new Calculator1();
    calc.plus(10);
    calc.div(0);

    System.out.println("-------------------------");
    System.out.println(calc.result);
    System.out.println("-------------------------");
  }
}
