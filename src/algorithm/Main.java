package algorithm;

import java.util.Scanner;

public class Main {

  static int n, m;
  static int[] pick;
  static int[] visit;

  public static void solution(int level, int idx) {
    if (level == m) {
      for (int i : pick) {
        System.out.print(i + " ");
      }
      System.out.println();
      return;
    }
    for (int i = idx; i <= n; i++) {
      pick[level] = i;
      solution(level + 1, i + 1);
    }
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    m = in.nextInt();
    pick = new int[m];
    visit = new int[n];
    solution(0, 1);
  }
}