package algorithm.serach;

import java.util.Scanner;
import java.util.Arrays;

public class MusicVideo {

    public static int count(int capacity, int[] music, int n) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + music[i] > capacity) {
                sum = music[i];
                count++;
            } else {
                sum += music[i];
            }
        }
        return count;
    }

    public static int solution(int[] music, int n, int m) {
        int lt = Arrays.stream(music).max().getAsInt();
        System.out.println(lt);
        int rt = Arrays.stream(music).sum();
        int capacity = Integer.MAX_VALUE;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(mid, music, n) > m) { // 용량을 더 늘려야함
                lt = mid + 1;
            }else { // 용량을 더 줄여도 된다.
                capacity = mid;
                rt = mid - 1;
            }
        }
        return capacity;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] min = new int[n];
        for (int i = 0; i < n; i++) {
            min[i] = in.nextInt();
        }
        System.out.println(solution(min, n, m));
    }
}
