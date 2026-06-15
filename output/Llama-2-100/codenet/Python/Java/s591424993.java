public class s591424993 {
    public static void solve(int d, int g) {
        List<List<Integer>> pc = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(input().splitAsInt());
            pc.add(temp);
        }

        int ans = Float.MAX_VALUE;

        for (int bit = 0; bit < (1 << d); bit++) {
            int count = 0;
            int sum = 0;
            Set<Integer> nokori = new HashSet<>();

            for (int i = 0; i < d; i++) {
                if ((bit & (1 << i)) != 0) {
                    sum += pc[i].get(0) * (i + 1) * 100 + pc[i].get(1);
                    count += pc[i].get(0);
                    nokori.add(i + 1);
                }
            }

            if (sum < g) {
                int use = Collections.max(nokori);
                int n = Math.min(pc[use - 1].get(0), -((g - sum) / (use * 100)));
                count += n;
                sum += n * use * 100;
            }

            if (sum >= g) {
                ans = Math.min(ans, count);
            }
        }

        System.out.println(ans);
    }
}


