package search.n2ton1;

import java.util.*;

public class PartialSequence {

  public static int solution(int[] arr, int n, int m) {

    int ans = 0, sum = 0, lt = 0;
    for (int rt = 0; rt < n; rt++) {
      sum += arr[rt];
      if (sum == m) {
        ans++;
      }
      while (sum >= m) {
        sum -= arr[lt++];
        if (sum == m) {
          ans++;
        }
      }

    }
    return ans;
  }

  public static void main(String[] args) {

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
