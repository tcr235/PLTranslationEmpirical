import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final int INF = 1000000000;
    static final long MOD = (long)1e9 + 7;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.mainMethod();
        pw.flush();
        pw.close();
    }

    static void solve(int N, int[] a){
        Arrays.sort(a);
        int n = a[N-1];

        int dif = INF;
        int prevDif = dif;
        for (int i = N-2; i >= 0; i--) {
            dif = Math.min(Math.abs(n / 2 - a[i]), dif);
            if (dif != prevDif) {
                int r = a[i];
                prevDif = dif;
            }
        }

        pw.println(n + " " + (r == -1 ? 0 : r));
    }

    public void mainMethod() throws IOException {
        int N = nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = nextInt();
        }
        solve(N, a);
    }

    static StringTokenizer st = new StringTokenizer("");
    public static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    public static int nextInt() throws IOException  {return Integer.parseInt(next());}
}