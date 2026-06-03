import java.util.Scanner;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

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
        writer.flush();
        writer.close();
        scanner.close();
    }

    private static void solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;
        solveHelper(N, M, Q, a, b, c, d, new int[N], 0, res, writer);
    }

    private static void solveHelper(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d, int[] current, int pos, int res, PrintWriter writer) {
        if (pos == N) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (current[b[i] - 1] - current[a[i] - 1] == c[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
            writer.println(res);
            return;
        }

        int lastMax = (current.length > 0) ? current[current.length - 1] : 1;
        for (int i = lastMax; i <= M; i++) {
            current[pos] = i;
            solveHelper(N, M, Q, a, b, c, d, current, pos + 1, res, writer);
        }
    }
}