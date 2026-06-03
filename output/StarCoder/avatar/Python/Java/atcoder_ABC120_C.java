import java.util.*;
import java.io.*;

public class Main {
    static final long INF = Long.MAX_VALUE / 2;
    static final int MOD = 1000000007;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.nextLine();
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }
        if (uniqueChars.size() == 1) {
            System.out.println(0);
            return;
        }
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int minFreq = Collections.min(charCount.values());
        System.out.println(minFreq * 2);
    }

    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
}