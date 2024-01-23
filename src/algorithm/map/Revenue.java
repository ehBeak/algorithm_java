package algorithm.map;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Revenue {

    public static List<Integer> solution(int days, int[] arr, int cDays) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < cDays - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = cDays - 1; rt < days; rt++, lt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int cDays = in.nextInt();
        int[] arr = new int[days];
        for (int i = 0; i < days; i++) {
            arr[i] = in.nextInt();
        }
        for (Integer answer : solution(days, arr, cDays)) {
            System.out.print(answer + " ");
        }
    }
}
