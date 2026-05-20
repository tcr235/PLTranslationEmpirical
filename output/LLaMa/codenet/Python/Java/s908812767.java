```java
import java.util.*;
import java.io.*;

public class Main {
    private static final int N = 200005;
    private static Map<Integer, List<int[]>> adj;
    private static int[] color;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        adj = new HashMap<>();
        color = new int[n + 5];

        for (int i = 1; i < n; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, w});
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, w});

            if (adj.get(u).size() == 1) {
                adj.get(u).get(0)[0] = adj.get(u).get(0)[1];
            }

            if (adj.get(v).size() == 1) {
                adj.get(v).get(0)[0] = adj.get(v).get(0)[1];
            }
        }

        for (int i = 1; i <= n; i++) {
            color[i] = -1;
        }

        int start = 0;
        for (int i = 1; i <= n; i++) {
            if (color[i] == -1) {
                start = i;
                color[start] = 0;
                break;
            }
        }

        if (start == 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print(color[i] + " ");
            }
            System.out.println();
        } else {
            boolean flag = dfs(start);
            if (flag) {
                for (int i = 1; i <= n; i++) {
                    System.out.print(color[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean dfs(int vertex) {
        for (int[] edge : adj.get(vertex)) {
            int childVertex = edge[0];
            int weight = edge[1];

            if ((weight & 1) == 0) {
                if (color[childVertex] == -1) {
                    color[childVertex] = color[vertex];
                } else if (