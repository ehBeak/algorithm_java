package algorithm.dfs;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Problem {
    int time;
    int score;

    public Problem(int score, int time) {
        this.time = time;
        this.score = score;
    }
}

public class MaxScore {

    static Problem[] problems;
    static List<Integer> scores;
    static int m;
    static int n;

    public static void solution(int idx, int scoreSum, int timeSum) {

        if (idx == n) {
            if (timeSum <= m) {
                scores.add(scoreSum);
            }
        } else {
            solution(idx + 1, scoreSum + problems[idx].score, timeSum  + problems[idx].time);
            solution(idx + 1, scoreSum, timeSum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        scores = new ArrayList<>();
        problems = new Problem[n];
        for (int i = 0; i < n; i++) {
            int score = in.nextInt();
            int time = in.nextInt();
            problems[i] = new Problem(score, time);
        }

        solution(0, 0, 0);
        System.out.println(scores.stream().mapToInt(x -> x).max().getAsInt());
    }
}
