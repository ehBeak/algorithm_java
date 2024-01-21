package search;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
  class Person {
    public Integer id;
    public Integer priority;

    public Person(Integer id, Integer priority) {
      this.id = id;
      this.priority = priority;
    }
  }

  public int solution(int[] arr, int n, int m) {
    int number = 0;
    Queue<Person> queue = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      queue.offer(new Person(i, arr[i]));
    }

    while (true) {
      Person person = queue.poll();
      boolean now = true;
      for (Person p : queue) {
        if (person.priority < p.priority) {
          now = false;
        }
      }
      if (now) {
        number++;
        if (person.id == m) {
          return number;
        }
      } else {
        queue.offer(person);
      }
    }
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    System.out.println(new Main().solution(arr, n, m));
  }
}