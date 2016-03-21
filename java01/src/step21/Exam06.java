package step21;

import java.util.ArrayList;
import java.util.Date;
import java.util.Comparator;

public class Exam06 {
  static void printList(ArrayList<String> list) {
    System.out.println("----------------------");
    for (String e : list) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    list.add("111");
    list.add("aaa");
    list.add("444");
    list.add("BBB");
    list.add("222");
    list.add("333");
    list.add("aab");
    list.add("Aac");

    printList(list);

    list.sort(new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.toLowerCase().compareTo(s2.toLowerCase());
      }
    });

    printList(list);
  }
}
