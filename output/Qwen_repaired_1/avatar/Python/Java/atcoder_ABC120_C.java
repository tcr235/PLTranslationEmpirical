import java.util.*;
import java.io.*;

public class atcoder_ABC120_C {
    static final long INF = Long.MAX_VALUE / 2;
    static final int MOD = 1000000007;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = br.read(); // Read character count
        String s = new String(br.read(n)); // Read characters as string
        
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
}