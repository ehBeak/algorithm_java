package stack;

import java.util.Scanner;
import java.util.Stack;

public class DeleteCharacter {

    public static Character OPEN = '(';
    public static Character CLOSE = ')';

    public static String solution(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for (char c : input.toCharArray()) {
            if (c != CLOSE && c != OPEN && stack.empty()) {
                sb.append(c);
            }
            if (c == OPEN) {
                stack.push(c);
            }
            if (c == CLOSE && !stack.empty()) {
                stack.pop();
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
