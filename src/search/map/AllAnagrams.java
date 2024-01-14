package search.map;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class AllAnagrams {

    public static int solution(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        int answer = 0;

        for (Character c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int l = t.length() - 1;
        for (int i = 0; i < l; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        int rt = 0;
        for (int lt = l; lt < s.length(); lt++, rt++) {
            sMap.put(s.charAt(lt), sMap.getOrDefault(s.charAt(lt), 0) + 1);
            if (sMap.equals(tMap)) {
                answer++;
            }
            sMap.put(s.charAt(rt), sMap.get(s.charAt(rt)) - 1);
            if (sMap.get(s.charAt(rt)) == 0) {
                sMap.remove(s.charAt(rt));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(solution(s, t));
    }

}
