import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] s = reader.readLine().substring(0, n - 1).split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String item : s) {
            w.put(item, w.getOrDefault(item, 0) + 1);
        }
        Arrays.sort(s);
        String a = "";
        int c = -1;
        for (Map.Entry<String, Integer> entry : w.entrySet()) {
            if (entry.getValue() == Collections.max(w.values())) {
                int index = new ArrayList<>(Arrays.asList(s)).indexOf(entry.getKey());
                if (index > c) {
                    a = entry.getKey();
                    c = index;
                }
            }
        }
        System.out.println(a);
    }
}