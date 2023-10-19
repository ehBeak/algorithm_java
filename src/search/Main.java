package search;

import java.util.*;

public class Main {

  public static int solution(int[] arr, int n, int m) {
    int sum = 0, lt = 0, res = 0;

    for (int rt = 0; rt < n; rt++) {
      sum += arr[rt];
      if (sum == m) {
        res++;
      }
      while (sum >= m) {
        sum -= arr[lt++];
        if (sum == m) {
          res++;
        }
      }
    }
    return res;
  }
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    System.out.println(solution(arr, n, m));

  }
}