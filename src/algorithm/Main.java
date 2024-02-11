package algorithm;

import java.util.Scanner;

public class Main {

  static int n, f;
  static int[] combination;
  static int[][] memo;
  static int[] arr;
  static boolean[] visit;
  static boolean flag = false;

  public static int C(int n, int r) {
    if (n == r || r == 0) {
      return 1;
    }
    if (memo[n][r] != 0) {
      return memo[n][r];
    }
    return memo[n][r] = C(n - 1, r - 1) + C(n - 1, r);
  }

  public static void solution(int level, int sum) {
    if (flag) {
      return;
    }
    if (level == n) {
      if (sum == f) {
        flag = true;
        for (int i : arr) {
          System.out.print(i + " ");
        }
        System.out.println();
      }
    }

    for (int i = 1; i <= n; i++) {
      if (!visit[i]) {
        visit[i] = true;
        arr[level] = i;
        solution(level + 1, sum + (arr[level] * combination[level]));
        visit[i] = false;
      }
    }
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    f = in.nextInt();
    combination = new int[n];
    arr = new int[n];
    memo = new int[n][n];
    visit = new boolean[n + 1];
    for (int i = 0; i < n; i++) {
      combination[i] = C(n - 1, i);
    }
    solution(0, 0);
  }
}