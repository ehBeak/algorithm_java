package algorithm.sort;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortCoordinate {

    public static class Pair implements Comparable<Pair> {
        public int x;
        public int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.x == o.x) {
                return this.y - o.y;
            }
            return this.x - o.x;
        }
    }

    public static List<Pair> solution(List<Pair> list, int n) {
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Pair(in.nextInt(), in.nextInt()));
        }
        for (Pair p : solution(list, n)) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
