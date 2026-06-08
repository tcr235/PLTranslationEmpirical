import java.util.Scanner;

public class atcoder_AGC046_B {
    static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int[][] d = new int[C + 1][D + 1];
        d[A][B] = 1;

        for (int i = A; i <= C; i++) {
            for (int j = B; j <= D; j++) {
                d[i][j] = (int) (((long)d[i][j - 1] * i + (long)d[i - 1][j] * j - (long)d[i - 1][j - 1] * (i - 1) * (j - 1)) % MOD);
                if (d[i][j] < 0) {
                    d[i][j] += MOD;
                }
            }
        }

        System.out.println(d[C][D]);
    }
}