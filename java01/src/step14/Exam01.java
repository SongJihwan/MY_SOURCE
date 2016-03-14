package step14;

public class Exam01 {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    // 2 * 3 - 7 % 3;
    calc.plus(2);
    calc.mul(3);
    calc.plus(7);
    System.out.println(calc.result);

    Calculator2 calc2 = new Calculator2();
    calc2.plus(2);
    calc2.mul(3);
    calc2.plus(7);
    calc2.remaind(3);
    System.out.println(calc2.result);
  }
}
