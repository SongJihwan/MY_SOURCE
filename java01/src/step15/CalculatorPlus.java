package step15;

public class CalculatorPlus extends Calculator {

  public void mul(int val) {
    result *= val;
  }

  public void div(int val) {
    result /= val;
  }

  public void rem(int val) {
    result %= val;
  }
}
