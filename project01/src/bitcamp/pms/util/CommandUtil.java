package bitcamp.pms.util;

import java.util.Scanner;

public class CommandUtil {
  public static boolean confirm(String message, Scanner keyScan) {
    while (true) {
      System.out.printf("%s하시겠습니까?(y/n) ", message);
      String input = keyScan.nextLine().toLowerCase();
      if (input.equals("y")) {
        return true;
      } else if (input.equals("n")) {
        return false;
      } else {
        System.out.println("잘못된 명령어입니다.");
      }
    }
  }
}
