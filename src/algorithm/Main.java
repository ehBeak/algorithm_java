package algorithm;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Person {
  public int id;
  public int priority;

  public Person(int id, int priority) {
    this.id = id;
    this.priority = priority;
  }
}
public class Main {

  public static int solution(int[] arr, int n, int m) {
    // m번째 환자 저장
    Queue<Person> queue = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      queue.offer(new Person(i, arr[i]));
    }

    int number = 0;
    while (true) {
      Person person = queue.poll();
      boolean now = true;
      for (Person p : queue) {
        if (person.priority < p.priority) {
          now = false;
          break;
        }
      }
      if (now) {
        number++;
        if (person.id == m) {
          return number;
        }
      }else{
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
    System.out.println(solution(arr, n, m));
  }
}