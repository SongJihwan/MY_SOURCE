package step26.exam03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
//    Box<String> box1 = new Box<>();
//    Box<Object> box2 = new Box<>();
    Box<FileWriter> box3 = new Box<>();
    Box<Writer> box4 = new Box<>();
    box3.setValue(new FileWriter(""));
    box4.setValue(new FileWriter(""));
    box4.setValue(new BufferedWriter(null));

//    box.setValue("okok");
    
//    String s = box.getValue();
  }

}
