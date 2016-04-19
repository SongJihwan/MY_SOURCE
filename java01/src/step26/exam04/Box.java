package step26.exam04;

public class Box<T> {
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
