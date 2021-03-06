package step25;

public class Test02 {
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

  public static void main(String[] args) throws ClassNotFoundException {
    Member m = new Member();
    Class clazz1 = m.getClass();
    System.out.println(clazz1.getName());
    
    Class clazz2 = Member.class;
    
    Member.count = 10;
    System.out.println(clazz2.getName());
    System.out.println(Member.class.getName());
    
    Class clazz3 = Class.forName("step25.Test02$Member");
    System.out.println(clazz3.getName());
  }
}
