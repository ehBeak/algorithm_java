package algorithm;

import java.util.Scanner;

public class Main {

  public static int[] solution(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      int key = arr[i];
      int idx = i;
      int j = i + 1;
      for (; j < n; j++) {
        if (key < arr[j]) {
          key = arr[j];
          idx = i;
        }
      }
    }
    return arr;
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    for (int i : solution(arr, n)) {
      System.out.print(i + " ");
    }
  }
}