package search.string;

import java.util.Scanner;

public class Password {

  public static String solution(int num, String str) {

    str = str.replaceAll("[#]", "1");
    str = str.replaceAll("[*]", "0");
    StringBuilder sb = new StringBuilder();

    int ans;

    while (str.length() != 0) {
      String tmp = str.substring(0, 7);
      char[] cArray = tmp.toCharArray();
      ans = 0;
      int binary = 64;
      for (char c : cArray) {
        int digit = Integer.parseInt(c + "");
        ans += binary * digit;
        binary = binary / 2;
      }

      sb.append((char) ans);
      str = str.substring(7);
    }

    return sb.toString();
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int inputNum = in.next().charAt(0);
    String input = in.next();
    System.out.println(solution(inputNum, input));
  }

}

