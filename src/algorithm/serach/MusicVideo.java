package algorithm.serach;

import java.util.Scanner;
import java.util.Arrays;

public class MusicVideo {

    public static int count(int[] arr, int n, int capacity) {
        int size = 0;
        int cnt = 1;
        for (int min : arr) {
            if (min + size > capacity) {
                size = min;
                cnt++;
            } else {
                size += min;
            }
        }
        return cnt;
    }

    public static int solution(int[] arr, int n, int m) {
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        int answer = rt;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, n, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(arr, n, m));
    }
}
