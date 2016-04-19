package step25;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test09 {
  static class Member {
    String name;
    int age;
    float weight;
    float height;
    
    public void setMember(String name, int age, float weight, float height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
    }

    @Override
    public String toString() {
      return "Member [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
    }     
  }

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step25.Test09$Member");

    Method m = clazz.getDeclaredMethod("setMember", String.class, int.class, float.class, float.class);
    
    for (Parameter param : m.getParameters()) {
      System.out.println(param.getName() + " : " + param.getType().getName());
    }
  }
}
