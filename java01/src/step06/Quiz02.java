/* 0부터 n-1까지 수를 원으로 배치할 때 특정 값의 맞은편에 위치한 수를 리턴하는 메서드를 정의하라
  메서드 이름은 CircleOfNumber이다.
  이 메서드가 받아야 할 값은 n값과 맞은 편 값을 알기 위해 전달하는 값이다*/
package step06;

public class Quiz02 {
  static int CircleOfNumbers(int a, int b) {
      return (b + a / 2) % a;
  }

  public static void main(String[] args){
    int val = CircleOfNumbers(10, 3);
    System.out.println(val);
  }
}
