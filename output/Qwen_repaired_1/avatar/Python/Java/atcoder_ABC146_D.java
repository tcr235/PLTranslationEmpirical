```java
import java.util.*;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        
        int[] degree = new int[N];
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            degree[a]++;
            degree[b]++;
        }
        
        ArrayDeque<Integer> leaves = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (degree[i] <= 1) {
                leaves.offer(i);
            }
        }
        
        boolean[] removed = new boolean[N];
        List<Integer> newG[] = (List<Integer>[])new List[N];
        for (int i = 0; i < N; i++) {
            newG[i] = new ArrayList<>();
        }
        int count = N;
        while (count > 2 && !leaves.isEmpty()) {
            int u = leaves.poll();
            removed[u] = true;
            count--;
            for (int v : G.get(u)) {
                if (!removed[v]) {
                    newG[v].remove(Integer.valueOf(u));
                    degree[v]--;
                    if (degree[v] <= 1) {
                        leaves.offer(v);
                    }
                }
            }
        }
        
        if (count > 1) {
            for (int i = 0; i < leaves.size(); i++) {
                for (int j = i + 1; j < leaves.size(); j++) {
                    newG[leaves.get(i)].add(leaves.get(j));
                    newG[leaves.get(j)].add(leaves.get(i));
                }
            }
            dfs(0, newG, new int[N], false, -1);
            System.out.println(getHeight(0, newG, new int[N]));
        } else {
            System.out.println(0);
        }
        
        
    }
    
    private static int getHeight(int u, List<Integer>[] G, int[] height, boolean[] visited, int parent) {
        visited[u] = true