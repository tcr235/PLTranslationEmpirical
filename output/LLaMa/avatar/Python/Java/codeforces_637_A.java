import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] s = br.readLine().trim().substring(0, br.readLine().trim().length() - 1).split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String i : s) {
            w.put(i, w.getOrDefault(i, 0) + 1);
        }
        String[] s2 = new String[s.length];
        for (int i = s.length - 1; i >= 0; i--) {
            s2[s.length - 1 - i] = s[i];
        }
        int c = -1;
        String a = "";
        for (Map.Entry<String, Integer> entry : w.entrySet()) {
            if (entry.getValue() == Collections.max(w.values())) {
                int index = -1;
                for (int i = 0; i < s2.length; i++) {
                    if (s2[i].equals(entry.getKey())) {
                        index = i;
                        break;
                    }
                }
                if (index > c) {
                    c = index;
                    a = entry.getKey();
                }
            }
        }
        System.out.println(a);
    }
}