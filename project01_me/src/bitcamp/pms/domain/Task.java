package bitcamp.pms.domain;

public class Task {
  private String title;
  private String description;
  private int memberNo;
  private int projectNo;
  private int state;

  public Task() {}

  public Task(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(int memberNo) {
    this.memberNo = memberNo;
  }

  public int getProjectNo() {
    return project;
  }

  public void setProjectNo(int projectNo) {
    this.projectNo = projectNo;
  }

  public int getStateNo() {
    return State;
  }

  public void setState(int state) {
    this.state = state;
  }


  @Override
  public String toString() {
    return title + ", " + description + ", " + String.valueOf(memberNo) + ", "
          + String.valueOf(projectNo) + ", " + String.valueOf(state);
  }
}
