import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int[] p = new int[N];

        for (int i = 0; i < N; i++) {
            p[i] = scanner.nextInt();
        }

        Arrays.sort(p);

        HashMap<Integer, Integer> candidates = new HashMap<>();
        for (int i = -1; i < 102; i++) {
            if (binarySearch(p, i) != -1) continue;

            if (!candidates.containsKey(Math.abs(X - i))) {
                candidates.put(Math.abs(X - i), i);
            } else {
                candidates.put(Math.abs(X - i), getMinIndex(candidates.get(Math.abs(X - i)), i));
            }
        }

        int smallest = Collections.min(candidates.keySet());
        int minNum = candidates.get(smallest);

        System.out.println(minNum);
    }

    public static int binarySearch(int[] a, int x) {
        int l = 0;
        int r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] < x) {
                l = m + 1;
            } else if (a[m] > x) {
                r = m;
            } else {
                return m;
            }
        }
        return l;
    }

    public static int getMinIndex(int a, int b) {
        return a < b ? a : b;
    }
}