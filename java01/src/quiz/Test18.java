package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Year is leap if its number is divisible by 4 and isn't divisible by 100 or if its number is divisible by 400. Determine if a given year is leap or not.
[input] integer year
number of the year
[output] boolean
true if the given year is leap, false otherwise
 */
 import java.util.Scanner;
public class Test18{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int year = s.nextInt();
    boolean b = false;

    if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
      b = true;
    }

    System.out.println(b);
  }
}
