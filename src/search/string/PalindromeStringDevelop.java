package search.string;

import java.util.Scanner;

public class PalindromeStringDevelop {

  public static String solution(String str) {

    int lt=0;
    int rt = str.length() - 1;

    str = str.toUpperCase();

    while (lt < rt) {
      if(!Character.isAlphabetic(str.charAt(lt)))
        lt++;
      else if(!Character.isAlphabetic(str.charAt(rt)))
        rt--;
      else {
        if(str.charAt(lt) != str.charAt(rt)) {
          return "NO";
        }
        lt++;
        rt--;
      }
    }
    return "YES";
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    System.out.println(solution(str));
  }

}
