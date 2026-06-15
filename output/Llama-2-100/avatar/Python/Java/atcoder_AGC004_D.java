import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoder_AGC004_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Map<Integer, Set<Integer>> links = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            links.put(a, new HashSet<>());
            for (int j = 0; j < n; j++) {
                if (j != a) {
                    links.get(a).add(j);
                }
            }
        }
        int heightFromLeaf = 0;
        int cutCount = 0;
        int v = 0;
        dfs(links, n, k, v, 0);
        System.out.println(cutCount);
    }

    public static int dfs(Map<Integer, Set<Integer>> links, int n, int k, int v, int p) {
        int heightFromLeaf = 0;
        int cutCount = 0;
        for (int u : links.get(v)) {
            if (u == 0) {
                continue;
            }
            int hgt = dfs(links, n, k, u, v);
            heightFromLeaf = Math.max(heightFromLeaf, hgt);
            cutCount += hgt;
        }
        heightFromLeaf += 1;
        if (p != 0 && heightFromLeaf == k) {
            heightFromLeaf = 0;
            cutCount += 1;
        }
        return heightFromLeaf, cutCount;
    }
}


