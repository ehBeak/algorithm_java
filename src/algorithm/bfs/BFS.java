package algorithm.bfs;

import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}
public class BFS {

    Node root;

    public void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root); // root값 넣기
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.print(level + " : ");
            for (int i = 0; i < size; i++) { // 현재 가지고 있는 노드의 data 빼가면서 출력하기
                Node curNode = queue.poll();
                System.out.print(curNode.data + " ");
                if (curNode.lt != null) { // curNode의 왼쪽에 값이 존재한다면(말단 노드가 아니라면)
                    queue.offer(curNode.lt);
                }
                if (curNode.rt != null) { // curNode의 오른쪽에 값이 존재한다면(말단 노드가 아니라면)
                    queue.offer(curNode.rt);
                }
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BFS tree = new BFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.bfs(tree.root);
    }
}
