package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Pick-out the largest even number from an array of integers
Example
maximalEven([4, 3, 6, 8, 2, 4]) = 8
[input] array.integer inputArray
an array of positive integers, it's guaranteed
that inputArray contains at least one even integer
[output] integer
maximal even element of inputArray
 */
import java.util.Scanner;
public class Test17{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("몇개의 숫자?");
    int num = s.nextInt();
    int[] arr = new int[num];
    System.out.println("숫자 입력");
    for (int i = 0; i < num; i++){
      arr[i] = s.nextInt();
    }
    
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if ((arr[i] % 2 == 0) && (arr[i] > max)){
        max = arr[i];
      }
    }
    System.out.println(max);
  }
}
