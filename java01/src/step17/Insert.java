package step17;

import java.util.Scanner;

public class Insert {
  public static QuizMember[] memInsert(int num){
    Scanner key = new Scanner(System.in);
    String check;
    QuizMember[] mem = new QuizMember[num];
    System.out.println();

    for (int i = 0; i < num; i++) {
      System.out.print("이름? ");
      String name = key.next();

      System.out.print("E-mail? ");
      String email = key.next();

      System.out.print("비밀번호? ");
      String pw = key.next();

      System.out.print("전화번호? ");
      String tel = key.next();

      while(true) {
        System.out.print("정말 저장하시겠습니까?(Y / N) ");
        check = key.next();

        if (check.equalsIgnoreCase("Y")){
          mem[i] = new QuizMember(name, email, pw, tel);
          System.out.println("저장했습니다.");
          break;
        } else if (check.equalsIgnoreCase("N")) {
          i--;
          System.out.println("저장을 취소했습니다.");
          break;
        }
      }
      System.out.println();
    }
    return mem;
  }
}
