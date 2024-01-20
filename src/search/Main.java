package search;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

  public static int solution(int n, int k) {
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      queue.offer(i);
    }

    int number = 1;
    while (queue.size() != 1) {
      if (number == k) {
        queue.poll();
        number = 1;
      } else {
        queue.offer(queue.poll());
        number++;
      }
    }
    return queue.poll();
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    System.out.println(solution(n, k));
  }
}