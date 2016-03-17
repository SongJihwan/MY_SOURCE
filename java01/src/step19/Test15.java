package step19;

public class Test15 {
  static void m1(int i) throws AgeException {
    throw new AgeException();
  }

  static void m2(int i) throws ChildException {
    throw new ChildException();
  }

  static void m3(int i) throws OldManException {
    throw new OldManException();
  }

  public static void main(String[] args) {
    try {
      m3(Integer.parseInt(args[0]));
      m2(Integer.parseInt(args[0]));
      m1(Integer.parseInt(args[0]));
    } catch (AgeException e) {
      e.printStackTrace();      
    } catch (OldManException e) {
      e.printStackTrace();
    } catch (ChildException e) {
      e.printStackTrace();
    } /*catch (AgeException e) {
      e.printStackTrace();
    }*/
  }
}
