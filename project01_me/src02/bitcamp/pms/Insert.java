package bitcamp.pms;

import java.util.Scanner;

public class Insert {
  public static String[] memInfo(int num) {
    Scanner key = new Scanner(System.in);
    String[] name = new String[num];
    for(int i = 0; i < num; i++ ) {
      System.out.print("이름? ");
      name[i] = key.next();
    }
    return name;
  }
}
