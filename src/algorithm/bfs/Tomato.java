package algorithm.bfs;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Tomato {

    static int m, n, answer = Integer.MIN_VALUE;
    static int[][] box;
    static int[][] days;
    static Queue<Point> queue = new LinkedList<>();

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static final int RIPEN = 1;
    public static final int NOT_RIPEN = 0;
    public static final int NOTHING = -1;

    public static void bfs() {
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nx = point.x + dx[k];
                int ny = point.y + dy[k];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == NOT_RIPEN) {
                    box[nx][ny] = RIPEN;
                    days[nx][ny] = days[point.x][point.y] + 1;
                    queue.offer(new Point(nx, ny));
                }
            }
        }

    }

    public static int solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == RIPEN) {
                    queue.offer(new Point(i, j));
                }
            }
        }
        bfs();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer = Math.max(answer, days[i][j]);
                if (box[i][j] == NOT_RIPEN) {
                    return -1;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        box = new int[n][m];
        days = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = in.nextInt();
            }
        }
        System.out.println(solution());
    }
}
