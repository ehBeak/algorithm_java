package search;

import java.util.Scanner;

public class Main {

  public static int solution(int[][] arr, int n) {
    int[] idx = {0, 1, 0, -1};
    int[] jdx = {1, 0, -1, 0};
    boolean flag = true;
    int count = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        flag = true;
        for (int k = 0; k < 4; k++) {
          if (arr[i][j] <= arr[i + idx[k]][j + jdx[k]]) {
            flag = false;
          }
        }
        if (flag) {
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n + 2][n + 2];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        arr[i][j] = in.nextInt();
      }
    }
    System.out.println(solution(arr, n));
  }
}