package algorithm;

import java.util.Scanner;

public class Main {

  public static int[] solution(int[] arr, int n) {
    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i;
      for (; j > 0; j--) {
        if (key < arr[j - 1]) {
          arr[j] = arr[j - 1];
        } else {
          break;
        }
      }
      arr[j] = key;
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