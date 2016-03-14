package bitcamp.pms.controller.command;

import java.util.Scanner;

public class PromptController {
  public static String[] cmd() {
    Scanner key = new Scanner(System.in);
    System.out.print("명령 > ");

    return key.nextLine().toLowerCase().split(" ");
  }
}
