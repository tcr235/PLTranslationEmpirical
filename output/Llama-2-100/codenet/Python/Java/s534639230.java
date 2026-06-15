public class s534639230 {
    public static void solve() {
        int N = Integer.parseInt(sc.nextLine());
        int[] D = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int mod = 998244353;

        if (D[0] == 0) {
            System.out.println(0);
            return;
        }

        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int current = D[i];
            if (current == 0) {
                continue;
            }
            if (cnt.containsKey(current)) {
                int previous = cnt.get(current);
                int power = previous * current % mod;
                power = (power % mod) % mod;
                cnt.put(current, power);
            } else {
                cnt.put(current, 1);
            }
        }

        int res = 1;
        for (int i = 1; i <= N; i++) {
            if (cnt.containsKey(i)) {
                res *= cnt.get(i) % mod;
                res %= mod;
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        solve();
    }
}
