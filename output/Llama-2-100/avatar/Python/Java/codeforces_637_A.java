import java.util.Scanner;
public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.nextLine();
        Map<Character, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int count = w.getOrDefault(c, 0) + 1;
            w.put(c, count);
        }
        int c = -1, a = 0;
        for (Map.Entry<Character, Integer> entry : w.entrySet()) {
            if (entry.getValue() == w.values().stream().mapToInt(Integer::intValue).max().orElse(-1)) {
                if (s.indexOf(entry.getKey()) > c) {
                    a = entry.getKey();
                    c = s.indexOf(entry.getKey());
                }
            }
        }
        System.out.println(a);
    }
}
