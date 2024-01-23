package algorithm.n2ton1;

import java.util.*;

public class Revenue {

  public static int solution(int[] arr, int n, int k) {

    int sum = 0;
    for (int j = 0; j < k; j++) sum += arr[j];

    int max = sum;
    for (int i = k; i < n - k; i++) {
      sum = sum + arr[i] - arr[i - k];
      if (max < sum) max = sum;
    }
    return max;
  }


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    System.out.println(solution(arr, n, k));
  }

}
