/*
회원 데이터를 다룰 사용자 정의 데이터 타입 선언하라!
회원번호, 이름, 아이디, 암호, 전화, 이메일
*/
package step12;

public class Member {
  static int cnt;

  private int no;
  private String name;
  private String id;
  private String pw;
  private String tel;
  private String email;

  {
    this.no = ++Member.cnt;
  }

  Member() {}

  Member(String id, String email, String pw) {
    this.setId(id);
    this.setEmail(email);
    this.setPw(pw);
  }

  Member(String name, String id, String pw, String tel, String email) {
    this.setName(name);
    this.setId(id);
    this.setPw(pw);
    this.setTel(tel);
    this.setEmail(email);
  }

  public int getNo() {
    return this.no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return this.pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public String getTel() {
    return this.tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
