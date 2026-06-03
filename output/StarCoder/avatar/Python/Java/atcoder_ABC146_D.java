import java.util.*;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        Map<int[], Integer> E = new HashMap<>();
        
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            E.put(new int[]{a, b}, 0);
        }
        
        int[] visited = new int[N];
        Arrays.fill(visited, 0);
        Queue<Integer> queue = new LinkedList<>();
        int[][] node2color = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                node2color[i][j] = -1;
            }
        }
        
        int v = 0;
        visited[v] = 1;
       (queue = new LinkedList<>()).offer(v);
        int k = -1;
        
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            
            for (int nex : G.get(q)) {
                if (visited[nex] != 0) {
                    continue;
                }
                visited[nex] = 1;
                color++;
                
                if (color == node2color[q][nex]) {
                    color++;
                }
                
                node2color[q][nex] = color;
                node2color[nex][q] = color;
                E.put(new int[]{Math.min(q, nex), Math.max(q, nex)}, color);
                queue.offer(nex);
            }
            
            k = Math.max(k, color);
        }
        
        System.out.println(k);
        
        for (Map.Entry<int[], Integer> entry : E.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}