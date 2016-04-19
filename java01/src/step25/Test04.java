package step25;

import java.lang.reflect.Method;

public class Test04 {
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
    Class<?> clazz = Class.forName("step25.Test04$Member");
    Method[] methods = clazz.getDeclaredMethods();
    
    for (Method method : methods) {
      System.out.println(method.getName());
    }
    System.out.println("---------------------------");
    
    methods = clazz.getMethods();
    for (Method method : methods) {
      System.out.println(method.getName());
    }
    System.out.println("---------------------------");
    
  }
}
