package algorithm.ex01;


public class Test {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안창호");
    list.add("김원봉");
    list.add("김구");

    list.add(3, "가나다");
    list.remove(6);
    list.remove(5);
    // list.add(8, "송지환2");
    // list.add(-1, "송지환3");
    list.add("dkdkdk");

    list.set(1, "ssssss");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }



  }
}