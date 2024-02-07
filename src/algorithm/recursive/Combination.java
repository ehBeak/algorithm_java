package algorithm.recursive;

import java.util.Scanner;

public class Combination {

    static int[][] m;

    public static int solution(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }
        if (m[n][r] != 0) {
            return m[n][r];
        }
        return m[n][r] = solution(n - 1, r - 1) + solution(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        m = new int[n + 1][n + 1];
        System.out.println(solution(n, r));
    }
}
