import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = Integer.parseInt(st.nextToken());
        }

        long mod = 998244353;
        if (D[0] != 0) {
            bw.write("0");
            bw.newLine();
            return;
        }

        Map<Integer, Long> cnt = new HashMap<>();
        for (int x : D) {
            cnt.put(x, cnt.getOrDefault(x, 0L) + 1);
        }

        if (cnt.getOrDefault(0, 0L) > 1) {
            bw.write("0");
            bw.newLine();
            return;
        }

        long res = 1;
        for (int i = 1; i <= Collections.max(Arrays.asList(D)); i++) {
            if (cnt.getOrDefault(i-1, 0L) == 1) {
                continue;
            }
            res = (res * powMod(cnt.getOrDefault(i-1, 0L), cnt.getOrDefault(i, 0L))) % mod;
        }

        bw.write(Long.toString(res));
        bw.newLine();

        bw.close();
    }

    private static long powMod(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % 998244353;
            }
            base = (base * base) % 998244353;
            exp >>= 1;
        }
        return result;
    }
}