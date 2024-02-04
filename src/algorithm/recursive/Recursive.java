package algorithm.recursive;

import java.util.Scanner;

public class Recursive {

    public static void DFS_desc(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n + " ");
            DFS_asc(n - 1);
        }
    }

    public static void DFS_asc(int n) {
        if (n == 0) {
            return;
        } else {
            DFS_desc(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DFS_desc(n);
        System.out.println();
        DFS_asc(n);
    }
}
