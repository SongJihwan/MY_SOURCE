package quiz;

//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Find the area of a rectangle with given sides.
Example
rectangleArea(2, 3) = 6
[input] integer a
positive integer
[input] integer b
positive integer
[output] integer
 */

import java.util.Scanner;
public class Test24{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int wid = s.nextInt();
    int hei = s.nextInt();
    int area = wid * hei;

    System.out.println(area);
  }
}
