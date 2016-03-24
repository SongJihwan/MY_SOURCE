package bitcamp.pms.controller;

import java.util.Scanner;
import java.sql.Date;
import bitcamp.pms.domain.Project;
import java.util.ArrayList;

public class ProjectController {
  private Scanner keyScan;
  private ArrayList<Project> projects;

  public ProjectController() {

  }

  public void setScanner(Scanner keyScan) {
    this.keyScan = keyScan;
  }

  public void setArrayList(ArrayList<Project> projects) {
    this.projects = projects;
  }

  public ArrayList<Project> getArrayList() {
    return projects;
  }

  public void service() {
    String input = null;
    while (true) {
      input = prompt();
      try {
        switch (input) {
          case "add": doAdd(); break;
          case "list": doList(); break;
          case "update": doUpdate(); break;
          case "delete": doDelete(); break;
          case "main": return;
          default:
            System.out.println("지원하지 않는 명령어입니다.");
        }
      } catch (IndexOutOfBoundsException e) {
        System.out.println("유효하지 않은 인덱스입니다.");
      } catch (Exception e) {
        System.out.println("형식을 확인해주세요.");
      }
    }
  }

  private String prompt() {
    System.out.print("프로젝트관리> ");
    return keyScan.nextLine();
  }

  private void doAdd() {
    Project project = new Project();

    System.out.print("프로젝트명? ");
    project.setTitle(keyScan.nextLine());
    System.out.print("시작일? ");
    project.setStartDate(Date.valueOf(keyScan.nextLine()));
    System.out.print("종료일? ");
    project.setEndDate(Date.valueOf(keyScan.nextLine()));
    System.out.print("설명? ");
    project.setDescription(keyScan.nextLine());

    if (confirm("저장하시겠습니까?", true)) {
      projects.add(project);
      System.out.println("저장하였습니다.");
    } else {
      System.out.println("저장을 취소하였습니다.");
    }
  }

  private void doList() {
    int i = 0;
    for (Project project : projects) {
      System.out.println(i++ + ", " +project);
    }
  }

  private void doUpdate() {
    System.out.print("변경할 회원 번호는? ");
    int no = Integer.parseInt(keyScan.nextLine());

    Project oldproject = projects.get(no);
    Project project = new Project();

    System.out.printf("제목(%s)? ", oldproject.getTitle());
    project.setTitle(keyScan.nextLine());

    System.out.printf("시작일(%s)? ", oldproject.getStartDate().toString());
    project.setStartDate(Date.valueOf(keyScan.nextLine()));

    System.out.printf("종료일(%s)? ", oldproject.getEndDate().toString());
    project.setEndDate(Date.valueOf(keyScan.nextLine()));

    System.out.printf("설명(%s)? ", oldproject.getDescription());
    project.setDescription(keyScan.nextLine());

    if (confirm("변경하시겠습니까?", true)) {
      projects.set(no, project);
      System.out.println("변경하였습니다.");
    } else {
      System.out.println("변경을 취소하였습니다.");
    }
  }

  private void doDelete() {
    System.out.print("삭제할 회원 번호는? ");
    int no = Integer.parseInt(keyScan.nextLine());

    if (confirm("정말 삭제하시겠습니까?", true)) {
      projects.remove(no);
      System.out.println("삭제하였습니다.");
    } else {
      System.out.println("삭제를 취소하였습니다.");
    }
  }

  private boolean confirm(String message, boolean strictMode) {
    String input = null;
    do {
      System.out.printf("%s(y/n) ", message);
      input = keyScan.nextLine().toLowerCase();

      if (input.equals("y")) {
        return true;
      } else if (input.equals("n")) {
        return false;
      } else {
        if (!strictMode) {
          return false;
        }
        System.out.println("잘못된 명령어입니다.");
      }
    } while(true);
  }






}
