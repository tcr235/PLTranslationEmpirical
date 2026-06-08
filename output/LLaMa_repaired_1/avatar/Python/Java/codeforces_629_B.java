import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        int i = scanner.nextInt();
        while (scanner.hasNextInt()) {
            int[] input = new int[3];
            for (int j = 0; j < 3; j++) {
                input[j] = scanner.nextInt();
            }
            int x = input[0];
            int a = input[1] - 1;
            int b = input[2];
            if (x == 1) {
                m[a] += 2;
                m[b] -= 2;
            } else {
                f[a] += 2;
                f[b] -= 2;
            }
        }
        int c = 0;
        for (int j = 0; j < N; j++) {
            c = Math.min(Math.min(c, m[j]) + f[j], Math.min(c, f[j]) + m[j]);
        }
        System.out.println(c);
    }
}