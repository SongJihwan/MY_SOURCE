package step31;

import java.util.Scanner;

public class Test04 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyScan = new Scanner(System.in);
//    String regex = "[0-9]";
//    String regex = "\\d";
//    String regex = "[0-9a-zA-Z_]";
//    String regex = "\\w";
//    String regex = ".";
    String regex = "\\.";
//    String regex = "[^\\d&&\\w]";
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
