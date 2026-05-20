import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(br);
        int n = sc.nextInt();
        String S = br.readLine();
        Map<Character, Integer> C = new HashMap<>();
        C.put('R', 0);
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == 'R') C.put('R', C.get('R') + 1);
        }

        bw.write(C.getOrDefault('R', 0) > n - C.getOrDefault('R', 0) ? "Yes" : "No");
        bw.newLine();
        bw.flush();
    }
}