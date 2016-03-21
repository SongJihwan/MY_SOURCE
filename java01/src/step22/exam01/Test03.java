package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test03 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");
    String[] arr = f.list();
    for(String name : arr) {
      System.out.println(name);
    }
  }
}
