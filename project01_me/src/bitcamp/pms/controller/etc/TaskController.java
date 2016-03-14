package bitcamp.pms.controller.etc;

import bitcamp.pms.controller.command.GoTaskController;
import bitcamp.pms.controller.etc.UnderLineController;
import bitcamp.pms.dao.CommandMenuDAO;
import bitcamp.pms.controller.command.ErrorController;

public class TaskController {
  public static void taskService() {
    while (true) {
      String com = GoTaskController.cmd();

      switch (com) {
      case "main":
        UnderLineController.draw();
        CommandMenuDAO.command();
        break;

        case "add":
          task.addList();
          UnderLineController.draw();
          break;

        case "delete":
          task.deleteList();
          UnderLineController.draw();
          break;

        case "update":
          task.updateList();
          break;

        case "list":
          task.printList();
          UnderLineController.draw();
          break;

      default:
        ErrorController.errorPrint();
        UnderLineController.draw();
      }
    }
  }
}
