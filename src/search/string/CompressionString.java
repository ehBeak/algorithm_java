package search.string;

import java.util.Scanner;

public class CompressionString {

  public static String solution(String str) {

    int count = 1;
    char prev = '0';
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      if (prev == str.charAt(i)) {
        count++;
      }else {
        sb.append(count);
        sb.append(str.charAt(i));
        count = 1;
      }
      prev = str.charAt(i);
    }

    return sb.substring(1);
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.next();
    System.out.println(solution(input));
  }

}
