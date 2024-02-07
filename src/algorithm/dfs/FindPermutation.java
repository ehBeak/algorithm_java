package algorithm.dfs;

import java.util.Scanner;

public class FindPermutation {

    static int n;
    static int m;
    static int[] arr;
    static int[] pick;
    static boolean[] visit;

    public static void solution(int level) {
        if (level == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(pick[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                pick[level] = arr[i];
                solution(level + 1);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        pick = new int[m];
        arr = new int[n];
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        solution(0);
    }
}
