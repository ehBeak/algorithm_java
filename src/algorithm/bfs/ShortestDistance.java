package algorithm.bfs;

import java.util.Queue;
import java.util.LinkedList;

public class ShortestDistance {

    Node root;

    public static Node bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                if (curNode.lt != null) {
                    queue.offer(curNode.lt);
                }
                if (curNode.rt != null) {
                    queue.offer(curNode.rt);
                }
                if (curNode.lt == null && curNode.rt == null) {
                    return curNode;
                }
            }
            level++;
        }
        return new Node(0);
    }

    public static void main(String[] args) {
        ShortestDistance tree = new ShortestDistance();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        Node bfs = bfs(tree.root);
        System.out.println(bfs.data);
    }
}
