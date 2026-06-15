import java.util.*;

public class s534639230 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }

        if (D[0]!= 0) {
            System.out.println(0);
            return;
        }

        int[] cnt = new int[1000001];
        for (int i = 0; i < N; i++) {
            cnt[D[i]]++;
        }

        if (cnt[0] > 1) {
            System.out.println(0);
            return;
        }

        int res = 1;
        for (int i = 1; i <= 1000000; i++) {
            if (cnt[i - 1] == 1) {
                continue;
            }
            res *= cnt[i - 1] * cnt[i] % 998244353;
            res %= 998244353;
        }
        System.out.println(res);
    }
}
