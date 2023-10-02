package search.string;

import java.util.Scanner;

public class CharacterOfString {

  public static String solution(String str) {

    String[] sArray = str.split(" ");
    String answer = sArray[0];

    int prev = answer.length();
    int tmp;
    for (String s : sArray) {
      tmp = s.length();
      if (prev < tmp) {
        prev = tmp;
        answer = s;
      }
    }
    return answer;
  }


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    System.out.println(solution(input));

  }

}
