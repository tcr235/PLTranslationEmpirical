import java.util.*;
import java.io.*;
public class atcoder_AGC005_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] par = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1, r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(par[k - 1])];
                unite(k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(par[k + 1])];
                unite(k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }
    public static int root(int x) {
        return x == par[x]? x : (par[x] = root(par[x]));
    }
    public static void unite(int x, int y) {
        int px = root(x);
        int py = root(y);
        if (px!= py) {
            if (rank[px] < rank[py]) {
                par[px] = py;
                size[py] += size[px];
            } else {
                par[py] = px;
                size[px] += size[py];
                if (rank[px] == rank[py]) rank[px]++;
            }
        }
    }
}