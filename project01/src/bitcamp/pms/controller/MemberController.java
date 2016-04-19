package bitcamp.pms.controller;

import java.util.List;
import java.util.Scanner;

import bitcamp.pms.annotation.Controller;
import bitcamp.pms.annotation.RequestMapping;
import bitcamp.pms.dao.MemberDao;
import bitcamp.pms.domain.Member;
import bitcamp.pms.util.CommandUtil;

@Controller
@RequestMapping("member/")
public class MemberController {
  private MemberDao memberDao;

  public void setMemberDao(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @RequestMapping("add.do")
  public void add(Scanner keyScan) {
    Member member = new Member();

    System.out.print("이름? ");
    member.setName(keyScan.nextLine());

    System.out.print("이메일? ");
    member.setEmail(keyScan.nextLine());

    System.out.print("암호? ");
    member.setPassword(keyScan.nextLine());

    System.out.print("전화? ");
    member.setTel(keyScan.nextLine());

    if (CommandUtil.confirm("저장하시겠습니까?", keyScan)) {
      try {
        memberDao.insert(member);
        System.out.println("저장했습니다.");
      } catch (Exception e) {
        System.out.println("데이터를 저장하는데 실패했습니다.");
      }
    } else {
      System.out.println("저장을 취소하였습니다.");
    }
  }

  @RequestMapping("delete.do")
  public void delete(Scanner keyScan) {
    try {
      System.out.print("삭제할 회원 번호는? ");
      int no = Integer.parseInt(keyScan.nextLine());

      if (CommandUtil.confirm("정말 삭제하시겠습니까?", keyScan)) {
        if (memberDao.delete(no) > 0) {
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
    try {
      List<Member> members = memberDao.selectList();

      for (Member member : members) {
        System.out.println(member);
      }
    } catch (Exception e) {
      
      throw new RuntimeException("회원 데이터 로딩 실패!", e);
    }
  }

  @RequestMapping("update.do")
  public void update(Scanner keyScan) {
    System.out.print("변경할 회원 번호는? ");
    int no = Integer.parseInt(keyScan.nextLine());

    try {
      Member member = memberDao.selectOne(no);
      
      if (member == null) {
        System.out.println("유효하지 않은 번호입니다.");
        return;
      }

      System.out.printf("이름(%s)? ", member.getName());
      member.setName(keyScan.nextLine());

      System.out.printf("이메일(%s)? ", member.getEmail());
      member.setEmail(keyScan.nextLine());

      System.out.printf("암호(%s)? ", member.getPassword());
      member.setPassword(keyScan.nextLine());

      System.out.printf("전화(%s)? ", member.getTel());
      member.setTel(keyScan.nextLine());

      if (CommandUtil.confirm("변경하시겠습니까?", keyScan)) {
        if (memberDao.update(member) > 0) {
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
