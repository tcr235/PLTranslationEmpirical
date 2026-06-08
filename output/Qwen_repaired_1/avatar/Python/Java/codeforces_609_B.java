import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String[] inputs = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(inputs[i]);
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            int count = map.get(Integer.parseInt(inputs[i]));
            if (count > 1) {
                result += (long) (n - i - count);
                map.put(Integer.parseInt(inputs[i]), count - 1);
            } else {
                result += (long) (n - i - 1);
            }
        }
        System.out.println(result);
    }
}