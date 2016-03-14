package bitcamp.pms.controller.etc;

import bitcamp.pms.domain.MemberVO;

public class LengthController {
  public static int arrLength(MemberVO[] mem) {
    for (int i = 0; i < mem.length; i++) {
      if(mem[i] == null) {
        return i;
      }
    }
    return 0;
  }
}
