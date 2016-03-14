package step15;

public class Calculator {
  protected int result;

  public void init(int val) {
    result = val;
  }

  public void plus(int val) {
    result += val;
  }

  public void minus(int val) {
    result -= val;
  }

  public void printResult() {
    System.out.println(result);
  }
}
