public class atcoder_AGC005_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] par = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
            b[i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i]) {
                    int k = root(j);
                    if (par[k] != j) {
                        par[i] = k;
                        rank[i] += rank[k];
                        size[i] += size[k];
                        if (rank[i] == rank[k]) {
                            rank[i]++;
                        }
                    }
                }
            }
        }
        int c = 0;
        for (int k = 0; k < n; k++) {
            c += size[k] * a[b[k]];
        }
        System.out.println(c);
    }

    public static int root(int x) {
        return x;
    }
}


