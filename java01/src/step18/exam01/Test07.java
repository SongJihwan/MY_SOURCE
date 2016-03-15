package step18.exam01;

public class Test07 {
  public static void main(String[] args) {
    Bucket p1 = new Bucket();
    Bucket6<String> p2 = new Bucket6<>();

    p1.value = new String("okok");
    p2.value = new String("okok22");


    String s1 = (String)p1.value;
    String s2 = p2.value;
  }
}
