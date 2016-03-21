package step22.exam01;

import java.io.File;
import java.sql.Date;
import java.io.IOException;

public class Test01 {
  public static void main(String[] args) throws IOException {
    File f = new File("../project01/src/bitcamp/pms/ProjectApp.java");
    System.out.println("getName() = " + f.getName());
    System.out.println("getPath() = " + f.getPath());
    System.out.println("getAbsolutePath() = " + f.getAbsolutePath());
    System.out.println("getCanonicalPath() = " + f.getCanonicalPath());
    System.out.println("getParent() = " + f.getParent());
    System.out.println("length() = " + f.length() + "bytes");
    System.out.println("toURI() = " + f.toURI());
    System.out.println("isFile() = " + f.isFile());
    System.out.println("isDirectory() = " + f.isDirectory());
    System.out.println("exists() = " + f.exists());
    System.out.println("getTotalSpace() = " + f.getTotalSpace());
    System.out.println("getFreeSpace() = " + f.getFreeSpace());
    System.out.println("getUsableSpace() = " + f.getUsableSpace());
    System.out.println("lastModified() = " + new Date(f.lastModified()));
  }
}
