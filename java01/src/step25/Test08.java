package step25;

import java.lang.reflect.Method;

public class Test08 {
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
    
    public void setName(int i) {
      
    }
    
    public void setName(String firstName, String middleName, String lastName) {
      this.name = firstName + " " + middleName + " " + lastName;
    }

    @Override
    public String toString() {
      return "Member [name=" + name + "]";
    }
    
    
  }
  

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step25.Test08$Member");

    Object obj = clazz.newInstance();
    
    Method m1 = clazz.getDeclaredMethod("setName", String.class);
    
    m1.invoke(obj, "홍길동");
    System.out.println(obj.toString());
    
    Method m2 = clazz.getDeclaredMethod("setName", String.class, String.class, String.class);
    m2.invoke(obj, "길동", "하이", "홍" );
    System.out.println(obj.toString());
    
  }
}
