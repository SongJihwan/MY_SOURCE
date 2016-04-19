package step25;

import java.lang.reflect.Method;

public class Test07 {
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
      this.name = firstName + middleName + lastName;
    }
  }
  

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step25.Test07$Member");

    Method m1 = clazz.getDeclaredMethod("setName", String.class);
    Method m2 = clazz.getDeclaredMethod("setName", String.class, String.class, String.class);
    Method m3 = clazz.getDeclaredMethod("setName", int.class);
    
    
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
  }
}
