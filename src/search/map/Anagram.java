package search.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static String solution(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();
        for (char key : str1.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (char key : str2.toCharArray()) {
            if (map.get(key) == 0 || !map.containsKey(key)) {
                return NO;
            }
            map.put(key, map.get(key) - 1);
        }

        return YES;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        System.out.println(solution(str1, str2));
    }
}
