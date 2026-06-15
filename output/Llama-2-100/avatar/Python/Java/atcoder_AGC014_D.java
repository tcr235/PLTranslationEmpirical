import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayList;
import java.util.List;
public class atcoder_AGC014_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] adj = new int[n + 1][n + 1];
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj[a][b] = adj[b][a] = 1;
        }
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        boolean[] seen = new boolean[n + 1];
        int[] par = new int[n + 1];
        int[] childNum = new int[n + 1];
        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : adj[v]) {
                if (!seen[u]) {
                    seen[u] = true;
                    par[u] = v;
                    childNum[v]++;
                    que.add(u);
                }
            }
        }
        List<Integer> seq = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (childNum[i] == 0) {
                seq.add(i);
            }
        }
        while (!seq.isEmpty()) {
            int c = seq.poll();
            seen[c] = false;
            if (seen[par[c]]) {
                System.out.println("First");
                return;
            }
            seen[par[c]] = false;
            childNum[par[par[c]]]--;
            if (childNum[par[par[c]]] == 0) {
                seq.add(par[par[c]]);
            }
        }
        System.out.println("Second");
    }
}


