package bitcamp.pms.controller.command;

import java.util.Scanner;

public class GoMemberController {
  public static String cmd() {
    Scanner key = new Scanner(System.in);
    System.out.print("회원관리 > ");

    return key.next().toLowerCase();
  }
}
