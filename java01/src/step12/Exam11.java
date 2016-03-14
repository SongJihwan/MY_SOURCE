
package step12;

public class Exam11 {
  public static void main(String[] args) {
    Board b1 = new Board("Java", "java programming", "홍길동");
    Board b2 = new Board("C", "c programming", "임꺽정");
    Board b3 = new Board("Python", "python programming", "유관순");

    System.out.println(b1.getNo() + " " + b1.getTitle() + " " + b1.getContent() + " "
                      + b1.getName() + " " + b1.getHits() + " " + b1.getDate());
    System.out.println(b2.getNo() + " " + b2.getTitle() + " " + b2.getContent() + " "
                      + b2.getName() + " " + b2.getHits() + " " + b2.getDate());
    System.out.println(b3.getNo() + " " + b3.getTitle() + " " + b3.getContent() + " "
                      + b3.getName() + " " + b3.getHits() + " " + b3.getDate());
  }
}
