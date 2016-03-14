package algorithm.ex01;

public class LinkedList {
  Bucket start;
  Bucket end;
  int cnt;

  public LinkedList() {
    start = new Bucket();
    end = start;
  }

  public void add(Object value) {
    end.value = value;
    Bucket temp = new Bucket();
    end.next = temp;
    end = temp;
    cnt++;
  }

  public void add(int index, Object value) {
    if (index > 0 && index < cnt){
      Bucket cursor = start;
      Bucket nextBucket = new Bucket();
      Bucket newBucket = new Bucket();
      for (int i = 1; i < index; i++) {
        cursor = cursor.next;
      }

      nextBucket = cursor.next;

      cursor.next = newBucket;
      newBucket.value = value;
      newBucket.next = nextBucket;

      cnt++;

    } else if (index >= cnt) {
      System.out.println("중간값이 아니므로 리스트의 마지막 번호(" + cnt + ")로 추가합니다.");
      add(value);
      return ;
    } else if (index == 0) {
      Bucket tmp = new Bucket();
      tmp.next = start;
      start = tmp;
      cnt++;
      return ;
    } else {
      System.out.println("삽입할 수 없는 Index입니다.");
      return ;
    }
  }

  public Object remove(int index) {
    Bucket cursor = start;
    Bucket preBucket = new Bucket();
    Bucket deleteBucket = new Bucket();

    if (index < 0 || index >= cnt) {
      return null;
    } else if (index == 0) {
      deleteBucket = start;
      start = start.next;
      cnt--;
      return deleteBucket.value;
    } else {
      for (int i = 1; i < index; i++) {
        cursor = cursor.next;
      }
      preBucket = cursor;
      deleteBucket = cursor.next;
      preBucket.next = deleteBucket.next;
      cnt--;
    }
    return deleteBucket.value;
  }


  public Object get(int index) {
    if(index >= 0 && index < cnt) {
      Bucket cursor = start;
      for (int i = 1; i <= index; i++) {
        if (cursor.next == null) {
          return null;
        }
        cursor = cursor.next;
      }
      return cursor.value;
    }
    return null;
  }

  public Object set(int index, Object value) {
    if (index < 0 || index >= cnt) {
      return null;
    }

    Bucket cursor = start;
    Bucket preBucket = new Bucket();
    for (int i = 0; i < index; i++) {
      preBucket = cursor.next;
    }
    Bucket newBucket = preBucket;
    newBucket.value = value;

    return preBucket.value;
  }

  public int size() {
    return cnt;
  }


}
