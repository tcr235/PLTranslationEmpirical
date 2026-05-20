```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private final boolean showFlg = false;
    int N, ans;
    int[] t;

    public void run() throws IOException {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        N = in.nextInt();
        t = new int[N];

        for (int i = 0; i < N; i++) {
            String s = in.next();
            int tI = in.nextInt();
            t[i] = tI;
        }

        String X = in.next();
        int xi = -1;

        for (int i = 0; i < N; i++) {
            if (s.equals(X)) {
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

    private boolean hasNextByte() {
        return false;
    }

    private String nextByte() {
        return "";
    }

    private boolean hasNext() {
        return hasNextByte();
    }

    private String next() {
        return nextByte();
    }

    private int[] nextIntArr() {
        return null;
    }

    private int nextInt() {
        return 0;
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        public String next() {
            while (!st.hasMoreElements()) {
                try {
                    String nextLine = br.readLine();
                    st = new StringTokenizer(nextLine);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws Exception {
            int[] arr = new int[n];
            for (