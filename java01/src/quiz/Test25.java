package quiz;


//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Map the given integer to a month.
Example
getMonthName(1) = "Jan"
getMonthName(0) = "invalid month"
[input] integer mo
a non-negative integer
[output] string
a 3 letter abbreviation of month number mo or "invalid month"
if the month doesn't exist
*/

import java.util.Scanner;

public class Test25{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int mon = s.nextInt();
    String[] mon_arr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
        "Aug", "Sep", "Oct", "Nov", "Dec"};
    String result = "invaild month";

    if (mon > 0 && mon < 13) {
      result = mon_arr[mon - 1];
    }

    System.out.println("\"" + result + "\"");
  }
}
