public class codeforces_216_B {
    public static void solve() {
        int n, m;
        try {
            n = Integer.parseInt(readLine());
            m = Integer.parseInt(readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return;
        }
        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> seen = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }
        for (int _ = 0; _ < m; _) {
            int a, b;
            try {
                a = Integer.parseInt(readLine());
                b = Integer.parseInt(readLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                continue;
            }
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                seen.add(i);
                int nodes = 1, edges = 0;
                dfs(g, seen, i, nodes, edges);
                if (nodes > 1 && nodes % 2 == 1 && 2 * nodes == edges) {
                    ans++;
                }
            }
        }
        if ((n - ans) % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
    }

    public static void dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, int i, int& nodes, int& edges) {
        if (seen.contains(i)) {
            return;
        }
        seen.add(i);
        int nodes1 = 1, edges1 = 0;
        for (int j : g.get(i)) {
            nodes1 += dfs(g, seen, j, nodes1, edges1);
            edges1 += edges1;
        }
        nodes += nodes1;
        edges += edges1;
    }
}


