import java.io.BufferedReader;
import java.io.InputStreamReader;

public class atcoder_AGC004_D {
    static List<Integer>[] links;
    static int k, ans;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] parts = line.split(" ");
        k = Integer.parseInt(parts[0]);
        int n = Integer.parseInt(parts[1]);
        links = new ArrayList[n];
        ans = 0;
        for (int i = 0; i < links.length; i++) {
            links[i] = new ArrayList<>();
        }
        for (int i = 2; i < parts.length; i += 2) {
            int a = Integer.parseInt(parts[i]) - 1;
            int b = Integer.parseInt(parts[i + 1]) - 1;
            links[a].add(b);
        }
        reader.close();
        if (k > 0) {
            int root = 0;
            for (int i = 0; i < n; i++) {
                if (!links[i].isEmpty()) {
                    root = i;
                    break;
                }
            }
            ans = dfs(root, k, -1)[1];
            if (root != 0) {
                ans++;
            }
            System.out.println(ans);
        }
    }

    static int[] dfs(int v, int k, int parent) {
        int maxHeightFromLeaf = 0;
        int cutCount = 0;
        for (int u : links[v]) {
            if (u == parent) {
                continue;
            }
            int[] result = dfs(u, k, v);
            maxHeightFromLeaf = Math.max(maxHeightFromLeaf, result[0]);
            cutCount += result[1];
        }
        maxHeightFromLeaf += 1;
        if (parent != 0 && maxHeightFromLeaf == k) {
            maxHeightFromLeaf = 0;
            cutCount += 1;
        }
        return new int[]{maxHeightFromLeaf, cutCount};
    }
}