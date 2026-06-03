import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        int x = Math.max(input[0].length(), input[1].length());
        String a = input[0];
        String b = input[1];
        while (a.length() < x) {
            a = "0" + a;
        }
        while (b.length() < x) {
            b = "0" + b;
        }
        StringBuilder s = new StringBuilder();
        int c = 0;
        for (int i = x - 1; i >= 0; i--) {
            int d = (int) b.charAt(i) + (int) a.charAt(x - i - 1) + c;
            if (d > 9) {
                s.insert(0, d % 10);
                c = 1;
            } else {
                s.insert(0, d);
                c = 0;
            }
        }
        if (c == 1) {
            s.insert(0, '1');
        }
        System.out.println(s.reverse().toString());
    }
}