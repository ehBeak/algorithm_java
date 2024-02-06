package algorithm.dfs;

import java.util.Scanner;

public class Permutation {

    static int n;
    static int m;
    static int[] marble;

    public static void solution(int level) {
        if (level == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(marble[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            marble[level] = i;
            solution(level + 1);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        marble = new int[m];
        solution(0);
    }
}
