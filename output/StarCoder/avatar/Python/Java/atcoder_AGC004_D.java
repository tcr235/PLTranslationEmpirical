import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer>[] links;
    static int k, ans;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        links = new ArrayList[k];
        ans = 0;
        for (int i = 0; i < links.length; i++) {
            links[i] = new ArrayList<>();
        }
        int root = -1;
        for (int i = 0; i < scanner.nextInt(); i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            links[a].add(b);
            if (root == -1 && a != b) {
                root = b;
            } else if (a == b && root != -1) {
                System.out.println("Error: Duplicate root");
                return;
            }
        }
        scanner.close();
        if (root == -1) {
            root = 0;
        }
        dfs(root, k, 0);
        if (!aaa[0].equals(1)) {
            ans++;
        }
        System.out.println(ans);
    }

    static int[] dfs(int v, int k,int parent){
        int maxHeightFromLeaf = 0;
        int cutCount = 0;
        for (int u : links[v]) {
            if (u == parent) {
                continue;
            }
            int[] result = dfs(u, k,v);
            maxHeightFromLeaf = Math.max(maxHeightFromLeaf, result[0]);
            cutCount += result[1];
        }
        maxHeightFromLeaf += 1;
        if (parent != 0 && maxHeightFromLeaf == k) {
            maxHeightFromLeaf = 0;
            cutCount += 1;
        }
        return new int[]{maxHeightFromLeaf,cutCount};
    }
}