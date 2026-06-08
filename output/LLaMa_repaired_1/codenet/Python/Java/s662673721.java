import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s662673721 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(input.readLine());

            long ans = Long.MAX_VALUE;

            for (int i = 1; i <= Math.min((long) Math.sqrt(n), n) + 1; i++) {
                if (n % i != 0) {
                    continue;
                }
                long j = n / i;
                ans = Math.min(ans, i + j - 2);
            }

            System.out.println(ans);
        }
    }
}