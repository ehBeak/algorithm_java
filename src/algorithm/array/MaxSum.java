package algorithm.array;

import java.util.*;

public class MaxSum {

  public static int solution(int[][] arr, int n) {
    // 대각선
    int sum = 0;
    int max;
    for (int i = 0; i < n; i++) {
      sum += arr[i][i];
    }
    max = sum;

    sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i][n-i-1];
    }
    if (max < sum) max = sum;


    // row
    for (int i = 0; i < n; i++) {
      sum = 0;
      for (int j = 0; j < n; j++) {
        sum += arr[i][j];
      }
      if (max < sum) max = sum;

    }

// col
    for (int i = 0; i < n; i++) {
      sum = 0;
      for (int j = 0; j < n; j++) {
        sum += arr[j][i];
      }
      if (max < sum) {
        max = sum;
      }
    }
    return max;
  }
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = in.nextInt();
      }
    }

    System.out.println(solution(arr, 5));
  }

}
