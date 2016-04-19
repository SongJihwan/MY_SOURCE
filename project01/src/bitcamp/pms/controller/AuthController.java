package bitcamp.pms.controller;

import java.util.Scanner;
import java.util.regex.Pattern;

import bitcamp.pms.annotation.Controller;
import bitcamp.pms.annotation.RequestMapping;
import bitcamp.pms.dao.MemberDao;
import bitcamp.pms.domain.Member;
import bitcamp.pms.util.CommandUtil;
import bitcamp.pms.util.Session;

@Controller
public class AuthController {
  MemberDao memberDao;
  Scanner keyScan;
  Session session;
  int checkNum;
  
  public void setScanner(Scanner keyScan) {
    this.keyScan = keyScan;
  }

  public void setMemberDao(MemberDao memberDao) {
    this.memberDao = memberDao;
  }
  
  public void setSession(Session session) {
    this.session = session;
  }

  public void service() {
    String choice = null;
    while (true) {
      System.out.println("1) 로그인\n2) 회원가입\n9) 종료");
      System.out.print("선택? ");
      choice = keyScan.nextLine();

      switch (choice) {
      case "1":
        if (doLogin())
          return;
        break;
      case "2":
        doSignUp();
        break;
      case "9":
        System.exit(0);
      default:
        System.out.println("잘못된 명령어입니다.");
      }
    }
  }

  private void doSignUp() {
    Member member = new Member();
    String value;
    System.out.print("이름 : ");
    member.setName(keyScan.nextLine());

    System.out.print("E-mail : ");
    value = keyScan.nextLine();
    while (!isEmail(value)) {
      System.out.println("이메일형식이 맞지 않습니다. (유효 형식 : xxx@xxx.xxx)");
      return;
    }
    member.setEmail(value);

    System.out.print("암호 : ");
    value = keyScan.nextLine();
    while (!isPwd(value)) {
      System.out.println("암호는 4~10자 까지만 가능합니다. 최소 알파벳 1개, 숫자 1개, 특수문자(?,!,@) 1개 반드시 포함.");
      return;
    }
    member.setPassword(value);

    System.out.print("전화 : ");
    value = keyScan.nextLine();
    while (!isTel(value)) {
      System.out.println("전화번호 형식에 맞지 않습니다.(3~4-4자), (2~4-3~4-4)");
      return;
    }
    member.setTel(value);

    try {
      memberDao.insert(member);
      System.out.println("회원가입되었습니다.");
    } catch (Exception e) {
      // TODO Auto-generated catch block
      System.out.println("회원등록 중 오류발생\n회원등록에 실패했습니다.");
    }
  }

  private boolean isTel(String tel) {
    if (tel == null)
      return false;
    return Pattern.matches("(\\d{2,4}-)?\\d{3,4}-\\d{4}", tel.trim());
  }

  private boolean isPwd(String pw) {
    if (pw == null)
      return false;
    return Pattern.matches("(?=.*\\d)(?=.*\\p{Alpha})(?=.*[!?@])[[\\w&&[^_]]!@?]{4,10}", pw.trim());
  }

  private boolean isEmail(String email) {
    if (email == null)
      return false;
    return Pattern.matches("[a-zA-Z][\\w\\.]*@([\\w]+\\.)+[a-zA-Z]{2,}", email.trim());
  }

  private boolean doLogin() {
    System.out.print("E-mail : ");
    String email = keyScan.nextLine();
    System.out.print("암호 : ");
    String pwd = keyScan.nextLine();

    Member member = memberDao.selectOneByEmail(email);

    if (member == null) {
      System.out.println("등록되지 않은 사용자입니다.");
      return false;
    } else if (!member.getPassword().equals(pwd)) {
      System.out.println("암호가 맞지 않습니다.");
      return false;
    }

    session.setAttribute("loginUser", member);
    System.out.println("환영합니다." + member.getName() + "!");
    return true;
  }
  
  @RequestMapping("unsubscribe")
  public void unsubsrcibe(Session session) {
    if (CommandUtil.confirm("정말 삭제", keyScan)) {
      try {
        Member loginUser = (Member) session.getAttribute("loginUser");
        memberDao.delete(loginUser.getNo());
        setCheckNum(1);
        System.out.println("회원 정보를 삭제하였습니다. 안녕히 가세요");
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("데이터를 삭제하는데 실패했습니다.");
      }
    }
  }

  public int getCheckNum() {
    return checkNum;
  }

  public void setCheckNum(int checkNum) {
    this.checkNum = checkNum;
  }
}
