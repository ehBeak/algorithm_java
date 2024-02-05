package algorithm;

import java.util.Scanner;

public class Main {

  static int[] arr;
  static int n;
  static int total = 0;
  static String answer = "NO";
  static boolean flag = false;

  public static void dfs(int idx, int sum) {
    if (flag) {
      return;
    }
    if (total / 2 < sum) {
      return;
    }
    if (idx == n) {
      if ((total - sum) == sum) {
        answer = "YES";
        flag = true;
      }
    } else {
      dfs(idx + 1, sum + arr[idx]);
      dfs(idx + 1, sum);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
      total += arr[i];
    }
    dfs(0, 0);
    System.out.println(answer);
  }
}