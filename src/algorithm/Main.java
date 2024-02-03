package algorithm;

import java.util.Scanner;

public class Main {

  static int[] arr;

  public static int solution(int n) {
    if (arr[n] > 0) {
      return arr[n];
    }
    if (n == 1 || n==2) {
      return arr[n] = 1;
    } else {
      return arr[n] = solution(n - 2) + solution(n - 1);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    arr = new int[n + 1];
    solution(n);
    for (int i = 1; i <= n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}