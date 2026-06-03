import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    static int nextInt() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return Integer.parseInt(tokenizer.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int id = 0;
        int l = nextInt();
        int r = nextInt();
        for (int i = 1; i < n; i++) {
            int li = nextInt();
            int ri = nextInt();
            if (li <= l && r <= ri) id = i;
            else if (li < l || r < ri) id = n;
            l = Math.min(l, li);
            r = Math.max(r, ri);
        }
        System.out.println(id == n ? -1 : (id + 1));
    }
}