import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int readInt() throws IOException {
        int ans = 0;
        boolean isNegative = false;
        int c;
        do {
            c = System.in.read();
            if (c == '-') {
                isNegative = true;
            }
        } while (c < '0' || c > '9');
        ans = c - '0';
        while (true) {
            c = System.in.read();
            if (c < '0' || c > '9') break;
            ans = ans * 10 + c - '0';
        }
        return isNegative ? -ans : ans;
    }

    public static void main(String[] args) throws IOException {
        int d = readInt(), g = readInt();
        int[][] pc = new int[d][2];
        for (int i = 0; i < d; i++) {
            pc[i][0] = readInt();
            pc[i][1] = readInt();
        }
        int ans = (int)Math.pow(10, 9);
        for (int bit = 1; bit < (1 << d); bit++) {
            int count = 0, sum = 0;
            Set<Integer> nokori = new HashSet<>();
            for (int i = 1; i <= d; i++) {
                nokori.add(i);
            }
            for (int i = 0; i < d; i++) {
                if ((bit & (1 << i)) != 0) {
                    sum += pc[i][0] * (i + 1) * 100 + pc[i][1];
                    count += pc[i][0];
                    nokori.remove(i + 1);
                }
            }
            if (sum < g) {
                Integer use = Collections.max(nokori);
                int n = Math.min(pc[use - 1][0], (-(g - sum) / (use * 100)) - 1);
                count += n;
                sum += n * use * 100;
            }
            if (sum >= g) {
                ans = Math.min(ans, count);
            }
        }
        System.out.println(ans);
    }
}