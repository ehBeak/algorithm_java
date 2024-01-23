package algorithm.queue;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class EmergencyRoom {

    class Person {
        public int id;
        public int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int[] arr, int n, int m) {
        Queue<Person> queue = new LinkedList<>();
        int number = 0;
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            boolean now = true;
            for (Person p : queue) {
                if (person.priority < p.priority) {
                    now = false;
                    break;
                }
            }
            if (!now) {
                queue.offer(person);
            }else {
                number++;
                if (person.id == m) {
                    return number;
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(new EmergencyRoom().solution(arr, n, m));
    }
}
