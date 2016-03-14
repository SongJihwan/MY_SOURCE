package step17;

public class QuizMember {
  private String name;
  private String email;
  private String pw;
  private String tel;

  public QuizMember() {}

  public QuizMember(String name, String email, String pw, String tel) {
    this.name = name;
    this.email = email;
    this.pw = pw;
    this.tel = tel;
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
    return name + ", " + email + ", " + pw + ", " + tel;
  }
}
