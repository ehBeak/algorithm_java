package algorithm.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * SearchPath에서 인접행렬을 사용했던 것과 다르게, 인접리스트를 사용해본다.
 */
public class SearchPathList {

    static List<List<Integer>> graph;
    static boolean[] isVisit;
    static int n;
    static int answer = 0;

    public static void DFS(int v) {
        if (v == n) {
            answer++;
            return;
        }
        for (int i : graph.get(v)) {
            if (!isVisit[i]) {
                isVisit[i] = true;
                DFS(i);
                isVisit[i] = false;
            }
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        graph = new ArrayList<>();
        isVisit = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i <= m; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            graph.get(start).add(end);
        }
        isVisit[1] = true;
        DFS(1);
        System.out.println(answer);
    }
}
