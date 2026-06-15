import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        for (int i = 0; i < int(scanner.nextLine().trim().split(" ")[0]); i++) {
            String x = scanner.nextLine().trim().split(" ")[1];
            int a = Integer.parseInt(scanner.nextLine().trim());
            int b = Integer.parseInt(scanner.nextLine().trim()) + 1;
            if (x.equals("M")) {
                m[a] += 2;
                m[b] -= 2;
            } else {
                f[a] += 2;
                f[b] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < N; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}
