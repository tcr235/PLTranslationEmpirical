import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[][] graph = new boolean[n][n];
        int[][] edges = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            graph[a][b] = true;
            graph[b][a] = true;
            edges[a][b] = edges[b][a] = scanner.nextInt();
        }
        int k = bfs(0, n, graph, edges);
        System.out.println(k);
        for (int value : edges.values()) {
            System.out.println(value);
        }
    }

    public static int bfs(int v, int n, boolean[][] graph, int[][] edges) {
        boolean[] visited = new boolean[n];
        Deque<Integer> queue = new Deque<>();
        int k = -1;
        int[] node2color = new int[n];
        queue.offer(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            for (int nex : graph[q]) {
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = true;
                color++;
                if (color == node2color[q]) {
                    color++;
                }
                node2color[nex] = color;
                edges[nex][q] = color;
                queue.offer(nex);
            }
            k = Math.max(k, color);
        }
        return k;
    }
}


