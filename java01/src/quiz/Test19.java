package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
You are given an array of integers representing coordinates of obstacles
situated on a straight line.
Assume that you are jumping from the point with coordinate 0 to the right.
You are allowed only to make jumps of the same length represented
by some integer.
Find the minimal length of the jump enough to avoid all the obstacles.
Example
for [5, 3, 6, 7, 9] output should be 4
[input] array.integer inputArray
non-empty array of positive integers
[output] integer
the desired length
 */

import java.util.Scanner;

public class Test19{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int min_leng = 2;
    System.out.print("몇개?");
    int num = s.nextInt();
    int[] arr = new int[num];
    System.out.println("장애물 위치 설정");
    for (int i = 0; i < num; i++){
      arr[i] = s.nextInt();
    }

    for(int i = 0; i < num; i++){
      if(arr[i] % min_leng == 0){
        min_leng++;
        i = 0;
      }
    }

    System.out.println(min_leng);
  }
}
