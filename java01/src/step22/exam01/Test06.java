package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

public class Test06 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");

    File[] f_arr = f.listFiles(new FilenameFilter() {
      @Override
      public boolean accept(File file, String name) {
        if (name.endsWith(".txt") {
          return true;
        }
        return false;
      }
    });

    for (File file : f_arr) {
      System.out.println(file.getName());
    }
  }
}
