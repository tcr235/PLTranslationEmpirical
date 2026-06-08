import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class s344468705 {
    private static final long INF = (long) 1e20;
    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while (n-- > 0) {
            solve(reader);
        }
    }

    private static void solve(BufferedReader reader) throws Exception {
        int n = Integer.parseInt(reader.readLine());
        Long[] dp = new Long[n + 1];
        Arrays.fill(dp, -INF);
        dp[0] = 0L;
        for (int i = 1; i <= n; i++) {
            long num = -Long.parseLong(reader.readLine());
            if (num >= dp[i - 1]) {
                dp[i] = num;
            } else {
                int idx = bisectRight(dp, num, i);
                dp[idx] = num;
            }
        }

        System.out.println(getLastValidIndex(dp));
    }

    private static int bisectRight(Long[] list, long x, int maxIndex) {
        int lo = 0, hi = maxIndex;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (list[mid] <= x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    private static int getLastValidIndex(Long[] dp) {
        for (int i = dp.length - 1; i >= 0; i--) {
            if (dp[i] != -INF) {
                return i;
            }
        }
        return -1;
    }
}