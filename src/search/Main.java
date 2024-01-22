package search;

import java.util.Scanner;

public class Main {

  public static int solution(int[] arr, int n, int m) {
    int answer = 0;
    int sum = 0;
    int idx = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      if (sum == m) {
        answer++;
      }
      while (sum >= m) {
        sum -= arr[idx++];
        if (sum == m) {
          answer++;
        }
      }
    }
    return answer;
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