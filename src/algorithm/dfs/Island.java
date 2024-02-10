package algorithm.dfs;

import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Island {

    static int n;
    static int[][] board;

    static int[] dx = {-1, 0, 1, 0, -1, -1, 1, 1};
    static int[] dy = {0, -1, 0, 1, -1, 1, -1, 1};

    public static final int LAND = 1;
    public static final int SEA = 0;

    public static int solution() {
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == LAND) {
                    board[i][j] = SEA;
                    dfs(new Point(i, j));
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void dfs(Point point) {
        for (int k = 0; k < 8; k++) {
            int nx = point.x + dx[k];
            int ny = point.y + dy[k];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if (board[nx][ny] == LAND) {
                    board[nx][ny] = SEA;
                    dfs(new Point(nx, ny));
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n =in.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }
        System.out.println(solution());
    }
}
