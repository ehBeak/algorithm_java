package stack;

import java.util.Scanner;
import java.util.Stack;

public class ClawDoll {

    public static int solution(int[][] board, int[] moves, int n, int m) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int k = 0; k < m; k++) {
            int p = moves[k] - 1;
            for (int i = 0; i < n; i++) {
                if (board[i][p] != 0) {
                    int pick = board[i][p];
                    if (!stack.empty() && stack.peek() == pick) {
                        stack.pop();
                        answer++;
                    } else {
                        stack.push(board[i][p]);
                    }
                    board[i][p] = 0;
                    break;
                }
            }
        }
        return answer * 2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
        }

        System.out.println(solution(board, moves, n, m));
    }
}
