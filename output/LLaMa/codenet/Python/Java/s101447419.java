import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < n / 2; i++) {
            even.add(v[2 * i]);
            odd.add(v[2 * i + 1]);
        }
        Map<Integer, Integer> ce = new HashMap<>();
        Map<Integer, Integer> co = new HashMap<>();
        for (int i : even) {
            ce.put(i, ce.getOrDefault(i, 0) + 1);
        }
        for (int i : odd) {
            co.put(i, co.getOrDefault(i, 0) + 1);
        }
        int ans = n;
        if (!ce.keySet().equals(co.keySet())) {
            ans = n - ce.values().stream().max(Integer::compare).get() - co.values().stream().max(Integer::compare).get();
        } else if (ce.size() == 1 && co.size() == 1) {
            ans = n - ce.values().stream().max(Integer::compare).get();
        } else if (ce.size() == 1) {
            ans = n - ce.values().stream().max(Integer::compare).get() - co.values().stream().stream().skip(1).max(Integer::compare).get();
        } else if (co.size() == 1) {
            ans = n - ce.values().stream().stream().skip(1).max(Integer::compare).get() - co.values().stream().max(Integer::compare).get();
        } else {
            int max1 = ce.values().stream().max(Integer::compare).get();
            int max2 = co.values().stream().max(Integer::compare).get();
            ans = Math.min(n - max1 - co.values().stream().stream().skip(1).max(Integer::compare).get(), n - max2 - ce.values().stream().stream().skip(1).max(Integer::compare).get());
        }
        System.out.println(ans);
    }
}