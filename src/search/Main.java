package search;

import java.util.*;

public class Main {

  public static int solution(int[][] arr, int n) {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        boolean flag = true;
        for (int k = 0; k < 4; k++) {
          int nx = dx[k];
          int ny = dy[k];
          if (nx < n && nx >=0 && ny < n && ny >= 0 && arr[i + nx][j + ny] >= arr[i][j]) {
            flag = true;
            break;
          }
        }
        if(flag) cnt++;
      }
    }
    return cnt;
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

