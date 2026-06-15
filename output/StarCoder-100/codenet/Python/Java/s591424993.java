import java.util.*;
import java.io.*;

public class s591424993 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int d = Integer.parseInt(line[0]);
        int g = Integer.parseInt(line[1]);
        int[][] pc = new int[d][2];
        for (int i = 0; i < d; i++) {
            line = br.readLine().split(" ");
            pc[i][0] = Integer.parseInt(line[0]);
            pc[i][1] = Integer.parseInt(line[1]);
        }
        int ans = Integer.MAX_VALUE;
        for (int bit = 0; bit < (1 << d); bit++) {
            int count = 0;
            int sum = 0;
            Set<Integer> nokori = new HashSet<>();
            for (int i = 0; i < d; i++) {
                if (((bit >> i) & 1) == 1) {
                    sum += pc[i][0] * (i + 1) * 100 + pc[i][1];
                    count += pc[i][0];
                    nokori.add(i + 1);
                }
            }
            if (sum < g) {
                int use = Collections.max(nokori);
                int n = Math.min(pc[use - 1][0], -(-(g - sum) / (use * 100)));
                count += n;
                sum += n * use * 100;
            }
            if (sum >= g) {
                ans = Math.min(ans, count);
            }
        }
        System.out.println(ans);
    }
}