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
        if (node == null) { //말단노드
            return;
        }
        System.out.print(node.data + " ");
        DFS(node.lt); // 왼쪽 먼저 들리고
        DFS(node.rt); // 오른쪽 들리기

    }

    public static void main(String[] args) {

    }


}
