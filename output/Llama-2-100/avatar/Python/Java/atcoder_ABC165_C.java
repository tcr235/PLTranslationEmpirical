import java.util.Scanner;
public class atcoder_ABC165_C {
    public static void solve(int N, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d) {
        int res = 0;
        rec(new int[N]);
        System.out.println(res);
    }
    public static void rec(int[] A) {
        int lastMax = 1;
        for (int i = 1; i <= M; i++) {
            if (A[b[i] - 1] - A[a[i] - 1] == c[i]) {
                res += d[i];
            }
            lastMax = Math.max(lastMax, A[i]);
        }
        for (int i = lastMax; i <= M + 1; i++) {
            rec(A + new int[] {i});
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            a.add(scanner.nextInt());
            b.add(scanner.nextInt());
            c.add(scanner.nextInt());
            d.add(scanner.nextInt());
        }
        solve(N, M, Q, a, b, c, d);
    }
}


