package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test02 {
  public static void main(String[] args) throws IOException {
    File f = new File("./test02.txt");
    // f.createNewFile();
    // f.delete();
    // File f2 = new File("./testok.txt");
    // f.renameTo(f2);
    // f.mkdir();
    if (f.delete()) {
      System.out.println("삭제됐습니다.");
    } else {
      System.out.println("삭제하지 못했습니다.");
    }

  }
}