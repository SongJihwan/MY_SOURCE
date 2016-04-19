package step25;

import java.lang.reflect.Method;

public class Test06 {
  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step25.Member2");
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
