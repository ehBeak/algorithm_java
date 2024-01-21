package search;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

  public static int solution(String s, String t) {
    Map<Character, Integer> tMap = new HashMap<>();
    Map<Character, Integer> sMap = new HashMap<>();
    int answer = 0;
    for (Character c : t.toCharArray()) {
      tMap.put(c, tMap.getOrDefault(c, 0) + 1);
    }

    for (int i = 0; i < t.length() - 1; i++) {
      sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
    }

    for (int i = t.length() - 1; i < s.length(); i++) {
      sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
      if (tMap.equals(sMap)) {
        answer++;
      }
      char c = s.charAt(i - t.length() + 1);
      sMap.put(c, sMap.get(c) - 1);
      if (sMap.get(c) == 0) {
        sMap.remove(c);
      }
    }
    return answer;
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String t = in.next();
    System.out.println(solution(s, t));
  }
}