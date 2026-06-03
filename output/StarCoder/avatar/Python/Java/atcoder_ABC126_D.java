public class Main {
    static class Node {
        int val;
        boolean color;
        ArrayList<Pair<Node, Integer>> a;

        Node() {
            this.val = -1;
            this.color = false;
            this.a = new ArrayList<>();
        }
    }

    static class Pair<T1, T2> {
        T1 first;
        T2 second;

        Pair(T1 first, T2 second) {
            this.first = first;
            this.second = second;
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
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int w = scanner.nextInt();
            nodes[u].val = u + 1;
            nodes[v].val = v + 1;
            nodes[u].a.add(new Pair<>(nodes[v], w));
            nodes[v].a.add(new Pair<>(nodes[u], w));
        }
        Node root = nodes[0];
        root.color = true;
        HashSet<Node> nodeSet = new HashSet<>();

        traverse(root, 0, nodeSet);

        for (int i = 0; i < n; i++) {
            if (nodes[i].color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        scanner.close();
    }

    static void traverse(Node node, int distance, HashSet<Node> nodeSet) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
        }
        for (Pair<Node, Integer> pair : node.a) {
            Node adjNode = pair.first;
            int dis = pair.second;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            traverse(adjNode, distance + dis, nodeSet);
        }
    }
}