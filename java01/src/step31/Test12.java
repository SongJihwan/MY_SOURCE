package step31;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test12 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyScan = new Scanner(System.in);

    Matcher matcher = null;
    String input = null;
    while (true) {
      System.out.print("입력 : ");
      input = keyScan.nextLine();
      if (input.equals("quit"))
        break;
      String regex = "(?=.*\\d)(?=.*\\p{Alpha})(?=.*[!?@])[[\\w&&[^_]]!@?]{4,10}";
      Pattern pattern = Pattern.compile(regex);
      matcher = pattern.matcher(input);
      while (matcher.find()) {
        System.out.println(matcher.group());
        
      }
    }

  }

}
