package algorithm.dfs;

import java.util.Scanner;

public class SumSubset {

    static int n;
    static int total = 0;
    static boolean flag = false;
    static String answer = "NO";
    static int[] arr;


    public static void solution(int level, int sum) {
        if (flag) {
            return;
        }
        if (sum > total / 2) {
            return;
        }
        if (level == n) { // 말단 노드라면 == 부분집합이 완성되었다면
            if ((total - sum) == sum) {
                flag = true;
                answer = "YES";
            }
        } else {
            solution(level + 1, sum + arr[level]);
            solution(level + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        solution(0, 0);
        System.out.println(answer);
    }
}
