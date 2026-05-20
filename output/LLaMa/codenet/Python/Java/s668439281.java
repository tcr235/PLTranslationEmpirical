import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ls = new String[n];

        for (int i = 0; i < n; i++) {
            ls[i] = sc.next();
        }

        Map<String, Integer> c = new HashMap<>();
        for (String s : ls) {
            c.put(s, c.getOrDefault(s, 0) + 1);
        }

        int maxCount = Math.max(c.values().stream().max(Integer::compare).get(), 1);
        List<String> ans = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : c.entrySet()) {
            if (entry.getValue() == maxCount) {
                ans.add(entry.getKey());
            } else {
                break;
            }
        }

        Collections.sort(ans);
        for (String s : ans) {
            System.out.println(s);
        }
    }
}