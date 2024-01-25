package algorithm.recursive;

import java.util.Scanner;

public class PrintBinary {

    public static void DFS(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DFS(n);
    }
}
