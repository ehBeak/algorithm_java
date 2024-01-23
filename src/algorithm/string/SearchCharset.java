package algorithm.string;

import java.util.Scanner;

public class SearchCharset {

  public int solution(String str, char c) {

    int sum = 0;

    char[] cArray = str.toCharArray();
    for (char e : cArray) {
      if (e == c) {
        sum++;
      }
      if (Math.abs(e - c) == 32) {
        sum++;
      }
    }
    return sum;
  }

  public static void main(String[] args){

    SearchCharset searchCharset = new SearchCharset();

    Scanner in = new Scanner(System.in);
    String input1 = in.next(); // 문자열 하나 읽음
    char input2 = in.next().charAt(0); // 문자 가져옴

    int sum = searchCharset.solution(input1, input2);

    System.out.println(sum);
  }


}