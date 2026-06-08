import java.util.*;
public class atcoder_ABC167_C {
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

        List<Integer> pre = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pre.add(i);
        }

        List<List<Integer>> l = new ArrayList<>();
        for (int i : pre) {
            l.add(new ArrayList<>( Collections.singletonList(i)));
        }

        while (!l.isEmpty()) {
            List<Integer> rem = new ArrayList<>();
            Iterator<List<Integer>> comboIterator = l.iterator();
            while(comboIterator.hasNext()) {
                List<Integer> combination = comboIterator.next();
                int sum = 0;
                for (Integer index : combination) {
                    sum += c[index][sc.nextInt()];
                    if(sum >= x) {
                        break;                    
                    }
                }
                if (sum < x) {
                    rem.add(index);
                    comboIterator.remove();
                }
            }

            if(rem.isEmpty()) {
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