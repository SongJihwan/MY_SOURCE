package bitcamp.pms.domain;

import java.sql.Date;

public class Board {
  int no;
  private String title;
  private String content;
  private int views;
  private String pw;
  private Date createDate;

  public Board() {
    super();
  }

  public Board(int no, String title, String content, String pw) {
    super();
    this.title = title;
    this.content = content;
    this.pw = pw;
  } 
    
  public Board(int no, String title, String content, int views, String pw, Date createDate) {
    super();
    this.no = no;
    this.title = title;
    this.content = content;
    this.views = views;
    this.pw = pw;
    this.createDate = createDate;
  }

  @Override
  public String toString() {
    return no + ", " + title + ", " + views + ", " + createDate ;
  }  

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
}
