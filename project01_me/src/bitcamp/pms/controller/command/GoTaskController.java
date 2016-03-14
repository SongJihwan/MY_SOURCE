package bitcamp.pms.controller.command;

import java.util.Scanner;

public class GoTaskController {
  public static String cmd() {
    Scanner key = new Scanner(System.in);
    System.out.print("작업관리 > ");

    return key.next().toLowerCase();
  }
}
