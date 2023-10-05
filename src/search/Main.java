package search;

import java.util.Scanner;

public class Main {

  public static int[] solution(String str, char t) {

    int[] ans = new int[str.length()];
    int d = Integer.MAX_VALUE - 100;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == t) {
        d = 0;
      } else {
        d++;
      }
      ans[i] = d;
    }

    d = Integer.MAX_VALUE - 100;
    for (int i = str.length() - 1; i >= 0; i--) {
      if (str.charAt(i) == t) {
        d = 0;
      } else {
        d++;
      }
      ans[i] = Math.min(ans[i], d);
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    char t = in.next().charAt(0);
    for (int e : solution(str, t)) {
      System.out.print(e + " ");
    }

  }

}
