import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(scanner.nextLine());
        }
        
        Map<String, Integer> c = new HashMap<>();
        for (String word : ls) {
            c.put(word, c.getOrDefault(word, 0) + 1);
        }
        
        int count = Collections.max(c.values());
        Set<String> ans = new TreeSet<>();
        for (Map.Entry<String, Integer> entry : c.entrySet()) {
            if (entry.getValue() == count) {
                ans.add(entry.getKey());
            } else {
                break;
            }
        }
        
        for (String i : ans) {
            System.out.println(i);
        }
    }
}