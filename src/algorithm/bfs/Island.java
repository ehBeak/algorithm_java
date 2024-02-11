package algorithm.bfs;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class LandPoint {
    int x, y;

    public LandPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Island {

    static int n;
    static int answer = 0;
    static int[][] board;

    static int[] dx = {-1, 0, 1, 0, -1, -1, 1, 1};
    static int[] dy = {0, 1, 0, -1, -1, 1, -1, 1};

    public static final int SEA = 0;
    public static final int LAND = 1;
    static Queue<LandPoint> queue = new LinkedList<>();

    public static void bfs() {
        while (!queue.isEmpty()) {
            LandPoint point = queue.poll();
            for (int k = 0; k < 8; k++) {
                int nx = point.x + dx[k];
                int ny = point.y + dy[k];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (board[nx][ny] == LAND) {
                        board[nx][ny] = SEA;
                        queue.offer(new LandPoint(nx, ny));
                    }
                }
            }
        }
        answer++;
    }

    public static void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == LAND) {
                    board[i][j] = SEA;
                    queue.offer(new LandPoint(i, j));
                    bfs();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }
        solution();
        System.out.println(answer);
    }
}
