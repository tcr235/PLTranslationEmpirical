import java.util.Scanner;

public class atcoder_ABC172_D {
    static long calc(long n) {
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i * (n / i) * (n / i + 1) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.println(calc(N));
    }
}