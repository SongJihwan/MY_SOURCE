// 주제: 주어진 폴더를 뒤져서 중첩 클래스 파일만 이름을 출력하라.
// > java -cp bin step22.exam01.Test08 ./bin ../project01/bin
// 출력 결과:
// /home/bitcamp/git/Java80/java01/bin/step22/exam01/Test07$1.class
// /home/bitcamp/git/Java80/java01/bin/step22/exam01/Test07$2.class
// /home/bitcamp/git/Java80/java01/bin/step22/exam01/Test07$3.class

package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;
import java.io.FileFilter;

public class Test08 {
  public static void main(String[] args) throws IOException {
    for (int i = 0; i < args.length; i++) {
      printFilename(new File(args[i]), ".class");
    }
  }

  static void printFilename(File f, String ext) throws IOException {
    if (f.isFile()) {
      if (f.getName().endsWith(ext) && f.getName().contains("$")) {
        System.out.println(f.getCanonicalPath());
      }
    } else {
      File[] files = f.listFiles();
      for (File file : files) {
        printFilename(file, ext);
      }
    }
  }

}
