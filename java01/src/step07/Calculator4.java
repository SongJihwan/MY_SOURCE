/*더하기, 빼기, 곱하기, 나누기 메서드를 모아둔다*/
package step07;

public class Calculator4 {
  // 인스턴스 변수
  int result;

  // 인스턴스 메서드를 실행할 때 넘어오는 인스턴스 주소는
  // 메서드의 감춰진 변수인 this에 자동 보관된다.
  // => 이 메서드를 호출할 때는 반드시 인스턴스 주소를 줘야 한다.
  // => 그래서 "인스턴스 메서드"라 부른다.

  void plus(int a) {
    this.result += a;
  }

  void minus(int a) {
    this.result -= a;
  }

  void mul(int a) {
    this.result *= a;
  }

  void div(int a) {
    this.result /= a;
  }
}
