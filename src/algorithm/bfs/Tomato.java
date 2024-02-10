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

    static int n, m;
    static int[][] box;
    static int[][] days;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static final int NOTHING = -1;
    public static final int RIPEN = 1;
    public static final int NOT_RIPEN = 0;

    public static int solution() {
        int max = Integer.MIN_VALUE;
        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == RIPEN) {
                    queue.add(new Point(i, j));
                }
            }
        }
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nx = p.x + dx[k];
                int ny = p.y + dy[k];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (box[nx][ny] == NOT_RIPEN) {
                        box[nx][ny] = RIPEN;
                        days[nx][ny] = days[p.x][p.y] + 1;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(days[i][j], max);
                if (box[i][j] == NOT_RIPEN) {
                    return -1;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt(); // 세로 칸 수
        n = in.nextInt(); // 가로 칸 수
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
