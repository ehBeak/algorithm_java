package algorithm.dfs;

import java.util.Scanner;

public class Subset {

    public static int n;
    public static int[] check;

    public static void DFS(int L) {
        if (L == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (check[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            check[L] = 1;
            DFS(L + 1);
            check[L] = 0;
            DFS(L + 1);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        check = new int[n + 1];
        DFS(1);

    }

}
