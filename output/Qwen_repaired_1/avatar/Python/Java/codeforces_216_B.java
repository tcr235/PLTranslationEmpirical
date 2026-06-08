import java.util.*;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (solve(scanner)) {
        }
    }

    public static boolean solve(Scanner scanner) {
        List<Integer> line0 = new ArrayList<>();
        try {
            String[] input = scanner.nextLine().split(" ");
            for (String s : input) {
                line0.add(Integer.parseInt(s));
            }
        } catch (NoSuchElementException e) {
            return false;
        }
        int n = line0.get(0);
        int m = line0.get(1);
        Map<Integer, Set<Integer>> g = new HashMap<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }

        for (int i = 0; i < m; i++) {
            String[] split = scanner.nextLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            g.get(a).add(b);
            g.get(b).add(a);
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                Set<Integer> cycleNodes = new HashSet<>();
                int edges = dfs(g, seen, cycleNodes, i);
                if (cycleNodes.size() > 1 && cycleNodes.size() % 2 == 1 && 2 * cycleNodes.size() == edges) {
                    ans++;
                }
            }
        }

        if ((n - ans) % 2 == 1) {
            ans++;
        }

        System.out.println(ans);
        return true;
    }

    private static int dfs(Map<Integer, Set<Integer>> g, Set<Integer> seen, Set<Integer> cycleNodes, int i) {
        if (seen.contains(i)) {
            return 0;
        }
        seen.add(i);
        cycleNodes.add(i);

        int edges = 0;
        for (int neighbor : g.get(i)) {
            edges += dfs(g, seen, cycleNodes, neighbor);
        }

        return edges + cycleNodes.size() - 1;
    }
}