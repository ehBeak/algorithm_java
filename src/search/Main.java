package search;

import java.util.Scanner;
public class Main {

  public static Integer solution(String str) {
    str = str.replaceAll("[^0-9]", "");
    return Integer.valueOf(str);
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input = in.next();
    System.out.println(solution(input));
  }

}
