package step19;

public class Test11 {
  static void m1(int i) {
    if (i < 17) {
      throw new RuntimeException("17세 미만입니다.");
    }
    m2(i);
  }

  static void m2(int i) {
    if (i > 70) {
      throw new RuntimeException("70세 초과입니다.");
    }
    m3(i);
  }

  static void m3(int i) {
    throw new RuntimeException("sssssssssssssss");
  }

  public static void main(String[] args) {
    try {
      m1(Integer.parseInt(args[0]));
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }
}
