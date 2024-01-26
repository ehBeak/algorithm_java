package algorithm.recursive;

import java.util.Scanner;

public class Fibonacci {

    static int[] arr;

    public static int DFS(int n) {
        if (n == 1 || n==2) {
            return arr[n] = 1;
        } else {
            return arr[n] = DFS(n - 2) + DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n + 1];
        DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
