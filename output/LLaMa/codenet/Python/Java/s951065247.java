import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int[] l = new int[N];
        for (int i = 0; i < N; i++) {
            l[i] = scanner.nextInt();
        }

        System.out.println(dfs(0, 0, 0, 0, l));
    }

    public static int dfs(int cur, int a, int b, int c, int[] l) {
        if (cur == l.length) {
            return Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) - 30;
        }
        if (min(a, b, c) > 0) {
            return 10_000_000_000;
        }

        int no_add = dfs(cur + 1, a, b, c, l);
        int add_a = dfs(cur + 1, a + l[cur], b, c, l) + 10;
        int add_b = dfs(cur + 1, a, b + l[cur], c, l) + 10;
        int add_c = dfs(cur + 1, a, b, c + l[cur], l) + 10;

        return Math.min(no_add, add_a, add_b, add_c);
    }

    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}