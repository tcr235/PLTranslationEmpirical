import java.util.*;
class Main {
    static int[][] graph;
    static boolean[] visited;
    static int[] color;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        graph = new int[n+1][];
        visited = new boolean[n+1];
        color = new int[n+1];

        Arrays.fill(color, -1);

        ArrayList<int[]>[] adjList = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            adjList[u].add(new int[]{v, w});
            adjList[v].add(new int[]{u, w});
        }

        int startVertex = 1;
        while (!visited[startVertex]) {
            startVertex++;
        }

        if (!dfs(startVertex)) {
            System.out.println("No");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println(color[i]);
            }
        }
        scanner.close();
    }

    private static boolean dfs(int vertex) {
        for (int[] edge : adjList[vertex]) {
            int neighbor = edge[0];
            int weight = edge[1];
            if (weight % 2 == 0) {
                if (color[neighbor] == -1) {
                    color[neighbor] = color[vertex];
                } else if (color[neighbor] == color[vertex]) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (color[neighbor] == -1) {
                    color[neighbor] = color[vertex] ^ 1;
                } else if (color[neighbor] == color[vertex]) {
                    return false;
                } else {
                    continue;
                }
            }
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                if (!dfs(neighbor)) {
                    return false;
                }
            }
        }
        return true;
    }
}