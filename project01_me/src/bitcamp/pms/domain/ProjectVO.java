package bitcamp.pms.domain;

import java.sql.Date;

public class ProjectVO {
  private static int no;
  private int index;
  private String title;
  private Date startDate;
  private Date endDate;
  private String description;
  private int state;

  {
    index = no++;
  }

  public ProjectVO() {}

  public ProjectVO(String title, Date startDate, Date endDate, String description) {
    this.title = title;
    this.startDate = startDate;
    this.endDate = endDate;
    this.description = description;
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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return title + ", " + startDate.toString() + ", " + endDate.toString() + ", "
          + description + String.valueOf(state);
  }

}
