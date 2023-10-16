package search;

import java.util.*;

public class Main {

  public static int solution(int[][] arr, int n) {

    int[] idx = {-1, 0, 1, 0};
    int[] jdx = {0, -1, 0, 1};

    int res = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        boolean flag = true;
        for (int k = 0; k < 4; k++) {
          int x = i + idx[k];
          int y = j + jdx[k];
          if (x < n && x >= 0 && y < n && y >= 0 && arr[i][j] <= arr[x][y]) {
            flag = false;
            break;
          }
        }
        if (flag) res++;

      }
    }
    return res;

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
  }
}


