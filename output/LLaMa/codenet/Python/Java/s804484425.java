import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<int[]> info = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            info.add(new int[]{scanner.nextInt(), scanner.nextInt()});
        }

        Collections.sort(info, (a, b) -> Integer.compare(b[1], a[1]));

        int[] selected = new int[Math.min(k, n)];
        System.arraycopy(info.get(0, k).get(0), 0, selected, 0, k);

        Set<Integer> memo = new HashSet<>();
        List<Integer> selected_count = new ArrayList<>();
        List<Integer> selected_sum = new ArrayList<>();
        List<Integer> unselected_count = new ArrayList<>();

        for (int[] t : info.get(0, k)) {
            if (!memo.add(t[0])) {
                unselected_count.add(t[1]);
            } else {
                selected_count.add(t[1]);
                selected_sum.add(t[1]);
            }
        }

        for (int i = k; i < n; i++) {
            int[] t = info.get(i);
            if (!memo.add(t[0])) {
                unselected_count.add(t[1]);
            }
        }

        int sum_select = 0;
        for (int i : selected_sum) {
            sum_select += i;
        }

        int ans = selected_count.size() * selected_count.size() + sum_select;

        for (int i = 0; i < Math.min(unselected_count.size(), selected_sum.size()); i++) {
            int temp = selected_count.size() + 1;
            sum_select += unselected_count.get(unselected_count.size() - 1);
            sum_select -= selected_sum.get(selected_sum.size() - 1);
            unselected_count.remove(unselected_count.size() - 1);
            selected_sum.remove(selected_sum.size() - 1);
            temp *= temp;
            temp += sum_select;
            ans = Math.max(ans, temp);
        }

        System.out.println(ans);
    }
}