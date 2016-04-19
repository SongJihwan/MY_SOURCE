package step25;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.LocalVariable;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.Type;

public class Test11 {
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
    Class<?> clazz = Class.forName("step25.Test11$Member");
    Object obj = clazz.newInstance();
    JavaClass clazz2 = Repository.lookupClass("step25.Test11$Member");
    Method[] methods = clazz2.getMethods();
    LocalVariable[] vars = null;
    Type[] types = null;
    for (Method method : methods) {
      if (!method.getName().equals("setMember"))
        continue;
      
      types = method.getArgumentTypes();
      vars = method.getLocalVariableTable().getLocalVariableTable();
      for (int i = 1; i < vars.length; i++) {
        System.out.println(vars[i].getName() + ":" + types[i-1].toString());
      }
    }
    
  }
}
