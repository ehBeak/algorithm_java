package search.array;

import java.util.*;

public class ReversePrime {

  public static List<Integer> solution(String[] strArray, int n) {

    int[] reverseNumArray = new int[n];
    List<Integer> ans = new ArrayList<>();
    boolean flag = true;

    for (int i = 0; i < n; i++) {
      reverseNumArray[i] = Integer.parseInt(new StringBuilder(strArray[i]).reverse().toString());
    }

    for (int i = 0; i < n; i++) {
      int tmp = reverseNumArray[i];
      flag = true;
      if (tmp == 1) {
        flag = false;
      }
      for (int j = 2; j*j <= tmp; j++) {
        if (tmp % j == 0) {
          flag = false;
        }
      }
      if (flag) {
        ans.add(tmp);
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] input = new String[n];
    for(int i=0; i<n; i++) {
      input[i] = in.next();
    }

    for (int i : solution(input, n)) {
      System.out.print(i + " ");
    }
  }

}
