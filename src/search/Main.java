package search;

import java.util.Scanner;

public class Main {

  public static String solution(int num, String str) {

    StringBuilder sb = new StringBuilder();
    str = str.replace('#', '1').replace('*', '0');
    System.out.println(str);

    System.out.println(num);
    for (int i = 0; i < num; i++) {
      String tmp = str.substring(0, 7);
      sb.append((char) Integer.parseInt(tmp, 2));
      str = str.substring(7);
    }
    return sb.toString();
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int inputNum = in.nextInt();
    String input = in.next();
    System.out.println(solution(inputNum, input));
  }

}
