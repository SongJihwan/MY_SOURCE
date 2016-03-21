package step21;

import java.util.ArrayList;
import java.util.Date;

public class Exam02 {
  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>();
    list.add("홍길동");
    list.add("임꺽정");
    list.add(new Integer(10));
    list.add(new Date());

    System.out.println(list.indexOf("임꺽정"));
    System.out.println(list.indexOf(new String("임꺽정")));

    if(list.contains("임꺽정")) {
      System.out.println(list.get(list.indexOf("임꺽정")));
    }

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("오호라");
    list2.add("우헤헤");

    list.addAll(list2);

    for(Object e : list) {
      System.out.println(e);
    }
  }
}
