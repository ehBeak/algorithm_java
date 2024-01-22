package search.sort;

import java.util.Scanner;

public class LRU {

    public static int[] solution(int[] arr, int s, int n) {
        int[] m = new int[s];

        for (Integer input : arr) {
            boolean hit = false;
            int hit_idx = 0;
            for (int j = 0; j < s; j++) {
                if (m[j] == input) {
                    hit = true;
                    hit_idx = j;
                }
            }

            if (hit) { // 존재한다면
                for (int k = hit_idx - 1; k >= 0; k--) {
                    m[k + 1] = m[k];
                }
            } else {
                for (int k = s - 2; k >= 0; k--) {
                    m[k + 1] = m[k];
                }
            }
            m[0] = input;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i : solution(arr, s, n)) {
            System.out.print(i + " ");
        }
    }
}
