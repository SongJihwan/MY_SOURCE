package bitcamp.pms.controller.etc;

import bitcamp.pms.domain.MemberVO;

public class PrintController {
  public static void showAll(MemberVO[] mem, int length) {
    for (int i = 0; i < length; i++) {
      System.out.println((i + 1) + "번째 회원정보 : " + mem[i]);
    }
  }
}
