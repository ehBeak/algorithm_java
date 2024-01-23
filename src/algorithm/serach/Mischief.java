package algorithm.serach;

import java.util.Scanner;
import java.util.Arrays;

public class Mischief {

    public static int[] solution(int[] arr, int n) {
        int[] answer = new int[2];
        int[] tmp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            tmp[i] = arr[i];
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (tmp[i] != arr[i]) {
                answer[j++] = i + 1;
            }
        }
        return answer;
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
