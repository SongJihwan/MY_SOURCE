package bitcamp.pms.controller.command;

import bitcamp.pms.controller.etc.MemberController;
import bitcamp.pms.controller.etc.ProjectController;
import bitcamp.pms.controller.etc.TaskController;

public class ServiceController {
  public void startMember() {

    MemberController.memberService();
  }

  public void startProject() {

    ProjectController.projectService();
  }

  public void startTask() {

    TaskController.taskService();
  }
}
