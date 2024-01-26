package algorithm.recursive;

import java.util.Scanner;

public class Factorial {

    public static int DFS(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(DFS(n));
    }
}
