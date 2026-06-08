import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s878873709 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] s = {1, 2, 4, 8, 16, 32, 64};
        int ans = 0;

        for (int i = 1; i <= N; i++) {
            if (i == s[0] || i == s[1] || i == s[2] || i == s[3] || i == s[4] || i == s[5] || i == s[6]) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}