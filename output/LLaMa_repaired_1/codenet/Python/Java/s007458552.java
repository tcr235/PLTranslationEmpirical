import java.io.*;
import java.util.*;

public class s007458552 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int[] LI() throws Exception {
        return Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public static int II() throws Exception {
        return Integer.parseInt(br.readLine());
    }

    public static String SI() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        int n = II();
        String S = SI();
        Map<Character, Integer> C = new HashMap<>();
        for (char c : S.toCharArray()) {
            C.put(c, C.getOrDefault(c, 0) + 1);
        }

        bw.write(C.getOrDefault('R', 0) > n - C.getOrDefault('R', 0) ? "Yes" : "No");
        bw.newLine();
        bw.flush();
    }
}