package algorithm.dfs;

import java.util.Scanner;

public class FindCombination {

    static int n;
    static int m;
    static int[] pick;

    public static void solution(int level, int s) {
        if (level == m) {
            for (int i : pick) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = s; i <= n; i++) {
            pick[level] = i;
            solution(level + 1, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        pick = new int[m];
        solution(0, 1);
    }
}
