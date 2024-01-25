package algorithm.serach;

import java.util.Scanner;
import java.util.Arrays;

public class SelectStall {

    public static int countHorse(int[] arr, int n, int maxDistance) {
        int stall = arr[0];
        int number = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] - stall >= maxDistance) {
                number++;
                stall = arr[i];
            }
        }
        return number;
    }

    public static int solution(int[] arr, int n, int horseCnt) {
        int maxDistance = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n - 1] - arr[0];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (countHorse(arr, n, mid) >= horseCnt) {
                lt = mid + 1;
                maxDistance = mid;
            } else {
                rt = mid - 1;
            }
        }
        return maxDistance;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int horseCnt = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(arr, n, horseCnt));
    }
}
