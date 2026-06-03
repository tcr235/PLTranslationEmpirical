import java.io.*;
import java.util.*;

public class atcoder_AGC014_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] seen = new boolean[N + 1];
        int[] par = new int[N + 1];
        int[] child_num = new int[N + 1];

        Queue<Integer> que = new ArrayDeque<>();
        que.offer(1);
        seen[1] = true;

        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : adj.get(v)) {
                if (!seen[u]) {
                    seen[u] = true;
                    par[u] = v;
                    child_num[v]++;
                    que.offer(u);
                }
            }
        }

        Queue<Integer> seq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            if (child_num[i] == 0) {
                seq.offer(i);
            }
        }

        while (!seq.isEmpty()) {
            int c = seq.poll();
            seen[c] = false;
            if (!seen[par[c]]) {
                pw.println("First");
                pw.close();
                System.exit(0);
            }
            seen[par[c]] = false;
            child_num[par[par[c]]]--;
            if (child_num[par[par[c]]] == 0) {
                seq.offer(par[par[c]]);
            }
        }

        pw.println("Second");
        pw.close();
    }
}