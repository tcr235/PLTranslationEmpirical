import java.util.*;
import java.io.*;
public class atcoder_ABC089_C {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for(int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }
        int[] march = new int[5];
        for(String str : s) {
            if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                march[str.charAt(0) - 'A']++;
            }
        }
        int ans = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = i + 1; j < 5; j++) {
                for(int k = j + 1; k < 5; k++) {
                    ans += march[i] * march[j] * march[k];
                }
            }
        }
        System.out.println(ans);
    }
}

