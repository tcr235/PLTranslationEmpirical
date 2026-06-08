```java
import java.util.Scanner;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        long MOD = 1000000007;
        long[] A = Arrays.stream(scanner.nextLine().split(" "))
                         .mapToLong(Long::parseLong)
                         .toArray();
        long[][] fact = new long[(int)Math.pow(10, 3)][(int)Math.pow(10, 3)];
        Arrays.fill(fact[0], 0);
        fact[0][0] = 1;
        for (int n = 1; n < Math.pow(10, 3); n++) {
            System.arraycopy(fact[n-1], 0, fact[n], 0, n+1);
            for (int m = 0; m <= n; m++) {
                fact[n][m] *= (n+1);
                if (fact[n][m] >= MOD) {
                    fact[n][m] %= MOD;
                }
            }
        }
        for (int n = 1; n < Math.pow(10, 3); n++) {
            fact[n][(int)Math.pow(10, 3)-1] *= fact[n-1][(int)Math.pow(10, 3)-1];
            while (fact[n][(int)Math.pow(10, 3)-1] >= MOD) {
                fact[n][(int)Math.pow(10, 3)-1] %= MOD;
            }
        }
        
        long[] inv = new long[N];
        inv[0] = 1;
        long sum = 0;
        for (int i = 1; i < N; i++) {
            inv[i]=(i*inv[i-1])%MOD;
            sum+=inv[i]%MOD;
        }
        
        Arrays.sort(A);
        long result = 0;
        for(int i=0;i<N/2;++i){
            result=((result+A[i]*((sum-inv[i]-inv[N-i-1]+MOD)%MOD))%MOD)*fact[i]%(N>=1?MOD:1);
        }
        if(N%2!=0){
           result=((result+A[N/2]*(sum+(N==1?0:(inv[N/2]-inv[N/2-1]+inv[N-1]))%MOD))