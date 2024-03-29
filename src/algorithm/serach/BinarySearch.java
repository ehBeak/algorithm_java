package algorithm.serach;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

    public static int solution(int[] arr, int n, int key) {
        Arrays.sort(arr);
        int lt=0;
        int rt = n - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (key == arr[mid]) {
                return mid + 1;
            }
            if (key > arr[mid]) {
                lt = mid + 1;
            }
            if (key < arr[mid]) {
                rt = mid - 1;
            }
        }
        return -1;
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
