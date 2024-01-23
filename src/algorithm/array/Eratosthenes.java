package algorithm.array;

import java.util.*;

public class Eratosthenes {

  public static int solution(int n) {
    int cnt = 0;
    boolean flag = true;

    for (int i = 2; i <= n; i++) {
      flag = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        cnt++;
      }
    }
    return cnt;
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(solution(n));
  }

}
