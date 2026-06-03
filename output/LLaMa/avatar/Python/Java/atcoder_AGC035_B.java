import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static ArrayList<ArrayList<Integer>> edges;
    static int[] degs;
    static int[] parity;
    static boolean[] flag;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edges.add(new ArrayList<>());
        }
        degs = new int[N];
        parity = new int[N];
        flag = new boolean[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
            degs[a]++;
            degs[b]++;
        }

        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x[0]));
        for (int i = 0; i < N; i++) {
            queue.add(new int[]{degs[i], i});
        }

        while (!queue.isEmpty()) {
            int[] pair = queue.poll();
            int u = pair[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int i = 0; i < edges.get(u).size(); i++) {
                int v = edges.get(u).get(i);
                edges.get(v).remove((Integer) u);
                if (parity[u] != 0 && i == 0) {
                    System.out.println((u + 1) + " " + (v + 1));
                    parity[u] = 1 - parity[u];
                } else {
                    System.out.println((v + 1) + " " + (u + 1));
                    parity[v] = 1 - parity[v];
                }
                degs[v]--;
                queue.add(new int[]{degs[v], v});
            }
        }
    }
}