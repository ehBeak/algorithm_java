package search.array;

import java.util.*;

public class CalculateScore {

  public static int solution(int[] arr, int n) {
    int total = 0;
    int score = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        score++;
      } else {
        score = 0;
      }
      total += score;
    }
    return total;
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
