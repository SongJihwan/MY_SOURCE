package bitcamp.pms.controller.etc;

import bitcamp.pms.dao.CommandMenuDAO;
import bitcamp.pms.dao.ProjectDAO;
import bitcamp.pms.controller.command.ErrorController;
import bitcamp.pms.controller.etc.UnderLineController;
import bitcamp.pms.controller.command.GoProjectController;


public class ProjectController {
  public static void projectService() {
    ProjectDAO pro = new ProjectDAO();
    while (true) {
      String com = GoProjectController.cmd();

      switch (com) {
      case "main":
        UnderLineController.draw();
        CommandMenuDAO.command();
        break;

      case "add":
        pro.addList();
        UnderLineController.draw();
        break;

      case "delete":
        pro.deleteList();
        UnderLineController.draw();
        break;

      case "update":
        pro.updateList();
        break;

      case "list":
        pro.printList();
        UnderLineController.draw();
        break;

      default:
        ErrorController.errorPrint();
        UnderLineController.draw();
      }
    }
  }
}
