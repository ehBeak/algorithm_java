package search.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassPresident {

    public static char solution(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char key : str.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        Character maxKey = null;
        for (Character key : map.keySet()) {
            int tmp = map.get(key);
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
        System.out.println(solution(input));
    }
}
