package step21;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Exam08 {
  static void printConcurrentLinkedQueue(ConcurrentLinkedQueue<String> list) {
    System.out.println("----------------------");
    String value = null;
    while((value = list.peek()) != null){
      System.out.println(list.poll());
    }
  }

  public static void main(String[] args) {
    ConcurrentLinkedQueue<String> list = new ConcurrentLinkedQueue<>();
    list.add("111");
    list.add("aaa");
    list.add("444");
    list.add("BBB");
    list.add("222");
    list.add("333");
    list.add("aab");
    list.add("Aac");

    printConcurrentLinkedQueue(list);
  }
}
