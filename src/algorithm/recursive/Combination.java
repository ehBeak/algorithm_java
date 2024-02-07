package algorithm.recursive;

import java.util.Scanner;

public class Combination {

    public static int solution(int n, int r) {
        if (n == r) {
            return 1;
        }
        if (r == 1) {
            return n;
        }
        return solution(n - 1, r - 1) + solution(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        System.out.println(solution(n, r));
    }
}
