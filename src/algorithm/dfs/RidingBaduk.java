package algorithm.dfs;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RidingBaduk {

    static int[] baduk;
    static int c;
    static int n;
    static List<Integer> sumList = new ArrayList<>();

    public static void solution(int idx, int sum) {
        if (idx == n) {
            if (c > sum) {
                sumList.add(sum);
            }
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

        System.out.println(sumList.stream().mapToInt(x -> x).max().getAsInt());
    }
}
