package search;

import java.util.*;

public class Main {

  public static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {

    ArrayList<Integer> res = new ArrayList<>();
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    int p1 = 0;
    int p2 = 0;
    while (p1 < n && p2 < m) {
      if(arr1[p1]==arr2[p2]){
        res.add(arr1[p1++]);
        p2++;
      } else if (arr1[p1] > arr2[p2]) {
        p2++;
      } else {
        p1++;
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