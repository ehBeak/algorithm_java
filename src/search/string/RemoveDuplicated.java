package search.string;

import java.util.Scanner;

public class RemoveDuplicated {

  public static String solution(String str) {

    StringBuilder sb = new StringBuilder();
    char[] cArray = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
      if (str.indexOf(cArray[i]) == i) {
        sb.append(cArray[i]);
      }
    }

    return sb.toString();

  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    System.out.println(solution(str));
  }

}
