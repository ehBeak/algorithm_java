package algorithm.serach;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckDuplicated {

    private static final String DUPLICATED = "D";
    private static final String UNIQUE = "U";

    public static String solution(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > 1) {
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
        System.out.println(solution(arr));
    }
}
