import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String s = scanner.nextLine();
        Map<Character, Integer> c = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        
        System.out.println(c.getOrDefault('R', 0) > n - c.getOrDefault('R', 0) ? "Yes" : "No");
    }
}