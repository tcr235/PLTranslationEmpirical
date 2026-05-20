import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());
        int R = N - K;
        BigInteger mod = BigInteger.valueOf(10).pow(9).add(BigInteger.ONE);

        for (int i = 1; i <= K; i++) {
            if (R + 2 < i) {
                System.out.println(0);
            } else {
                BigInteger ans = factorial(R + 1).divide(factorial(i)).multiply(factorial(K - 1).divide(factorial(i - 1)));
                System.out.println(ans.mod(mod));
            }
        }

        scanner.close();
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int factor = 2; factor <= n; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }
}