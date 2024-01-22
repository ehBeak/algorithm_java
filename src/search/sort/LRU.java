package search.sort;

import java.util.Scanner;

public class LRU {

    public static int[] solution(int[] arr, int s) {
        int[] m = new int[s];

        for (Integer input : arr) {
            int hit_idx = -1;
            for (int j = 0; j < s; j++) {
                if (m[j] == input) {
                    hit_idx = j;
                }
            }

            if (hit_idx != -1) { // 존재한다면
                for (int k = hit_idx; k > 0; k--) {
                    m[k] = m[k - 1];
                }
            } else {
                for (int k = s - 1; k > 0; k--) {
                    m[k] = m[k - 1];
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
        for (int i : solution(arr, s)) {
            System.out.print(i + " ");
        }
    }
}
