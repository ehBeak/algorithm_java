package algorithm.array;

import java.util.*;

public class Fibonacci {

  public static void solution(int n) {
    int first_prev = 1;
    int second_prev = 1;
    int tmp;
    System.out.print("1 1 ");
    for (int i = 2; i < n; i++) {
      tmp = first_prev + second_prev;
      System.out.print(tmp + " ");
      second_prev = first_prev;
      first_prev = tmp;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    solution(n);
//    for (int i : solution(n)) {
//      System.out.print(i + " ");
//    }
  }
}
