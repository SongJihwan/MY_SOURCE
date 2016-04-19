package step31;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyScan = new Scanner(System.in);

    Pattern pattern = Pattern.compile("\\b\\d{4}-\\d{1,2}-\\d{1.2}\\b");
    Matcher matcher = null;
    String input = null;
    while (true) {
      System.out.print("입력 : ");
      input = keyScan.nextLine();
      if (input.equals("quit"))
        break;
      matcher = pattern.matcher(input);
      while (matcher.find()) {
        System.out.println(matcher.group());
      }
    }

  }

}
