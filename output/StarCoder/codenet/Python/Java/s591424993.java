import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int g = scanner.nextInt();
        int[][] pc = new int[d][2];
        for (int i = 0; i < d; i++) {
            pc[i][0] = scanner.nextInt();
            pc[i][1] = scanner.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int bit = 0; bit < (1 << d); bit++) {
            int count = 0;
            int sum = 0;
            Set<Integer> nokori = new HashSet<>();
            for (int j = 0; j < d; j++) {
                if ((bit & (1 << j)) != 0) {
                    sum += pc[j][0] * (j + 1) * 100 + pc[j][1];
                    count += pc[j][0];
                    nokori.remove(j + 1);
                }
            }
            if (sum < g) {
                int use = Collections.max(nokori);
                int n = Math.min(pc[use - 1][0], -(g - sum) / (use * 100));
                count += n;
                sum += n * use * 100;
            }
            if (sum >= g) {
                ans = Math.min(ans, count);
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}