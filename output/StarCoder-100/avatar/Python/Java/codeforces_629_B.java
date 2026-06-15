import java.util.*;
public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        for (int i = 0; i < sc.nextInt(); i++) {
            String[] s = sc.next().split(" ");
            if (s[0].equals("M")) {
                m[Integer.parseInt(s[1])] += 2;
                m[Integer.parseInt(s[2]) + 1] -= 2;
            } else {
                f[Integer.parseInt(s[1])] += 2;
                f[Integer.parseInt(s[2]) + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < N; i++) {
            a += m[i];
            b += f[i];
            c = Math.min(a, b) > c? Math.min(a, b) : c;
        }
        System.out.println(c);
    }
}

