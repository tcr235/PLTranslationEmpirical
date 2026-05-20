import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans = (int) 1e17;

        for (int k = 0; k <= Math.max(X, Y); k++) {
            int total = 2 * C * k + A * Math.max(0, X - k) + B * Math.max(0, Y - k);
            if (total < ans)
                ans = total;
        }

        out.println(ans);
        out.flush();
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {}
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}