package search.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassPresident {

    public static char solution(int num, String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            Character key = str.charAt(i);
            Integer integer = map.getOrDefault(key, 0);
            map.put(str.charAt(i), ++integer);
        }

        Integer max = 0;
        Character maxKey = null;
        for (Character key : map.keySet()) {
            Integer tmp = map.get(key);
            if (max < tmp) {
                max = tmp;
                maxKey = key;
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String input = in.next();
        System.out.println(solution(num, input));
    }
}
