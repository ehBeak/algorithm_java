package search.queue;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class PlanClass {

    public static final String YES = "YES";
    public static final String NO = "NO";

    public static String solution(String require, String classes) {
        Queue<Character> queue = new LinkedList<>();
        for (Character c : require.toCharArray()) {
            queue.offer(c);
        }

        for (Character c : classes.toCharArray()) {
            if (c == queue.peek()) {
                queue.poll();
            }
        }

        if (queue.isEmpty()) {
            return YES;
        }
        return NO;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String require = in.next();
        String classes = in.next();
        System.out.println(solution(require, classes));
    }
}
