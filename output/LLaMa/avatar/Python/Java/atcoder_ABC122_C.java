import java.util.*;
import java.io.*;

public class atcoder_ABC122_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        List<int[]> problems = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            problems.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        int[] cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i - 1 >= 0 && i + 1 <= n && s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
                cumsum[i] = cumsum[i - 1] + 1;
            } else {
                cumsum[i] = cumsum[i - 1];
            }
        }
        for (int[] p : problems) {
            System.out.println(cumsum[p[1] - 1] - cumsum[p[0] - 1]);
        }
    }
}