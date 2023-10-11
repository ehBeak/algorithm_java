package search;

import java.util.*;

public class Main {

  public static int[] solution(int[] arr, int n) {

    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      int iScore = 1;
      for (int j = 0; j < n; j++) {
        if (arr[i] < arr[j]) iScore++;
      }
      res[i] = iScore;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    for (int i : solution(arr, n)) {
      System.out.print(i + " ");

    }
  }

}

