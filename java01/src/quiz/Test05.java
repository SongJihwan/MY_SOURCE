package quiz;

// 출처: codefights.com
//
// 한 숫자를 바꿔 이전 값과 다른 경우를 모두 찾아라.
// 단 맨 앞의 숫자는 0이 될 수 없다.
// 예)
// 10 => 17
//
// 한 줄에 버그가 있다. 고쳐라!
//
import java.util.Scanner;

public class Test05{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int value = s.nextInt();
    int cnt = 0;

    while (value != 0) {
      value /= 10;
      cnt++;
    }

    System.out.println(9 * cnt - 1);
  }
}
