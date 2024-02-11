package algorithm.dfs;

import java.util.Scanner;

public class PascalsTriangle {

    static int n, f;
    static int[] combination;
    static int[] permutation;
    static boolean[] visit;
    static int[][] memo;
    static boolean flag = false;

    public static int combination(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        }
        if (memo[n][r] != 0) {
            return memo[n][r];
        }
        return memo[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public static void dfs(int level, int sum) {
        if (flag) {
            return;
        }
        if (level == n) {
            if (sum == f) {
                for (int i : permutation) {
                    System.out.print(i + " ");
                }
                System.out.println();
                flag = true;
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                permutation[level] = i;
                dfs(level + 1, sum + (permutation[level] * combination[level]));
                visit[i] = false;
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f = in.nextInt();
        combination = new int[n];
        permutation = new int[n];
        visit = new boolean[n + 1];
        memo = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            combination[i] = combination(n - 1, i);
        }
        dfs(0, 0);
    }
}
