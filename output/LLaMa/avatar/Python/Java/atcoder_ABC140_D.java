import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class atcoder_ABC140_D {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static void main(String[] args) throws IOException {
        int N = nextInt();
        int K = nextInt();
        String S = next();
        int segCnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                segCnt++;
            }
        }
        int curHappy = N - 1 - segCnt;
        int ans;
        if (2 * K >= segCnt) {
            ans = N - 1;
        } else {
            ans = curHappy + 2 * K;
        }
        System.out.println(ans);
    }
}