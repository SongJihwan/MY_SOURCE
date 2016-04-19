package step25;

public class Member2 {
  public static int count = 0;

  String name;

  public Member2() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  protected void m1() {}
  
  void m2() {}
  
  private void m3() {}
}
