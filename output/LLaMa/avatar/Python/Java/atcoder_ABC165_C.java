import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            solve(scanner);
        }
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

        int[][] rec = new int[N + 1][M + 1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(rec[i], -1);
        }

        rec(0, 1, N, M, a, b, c, d, res);
        System.out.println(res);
    }

    public static void rec(int currentSum, int pos, int N, int M, int[] a, int[] b, int[] c, int[] d, int res) {
        if (pos == a.length + 1) {
            int ans = 0;
            for (int i = 0; i < a.length; i++) {
                if (currentSum - a[i] == c[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
            return;
        }
        if (rec[currentSum][pos] != -1) {
            rec(currentSum, pos + 1, N, M, a, b, c, d, res);
            return;
        }
        rec[currentSum][pos] = 1;
        for (int i = 1; i <= M; i++) {
            rec(i + currentSum, pos + 1, N, M, a, b, c, d, res);
        }
    }
}