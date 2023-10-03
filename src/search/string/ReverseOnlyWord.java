package search.string;

import java.util.Scanner;

public class ReverseOnlyWord {

  public static String solution(String str) {

    int lt = 0;
    int rt = str.length() - 1;

    char[] cArray = str.toCharArray();
    while (lt < rt) {

      boolean ltFlag = true;
      boolean rtFlag = true;
      while (ltFlag || rtFlag) {
        if (!((cArray[lt] > 64 && cArray[lt] < 91) || (cArray[lt] > 96 && cArray[lt] < 123))) {
          lt++;
        }else {
          ltFlag = false;
        }
        if (!((cArray[rt] > 64 && cArray[rt] < 91) || (cArray[rt] > 96 && cArray[rt] < 123))) {
          rt--;
        }else{
          rtFlag = false;
        }
      }

      char tmp = cArray[lt];
      cArray[lt] = cArray[rt];
      cArray[rt] = tmp;

      lt++;
      rt--;
    }

    return String.valueOf(cArray);

  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String input = in.next();
    System.out.println(solution(input));

  }

}
