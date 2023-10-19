package search;

import java.util.Scanner;

public class Main {
  public static String solution(String str) {
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<str.length(); i++) {
      if(str.indexOf(str.charAt(i))==i)
        sb.append(str.charAt(i));
    }
    return sb.toString();
  }
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input = in.next();
    System.out.println(solution(input));
    return ;
  }
}