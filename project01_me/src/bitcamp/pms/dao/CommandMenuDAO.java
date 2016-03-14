package bitcamp.pms.dao;

import bitcamp.pms.controller.command.PromptController;
import bitcamp.pms.controller.command.QuitController;
import bitcamp.pms.controller.command.AboutController;
import bitcamp.pms.controller.command.ErrorMenuController;
import bitcamp.pms.controller.etc.UnderLineController;
import bitcamp.pms.controller.command.GoMenuController;
import java.util.Scanner;


public class CommandMenuDAO {
  
  public static String command() {
    while (true) {
      String[] cmds = PromptController.cmd();

      switch (cmds[0]) {
      case "quit":
        QuitController.bye();

      case "about":
        AboutController.printAbout();
        UnderLineController.draw();
        break;

      case "go":
        GoMenuController.goPrint(cmds);
        UnderLineController.draw();
        break;

      default:
        ErrorMenuController.errorPrint();
        UnderLineController.draw();
      }
    }
  }
}
