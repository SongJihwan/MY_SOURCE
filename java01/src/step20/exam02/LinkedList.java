package step20.exam02;

public class LinkedList {
  private class Bucket {
    Object value;
    Bucket next;

    public Bucket() {}

    public Bucket(Object value, Bucket next) {
      this.value = value;
      this.next = next;
    }
  }

  Bucket start;
  Bucket end;
  int cnt;

  public LinkedList() {
    start = new Bucket();
    end = start;
  }

  public int size() {
    return cnt;
  }

  public void add(Object value) {
    end.value = value;
    Bucket newBucket = new Bucket();
    end.next = newBucket;
    end = newBucket;
    cnt++;
  }

  public void add(int index, Object value) {
    if (index < 0 || index > cnt) {
      return ;
    }

    if (index == cnt) {
      add(value);
      return ;
    }

    cnt++;
    if (index == 0) {
      Bucket newBucket= new Bucket(value, start);
      start = newBucket;
      return ;
    }

    Bucket cursor = previousCursor(index, start);
    Bucket newBucket = new Bucket(value, cursor.next);
    cursor.next = newBucket;
    cnt++;
  }

  public Object remove(int index) {
    if (index < 0 || index >= cnt) {
      return null;
    }

    Object deleteValue;
    cnt--;

    if (index == 0) {
      deleteValue = start.value;
      start = start.next;
      return deleteValue;
    }

    Bucket deleteNextBucket = previousCursor(index, start);
    deleteValue = deleteNextBucket.next.value;
    deleteNextBucket.next = deleteNextBucket.next.next;
    return deleteValue;
  }


  public Object get(int index) {
    if (index < 0 || index >= cnt) {
      return null;
    }

    Bucket cursor = currentCursor(index, start);

    return cursor.value;
  }

  public Object set(int index, Object value) {
    if (index < 0 || index >= cnt) {
      return null;
    }

    Bucket cursor = currentCursor(index, start);
    Object updatePreValue = cursor.value;
    cursor.value = value;

    return updatePreValue;
  }

  public Bucket previousCursor(int index, Bucket cursor) {
    for (int i = 1; i < index; i++) {
      cursor = cursor.next;
    }

    return cursor;
  }

  public Bucket currentCursor(int index, Bucket cursor) {
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    return cursor;
  }
}
