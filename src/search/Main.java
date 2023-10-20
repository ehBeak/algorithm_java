package search;

import java.util.Scanner;

public class Main {

  public static int solution(int[] arr, int n, int m) {

    int lt = 0;
    int sum = 0;
    int cnt = 0;

    for (int rt = 0; rt < n; rt++) {
      sum += arr[rt];
      if (sum == m) cnt++;

      while (sum >= m) {
        sum -= arr[lt++];
        if (sum == m) cnt++;
      }
    }
    return cnt;
  }

  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    System.out.println(solution(arr, n, m));
  }
}