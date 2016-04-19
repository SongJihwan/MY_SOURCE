package bitcamp.pms.controller;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import bitcamp.pms.annotation.Controller;
import bitcamp.pms.annotation.RequestMapping;
import bitcamp.pms.dao.ProjectDao;
import bitcamp.pms.domain.Project;
import bitcamp.pms.util.CommandUtil;

@Controller
@RequestMapping("project/")
public class ProjectController {
  private ProjectDao projectDao;

  public void setProjectDao(ProjectDao projectDao) {
    this.projectDao = projectDao;
  }

  @RequestMapping("add.do")
  public void add(Scanner keyScan) {
    Project project = new Project();

    System.out.print("프로젝트명? ");
    project.setTitle(keyScan.nextLine());
    System.out.print("시작일? ");
    project.setStartDate(Date.valueOf(keyScan.nextLine()));
    System.out.print("종료일? ");
    project.setEndDate(Date.valueOf(keyScan.nextLine()));
    System.out.print("설명? ");
    project.setDescription(keyScan.nextLine());

    if (CommandUtil.confirm("저장하시겠습니까?", keyScan)) {
      try {
        if (projectDao.insert(project) > 0) {
          System.out.println("저장하였습니다.");
        } else {
          System.out.println("유효하지 않은 번호이거나, 이미 삭제된 항목입니다.");
        }
      } catch (Exception e) {
        System.out.println("데이터 저장에 실패했습니다.");
      }

    } else {
      System.out.println("저장을 취소하였습니다.");
    }

  }

  @RequestMapping("delete.do")
  public void delete(Scanner keyScan) {
    try {
      System.out.print("삭제할 프로젝트 번호?");
      int no = Integer.parseInt(keyScan.nextLine());

      if (CommandUtil.confirm("정말 삭제하시겠습니까?", keyScan)) {
        if (projectDao.delete(no) > 0) {
          System.out.println("삭제하였습니다.");
        } else {
          System.out.println("유효하지 않은 번호이거나, 이미 삭제된 항목입니다.");
        }
      } else {
        System.out.println("삭제를 취소하였습니다.");
      }
    } catch (Exception e) {
      System.out.println("데이터 처리에 실패했습니다.");
    }

  }

  @RequestMapping("list.do")
  public void list() {
    List<Project> projects;
    try {
      projects = projectDao.selectList();
      for (Project project : projects) {
        System.out.println(project);
      }
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @RequestMapping("update.do")
  public void update(Scanner keyScan) {
    System.out.print("변경할 프로젝트 번호?");
    int no = Integer.parseInt(keyScan.nextLine());
    
    try {
      Project project = projectDao.selectOne(no);
      
      if (project == null) {
        System.out.println("유효하지 않은 번호입니다.");
        return;
      }

      System.out.printf("프로젝트명(%s)? ", project.getTitle());
      project.setTitle(keyScan.nextLine());
      System.out.printf("시작일(%s)? ", project.getStartDate());
      project.setStartDate(Date.valueOf(keyScan.nextLine()));
      System.out.printf("종료일(%s)? ", project.getEndDate());
      project.setEndDate(Date.valueOf(keyScan.nextLine()));
      System.out.printf("설명(%s)? ", project.getDescription());
      project.setDescription(keyScan.nextLine());

      if (CommandUtil.confirm("변경하시겠습니까?", keyScan)) {
        if (projectDao.update(project) > 0) {
          System.out.println("변경하였습니다.");
        } else {
          System.out.println("유효하지 않은 번호이거나, 이미 삭제된 항목입니다.");
        }
      } else {
        System.out.println("변경을 취소하였습니다.");
      }
    } catch (Exception e) {
      System.out.println("데이터 처리에 실패했습니다.");
    }
  }
}
