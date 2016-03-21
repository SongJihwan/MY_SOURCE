/* 주어진 포러를 뒤져서 중첩 클래스 파일만 이름을 출력하라.*/

package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

public class Test09 {
  public static void recur(File f, String args) {
    String str = args.toLowerCase();
    if (f.isFile() && (f.getName().endsWith(".class") && f.getName().contains(str))) {
      System.out.println(f.getName());
    } else if (f.isDirectory()){
      File[] files = f.listFiles();
      for (File file : files) {
        recur(file, str);
      }
    }
  }

  public static void main(String[] args) {
    try {
      for(int i = 0; i < args.length - 1; i++){
        recur(new File(args[i + 1]), args[0]);
      }
    } catch (Exception e) {
      System.out.println("형식이 잘못됐습니다.");
    }
  }

}
