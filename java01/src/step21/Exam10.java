package step21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.AbstractCollection;

public class Exam10 {
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
  }

  static void printList(HashSet<Member> list) {
    System.out.println("----------------------");

    for (Object s : list.toArray()) {
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    HashSet<Member> set = new HashSet<>();
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 16);
    Member m4 = new Member("홍길동", 20);
    Member m5 = new Member("임꺽정", 30);


    System.out.println("m1 = " + m1.hashCode());
    System.out.println("m2 = " + m2.hashCode());
    System.out.println("m3 = " + m3.hashCode());
    System.out.println("m4 = " + m4.hashCode());
    System.out.println("m5 = " + m5.hashCode());

    set.add(m1);
    set.add(m2);
    set.add(m3);
    set.add(m4);
    set.add(m5);

    printList(set);
  }
}
