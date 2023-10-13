package search;

import java.util.*;

public class Main {

  public static int solution(int[][] arr, int n) {

    int max = Integer.MIN_VALUE;
    int ans = 0;

    for (int i = 1; i <= n; i++) {
      int cnt = 0;
      for (int j = 1; j <= n; j++) {
        for (int k = 1; k <= 5; k++) {
          if (arr[i][k] == arr[j][k]) {
            cnt++;
            break;
          }
        }
      }
      if (max < cnt) {
        max = cnt;
        ans = i;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int[][] arr = new int[n + 1][6];

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 5; j++) {
        arr[i][j] = in.nextInt();
      }
    }

    System.out.println(solution(arr, n));
  }

}

