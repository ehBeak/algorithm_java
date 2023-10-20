package search;

import java.util.Scanner;

public class Main {

  public static int solution(int[][] arr, int n) {

    int max = Integer.MIN_VALUE;
    int res = 0;

    for (int i = 0; i < n; i++) {
      int cnt = 0;
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < 5; k++) {
          if (arr[i][k] == arr[j][k]) {
            cnt++;
            break;
          }
        }
      }
      if (max < cnt) {
        max = cnt;
        res = i + 1;
      }
    }

    return res;
  }

  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n][5];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 5; j++) {
        arr[i][j] = in.nextInt();
      }
    }

    System.out.println(solution(arr, n));
  }
}