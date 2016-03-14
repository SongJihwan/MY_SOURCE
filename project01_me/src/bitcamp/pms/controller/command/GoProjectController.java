package bitcamp.pms.controller.command;

import java.util.Scanner;

public class GoProjectController {
  public static String cmd() {
    Scanner key = new Scanner(System.in);
    System.out.print("프로젝트관리 > ");

    return key.next().toLowerCase();
  }
}
