package search.queue;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SavePrincess {

    public static int solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;
        int number = 1;
        while (list.size() != 1) {
            if (number == k) {
                list.remove(index--);
                number = 1;
            } else {
                number++;
            }
            index++;
            if (index >= list.size()) {
                index = 0;
            }
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(solution(n, k));
    }
}
