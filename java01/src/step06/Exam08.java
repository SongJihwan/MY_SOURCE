/* 주제: 가변개수의 파라미터 선언 순서 */

package step06;

public class Exam08 {
  // 다음과 같이 여러 개를 선언할 수 없다.
  static int plus(float... f, int... a) { // 컴파일 오류
    int sum = 0;
    for (int v : a) {
      sum += v;
    }
    return sum;
  }

  public static void main(String[] args){
    System.out.println(plus("문자열"));
    System.out.println(plus("문자열", 10));
    System.out.println(plus("문자열", 10, 20));
    System.out.println(plus("문자열", 10, 20, 30));
  }
}
