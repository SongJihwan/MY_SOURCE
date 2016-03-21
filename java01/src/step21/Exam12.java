package step21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.AbstractCollection;

public class Exam12 {
  static class Member {
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return name + ", " + age;
    }

    @Override
    public int hashCode() {
      return toString().hashCode();
    }

    @Override
    public boolean equals(Object other) {
      if (other == null || other.getClass() != this.getClass()) {
        return false;
      }

      Member m = (Member)other;

      if(!this.name.equals(name)) {
        return false;
      }

      if(this.age != age) {
        return false;
      }

       return true;
    }

  }

  static void printList(HashMap<String, Member> list) {
    System.out.println("----------------------");

    // for (Object s : list.toArray()) {
      // System.out.println(s);
    // }
  }

  public static void main(String[] args) {
    String k1 = new String("aaa");
    String k2 = new String("bbb");
    String k3 = new String("ccc");
    String k4 = new String("ddd");
    String k5 = new String("eee");

    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 16);

    HashMap<String, Member> map = new HashMap<>();
    map.put(k1, m1);
    map.put(k2, m2);
    map.put(k3, m3);
    map.put(k4, m1);
    map.put(k5, m2);

    // printList(map);
    System.out.println(map.get(new String("aaa")));
    System.out.println(map.get(new String("bbb")));
    System.out.println(map.get(new String("ccc")));
    System.out.println(map.get(new String("ddd")));
    System.out.println(map.get(new String("eee")));
  }
}
