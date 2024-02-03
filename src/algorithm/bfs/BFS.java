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
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            System.out.print(level++ + " : ");
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                System.out.print(curNode.data + " ");
                if (curNode.lt != null) {
                    queue.offer(curNode.lt);
                }
                if (curNode.rt != null) {
                    queue.offer(curNode.rt);
                }
            }
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
