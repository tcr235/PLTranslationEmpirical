```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class s977408144 {

    static class UnionFind {
        int[] par, rank;

        UnionFind(int n) {
            this.par = new int[n];
            this.rank = new int[n];
            Arrays.setAll(par, (i) -> i);
            Arrays.fill(rank, 1);
        }

        int find(int x) {
            if (par[x] == x) return x;
            return par[x] = find(par[x]);
        }

        boolean same(int x, int y) {
            return find(x) == find(y);
        }

        void link(int x, int y) {
            int fx = find(x), fy = find(y);
            if (rank[fx] < rank[fy]) {
                par[fx] = fy;
            } else {
                par[fy] = fx;
                if (rank[fx] == rank[fy]) {
                    rank[fx]++;
                }
            }
        }

        void unite(int x, int y) {
            link(find(x), find(y));
        }

        int size() {
            int ct = 0;
            for (int i = 0; i < par.length; i++) {
                if (par[i] == i) ct++;
            }
            return ct;
        }
    }

    static class Scanner {
        BufferedReader in;
        StringTokenizer tok;

        Scanner() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (tok == null || !tok.hasMoreTokens()) try {
                tok = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return tok.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner();
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] S = new String[n];
        for (int i = 0; i < n; i++)
            S[i] = sc.next();

        Arrays.sort(S);
        for (String s