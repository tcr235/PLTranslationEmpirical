```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int[] a = Arrays.stream(input).skip(1).mapToInt(Integer::parseInt).toArray();
        
        int[] par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        
        int[] rank = new int[n];
        Arrays.fill(rank, 1);
        
        int[] size = new int[n];
        Arrays.fill(size, 1);
        
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        
        long c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1, r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(par, k - 1)];
                unite(par, rank, size, k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(par, k + 1)];
                unite(par, rank, size, k + 1, k);
            }
            c += (long) l * r * a[k];
        }
        
        System.out.print(c);
    }

    private static int root(int[] par, int x) {
        return par[x] == x ? x : root(par, par[x]);
    }

    private static boolean same(int[] par, int x, int y) {
        return root(par, x) == root(par, y);
    }

    private static void unite(int[] par, int[] rank, int[] size, int x, int y) {
        x = root(par, x);
        y = root(par, y);
        if (x != y) {
            if (rank[x] < rank[y]) {
                par[x] = y;
                size[y] += size[x];
            } else {
                par[y] = x;
                size[x] += size[y];
                if (rank[x] ==