import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.math.BigInteger;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 100000;
        List<Long> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            for (int j = 0; j < arr.length; j++) {
                A.add(Long.parseLong(arr[j]));
            }
        }
        int Nsq = 1000;
        BigInteger[][] fact = new BigInteger[Nsq][Nsq];
        BigInteger[] inv = new BigInteger[N];
        for (int n = 1; n <= Nsq; n++) {
            fact[n][0] = BigInteger.ONE;
            for (int i = 1; i < Nsq; i++) {
                fact[n][i] = fact[n - 1][i - 1] * fact[n - 1][i];
                fact[n][i] = fact[n][i].mod(M);
            }
        }
        for (int n = 1; n <= Nsq; n++) {
            inv[n] = BigInteger.valueOf(pow(n + 1, M - 2, M));
        }
        BigInteger temp = inv[j] + inv[N - 1 - j] - BigInteger.ONE;
        BigInteger ans = (BigInteger) A.stream().map(a -> a * temp.mod(M)).sum().mod(M);
        ans = ans.multiply(fact[N]).mod(M);
        System.out.println(ans);
    }
}


