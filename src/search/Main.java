package search;

import java.util.*;
public class Main {

  public static int solution(int n) {
    int ans = 0, cnt = 1;
    n--;
    while (n > 0) {
      cnt++;
      n = n - cnt;
      if (n % cnt == 0) {
        ans++;
      }
    }
    return ans;
  }


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(solution(n));
  }

}