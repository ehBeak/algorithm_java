package algorithm.dfs;

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class Dfs {

    Node root;

    public static void DFS(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        DFS(node.lt);
        DFS(node.rt);
    }

    public static void main(String[] args) {
        Dfs tree = new Dfs();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        DFS(tree.root);
    }
}
