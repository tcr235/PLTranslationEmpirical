import java.util.LinkedList;
import java.util.ArrayList;
class Node {
    public int val;
    public boolean color;
    public ArrayList<Node> a;
    public Node() {
        val = 0;
        color = false;
        a = new ArrayList<>();
    }
}
public class atcoder_ABC126_D {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Node root = new Node();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = Integer.parseInt(args[i + 1]);
            int v = Integer.parseInt(args[i + 2]);
            int w = Integer.parseInt(args[i + 3]);
            Node node1 = nodes[u - 1];
            Node node2 = nodes[v - 1];
            node1.val = u;
            node2.val = v;
            node1.a.add(new Node[]{node2, w});
            node2.a.add(new Node[]{node1, w});
        }
        root.val = 0;
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        void traverse(Node node, int distance) {
            if (nodeSet.contains(node)) {
                return;
            }
            nodeSet.add(node);
            for (Node adjNode : node.a) {
                int dis = adjNode.val - node.val;
                if ((distance + dis) % 2 == 0) {
                    adjNode.color = root.color;
                } else {
                    adjNode.color = !root.color;
                }
                traverse(adjNode, distance + dis);
            }
        }
        traverse(root, 0);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
}
