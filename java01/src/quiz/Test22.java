package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Find the largest number from the given three integers
[input] integer a
[input] integer b
[input] integer c
[output] integer
max of a,b and c
*/
import java.util.Scanner;

public class Test22{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();

    if (a > b) {
      if (a > c) {
        System.out.println(a);
      } else {
        System.out.println(c);
      }
    } else {
      if (b > c){
        System.out.println(b);
      } else {
        System.out.println(c);
      }
    }
  }
}
