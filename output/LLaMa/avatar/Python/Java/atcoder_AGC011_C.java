import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> g = new ArrayList<>();
    static int n, m;
    static int[] vis = new int[10001];
    static int ci, cb, cc;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 1; i <= n; i++) {
            vis[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g.get(i).isEmpty()) {
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
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean dfs(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        boolean flag = true;
        while (!stk.isEmpty()) {
            int[] temp = stk.pop();
            int u = temp[0];
            int col = temp[1];
            if (vis[u] != 0 && vis[u] != col) {
                flag = false;
            } else if (vis[u] != 0) {
                continue;
            }
            vis[u] = col;
            for (int i : g.get(u)) {
                stk.push(new int[]{i, 3 - col});
            }
        }
        return flag;
    }
}