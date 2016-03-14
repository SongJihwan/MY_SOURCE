package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Given a string, find the number of different characters in it.
for "cabca" output should be 3
[input] string s
a string of lowercase latin letters
[output] integer
 */

import java.util.Scanner;

public class Test11{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("문자를 입력하시오");
    String str = s.next();
    char[] arr = new char[str.length()];
    int cnt = 0;

    for (int i = 0; i < str.length(); i++) {
      arr[i] = str.charAt(i);
    }

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++){
        if (arr[i] == arr[j]) {
          arr[j] = '\0';
        }
      }
      if(arr[i] != '\0'){
        cnt++;
      }
    }

    System.out.println(cnt);
  }
}
