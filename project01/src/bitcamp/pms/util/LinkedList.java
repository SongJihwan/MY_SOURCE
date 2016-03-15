package bitcamp.pms.util;

public class LinkedList<T> {
  Bucket<T> start;
  Bucket<T> end;
  int cnt;

  public LinkedList() {
    start = new Bucket<T>();
    end = start;
  }

  public int size() {
    return cnt;
  }

  public void add(T value) {
    end.value = value;
    Bucket<T> newBucket = new Bucket<T>();
    end.next = newBucket;
    end = newBucket;
    cnt++;
  }

  public void add(int index, T value) {
    if (index < 0 || index > cnt) {
      return ;
    }

    if (index == cnt) {
      add(value);
      return ;
    }

    cnt++;
    if (index == 0) {
      Bucket<T> newBucket= new Bucket<T>(value, start);
      start = newBucket;
      return ;
    }

    Bucket<T> cursor = previousCursor(index, start);
    Bucket<T> newBucket = new Bucket<T>(value, cursor.next);
    cursor.next = newBucket;
    cnt++;
  }

  public T remove(int index) {
    if (index < 0 || index >= cnt) {
      return null;
    }

    T deleteValue;
    cnt--;

    if (index == 0) {
      deleteValue = start.value;
      start = start.next;
      return deleteValue;
    }

    Bucket<T> deleteNextBucket = previousCursor(index, start);
    deleteValue = deleteNextBucket.next.value;
    deleteNextBucket.next = deleteNextBucket.next.next;
    return deleteValue;
  }


  public T get(int index) {
    if (index < 0 || index >= cnt) {
      return null;
    }

    Bucket<T> cursor = currentCursor(index, start);

    return cursor.value;
  }

  public T set(int index, T value) {
    if (index < 0 || index >= cnt) {
      return null;
    }

    Bucket<T> cursor = currentCursor(index, start);
    T updatePreValue = cursor.value;
    cursor.value = value;

    return updatePreValue;
  }

  public Bucket<T> previousCursor(int index, Bucket<T> cursor) {
    for (int i = 1; i < index; i++) {
      cursor = cursor.next;
    }

    return cursor;
  }

  public Bucket<T> currentCursor(int index, Bucket<T> cursor) {
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    return cursor;
  }
}
