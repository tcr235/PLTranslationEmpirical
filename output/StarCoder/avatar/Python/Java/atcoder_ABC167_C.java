import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m+1];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                c[i][j] = sc.nextInt();
            }
        }

        Set<Integer> pre = new HashSet<>();
        for (int i = 0; i < n; i++) {
            pre.add(i);
        }

        List<List<Integer>> l = new ArrayList<>();
        for (int i : pre) {
            l.add(new ArrayList<>(Collections.singletonList(i)));
        }

        while (true) {
            List<int[]> rem = new ArrayList<>();
            for (List<Integer> combination : l) {
                int sum = 0;
                for (Integer index : combination) {
                    sum += c[index][sc.nextInt()];
                }
                if (sum < x) {
                    rem.add(combination.stream().mapToInt(Integer::intValue).toArray());
                }
            }

            for(int [] r:rem){
                for(List<Integer> ll:l){
                    if(ll.contains(r[0]) && ll.size() > 1){
                        ll.remove((Object)r[0]);
                    }
                }
            }

            if(l.isEmpty()){
                System.out.println(-1);
                return;
            }

            int ans = Integer.MAX_VALUE;
            for (List<Integer> combination : l) {
                int sum = 0;
                for (Integer index : combination) {
                    sum += c[index][0];
                }
                ans = Math.min(ans, sum);
            }

            System.out.println(ans);
            break;
        }
    }
}