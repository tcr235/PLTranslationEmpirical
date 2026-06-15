import java.util.PriorityQueue;
public class atcoder_AGC011_C {
    public static void main(String[] args) {
        int n, m;
        n = Integer.parseInt(args[0]);
        m = Integer.parseInt(args[1]);
        int[][] g = new int[n + 1][n + 1];
        boolean[] vis = new boolean[n + 1];
        boolean[] ci = new boolean[n + 1];
        boolean[] cb = new boolean[n + 1];
        boolean[] cc = new boolean[n + 1];
        PriorityQueue<Integer> stk = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            int u, v;
            u = Integer.parseInt(args[i * 2]);
            v = Integer.parseInt(args[i * 2 + 1]);
            g[u][v] = 1;
            g[v][u] = 1;
        }
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                if (g[i].length == 0) {
                    ci++;
                } else {
                    if (dfs(i)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println((ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb));
    }
    public static boolean dfs(int x) {
        PriorityQueue<Integer> stk = new PriorityQueue<>();
        boolean flag = true;
        stk.add(new Pair(x, 1));
        while (!stk.isEmpty()) {
            Pair<Integer, Integer> u = stk.poll();
            if (vis[u.x]) {
                flag &= (vis[u.x] == u.y);
                continue;
            }
            vis[u.x] = u.y;
            for (int i : g[u.x]) {
                stk.add(new Pair(i, 3 - u.y));
            }
        }
        return flag;
    }
    public static class Pair implements Comparable<Pair> {
        public int x;
        public int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Pair o) {
            if (this.x < o.x) {
                return -1;
            } else if (this.x > o.x) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}


