package bitcamp.pms.controller.list;

import bitcamp.pms.domain.MemberVO;

public class ListAddController {
  public static MemberVO[] member = new MemberVO[200];

  public static MemberVO[] addList(MemberVO mem) {
    member[mem.getIndex()] = mem;
    return member;
  }
}
