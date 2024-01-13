package search.map;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Revenue {

    public static int[] solution(int days, int[] arr, int cDays) {
        int[] answer = new int[days - cDays + 1];
        Map<Integer, Integer> map = new HashMap<>();

        int k = 0;
        for (int i = 0; i < cDays; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer[k++] = map.size();

        for (int i = cDays; i < days; i++) {
            map.put(arr[i - cDays], map.get(arr[i - cDays]) - 1);
            if (map.get(arr[i - cDays]) == 0) {
                map.remove(arr[i - cDays]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            answer[k++] = map.size();
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
        for (int answer : solution(days, arr, cDays)) {
            System.out.print(answer + " ");
        }
    }
}
