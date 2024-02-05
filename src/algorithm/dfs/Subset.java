package algorithm.dfs;

import java.util.Scanner;

public class Subset {
    static int n;
    static boolean[] use;

    public static void DFS(int e) {
        if (e == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (use[i]) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            use[e] = true;
            DFS(e + 1);
            use[e] = false;
            DFS(e + 1);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        use = new boolean[n + 1];
        DFS(1);
    }

}
