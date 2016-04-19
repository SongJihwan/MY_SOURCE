package step31;

import java.util.Scanner;

public class Test03 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyScan = new Scanner(System.in);
//    String regex = "[abc]";
//    String regex = "[^abc]";
//    String regex = "[a-z]";
//    String regex = "[a-zA-Z]";
//    String regex = "[a-d[x-z]]";
//    String regex = "[a-dx-z]";
    String regex = "[a-f&&[d-m]]";
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
