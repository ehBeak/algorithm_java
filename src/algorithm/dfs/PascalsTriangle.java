package algorithm.dfs;

import java.util.Scanner;

public class PascalsTriangle {

    static int n;
    static int f;
    static boolean flag;
    static int[][] com;
    static int[] combination;
    static boolean[] visit;
    static int[] permutation;

    public static int C(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }
        if (com[n][r] != 0) {
            return com[n][r];
        }
        return com[n][r] = C(n - 1, r - 1) + C(n - 1, r);
    }

    public static void solution(int level, int sum) {
        if (flag) {
            return;
        }
        if (level == n) {
            if (sum == f) {
                for (int i : permutation) {
                    System.out.print(i+ " ");
                    flag = true;
                }
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                permutation[level] = i;
                solution(level + 1, sum + (permutation[level] * combination[level]));
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f = in.nextInt();
        com = new int[n + 1][n + 1];
        combination = new int[n];
        visit = new boolean[n + 1];
        permutation = new int[n];
        for (int i = 0; i < n; i++) {
            combination[i] = C(n - 1, i);
        }
        solution(0, 0);
    }
}
