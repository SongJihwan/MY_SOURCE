package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Reverse an array
Example
myReverse([1, 3, 2]) = [2, 3, 1]
[input] array.integer input
[output] array.integer
*/

import java.util.Scanner;

public class Test26{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("배열 개수 ? ");
    int num = s.nextInt();
    System.out.print("입력 ");
    int[] arr = new int[num];
    for(int i = 0; i < num; i++) {
      arr[i] = s.nextInt();
    }
    int temp;

    for (int i = 0; i < arr.length / 2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }

    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
