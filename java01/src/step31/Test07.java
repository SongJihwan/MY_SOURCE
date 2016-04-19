package step31;

import java.util.Scanner;

public class Test07 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyScan = new Scanner(System.in);
//    String regex = "ab";
//    String regex = "a|b";
    String regex = "(a|b)(x|y)";
    
    String input = null;
    while (true) {
      System.out.print("입력 : ");
      input = keyScan.nextLine();
      if (input.equals("quit")) 
        break;
      System.out.println(input.matches(regex));
    }
    
  }

}
