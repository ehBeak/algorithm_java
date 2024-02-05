package algorithm;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

  static List<List<Integer>> graph;
  static int[] distance;
  static boolean[] visit;

  public static void solution(int v) {
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(v);
    while (!queue.isEmpty()) {
      int cv = queue.poll();
      for (int nv : graph.get(cv)) {
        if (!visit[nv]) {
          visit[nv] = true;
          queue.offer(nv);
          distance[nv] = distance[cv] + 1;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    graph = new ArrayList<>();
    distance = new int[n + 1];
    visit = new boolean[n + 1];
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }

    for (int i = 0; i < m; i++) {
      int start = in.nextInt();
      int end = in.nextInt();
      graph.get(start).add(end);
    }

    distance[1] = 0;
    visit[1] = true;
    solution(1);

    for (int i = 2; i < n; i++) {
      System.out.println(i + " : " + distance[i]);
    }
  }
}