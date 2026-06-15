import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class s668439281 {
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(sc.nextLine());
        }
        Map<String, Integer> c = new HashMap<>();
        for (String s : ls) {
            int count = 1;
            for (Map.Entry<String, Integer> entry : c.entrySet()) {
                if (entry.getValue() == count) {
                    count++;
                    break;
                }
            }
            c.put(s, count);
        }
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : c.entrySet()) {
            if (entry.getValue() == c.values().stream().mapToInt(Integer::intValue).max()) {
                ans.add(entry.getKey());
            }
        }
        Collections.sort(ans);
        for (String s : ans) {
            System.out.print(s + " ");
        }
    }
}
