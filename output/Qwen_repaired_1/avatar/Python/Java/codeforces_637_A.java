import java.util.*;
import java.io.*;

public class codeforces_637_A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] items = reader.readLine().split(" ");
        Map<String, Integer> counts = new HashMap<>();
        for (String item : items) {
            counts.put(item, counts.getOrDefault(item, 0) + 1);
        }
        List<String> sortedItems = Arrays.asList(items);
        sortedItems.sort(null);
        String result = "";
        int maxCount = -1;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == counts.values().stream().max(Integer::compare).orElse(-1)) {
                int index = sortedItems.indexOf(entry.getKey());
                if (index > maxCount) {
                    result = entry.getKey();
                    maxCount = index;
                }
            }
        }
        System.out.println(result);
    }
}