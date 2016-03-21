package step21;

import java.util.HashMap;
import java.util.Set;
// import static java.util.Map.Entry;
import java.util.Map;

public class Exam16 {
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

  public static void main(String[] args) {
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 16);

    HashMap<String, Member> map = new HashMap<>();
    map.put("aaa", m1);
    map.put("bbb", m2);
    map.put("ccc", m3);

    Set<Map.Entry<String, Member>> entrySet = map.entrySet();

    for (Map.Entry<String, Member> entry : entrySet) {
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }
  }
}
