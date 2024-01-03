package search;

import java.util.Scanner;

public class Main {

  public static char[] solution(String input) {
    int lt = 0;
    int rt = input.length() - 1;
    char[] cArray = input.toCharArray();

    while (lt < rt) {
      if (Character.isAlphabetic(cArray[lt]) && Character.isAlphabetic(cArray[rt])) {
        char tmp = cArray[lt];
        cArray[lt] = cArray[rt];
        cArray[rt] = tmp;
        lt++;
        rt--;
      }
      if (!Character.isAlphabetic(cArray[lt])) {
        lt++;
      }
      if (!Character.isAlphabetic(cArray[rt])) {
        rt--;
      }
    }
    return cArray;
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String input = in.next();
    System.out.println(solution(input));
  }
}