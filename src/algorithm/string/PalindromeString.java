package algorithm.string;

import java.util.Scanner;

public class PalindromeString {

  public static String solution(String str) {
    String upperCaseStr = str.toUpperCase();

    int lt = 0;
    int rt = upperCaseStr.length() - 1;
    while (lt < rt) {
      if (upperCaseStr.charAt(lt) != upperCaseStr.charAt(rt)) {
        return "NO";
      }
      lt++;
      rt--;
    }
    return "YES";
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.next();
    System.out.println(solution(input));
  }

}
