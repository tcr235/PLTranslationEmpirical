import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.PriorityQueue;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        int n, m, x;
        n = Integer.parseInt(args[0]);
        m = Integer.parseInt(args[1]);
        x = Integer.parseInt(args[2]);
        int[][] c = new int[n][m];
        List<List<Integer>> l = new ArrayList<>();
        List<List<Integer>> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> pre = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                pre.add(j);
            }
            l.add(pre);
        }
        for (int i = 1; i <= m; i++) {
            List<List<Integer>> temp = new ArrayList<>();
            for (int j : l) {
                List<Integer> comb = new ArrayList<>();
                for (int k : j) {
                    comb.add(k);
                }
                temp.add(comb);
            }
            rem.add(temp);
            l.clear();
        }
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                int c1 = 0;
                for (int i : o1) {
                    c1 += c[i, 0];
                }
                int c2 = 0;
                for (int i : o2) {
                    c2 += c[i, 0];
                }
                return c1 - c2;
            }
        });
        for (int i = 1; i <= m; i++) {
            for (List<Integer> j : rem) {
                pq.offer(j);
            }
            rem.clear();
        }
        if (pq.size() == 0) {
            System.out.println(-1);
            return;
        }
        List<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            List<Integer> j = pq.poll();
            int ca = 0;
            for (int i : j) {
                ca += c[i, 0];
            }
            if (ca < x) {
                ans.add(j);
            }
        }
        System.out.println(ans);
    }
}
