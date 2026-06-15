public class s951065247 {
    public static int dfs(int cur, int a, int b, int c) {
        if (cur == N) {
            return Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) - 30;
        }
        int noAdd = dfs(cur + 1, a, b, c);
        int addA = dfs(cur + 1, a + l[cur], b, c) + 10;
        int addB = dfs(cur + 1, a, b + l[cur], c) + 10;
        int addC = dfs(cur + 1, a, b, c + l[cur]) + 10;

        return Math.min(noAdd, addA, addB, addC);
    }

    public static int solve() {
        int N, A, B, C;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        int[] l = new int[N];
        for (int i = 0; i < N; i++) {
            l[i] = scanner.nextInt();
        }

        return dfs(0, 0, 0, 0);
    }
}

