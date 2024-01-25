package algorithm.recursive;

import java.util.Scanner;

public class Recursive {

    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.print(n + " ");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DFS(n);
    }
}
