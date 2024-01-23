package algorithm.map;

import java.util.Scanner;
import java.util.Collections;
import java.util.TreeSet;

public class NumberK {

    public static int solution(int[] arr, int k, int n) {

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int flag = 0;
        for (Integer i : set) {
            if (flag++ == k-1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(arr, k, n));
    }
}
