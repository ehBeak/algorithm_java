package search.array;

import java.util.*;

public class RockScissorsPaper {

  public static ArrayList<String> solution(int[] aArr, int[] bArr, int n) {
    ArrayList<String> res = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (aArr[i] == bArr[i]) {
        res.add("D");
      }else {
        if (aArr[i] == 1 && bArr[i] == 3) {
          res.add("A");
        } else if (aArr[i] == 2 && bArr[i] == 1) {
          res.add("A");
        } else if (aArr[i] == 3 && bArr[i] == 2) {
          res.add("A");
        } else {
          res.add("B");
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] aArr = new int[n];
    int[] bArr = new int[n];
    for (int i = 0; i < n; i++) {
      aArr[i] = in.nextInt();
    }
    for (int i = 0; i < n; i++) {
      bArr[i] = in.nextInt();
    }

    for (String str : solution(aArr, bArr, n)) {
      System.out.println(str);
    }

  }

}
