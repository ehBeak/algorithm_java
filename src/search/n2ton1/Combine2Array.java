package search.n2ton1;

import java.util.*;

public class Combine2Array {

  public static int[] solution(int n, int[] arr1, int m, int[] arr2) {
    int[] res = new int[n + m];
    int idx1 = 0;
    int idx2 = 0;

    for (int i = 0; i < n + m; i++) {
      if (idx1 >= n) {
        while (idx2 < m) {
          res[i++] = arr2[idx2];
          idx2++;
        }
        break;
      }
      if (idx2 >= m) {
        while (idx1 < n) {
          res[i++] = arr2[idx1];
          idx1++;
        }
        break;
      }

      if (arr1[idx1] > arr2[idx2]) {
        res[i] = arr2[idx2];
        idx2++;
      } else {
        res[i] = arr1[idx1];
        idx1++;
      }
    }

    return res;
  }


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr1 = new int[n];
    for (int i = 0; i < n; i++) {
      arr1[i] = in.nextInt();
    }

    int m = in.nextInt();
    int[] arr2 = new int[m];
    for (int i = 0; i < m; i++) {
      arr2[i] = in.nextInt();
    }

    for (int i : solution(n, arr1, m, arr2)) {
      System.out.print(i + " ");
    }

  }

}
