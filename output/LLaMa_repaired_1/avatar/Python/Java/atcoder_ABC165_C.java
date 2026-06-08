```java
import java.util.Scanner;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            solve(scanner);
        }
        scanner.close();
    }

    public static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();

        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];

        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }

        solve(N, M, Q, a, b, c, d);
    }

    public static void solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;

        for (int S = 0; S <= M; S++) {
            res = Math.max(res, rec(N, S, 1, M, a, b, c, d, new int[N + 1], res));
        }

        System.out.println(res);
    }

    public static int rec(int N, int currentSum, int pos, int M, int[] a, int[] b, int[] c, int[] d, int[] dp, int res) {
        if (pos == a.length + 1) {
            int ans = 0;
            for (int i = 0; i < a.length; i++) {
                if (currentSum - a[i] == c[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
            return res;
        }

        if (dp[currentSum] != 0 && dp[currentSum] < M + 1) {
            return rec(N, currentSum, pos + 1, M, a, b, c, d, dp, res);
        }

        dp[currentSum] = pos;
        for (int i = pos; i <= M; i++) {
            res = Math.max(res, rec(N, currentSum + i, pos + 1, M, a, b, c, d,