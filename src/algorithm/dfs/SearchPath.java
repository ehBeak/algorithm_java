package algorithm.dfs;

import java.util.Scanner;

public class SearchPath {

    static int n;
    static int[][] graph;
    static int answer = 0;
    static boolean[] visit;

    public static void solution(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i=1; i <= n; i++) {
                if (!visit[i] && graph[v][i] == 1) {
                    visit[i] = true;
                    solution(i);
                    visit[i] = false;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();

        visit = new boolean[n + 1];
        graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            graph[start][end] = 1;
        }
        visit[1] = true;
        solution(1);
        System.out.println(answer);
    }
}
