```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class codeforces_216_B {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (solve(scanner)) {
        }
    }

    public static boolean solve(Scanner scanner) {
        List<Integer> line0 = new ArrayList<>();
        while (scanner.hasNextInt()) {
            line0.add(scanner.nextInt());
            if (line0.size() == 2) {
                break;
            }
        }
        int n = line0.get(0);
        int m = line0.get(1);
        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> seen = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            g.get(a).add(b);
            g.get(b).add(a);
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                ans += dfs(g, seen, i);
            }
        }
        if ((n - ans) % 2 == 1) {
            ans += 1;
        }
        System.out.println(ans);
        return true;
    }

    public static int dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, int i) {
        if (seen.contains(i)) {
            return 0;
        }
        seen.add(i);
        int nodes = 1;
        int edges = dfsHelper(g.get(i), seen);
        for (int j : g.get(i)) {
            nodes += dfs(g, seen, j);
            edges += dfsHelper(g.get(j), seen);
        }
        return nodes;
    }

    public static int dfsHelper(Set<Integer> edges, Set<Integer> seen) {
        if (seen.contains(edges.size())) {
            return 0;
        }
        seen.add(edges.size());
        int sum = 0;
        for (Integer j : edges) {
            sum += dfsHelper(gOrDefault(j, gHelper(edges), gSet(edges)), seen);
        }
        return sum;
    }

    public static Set<Integer> gDefault(Set<Integer> edges, int size) {