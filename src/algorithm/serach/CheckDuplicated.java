package algorithm.serach;

import java.util.Scanner;

public class CheckDuplicated {

    private static final String DUPLICATED = "D";
    private static final String UNIQUE = "U";

    public static String solution(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i;
            for (; j >= 0; j--) {
                if (key < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
            arr[j] = key;
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                return DUPLICATED;
            }
        }

        return UNIQUE;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(arr, n));
    }
}
