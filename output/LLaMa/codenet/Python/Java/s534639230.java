import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        solve(br, pw);
        pw.close();
    }

    static void solve(BufferedReader br, PrintWriter pw) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String[] DStr = br.readLine().split(" ");
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = Integer.parseInt(DStr[i]);
        }

        int mod = 998244353;

        if (D[0] != 0) {
            pw.println(0);
            return;
        }

        Map<Integer, Integer> cnt = new HashMap<>();
        for (int val : D) {
            cnt.put(val, cnt.getOrDefault(val, 0) + 1);
        }

        if (cnt.getOrDefault(0, 0) > 1) {
            pw.println(0);
            return;
        }

        int res = 1;

        int max = Collections.max(Arrays.asList(D)) + 1;
        for (int i = 1; i < max; i++) {
            if (cnt.getOrDefault(i - 1, 0) == 1) {
                continue;
            }
            res = (int) ((long) res * Math.pow(cnt.get(i - 1), cnt.get(i)) % mod);
        }

        pw.println(res);
    }
}