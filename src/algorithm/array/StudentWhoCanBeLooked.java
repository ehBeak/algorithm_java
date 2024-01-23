package algorithm.array;

import java.util.*;

public class StudentWhoCanBeLooked {

  public static int solution(int[] arr, int n) {
    int cnt = 1;
    int maxPrev = arr[0];
    for (int i = 1; i < n; i++) {
      if (maxPrev < arr[i]) {
        maxPrev = arr[i];
        cnt++;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    System.out.println(solution(arr, n));

  }

}
