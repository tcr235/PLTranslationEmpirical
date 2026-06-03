```java
import java.util.*;
import java.io.*;

public class atcoder_ABC167_C {
    static int n, m, x;
    static int[][] c;
    static int[] pre;
    static List<List<Integer>> l;
    static List<Integer> rem;
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
        l = new ArrayList<>();
        rem = new ArrayList<>();
        for (int i = 0; i < pre.length; i++) {
            List<Integer> p = new ArrayList<>();
            for (int j = 0; j < pre.length; j++) {
                if (j != i) {
                    p.add(j);
                }
            }
            l.add(p);
        }
        while (true) {
            for (int i = 1; i <= m; i++) {
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < l.size(); j++) {
                    int ca = 0;
                    for (int ii : l.get(j)) {
                        ca += c[ii][i];
                    }
                    if (ca < x) {
                        temp.add(j);
                    }
                }
                if (!temp.isEmpty()) {
                    for (int j : temp) {
                        l.remove(j);
                    }
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