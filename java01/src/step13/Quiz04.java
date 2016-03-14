/* 문제4) 주어진 수를 오름차순으로 정렬하시오.
   프로그램 아규먼트의 개수는 정해져 있지 않다.
> java -cp bin step13.Quiz04 64 5 2 74 13 98
> 2, 5, 13, 64, 74, 98
*/

package step13;

import java.util.Arrays;

public class Quiz04 {
  public static void main(String[] args) {
    int tmp = 0;
    int[] arr = new int[args.length];
    for(int i = 0; i < args.length; i++) {
      arr[i] = Integer.parseInt(args[i]);
    }

    // Arrays.sort(arr);
    // System.out.println(Arrays.toString(arr));

    for (int i = 0; i < args.length - 1; i++) {
      for(int j = i+1; j < args.length; j++) {
        if (arr[i] > arr[j]) {
          tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
      System.out.print(arr[i] + " ");
    }

    System.out.println();
  }
}
