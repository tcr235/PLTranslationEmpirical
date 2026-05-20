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
        System.out.println(dfs(0, 0, 0, 0, A, B, C));
    }

    private static int dfs(int cur, int a, int b, int c, int A, int B, int C) {
        if (cur == A)
            return Math.abs(B - b) + Math.abs(C - c) - 30;
        if (cur==B)
            return Math.abs(A- a) + Math.abs(B - b) - 30;
        if (cur==C)
        return Math.abs(A-a)+Math.abs(B-b)-30;
        else {
            int no_add = dfs(curr + 1, a, b, c, A, B, C); 
            int add_a = dfs(curr + 1, a + l[curr], b, c, A, B, C) + 10;
            int add_b = dfs(curr + 1, a, b + l[curr], c, A, B, C) + 10;
            int add_c = dfs(curr + 1, a, b, c + l[curr], A, B, C) + 10;
            return Math.min(Math.min(Math.min(no_add, add_a), add_b), add_c);
        }
    }
}