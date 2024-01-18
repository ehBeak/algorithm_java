package stack;

import java.util.Scanner;
import java.util.Stack;

public class DeleteCharacter {

    public static Character OPEN = '(';
    public static Character CLOSE = ')';

    public static Stack solution(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c != CLOSE) {
                stack.push(c);
            } else {
                while (stack.peek() != OPEN) {
                    stack.pop();
                }
                stack.pop();
            }
        }
        return stack;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Stack answer = solution(input);
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i));
        }
    }
}
