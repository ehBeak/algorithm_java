package algorithm.string;

import java.util.Scanner;

public class ChangeUpperLowerCase {

  public String solution(String str) {

    String ans = "";
    for(int i = 0; i<str.length(); i++) {
      if (str.charAt(i) < 97) {
        ans += (char) (str.charAt(i) + 32);
      } else {
        ans += (char) (str.charAt(i) - 32);
      }
    }
    return ans;
  }

  public static void main(String[] args) {

    ChangeUpperLowerCase T = new ChangeUpperLowerCase();
    Scanner in = new Scanner(System.in);
    String input = in.next();
    System.out.println(T.solution(input));
  }

}
