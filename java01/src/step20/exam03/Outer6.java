package step20.exam03;

import java.lang.reflect.Method;

public class Outer6 {
  int no;

  Object obj1 = new Object() {
    public void test() {
      System.out.println("어떻게 호출하지?");
    }

    @Override
    public String toString() {
      return "오호라";
    }

  };

  void m(){
    System.out.println(obj1);
    // obj1.test();
    try {
      Class classInfo = obj1.getClass();
      Method methodInfo = classInfo.getMethod("test");
      methodInfo.invoke(obj1);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
