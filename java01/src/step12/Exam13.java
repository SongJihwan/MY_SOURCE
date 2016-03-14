
package step12;

import java.util.Arrays;

public class Exam13 {
  public static void main(String[] args) {
    String[] names = new String[]{"홍길동", "임꺽정"};
    Book b1 = new Book("ISBN-000000001111", "자바", names, "비트교육센터",
                      230, 20000, "자바 프로그래밍 입문 책");

    System.out.println(b1.getNo() + " " + b1.getIsbn() + " " + b1.getTitle() + " "
    + Arrays.toString(b1.getNames()) + " " + b1.getCompany() + " " + b1.getPages() + " "
    + b1.getPrice() + " " + b1.getIndex());
  }
}
