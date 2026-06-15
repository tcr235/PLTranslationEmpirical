import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] degs = new int[n];
        int[] parity = new int[n];
        boolean[] flag = new boolean[n];
        HashSet<Integer>[] edges = new HashSet[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new HashSet<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            edges[a - 1].add(b - 1);
            edges[b - 1].add(a - 1);
            degs[a - 1]++;
            degs[b - 1]++;
        }
        if (m % 2!= 0) {
            System.out.println(-1);
            return;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                return a.deg - b.deg;
            }
        });
        for (int i = 0; i < n; i++) {
            pq.add(new Pair(degs[i], i));
        }
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            if (flag[p.id]) continue;
            flag[p.id] = true;
            int u = p.id;
            for (int v : edges[u]) {
                edges[v].remove(u);
                if (parity[u]!= 0 && edges[u].size() == 0) {
                    System.out.println(u + 1 + " " + v + 1);
                    parity[u] = 1 - parity[u];
                } else {
                    System.out.println(v + 1 + " " + u + 1);
                    parity[v] = 1 - parity[v];
                }
                degs[v]--;
                pq.add(new Pair(degs[v], v));
            }
        }
    }
}
class Pair {
    int deg;
    int id;
    Pair(int deg, int id) {
        this.deg = deg;
        this.id = id;
    }
}
