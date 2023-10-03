package search;

import java.util.Scanner;

public class Main {

  public static String solution(String str) {

    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
    }

    return reverse;
  }


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    for(int i=0; i<n; i++){
      String str = in.next();
      System.out.println(solution(str));
    }
  }
}

