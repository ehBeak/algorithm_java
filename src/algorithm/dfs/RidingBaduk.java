package algorithm.dfs;

import java.util.Scanner;

public class RidingBaduk {

    static int[] baduk;
    static int c;
    static int n;
    static int answer = Integer.MIN_VALUE;

    public static void solution(int idx, int sum) {
        if (c < sum) {
            return;
        }
        if (idx == n) {
            answer = Math.max(answer, sum);
        } else {
            solution(idx + 1, sum + baduk[idx]);
            solution(idx + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        n = in.nextInt();
        baduk = new int[n];
        for (int i = 0; i < n; i++) {
            baduk[i] = in.nextInt();
        }
        solution(0, 0);

        System.out.println(answer);
    }
}
