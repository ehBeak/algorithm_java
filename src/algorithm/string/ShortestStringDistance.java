package algorithm.string;

import java.util.Scanner;
public class ShortestStringDistance {

  public static String solution(String str, char t) {

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      int prev = Integer.MAX_VALUE;
      for (int j = 0; j < str.length(); j++) {
        char cj = str.charAt(j);
        if (cj == t) {
          int tmp = Math.abs(j - i);
          if (prev > tmp) {
            prev = tmp;
          }
        }
      }
      sb.append(prev).append(" ");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    char t = in.next().charAt(0);
    System.out.println(solution(str, t));
  }

}
