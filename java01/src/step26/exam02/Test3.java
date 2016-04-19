package step26.exam02;

import java.util.Date;

public class Test3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Box<String> box1 = new Box<>();
    Box<Date> box2 = new Box<>();
    Box<Integer> box3 = new Box<>();
    Box<Object> box4 = new Box<>();
    
    box1.setValue("okok");
    box2.setValue(new Date());
    box3.setValue(10);
    
    box4.setValue("okok");
    box4.setValue(new Date());
    box4.setValue(10);
    box4.setValue(true);
    
    String s1 = box1.getValue();
    Date s2 = box2.getValue();
    int s3 = box3.getValue();
    Object s4 = box4.getValue();
  }

}
