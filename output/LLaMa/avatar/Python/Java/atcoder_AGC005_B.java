import java.util.*;

public class atcoder_AGC005_B {
    static int[] par, rank, size;
    static int[] b;

    public static int find(int x) {
        if (par[x] == x) return x;
        return find(par[x]);
    }

    public static boolean same(int x, int y) {
        return find(x) == find(y);
    }

    public static void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            if (rank[x] < rank[y]) {
                par[x] = y;
                size[y] += size[x];
            } else {
                par[y] = x;
                size[x] += size[y];
                if (rank[x] == rank[y]) rank[x]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        par = new int[n];
        for (int i = 0; i < n; i++) par[i] = i;
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) size[i] = 1;
        b = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[a[i] - 1] = i;
        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1;
            int r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[find(k - 1)];
                unite(k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[find(k + 1)];
                unite(k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }
}