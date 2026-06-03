import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class atcoder_ABC174_C {
    public static void main(String[] args) throws IOException {
        FastReader s = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int k = s.nextInt();
        int t = 0;
        for (int i = 1; i <= k; i++) {
            t = (t % k) * 10 + 7;
            if (t % k == 0) {
                out.println(i);
                break;
            }
        } else {
            out.println(-1);
        }
        out.flush();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}