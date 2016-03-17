package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Test7 {
  public static void main(String[] args) throws FileNotFoundException {
    File f = new File(args[0]);
    FileReader in = new FileReader(args[0]);
    System.out.println("파일을 찾았습니다.");
  }
}
