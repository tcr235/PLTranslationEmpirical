import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    static final BigInteger MOD = BigInteger.TEN.pow(9).add(BigInteger.ONE);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int R = N - K;

        BigInteger[] facts = new BigInteger[K + 1];
        Arrays.fill(facts, BigInteger.ONE);
        for (int i = 2; i <= K; ++i) {
            facts[i] = facts[i - 1].multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= K; ++i) {
            if (R + 2 < i) 
              System.out.println(0); 
            else 
              System.out.println(facts[R + 1].divide(facts[i]).multiply(facts[K - 1].divide(facts[i - 1])).mod(MOD)); 
        } 

        scanner.close();
    }
}