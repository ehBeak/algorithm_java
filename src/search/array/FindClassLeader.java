package search.array;

import java.util.*;

public class FindClassLeader {

  public static int solution(int[][] arr, int n) {

    int[] student = new int[n];

    int ans = 0;
    int max = Integer.MIN_VALUE;

    for (int j = 0; j < n; j++) {
      for (int i = 0; i < n; i++) {
        for (int k = i + 1; k < n; k++) {
          if (arr[k][j] == arr[i][j]) {
            student[k]++;
            student[i]++;
          }
        }
      }
    }

    for (int i = 0; i < n; i++) {
      if (max < student[i]) {
        max = student[i];
        ans = i + 1;
      }
    }

    return ans;
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

    System.out.println(solution(arr, n));
  }

}
