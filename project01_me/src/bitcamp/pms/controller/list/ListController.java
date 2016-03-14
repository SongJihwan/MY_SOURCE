package bitcamp.pms.controller.list;

import bitcamp.pms.domain.MemberVO;
import bitcamp.pms.controller.etc.LengthController;
import bitcamp.pms.controller.etc.PrintController;

public class ListController {

  public static void printList(MemberVO[] mem) {
    PrintController.showAll(mem, LengthController.arrLength(mem));
  }
}
