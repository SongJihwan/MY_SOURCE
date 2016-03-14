package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Find the largest digit of the given number.
[input] integer n
non-negative integer
[output] integer
largest digit of n
 */
import java.util.Scanner;

public class Test23{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int max = 0;
    while (num != 0) {
      max = Math.max(max, num % 10);
      num /= 10;
    }

    System.out.println(max);
  }
}
