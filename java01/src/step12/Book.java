/*
책 데이터를 다룰 사용자 정의 데이터 타입을 선언하라!
책번호, ISBN, 제목, 저자들, 출판사, 총페이지수, 가격, 소개
*/
package step12;

public class Book {
  static int cnt;

  private int no;
  private String isbn;
  private String title;
  private String[] names;
  private String company;
  private int pages;
  private int price;
  private String index;

  {
    this.no = ++Book.cnt;
  }

  public Book() {}

  public Book(String isbn, String title, String[] names, String company, int pages, int price, String index) {
    this.setIsbn(isbn);
    this.setTitle(title);
    this.setNames(names);
    this.setCompany(company);
    this.setPages(pages);
    this.setPrice(price);
    this.setIndex(index);
  }

  public int getNo() {
    return this.no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getIsbn() {
    return this.isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String[] getNames() {
    return this.names;
  }

  public void setNames(String[] names) {
    this.names = names;
  }

  public String getCompany() {
    return this.company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getPages() {
    return this.pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getIndex() {
    return this.index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

}
