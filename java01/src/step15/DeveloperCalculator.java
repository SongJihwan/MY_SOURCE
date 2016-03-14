package step15;

public class DeveloperCalculator extends CalculatorPlus {
  public void printResult(int radix){
    switch(radix) {
    case 2:
      System.out.println(Integer.toBinaryString(result));
      break;
    case 8:
      System.out.println(Integer.toOctalString(result));
      break;
    case 16:
      System.out.println(Integer.toHexString(result));
      break;
    default:
      printResult();
    }
  }
}
