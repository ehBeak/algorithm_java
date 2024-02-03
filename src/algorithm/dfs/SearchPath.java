package algorithm.dfs;

import java.util.Scanner;

public class SearchPath {

    static int cnt = 0;
    static int[][] graph;
    static int[] isVisit;
    static int n;

    public static void DFS(int v) {
        if (v == n) {
            cnt++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && isVisit[i]==0) {
                    isVisit[i] = 1;
                    DFS(i);
                    isVisit[i] = 0; // 백트래킹
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        isVisit = new int[n + 1];
        graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            graph[start][end] = 1;
        }
        isVisit[1] = 1;
        DFS(1);
        System.out.println(cnt);
    }
}
