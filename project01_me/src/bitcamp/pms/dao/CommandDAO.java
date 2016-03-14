package bitcamp.pms.dao;

import bitcamp.pms.controller.command.PromptController;
import bitcamp.pms.controller.command.QuitController;
import bitcamp.pms.controller.command.AboutController;
import bitcamp.pms.dao.ListDAO;
import bitcamp.pms.controller.etc.UnderLineController;
import bitcamp.pms.controller.etc.ErrorController;

public class CommandDAO {
  public static String command() {
    while (true) {
      String com = PromptController.cmd();

      switch (com) {
      case "quit":
        QuitController.bye();

      case "add":
        ListDAO.addList();
        UnderLineController.draw();
        break;

      case "list":
        ListDAO.printList();
        UnderLineController.draw();
        break;

      case "delete":
        ListDAO.deleteList();
        UnderLineController.draw();
        break;

      case "update":
        ListDAO.updateList();
        UnderLineController.draw();
        break;

      case "about":
        AboutController.printAbout();
        UnderLineController.draw();
        break;

      default:
        ErrorController.errorPrint();
        UnderLineController.draw();
      }
    }
  }
}
