package search.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static String solution(String str1, String str2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str1.length() || i < str2.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }

        if (!(map1.keySet().containsAll(map2.keySet()) && map2.keySet().containsAll(map1.keySet()))) {
            return NO;
        }

        for (Character key : map1.keySet()) {
            if (map1.get(key) != map2.get(key)) {
                return NO;
            }
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
