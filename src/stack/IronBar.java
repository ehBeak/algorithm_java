package stack;

import java.util.Scanner;
import java.util.Stack;

public class IronBar {

    public static final char OPEN = '(';
    public static final char CLOSE = ')';

    public static int solution(String input) {
        Stack<Character> stack = new Stack<>();
        int sum = 0;
        char prev = 'a';
        for (char c : input.toCharArray()) {
            if (c == OPEN) {
                stack.push(c);
            }
            if (c == CLOSE && prev == OPEN) {
                stack.pop();
                sum += stack.size();
            }
            if (c == CLOSE && prev == CLOSE) {
                stack.pop();
                sum++;
            }
            prev = c;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
