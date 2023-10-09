package search.array;

import java.util.Scanner;

public class BigNumber {

  public static String solution(int[] arr, int n) {
    StringBuilder sb = new StringBuilder().append(arr[0]).append(" ");
    for (int i = 1; i < n; i++) {
      if (arr[i - 1] < arr[i]) {
        sb.append(arr[i]).append(" ");
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    System.out.println(solution(arr, n));
  }

}
