package algorithm.sort;

import java.util.Scanner;

public class InsertionSort {

    public static int[] solution(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (key < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i : solution(arr, n)) {
            System.out.print(i + " ");
        }
    }
}
