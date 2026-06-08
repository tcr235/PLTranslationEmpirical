import java.util.*;
import java.io.*;

public class atcoder_ABC167_C {
    static int n, m, x;
    static int[][] c;
    static int[] pre;
    static Set<List<Integer>> l = new HashSet<>();
    static Set<Integer> rem = new HashSet<>();
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= m; j++) {
                c[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        pre = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = i;
        }
        for (int i = 0; i < pre.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < pre.length; j++) {
                if (j != i) {
                    set.add(j);
                }
            }
            l.add(new ArrayList<>(set));
        }
        while (true) {
            for (int i = 1; i <= m; i++) {
                rem.clear();
                for (List<Integer> comb : l) {
                    int ca = 0;
                    for (int j : comb) {
                        ca += c[j][i];
                    }
                    if (ca < x) {
                        rem.add(comb);
                    }
                }
                if (!rem.isEmpty()) {
                    l.removeAll(rem);
                }
                if (l.isEmpty()) {
                    System.out.println(-1);
                    return;
                }
            }
            if (!l.isEmpty()) {
                int ca = 0;
                for (List<Integer> p : l) {
                    for (int j : p) {
                        ca += c[j][0];
                    }
                }
                if (ca < ans) {
                    ans = ca;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}