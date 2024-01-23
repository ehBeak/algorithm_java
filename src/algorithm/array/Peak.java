package algorithm.array;

import java.util.*;

public class Peak {

  public static int solution(int[][] arr, int n) {
    int cnt = 0;
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < n + 1; j++) {
        int tmp = arr[i][j];
        if ((arr[i - 1][j] < tmp) && (arr[i][j - 1] < tmp) && (arr[i + 1][j] < tmp) && (arr[i][j + 1] < tmp)) {
          cnt++;
        }
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n + 2][n + 2];

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < n + 1; j++) {
        arr[i][j] = in.nextInt();
      }
    }
    System.out.println(solution(arr, n));
  }
}
