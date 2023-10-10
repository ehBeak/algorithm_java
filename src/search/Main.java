package search;

import java.util.*;

public class Main {

  public static boolean isPrime(int num) {
    if (num == 1) {
      return false;
    }
    for (int i = 2; i*i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static List<Integer> solution(int[] iArray, int n) {
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int tmp = iArray[i];
      int res = 0;
      while (tmp > 0) {
        res = res * 10 + (tmp % 10);
        tmp = tmp / 10;
      }
      if (isPrime(res)) ans.add(res);
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] input = new int[n];
    for(int i=0; i<n; i++) {
      input[i] = in.nextInt();
    }

    for (int i : solution(input, n)) {
      System.out.print(i + " ");
    }
  }

}

