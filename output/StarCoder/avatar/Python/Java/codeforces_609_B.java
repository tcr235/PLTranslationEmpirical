import java.util.HashMap;
import java.util.Map;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            int count = map.get(lst[i]);
            if (count > 1) {
                result += (long) (n - i - count);
                map.put(lst[i], count - 1);
            } else {
                result += (long) (n - i - 1);
            }
        }
        System.out.println(result);
    }
}