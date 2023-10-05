package search;

import java.util.Scanner;
public class Main {

  public static int solution(String str) {

    int ans = 0;
    for (char c : str.toCharArray()) {
      if (c >= 48 && c <= 57) {
        ans = ans * 10 + (c - 48);
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.next();
    System.out.println(solution(input));
  }

}
