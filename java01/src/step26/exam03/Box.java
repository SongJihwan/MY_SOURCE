package step26.exam03;

import java.io.Writer;

public class Box<T extends Writer> {
  T obj;
  
  public Box() {
    super();
    // TODO Auto-generated constructor stub
  }

  public T getValue() {
    return obj;
  }
  
  public void setValue(T obj) {
    this.obj = obj;
  }
}
