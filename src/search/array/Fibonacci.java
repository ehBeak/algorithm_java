package search.array;

import java.util.*;

public class Fibonacci {

  public static int[] solution(int n) {
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      if (i == 0 || i == 1) {
        ans[i] = 1;
      } else {
        ans[i] = ans[i - 1] + ans[i - 2];
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i : solution(n)) {
      System.out.print(i + " ");
    }
  }
}
