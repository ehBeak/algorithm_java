package search;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {

  public static List<Integer> solution(int[] arr, int n, int k) {
    List<Integer> answer = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < k-1; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    for (int i = k - 1; i < n; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
      answer.add(map.size());
      map.put(arr[i - k + 1], map.get(arr[i - k + 1]) - 1);
      if (map.get(arr[i - k + 1]) == 0) {
        map.remove(arr[i - k + 1]);
      }
    }

    return answer;
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    for (Integer i : solution(arr, n, k)) {
      System.out.print(i + " ");
    }
  }
}