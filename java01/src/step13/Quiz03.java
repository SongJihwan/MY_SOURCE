/* 문제3) 주어진 수의 약수를 모두 출력하시오.
> java -cp bin step13.Quiz03 72
> 1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72
*/

package step13;

public class Quiz03 {
  public static void main(String[] args) {
    for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
      if(Integer.parseInt(args[0]) % i == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
