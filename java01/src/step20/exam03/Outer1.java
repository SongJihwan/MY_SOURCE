package step20.exam03;

public class Outer1 {
  static class TopLevelInner {
  }

  class MemberInner {
  }

  public void m() {
    class LocalInner {
    }
  }

  Object obj = new Object(){
    public void m() {}
  };
}
