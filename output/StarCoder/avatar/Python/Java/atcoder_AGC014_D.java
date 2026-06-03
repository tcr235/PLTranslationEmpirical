import java.util.*;

public class atcoder_AGC014_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[N + 1];
        
        for(int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for(int i = 1; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        
        Deque<Integer> que = new ArrayDeque<>();
        que.add(1);
        boolean[] seen = new boolean[N + 1];
        seen[1] = true;
        int[] par = new int[N + 1];
        int[] childNum = new int[N + 1];
        
        while(!que.isEmpty()) {
            int v = que.poll();
            for(int u : adj[v]) {
                if(!seen[u]) {
                    seen[u] = true;
                    par[u] = v;
                    childNum[v]++;
                    que.add(u);
                }
            }
        }
        
        Deque<Integer> seq = new ArrayDeque<>();
        
        for(int i = 1; i <= N; i++) {
            if(childNum[i] == 0) {
                seq.push(i);
            }
        }
        
        while(!seq.isEmpty()) {
            int c = seq.pop();
            seen[c] = false;
            
            if(c != 1 && !seen[par[c]]) {
                System.out.println("First");
                return;
            }
            
            seen[par[c]] = false;
            childNum[par[par[c]]]--;
            
            if(childNum[par[par[c]]] == 0) {
                seq.push(par[par[c]]);
            }
        }
        
        System.out.println("Second");
    }
}