package algorithm.dfs;

import java.util.Scanner;

public class MaxScore {

    static int answer = Integer.MIN_VALUE;
    static int m;
    static int n;
    static int[] scores;
    static int[] times;

    public static void solution(int idx, int scoreSum, int timeSum) {
        if (timeSum > m) {
            return;
        }
        if (idx == n) {
                answer = Math.max(answer, scoreSum);
        } else {
            solution(idx + 1, scoreSum + scores[idx], timeSum  + times[idx]);
            solution(idx + 1, scoreSum, timeSum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        scores = new int[n];
        times = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
            times[i] = in.nextInt();
        }

        solution(0, 0, 0);
        System.out.println(answer);
    }
}
