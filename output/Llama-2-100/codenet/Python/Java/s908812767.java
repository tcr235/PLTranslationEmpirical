import java.util.*;

public class s908812767 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Map<Integer, List<Integer>> V = new HashMap<>();
        Map<Integer, Integer> color = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int u, v, w;
            u = Integer.parseInt(args[i * 3 + 1]);
            v = Integer.parseInt(args[i * 3 + 2]);
            w = Integer.parseInt(args[i * 3 + 3]);

            if (!V.containsKey(u)) {
                V.put(u, new ArrayList<>());
            }
            V.get(u).add(new Pair<>(v, w));

            if (!V.containsKey(v)) {
                V.put(v, new ArrayList<>());
            }
            V.get(v).add(new Pair<>(u, w));
        }

        for (int i = 1; i <= n; i++) {
            if (color.containsKey(i)) {
                continue;
            }
            color.put(i, -1);
        }

        while (true) {
            int i = 0;
            for (int j = 1; j <= n; j++) {
                if (color.get(j) == -1) {
                    i = j;
                    color.put(i, 0);
                    break;
                }
            }
            if (i == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(color.get(j) + " ");
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
        List<Pair<Integer, Integer>> adjList = V.get(i);
        for (Pair<Integer, Integer> pair : adjList) {
            int v = pair.a;
            int w = pair.b;
            if (color.get(v) == -1) {
                color.put(v, color.get(i));
            } else if (color.get(v) == color.get(i)) {
                continue;
            } else {
                return false;
            }
            if (dfs(v)) {
                return true;
            }
        }
        return false;
    }
}
