package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Test6 {
  public static void main(String[] args) {
    File f = new File("test.txt");

    try {
      FileReader in = new FileReader("test2.txt");
      System.out.println("파일을 찾았습니다.");
    } catch (FileNotFoundException e) {
      System.out.println("파일을 찾을 수 없습니다.");
    }
  }
}
