package algorithm.bfs;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class ShortestPath {

    static List<List<Integer>> graph;
    static int n;
    static int[] answer;


    public static void bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                if(current == end) {
                    answer[end] = level;
                    return;
                }
                for (int path : graph.get(current)) {
                    queue.offer(path);
                }
            }
            level++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        answer = new int[n + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            graph.get(start).add(end);
        }
        for (int i = 2; i <= n; i++) {
            bfs(1, i);
            System.out.println(i + " : " + answer[i]);
        }
    }
}
