package search;

import java.util.*;
public class Main {

  public static int solution(int n) {
    int res = 0;
    int lt = 1, sum = 0;
    for (int rt = 1; rt <= (n / 2 + 1); rt++) {
      sum += rt;
      if (sum == n) res++;

      while (sum >= n) {
        sum -= lt++;
        if (sum == n) {
          res++;
        }
      }
    }
    return res;
  }


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(solution(n));
  }

}