import java.util.*;
import java.math.*;

public class atcoder_AGC028_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 1000000;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int Nsq = 1000;
        int[] fact = new int[M];
        fact[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            fact[n] = fact[n - 1] * n % M;
        }
        for (int n = 1; n < Nsq; n++) {
            fact[n] = fact[n] * fact[n - 1] % M;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] * fact[i] % M;
            ans %= M;
        }
        System.out.println(ans);
    }
}