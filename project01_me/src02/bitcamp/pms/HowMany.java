package bitcamp.pms;

import java.util.Scanner;

public class HowMany {
  public static int people() {
    Scanner key = new Scanner(System.in);
    System.out.print("몇 명을 입력하시겠습니까? ");

    return key.nextInt();
  }
}
