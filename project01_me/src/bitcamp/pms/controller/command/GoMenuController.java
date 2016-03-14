package bitcamp.pms.controller.command;

import bitcamp.pms.controller.command.ServiceController;
import bitcamp.pms.controller.command.ErrorMenuController;

public class GoMenuController {
  public static void goPrint(String[] cmds) {
    ServiceController service = new ServiceController();

    if (cmds.length < 2) {
      System.out.println("go 명령어를 정확히 입력해주세요");
      System.out.println("ex) > go member");
    } else {
      if (cmds[1].equals("member")) {
        service.startMember();
      } else if (cmds[1].equals("project")) {
        service.startProject();
      } else if (cmds[1].equals("task")) {
        service.startTask();
      } else {
        ErrorMenuController.errorPrint();
      }
    }
  }
}
