package algorithm.bfs;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Address {
    int x, y;

    public Address(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class DeliveryPizza {

    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[][] city;

    static int[] combination;
    static List<Address> house, store;

    public static final int STORE = 2;
    public static final int HOUSE = 1;

    public static int deliveryDistance(Address a1, Address a2) {
        return Math.abs(a1.x - a2.x) + Math.abs(a1.y - a2.y);
    }

    public static void dfs(int level, int idx) {
        if (level == m) {
            int sum = 0;
            for(Address house : house) {
                int dis = Integer.MAX_VALUE;
                for (int i : combination) {
                    Address address = store.get(i);
                    dis = Math.min(deliveryDistance(house, address), dis);
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
            return;
        }
        for(int i=idx; i<len; i++) {
            combination[level] = i;
            dfs(level + 1, i + 1);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        store = new ArrayList<>();
        house = new ArrayList<>();
        city = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Integer tmp = in.nextInt();
                if (tmp == HOUSE) {
                    house.add(new Address(i, j));
                } else if (tmp == STORE) {
                    store.add(new Address(i, j));
                }
            }
        }
        len = store.size();
        combination = new int[m];
        dfs(0, 0);
        System.out.println(answer);
    }
}
