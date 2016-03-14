package bitcamp.pms.controller.project;

import bitcamp.pms.domain.ProjectVO;
import bitcamp.pms.controller.etc.LengthProjectController;
import bitcamp.pms.controller.etc.PrintProjectController;

public class ListController {

  public static void printList(ProjectVO[] pro) {
    PrintProjectController.showAll(pro, LengthProjectController.arrLength(pro));
  }
}
