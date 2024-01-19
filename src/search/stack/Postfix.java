package search.stack;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public static int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.digit(c, 10));
            } else {
                int second = stack.pop();
                int first = stack.pop();
                if (c == '+') {
                    stack.push(first + second);
                }
                if (c == '-') {
                    stack.push(first - second);
                }
                if (c == '*') {
                    stack.push(first * second);
                }
                if (c == '/') {
                    stack.push(first / second);
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
