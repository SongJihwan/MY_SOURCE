
package step12;

public class Exam12 {
  public static void main(String[] args) {
    Member m1 = new Member("홍길동", "hongGD", "123456", "01011111111", "hong@a.com");
    Member m2 = new Member("임꺽정", "ImGJ", "qweasd", "01022222222", "im@b.com");
    Member m3 = new Member("유관순", "YouGS", "1q2w3e", "01033333333", "you@c.com");

    System.out.println(m1.getNo() + " " + m1.getName() + " " + m1.getId() + " "
                      + m1.getPw() + " " + m1.getTel() + " " + m1.getEmail());
    System.out.println(m2.getNo() + " " + m2.getName() + " " + m2.getId() + " "
                      + m2.getPw() + " " + m2.getTel() + " " + m2.getEmail());
    System.out.println(m3.getNo() + " " + m3.getName() + " " + m3.getId() + " "
                      + m3.getPw() + " " + m3.getTel() + " " + m3.getEmail());
  }
}
