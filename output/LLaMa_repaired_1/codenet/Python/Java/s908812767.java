import java.util.*;

public class s908812767 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Map<Integer, List<int[]>> V = new HashMap<>();
        int[] color = new int[n + 1];

        for (int i = 1; i < n; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            if (!V.containsKey(u)) {
                V.put(u, new ArrayList<>());
            }
            V.get(u).add(new int[]{v, w});

            if (!V.containsKey(v)) {
                V.put(v, new ArrayList<>());
            }
            V.get(v).add(new int[]{u, w});
        }

        for (int i = 1; i <= n; i++) {
            color[i] = -1;
        }

        while (true) {
            int i = 0;
            for (int j = 1; j <= n; j++) {
                if (color[j] == -1) {
                    i = j;
                    color[i] = 0;
                    break;
                }
            }
            if (i == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(color[j] + " ");
                }
                System.out.println();
                break;
            } else {
                if (!dfs(i)) {
                    System.out.println("No");
                    break;
                }
            }
        }
    }

    public static boolean dfs(int i) {
        for (int[] pair : V.getOrDefault(i, new ArrayList<>())) {
            int v = pair[0];
            int w = pair[1];

            if ((w & 1) == 0) {
                if (color[v] == -1) {
                    color[v] = color[i];
                } else if (color[v] == color[i]) {
                    continue;
                } else if (color[v] != color[i]) {
                    return false;
                }
            } else {
                if (color[v] == -1) {
                    color[v] = color[i] ^ 1;
                } else if (color[v] == color[i]) {
                    return false;
                } else if (color[v] != color[i]) {
                    continue;
                }
            }
            dfs(v);
        }
        return true;
    }
}