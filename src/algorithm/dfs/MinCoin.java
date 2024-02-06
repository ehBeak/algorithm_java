package algorithm.dfs;

import java.util.Scanner;

public class MinCoin {

    static int[] coins;
    static int answer = Integer.MAX_VALUE;
    static int price;
    static int n;

    public static void solution(int level, int sum) {
        if (sum > price) {
            return;
        }
        if (sum == price) {
            answer = Math.min(answer, level);
        } else {
            for (int i = 0; i < n; i++) {
                solution(level + 1, sum + coins[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = in.nextInt();
        }
        price = in.nextInt();
        solution(0, 0);
        System.out.println(answer);
    }
}
