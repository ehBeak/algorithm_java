package algorithm.array;

import java.util.*;

public class FindMentor {

  public static int solution(int[][] arr, int n, int m) {

    int ans = 0;
    int pi = 0, pj = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        int cnt = 0;
        for (int k = 0; k < m; k++) {
          for (int s = 0; s < n; s++) {
            if (arr[k][s] == i) pi = s;
            if (arr[k][s] == j) pj = s;
          }
          if (pi > pj) cnt++;
        }
        if (cnt == m) ans++;
      }
    }
    return ans;
  }
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();

    int[][] arr = new int[m][n];

    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++) arr[i][j] = in.nextInt();

    System.out.println(solution(arr, n, m));
  }

}
