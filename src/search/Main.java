package search;

import java.util.Scanner;

public class Main {

  public static String solution(String input) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      if (input.indexOf(input.charAt(i)) == i) {
        sb.append(input.charAt(i));
      }
    }
    return sb.toString();
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String input = in.next();
    System.out.println(solution(input));
  }
}