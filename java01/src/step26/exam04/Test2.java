package step26.exam04;

import java.io.IOException;
import java.io.Writer;

public class Test2 {

  public static void main(String[] args) throws IOException {
    Box<?> r1 = new Box<String>();
    r1 = new Box<Integer>();
    r1 = new Box<Writer>();
    
    Box<?> r2 = new Box<String>();
    String s = (String)r2.getValue();
  }

}
