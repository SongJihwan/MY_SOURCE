package bitcamp.pms.controller.etc;

import bitcamp.pms.dao.CommandMenuDAO;
import bitcamp.pms.dao.MemberDAO;
import bitcamp.pms.controller.command.ErrorController;
import bitcamp.pms.controller.etc.UnderLineController;
import bitcamp.pms.controller.command.GoMemberController;


public class MemberController {
  public static void memberService() {
    MemberDAO mem = new MemberDAO();
    while (true) {
      String com = GoMemberController.cmd();

      switch (com) {
      case "main":
        UnderLineController.draw();
        CommandMenuDAO.command();
        break;

      case "add":
        mem.addList();
        UnderLineController.draw();
        break;

      case "list":
        mem.printList();
        UnderLineController.draw();
        break;

      case "delete":
        mem.deleteList();
        UnderLineController.draw();
        break;

      case "update":
        mem.updateList();
        UnderLineController.draw();
        break;

      default:
        ErrorController.errorPrint();
        UnderLineController.draw();
      }
    }
  }
}
