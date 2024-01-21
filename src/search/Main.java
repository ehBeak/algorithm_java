package search;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

  public static final String YES = "YES";
  public static final String NO = "NO";

  public static String solution(String s, String t) {
    Map<Character, Integer> map = new HashMap<>();
    for (Character c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (Character c : t.toCharArray()) {
      if (!map.containsKey(c)) {
        return NO;
      }
      map.put(c, map.get(c) - 1);
      if (map.get(c) == 0) {
        map.remove(c);
      }
    }
    return YES;
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String t = in.next();
    System.out.println(solution(s, t));
  }
}