import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<Integer> S = Arrays.stream(reader.readLine().split(" "))
                                .map(Integer::parseInt)
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.toList());
        
        boolean[] flag = new boolean[S.size()];
        Arrays.fill(flag, true);
        
        List<Integer> cur = new ArrayList<>();
        cur.add(S.get(0));
        flag[0] = false;
        
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            
            for (int k = 0; k < S.size(); k++) {
                if (flag[k] && S.get(k) < cur.get(j)) {
                    cur.add(S.get(k));
                    j++;
                    flag[k] = false;
                    
                    if (j == jM) {
                        break;
                    }
                }
            }
            
            if (cur.size() <= i + 1) {
                System.out.println("No");
                return;
            } 
            
            Collections.sort(cur, Comparator.reverseOrder());
        }

        System.out.println("Yes");
    }
}