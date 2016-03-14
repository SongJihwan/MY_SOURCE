package quiz;

//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Given a number and a range, find the largest integer
within the given range that's divisible by the given number.
[input] integer left
the left bound of the given range
[input] integer right
the right bound of the given range, left <= right
[input] integer divisor
a non-zero integer
[output] integer
maximal integer in the range [left, right] which is divisible
by divisor or -1 if there in no such number
 */
import java.util.Scanner;
public class Test21 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int left = s.nextInt();
    int right = s.nextInt();
    int divisor = s.nextInt();
    int max = -1;
    for (int i = right; i >= left; i--) {
      if(i % divisor == 0){
        max = i;
        break;
      }
    }

    System.out.println(max);
  }
}
