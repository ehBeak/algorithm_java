package algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

  static int n;
  static int m;
  static int[] music;

  public static int count(int capacity) {
    int sum = 0;
    int count = 1;
    for (int i = 0; i < n; i++) {
      if (sum + music[i] > capacity) {
        count++;
        sum = music[i];
      } else {
        sum += music[i];
      }
    }
    return count;
  }

  public static int solution() {
    int lt = music[n - 1];
    int rt = Arrays.stream(music).sum();
    int answer = Integer.MAX_VALUE;
    while (lt <= rt) {
      int mid = (lt + rt) / 2;
      if (count(mid) > m) {
        lt = mid + 1;
      } else { // 개수가 같거나 더 적으면 용량 늘려도 된다.
        answer = mid;
        rt = mid - 1;
      }
    }
    return answer;
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    m = in.nextInt();
    music = new int[n];
    for (int i = 0; i < n; i++) {
      music[i] = in.nextInt();
    }
    Arrays.sort(music);
    System.out.println(solution());
  }
}