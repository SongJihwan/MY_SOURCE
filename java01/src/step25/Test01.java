package step25;

public class Test01 {
  static class Member {
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

  public static void main(String[] args) {
    Member member = new Member();
    member.setName("홍길동");
    
    Class clazz = member.getClass();
    System.out.println(clazz.getName());
    
    Class superClass = clazz.getSuperclass();
    System.out.println(superClass.getName());
  }

}
