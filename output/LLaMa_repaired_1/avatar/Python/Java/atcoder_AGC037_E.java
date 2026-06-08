```java
import java.util.Scanner;

public class atcoder_AGC037_E {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        int K = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        String S = scanner.nextLine();
        boolean aaaa = false;

        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }

        if (aaaa) {
            char c = (char) Math.min(S.charAt(0), S.charAt(1));
            System.out.println(c * N);
            System.exit(0);
        }

        String get_last_dict(String s_str, int N) {
            String U = s_str + new StringBuilder(s_str).reverse().toString();
            char c = (char) s_str.charAt(0);
            int p = U.indexOf(c);
            int minindex = p;
            p += 1;
            while (p <= N) {
                if (U.charAt(p) == c) {
                    if (check_normal_dict(U, minindex, p)) {
                        minindex = p;
                    }
                }
                p += 1;
            }
            return U.substring(minindex, minindex + N);
        }

        String check_normal_dict(String u, int pointer1, int pointer2) {
            for (int i = 0; i < N; i++) {
                if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                    return u.substring(0, N);
                } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                    return "";
                }
            }
            return u.substring(0, N);
        }

        String S = get_last_dict(S, N);

        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == S.charAt(0)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count * (int) Math.pow(2, K - 1) >= N) {
                System.out.println((char) S.charAt(0) * N);
            } else {
                String result = S.charAt(0)