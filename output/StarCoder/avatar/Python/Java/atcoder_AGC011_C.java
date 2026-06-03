import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean[] vis = new boolean[n + 1];
        int ci = 0, cb = 0, cc = 0;
        List<List<Integer>> g = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                if (g.get(i).isEmpty()) {
                    ci++;
                } else {
                    boolean flag = dfs(g, vis, i, 1);
                    if (flag) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
        
        scanner.close();
    }

    private static boolean dfs(List<List<Integer>> g, boolean[] vis, int u, int col) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{u, col});
        
        while (!stk.isEmpty()) {
            int[] current = stk.pop();
            u = current[0];
            col = current[1];
            
            if (vis[u]) {
                if (vis[u] != col) return false;
                continue;
            }
            
            vis[u] = true;
            for (int v : g.get(u)) {
                stk.push(new int[]{v, 3 - col});
            }
        }
        
        return true;
    }
}