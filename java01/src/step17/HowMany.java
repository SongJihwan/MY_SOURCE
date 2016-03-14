package step17;

import java.util.Scanner;

public class HowMany {
  public static int howManyPeople () {
    Scanner key = new Scanner(System.in);
    System.out.print("몇명을 입력 받으시겠습니까? ");
    return key.nextInt();
  }
}
