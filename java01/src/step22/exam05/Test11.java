// 주제: 대용량 데이터 읽기 - 버퍼링 데코레이터 사용 후
package step22.exam05;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Test11 {
  public static void main(String[] args) throws Exception {
    ObjectInputStream in1 = new ObjectInputStream(
    new BufferedInputStream(
    new FileInputStream("exam05.Test10.data")));

    Member2 m1 = (Member2)in1.readObject();
    m1.caculateBMI();
    Member2 m2 = (Member2)in1.readObject();
    m2.caculateBMI();

    System.out.println(m1);
    System.out.println(m2);

    in1.close();
  }
}
