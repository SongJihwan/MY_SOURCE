package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
For given n and k find the sum of all multiples of k
that are not greater than n.
Example
sumOfMultiples(7, 2) = 2 + 4 + 6 = 12
[input] integer n
positive integer
[input] integer k
positive integer
[output] integer
 */
import java.util.Scanner;

public class Test13{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sum = 0;
    System.out.print("범위를 입력하시오 ");
    int ran = s.nextInt();
    System.out.print("배수를 입력하시오 ");
    int mul = s.nextInt();

    for (int i = mul; i < ran; i += mul) {
      sum += i;
    }

    System.out.println(sum);
  }
}
