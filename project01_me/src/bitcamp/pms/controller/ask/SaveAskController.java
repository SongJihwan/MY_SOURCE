package bitcamp.pms.controller.ask;

import java.util.Scanner;

public class SaveAskController {
  public static boolean saveAsk(boolean strictMode) {
    Scanner key = new Scanner(System.in);

    while (true) {
      System.out.print("저장하시겠습니까? ");
      String check = key.next();
      if (check.equalsIgnoreCase("y")) {
        return true;
      } else if (check.equalsIgnoreCase("n")) {
        return false;
      } else {
        if (!strictMode) {
          return false;
        }
        System.out.println("잘못된 명령어입니다");
      }
    }

    // return false;
  }
}