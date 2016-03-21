package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FileFilter;

public class Test05 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");

    File[] f_arr = f.listFiles(new FileFilter() {
      @Override
      public boolean accept(File file) {
        if (file.isFile()) {
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
