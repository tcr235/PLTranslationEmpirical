import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s906994739 {
    static int n;
    static long[][] F;
    static long[][] P;
    static long max = Long.MIN_VALUE;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        F = new long[(int) n][10];
        P = new long[(int) n][10];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                F[i][j] = Long.parseLong(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                P[i][j] = Long.parseLong(st.nextToken());
            }
        }
    }

    static int bitCount(long n) {
        int count = 0;
        while (n > 0) {
            count += (int) (n & 1);
            n >>= 1;
        }
        return count;
    }

    static long calc(long i) {
        long[] lst = new long[(int) n];
        for (int j = 0; j < 10; j++) {
            if (((i >> j) & 1) == 1) {
                for (int k = 0; k < n; k++) {
                    lst[k] += F[k][j];
                }
            }
        }
        long tmp = 0;
        for (int k = 0; k < n; k++) {
            tmp += P[k][(int) lst[k]];
        }
        return tmp;
    }

    static void solve() {
        max = Long.MIN_VALUE;
        for (long i = 1; i < Math.pow(2, 10); i++) {
            long tmp = calc(i);
            max = Math.max(max, tmp);
        }
        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}