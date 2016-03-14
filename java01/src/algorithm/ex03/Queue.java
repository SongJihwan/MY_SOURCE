package algorithm.ex03;

public class Queue {
  Bucket front;
  Bucket rear;
  int cnt;

  public Queue() {
    front = new Bucket();
    rear = front;
  }

  public void put(Object value) {
    rear.value = value;
    Bucket newRear = new Bucket();
    rear.next = newRear;
    rear = newRear;
    cnt++;
  }


  public Object poll() {
    Object oldFront = null;
    if(cnt >= 0) {
      oldFront = front.value;
      front = front.next;
      cnt--;
    }

    return oldFront;
  }

  public int size() {
    return cnt;
  }
}
