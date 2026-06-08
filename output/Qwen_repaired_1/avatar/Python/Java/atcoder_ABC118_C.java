import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        BigInteger[] A = new BigInteger[N];
        for (int i = 0; i < N; i++) {
            A[i] = BigInteger.valueOf(scanner.nextInt());
        }
        BigInteger result = A[0].gcd(A[1]);
        for (int i = 2; i < N; i++) {
            result = result.gcd(A[i]);
        }
        System.out.println(result);
        scanner.close();
    }
}