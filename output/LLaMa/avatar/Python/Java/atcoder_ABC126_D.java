import java.util.*;

public class atcoder_ABC126_D {
    static class Node {
        int val;
        boolean color;
        List<int[]> a;

        public Node() {
            val = -1;
            color = false;
            a = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            Node node1 = nodes[u - 1];
            Node node2 = nodes[v - 1];
            node1.val = u;
            node2.val = v;
            node1.a.add(new int[]{node2.val, w});
            node2.a.add(new int[]{node1.val, w});
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodeSet);
        for (Node node : nodes) {
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    static void traverse(Node node, int distance, Set<Node> nodeSet) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
        }
        for (int[] pair : node.a) {
            Node adjNode = nodes[pair[0] - 1];
            int dis = pair[1];
            if ((distance + dis) % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            traverse(adjNode, distance + dis, nodeSet);
        }
    }

    static Node root;
    static Node[] nodes;
}