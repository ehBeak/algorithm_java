package algorithm.bfs;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class ShortestPath {

    static List<List<Integer>> graph;
    static int n;
    static int[] distance;
    static boolean[] isVisit;


    public static void bfs(int v) {
        isVisit[1] = true;
        distance[1] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int nv : graph.get(cur)) {
                if (!isVisit[nv]) {
                    isVisit[nv] = true;
                    queue.offer(nv);
                    distance[nv] = distance[cur] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        distance = new int[n + 1];
        isVisit = new boolean[n + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            graph.get(start).add(end);
        }
        bfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + distance[i]);
        }
    }
}
