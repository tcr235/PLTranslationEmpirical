public class atcoder_AGC024_B {
    public static void main(String[] args) {
        int N = Integer.parseInt(sc.nextLine());
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(sc.nextLine());
        }
        editorial(N, P);
    }

    public static void editorial(int N, int[] P) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] a = new int[N + 1];
        for (int i = 0; i < N; i++) {
            a[P[i]] = i;
        }
        int maxLen = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                maxLen = Math.max(maxLen, 1 + a[i]);
            } else {
                maxLen = 1;
            }
        }
        int ans = N - maxLen;
        System.out.println(ans);
    }

    public static void WA(int N, int[] P) {
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || P[i - 1] + 1 == P[i]) {
                ans++;
            } else {
                ans = Math.max(ans, 1 + ans);
            }
        }
        System.out.println(N - ans);
    }
}


