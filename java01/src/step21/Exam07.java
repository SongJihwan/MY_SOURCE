package step21;

import java.util.Stack;
import java.util.EmptyStackException;

public class Exam07 {
  static void printStack(Stack<String> list) {
    System.out.println("----------------------");
    while(true){
      try {
        System.out.println(list.pop());
      } catch (EmptyStackException e) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    Stack<String> list = new Stack<>();
    list.push("111");
    list.push("aaa");
    list.push("444");
    list.push("BBB");
    list.push("222");
    list.push("333");
    list.push("aab");
    list.push("Aac");

    printStack(list);
  }
}
