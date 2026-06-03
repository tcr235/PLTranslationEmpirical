```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] aaa = new int[n];
        for (int i = 0; i < n; i++) {
            aaa[i] = sc.nextInt() - 1;
        }
        Map<Integer, Set<Integer>> links = new HashMap<>();
        for (int i = 0; i < n; i++) {
            links.put(i, new HashSet<>());
        }
        for (int i = 0; i < n; i++) {
            links.get(aaa[i]).add(i);
        }
        int ans = dfs(links, k, 0);
        if (aaa[0] != 1) {
            ans++;
        }
        out.println(ans);
        out.close();
    }

    static int dfs(Map<Integer, Set<Integer>> links, int k, int v) {
        int heightFromLeaf = 0;
        int cutCount = 0;
        for (Integer u : links.get(v)) {
            if (u == 0) {
                continue;
            }
            int[] hgt = dfs(links, k, u);
            heightFromLeaf = Math.max(heightFromLeaf, hgt[0]);
            cutCount += hgt[1];
        }
        heightFromLeaf++;
        if (v != 0 && heightFromLeaf == k) {
            heightFromLeaf