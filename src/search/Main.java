package search;

import java.util.*;

public class Main {

  public static int solution(int[][] arr, int n) {

    int max = Integer.MIN_VALUE;
    int res = 0;

    for (int i = 1; i <= n; i++) {
      int cnt = 0;
      for (int j = 1; j <= n; j++) {
        for (int k = 0; k < 5; k++) {
          if(arr[i][k]==arr[j][k]) {
            cnt++;
            break;
          }
        }
      }
      if (cnt > max) {
        max = cnt;
        res = i;
      }
    }

    return res;
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n+1][5];
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < 5; j++) {
        arr[i][j] = in.nextInt();
      }
    }

    System.out.println(solution(arr, n));
    return ;
  }
}