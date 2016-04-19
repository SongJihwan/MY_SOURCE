package step31;

import java.util.Scanner;

public class Test05 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyScan = new Scanner(System.in);
//    String regex = "^a\\d";
//    String regex = "^\\p{Alpha}\\d";
    String regex = "\\wx";
    
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
