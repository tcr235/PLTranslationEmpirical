import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s664563518 {
    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private final boolean showFlg = false;
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;
    int N, ans;

    public void run() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        FastScanner in = new FastScanner();
        N = in.nextInt();
        String[] s = new String[N];
        int[] t = new int[N];

        for (int i = 0; i < N; i++) {
            s[i] = in.next();
            t[i] = in.nextInt();
        }

        String X = br.readLine();
        int xi = -1;

        for (int i = 0; i < N; i++) {
            if (s[i].equals(X)) {
                xi = i;
                break;
            }
        }

        int cur = 0;
        for (int i = 0; i < N; i++) {
            if (xi < i) {
                cur += t[i];
            }
        }

        out.println(cur);
        out.flush();
        out.close();
    }

    private class FastScanner {
        public String next() throws IOException {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}