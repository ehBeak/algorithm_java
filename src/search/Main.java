package search;

import java.util.Scanner;

public class Main {

  public static int solution(int[][] arr, int n) {

    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    int cnt = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        boolean flag = true;
        for (int k = 0; k < 4; k++) {
          int x = i + dx[k];
          int y = j + dy[k];
          if (x >= 0 && x < n && y >= 0 && y < n && arr[i][j] <= arr[x][y]) {
            flag = false;
            break;
          }
        }
        if (flag) cnt++;
      }
    }
    return cnt;
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = in.nextInt();
      }
    }

    System.out.println(solution(arr, n));
    return ;
  }
}