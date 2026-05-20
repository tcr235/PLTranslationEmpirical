import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int R = N - K;
        long mod = (long) (1e9 + 7);

        for (int i = 1; i <= K; i++) {
            long ans = 0;
            if (N - K + 1 >= i) {
                ans = (long) mathFunction(R + 1, i) * mathFunction(K - 1, i - 1);
            }
            System.out.println(ans % mod);
        }

        scanner.close();
    }

    public static long mathFunction(int n, int r) {
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
}