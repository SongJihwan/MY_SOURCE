package step19;

public class Test12 {
  static void m1(int i) throws Exception {
    m2(i);
  }

  static void m2(int i) throws Exception {
    m3(i);
  }

  static void m3(int i) throws Exception {
    throw new Exception("sssssssssssssss");
  }

  public static void main(String[] args) {
    try {
      m1(Integer.parseInt(args[0]));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
