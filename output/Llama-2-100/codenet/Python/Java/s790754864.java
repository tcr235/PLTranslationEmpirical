import java.util.Scanner;

public class s790754864 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int R = N - K;
        long mod = (1L << 9) + 7L;

        for (int i = 1; i <= K; i++) {
            if (N - K + 1 < i) {
                int ans = 0;
            } else {
                int factR = fact(R + 1, i);
                int factK = fact(K - 1, i - 1);
                int ans = factR * factK;
            }
            System.out.println(ans % mod);
        }
    }

    public static int fact(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
