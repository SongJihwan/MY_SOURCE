package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Determine whether the given string is a concatenation of another string
to itself.
Example
for 'tandemtandem' output should be true
for 'qqq' or '2w2ww' output should be false
[input] string inputString
[output] boolean
true if inputString represents a string concatenated to itself,
false otherwise
 */

import java.util.Scanner;
public class Test16{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String tan = s.next();
    int cnt = 0;
    boolean b = false;

    if (tan.length() % 2 == 0) {
      for (int i = 0; i < tan.length() / 2; i++){
        if(tan.charAt(i) == tan.charAt(i + tan.length() / 2)){
          cnt++;
        }
      }
      if (cnt == tan.length() / 2) {
        b = true;
      }
    }

    System.out.println(b);
  }
}
