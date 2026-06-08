import java.util.*;
import java.lang.Collections;

public class s668439281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        Map<String, Integer> c = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            c.put(word, c.getOrDefault(word, 0) + 1);
        }

        int count = Collections.max(c.values());
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : c.entrySet()) {
            if (entry.getValue() == count) {
                ans.add(entry.getKey());
            } else {
                break;
            }
        }

        Collections.sort(ans);
        for (String i : ans) {
            System.out.println(i);
        }
    }
}