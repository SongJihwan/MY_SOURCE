/* 주제: 메서드 오버로딩과 호출 규칙 */
package step11;

public class Exam03 {
  static int plus(int a, int b) {
    System.out.println("int int");
    return a + b;
  }
  // 파라미터 개수가 같더라도 타입이 다르면
  // 같은 이름을 갖는 메서드를 추가할 수 있다.

  static float plus(float a, float b) {
    System.out.println("float float");
    return a + b;
  }

  static float plus(float a, int b) {
    System.out.println("float int");
    return a + b;
  }

  static float plus(int a, float b) {
    System.out.println("int float");
    return a + b;
  }

  static int plus(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    System.out.println(plus(10, 20, 30));
    System.out.println(plus(10, 20));
    System.out.println(plus(10f, 20f));
    System.out.println(plus(10, 20f));
    System.out.println(plus(10f, 20));
  }
}
