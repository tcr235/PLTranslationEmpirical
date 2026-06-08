```java
import java.util.*;

public class s101447419 {
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
            ans = n - Arrays.stream(ce.values().toArray()).max().getAsInt() - Arrays.stream(co.values().toArray()).max().getAsInt();
        } else if (ce.size() == 1 && co.size() == 1) {
            ans = n - Arrays.stream(ce.values().toArray()).max().getAsInt();
        } else if (ce.size() == 1) {
            ans = n - Arrays.stream(ce.values().toArray()).max().getAsInt() - getSecondMax(co.values().toArray());
        } else if (co.size() == 1) {
            ans = n - getSecondMax(ce.values().toArray()) - Arrays.stream(co.values().toArray()).max().getAsInt();
        } else {
            int max1 = Arrays.stream(ce.values().toArray()).max().getAsInt();
            int max2 = getSecondMax(ce.values().toArray());
            int coMax1 = Arrays.stream(co.values().toArray()).max().getAsInt();
            int coMax2 = getSecondMax(co.values().toArray());
            ans = Math.min(n - max1 - coMax2, n - coMax1 - max2);
        }
        System.out.println(ans);
    }

    public static int getSecondMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num :