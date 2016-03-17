package step19;

public class Test14 {
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
    // } catch (OldManException e) {
    // } catch (AgeException e) {
    // } catch (Exception e) {
    } catch (Throwable e) {
    // } catch (Object e) {
      e.printStackTrace();
    }
  }
}
