package algorithm.n2ton1;

import java.util.*;
public class MaxLengthPartialSequence {

    public static int solution(int[] arr, int n, int k) {

        int cnt = 0;
        int lt = 0;
        int max = Integer.MIN_VALUE;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;

            while (cnt > k) {
                if (arr[lt++] == 0) cnt--;
            }

            max = Math.max(max, rt - lt + 1);
        }

        return max;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr, n, k));
    }

}
