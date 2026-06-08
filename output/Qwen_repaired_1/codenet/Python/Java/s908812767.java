import java.util.*;

class Main {
    static List<int[]>[] adjList;
    static int[] color;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        adjList = new ArrayList[n+1];
        color = new int[n+1];

        Arrays.fill(color, -1);

        for (int i = 0; i <= n; i++) {
            adjList[i] = new ArrayList<int[]>();
        }

        for (int i = 1; i < n; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            adjList[u].add(new int[]{v, w});
            adjList[v].add(new int[]{u, w});
        }

        int startVertex = 1;
        while (color[startVertex] != -1) {
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
        visited[vertex] = true;
        for (int[] edge : adjList[vertex]) {
            int neighbor = edge[0];
            int weight = edge[1];
            if (color[neighbor] == -1) {
                color[neighbor] = weight % 2 == 0 ? color[vertex] : color[vertex] ^ 1;
                if (!dfs(neighbor)) {
                    return false;
                }
            } else if (color[neighbor] == color[vertex]) {
                if (weight % 2 != 0) {
                    return false;
                }
            } else if (color[neighbor] != color[vertex] && weight % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}