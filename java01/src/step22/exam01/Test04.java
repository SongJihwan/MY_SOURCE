package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test04 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");
    File[] f_arr = f.listFiles();
    for (File name : f_arr) {
      if (name.isFile()) {
        System.out.println(name.getName());
      }
    }

    // for(String name : arr) {
    //   System.out.println(name);
    // }
  }
}
