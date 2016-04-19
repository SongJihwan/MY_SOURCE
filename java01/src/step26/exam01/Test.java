package step26.exam01;

import java.util.Date;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub 
    Box box = new Box();
    
    box.setValue("okok");
    box.setValue(new Date());
    box.setValue(10);
    
    String s = (String)box.getValue();
    
  }

}
