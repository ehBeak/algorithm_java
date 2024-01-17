package stack;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {

    public static Character OPEN = '(';
    public static Character CLOSE = ')';

    public static String YES = "YES";
    public static String NO = "NO";

    public static String solution(String input) {
        Stack<Character> stack = new Stack<>();
        char[] cArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            if (cArray[i] == OPEN) {
                stack.push(OPEN);
            }
            if (cArray[i] == CLOSE) {
                if (stack.empty()) {
                    return NO;
                }
                stack.pop();
            }
        }

        if (!stack.empty()) {
            return NO;
        }

        return YES;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
