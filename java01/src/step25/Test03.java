package step25;

public class Test03 {
  static class Member {
    public static int count = 0;

    String name;

    public Member() {
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
  }
  

  public static void main(String[] args) throws Exception {
    Class clazz = Class.forName("step25.Test03$Member");
    System.out.println(clazz.getName());
    Member m = (Member)clazz.newInstance();
  }
}
