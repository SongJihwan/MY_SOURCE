package step14;

public class Calculator2 extends Calculator{
  public void remaind(int a) {
    this.result %= a;
  }

  protected int abs() {
    return (result < 0) ? -result : result;
  }

  int abs2() {
    return (result < 0) ? -result : result;
  }

  private int abs3() {
    return (result < 0) ? -result : result;
  }
}
