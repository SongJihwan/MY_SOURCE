package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

public class Test07 {
  public static void recur(File f) {
    if (f.isFile() && f.getName().endsWith(".class")) {
      System.out.println(f.getName());
    } else if (f.isDirectory()){
      File[] files = f.listFiles();
      for (File file : files) {
        recur(file);
      }
    }
  }

  public static void main(String[] args) throws IOException {
    recur(new File("."));
  }
}
