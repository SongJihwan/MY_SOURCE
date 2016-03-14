package algorithm.ex02;

public class Stack {
  Bucket top;
  Bucket bottom;
  int cnt;

  public Stack() {
    // top = new Bucket();
    // bottom = top;
  }

  public void push(Object value) {
    Bucket newTop = new Bucket(value, top);
    top = newTop;
    cnt++;
  }

  public Object pop() {
    if(cnt == 0) {
      return null;
    }

    Object oldTop = top.value;
    cnt--;
    top = top.previous;

    return oldTop;
  }

  public int size() {
    return cnt;
  }
}
