package search;

import java.util.Scanner;

public class Main {


  public static int solution(int[][] arr, int n) {
    int max = 0;
    int president = 0;

    for (int i = 0; i < n; i++) {
      int prev = 0;
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < 5; k++) {
          if (arr[i][k] == arr[j][k]) {
            prev++;
            break;
          }
        }
        if (prev > max) {
          max = prev;
          president = i;
        }
      }
    }
    return president + 1;
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] table = new int[n][5];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 5; j++) {
        table[i][j] = in.nextInt();
      }
    }

    System.out.println(solution(table, n));
  }
}