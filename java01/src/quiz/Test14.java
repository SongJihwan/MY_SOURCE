package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Reverse a given integer by rearranging its digits.
Example
numberReverse(123) = 321
numberReverse(120) = 21
[input] integer input
positive integer
[output] integer
 */
import java.util.Scanner;

public class Test14 {
  public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int val = s.nextInt();
      int rev = 0;

      while(val != 0) {
        rev = (val % 10) + (rev * 10);
        val /= 10;
      }

      System.out.println(rev);


  }
}
