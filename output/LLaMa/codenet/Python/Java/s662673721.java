import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    static StreamTokenizer in;

    static void init() throws IOException {
        in = new StreamTokenizer(new BufferedInputStream(System.in));
        in.ordinaryChars('0', '9');
        in.wordChars('0', '9');
    }

    public static void main(String[] args) throws IOException {
        init();
        int n = nextInt();

        long ans = (long)1e18;

        for (int i = 1; i <= Math.min((long)Math.pow(n, 0.5), n) + 2; i++) {
            if (n % i != 0) {
                continue;
            }
            long j = n / i;
            ans = Math.min(ans, i + j - 2);
        }

        System.out.println(ans);
    }

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }
}