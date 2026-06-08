```java
import java.util.Arrays;
import java.util.Scanner;

class UnionFind {
    int[] parent;
    int[] rank;
    int[] size;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        size = new int[n];
        Arrays.setAll(parent, i -> i);
        Arrays.fill(rank, 1);
        Arrays.fill(size, 1);
    }

    public int find(int x) {
        if (parent[x] != x) 
            parent[x] = find(parent[x]);
        return parent[x];
    }

    public boolean union(int x, int y) {
        x = find(x); 
        y = find(y);
        if (x != y) {
            if (rank[x] < rank[y]) {
                parent[x] = y;
                size[y] += size[x]; 
                size[x] = 0;
            } else if (rank[x] > rank[y]) {
                parent[y] = x; 
                size[x] += size[y]; 
                size[y] = 0;
            } else {
                parent[x] = y; 
                size[y] += size[x]; 
                size[x] = 0;
                rank[y]++;
            }
            return true; 
        }
        return false;
    }

    public int getSize(int x) {
        return size[find(x)]; 
    }

    public boolean sameSet(int x, int y) {
        return find(x) == find(y); 
    }
}

public class atcoder_AGC005_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int[] a = Arrays.stream(input).skip(1).mapToInt(Integer::parseInt).toArray();

        UnionFind uf = new UnionFind(n);

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }

        long c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1, r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += uf.getSize(k - 1);
                if (!uf.union(k - 1, k))