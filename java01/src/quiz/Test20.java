package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
A round number is informally considered to be an integer that ends with one or more zeros.
Find the smallest round number that is not less than a given value.
Example
nearestRoundNumber(122) = 130
[input] integer value
[output] integer
 */
import java.util.Scanner;
public class Test20{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int val = s.nextInt();
    int[] dig = new int[2];
    int cnt = 0;
    int round_num;

    if (val >= 100) {
      while (val != 0) {
        cnt++;
        if ((val / 100 == 0) && val >= 10) {
          dig[0] = val % 10;
          dig[1] = val / 10;
        }
        val /= 10;
      }
      round_num = ((dig[1] * 10) + dig[0] + 1) * (int)Math.pow(10, cnt - 2);
    } else {
      while (val % 10 != 0) {
        val++;
      }
      round_num = val;
    }
    System.out.println(round_num);

  }
}
