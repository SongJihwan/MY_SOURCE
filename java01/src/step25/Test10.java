package step25;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test10 {
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
    Class<?> clazz = Class.forName("step25.Test10$Member");
    Object obj = clazz.newInstance();
    Method m = clazz.getDeclaredMethod("setMember", String.class, int.class, float.class, float.class);
    Object[] arguments = {"홍길동", 20, 85.5f, 182.4f};
    m.invoke(obj, arguments);
    System.out.println(obj);
    m.invoke(obj, "임꺽정", 30, 90f, 180f);
    System.out.println(obj);
  }
}
