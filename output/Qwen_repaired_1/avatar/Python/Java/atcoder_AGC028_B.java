```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(reader.readLine());
        BigInteger MOD = BigInteger.valueOf(1_000_000_007);
        String[] A_input = reader.readLine().split(" ");
        BigInteger[] A = Arrays.stream(A_input)
                                 .map(BigInteger::new)
                                 .toArray(BigInteger[]::new);

        BigInteger[][] fact = new BigInteger[1001][1001];
        for(int i = 0; i < factorials.length; i++){
            for(int j = 0; j < factorials[i].length; j++)
                factorials[i][j]=BigInteger.ONE;
        }

        for (int n = 1; n <= 1000; n++) {
            Arrays.copyOf(fact[n - 1], n);
            for (int m = 0; m < n; m++) {
                fact[n][m] = fact[n][m].multiply(BigInteger.valueOf(n + 1));
                if (fact[n][m].compareTo(MOD) >= 0) {
                    fact[n][m] = fact[n][m].mod(MOD);
                }
            }
        }

        BigInteger[] inv = new BigInteger[A.length];
        inv[0] = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i < A.length; i++) {
            inv[i]=inv[i-1].multiply(BigInteger.valueOf(i)).mod(MOD);
            sum=sum.add(inv[i]);
        }
        
        Arrays.sort(A);
        BigInteger result = BigInteger.ZERO;
        for(int i=0;i<A.length/2;++i){
            result=result.add(A[i].multiply(sum.subtract(inv[i].subtract(inv[A.length-1-i]).add(MOD)).mod(MOD))).multiply(fact[i]);
            if(result.compareTo(MOD)>=0)
                result=result.mod(MOD);
        }

        if(A.length%2!=0)
            result=result.add(A[A.length/2].multiply(sum.addBigInteger(A.length==1?BigInteger.ZERO:inv[A.length/2].subtract(inv[A.length/2-1]).add(inv[A.length-1])).mod(MOD));

        System.out.println(result.add(MOD).divide(MOD));