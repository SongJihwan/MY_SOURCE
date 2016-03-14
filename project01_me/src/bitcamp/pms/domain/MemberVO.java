package bitcamp.pms.domain;

public class MemberVO {
  private static int no;
  private int index;
  private String name;
  private String email;
  private String pw;
  private String tel;

  {
    this.index = no++;
  }

  public MemberVO() {}

  public MemberVO(String name, String email, String pw, String tel) {
    this.index = no++;
    this.name = name;
    this.email = email;
    this.pw = pw;
    this.tel = tel;
  }

  public void indexMinus() {
    no--;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  @Override
  public String toString() {
    return String.valueOf(index) + ", " + name + ", " + email + ", " + pw + ", " + tel;
  }
}
