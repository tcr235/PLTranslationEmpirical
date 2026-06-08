import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_171_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        int x = Math.max(a.length(), b.length());
        StringBuilder sb = new StringBuilder();
        while (sb.length() < x) {
            sb.insert(0, '0');
        }
        while (sb.length() > x) {
            if (sb.charAt(x) == '0') {
                sb.deleteCharAt(x);
            } else {
                break;
            }
        }
        int c = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = x - 1; i >= 0; i--) {
            int d = (sb.charAt(i) - '0') + (a.charAt(x - i - 1) - '0') + c;
            if (d > 9) {
                ans.insert(0, d % 10);
                c = 1;
            } else {
                ans.insert(0, d);
                c = 0;
            }
        }
        if (c == 1) {
            ans.insert(0, 1);
        }
        System.out.println(ans.toString());
    }
}