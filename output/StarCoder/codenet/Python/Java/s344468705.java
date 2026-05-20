import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(-1 * (int) Math.pow(10, 20));
        for (int i = 0; i < n; i++) {
            int num = -scanner.nextInt();
            if (num >= dp.get(dp.size() - 1)) {
                dp.add(num);
            } else {
                int idx = bisectRight(dp, num);
                dp.set(idx, num);
            }
        }

        System.out.println(dp.size() - 1);
    }

    private static int bisectRight(ArrayList<Integer> list, int x) {
        int lo = 0, hi = list.size();
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (list.get(mid) <= x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}