/* 주어진 포러를 뒤져서 중첩 클래스 파일만 이름을 출력하라.*/

package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

public class Test08 {
  public static void recur(File f) {
    if (f.isFile() && (f.getName().endsWith(".class") && f.getName().contains("$"))) {
      System.out.println(f.getName());
    } else if (f.isDirectory()){
      File[] files = f.listFiles();
      for (File file : files) {
        recur(file);
      }
    }
  }

  public static void main(String[] args) {
    try {
      for(int i = 0; i < args.length; i++){
        recur(new File(args[i]));
      }
    } catch (Exception e) {
      System.out.println("형식이 잘못됐습니다.");
    }
  }

}
