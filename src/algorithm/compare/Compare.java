package algorithm.compare;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {

    int x;

    public Point(int x) {
        this.x = x;
    }

    @Override
    public int compareTo(Point p) {
        return p.x - this.x;
    }

    @Override
    public String toString() {
        return x + "";
    }
}

class PointAsc implements Comparable<PointAsc> {

    int x;

    public PointAsc(int x) {
        this.x = x;
    }

    @Override
    public int compareTo(PointAsc pa) {
        return this.x - pa.x;
    }

    @Override
    public String toString() {
        return x + "";
    }
}


public class Compare {

    public static void main(String[] args) {

        List<Point> list = new ArrayList<>();
        List<PointAsc> list_ = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Point(i));
            list_.add(new PointAsc(i));
        }

        System.out.println(list);
        System.out.println(list_);

        Collections.sort(list);
        Collections.sort(list_);

        System.out.println(list);
        System.out.println(list_);
    }

}
