import java.util.*;

public class codeforces_637_A {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next();
        s = s.substring(0, s.length() - 1);

        Map<String, Integer> w = new HashMap<>();
        for (String c : s.split(" ")) {
            w.put(c, w.getOrDefault(c, 0) + 1);
        }

        String[] sReverse = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sReverse[s.length() - i - 1] = s.charAt(i) + "";
        }

        int c = -1;
        String a = "";

        int max = Collections.max(w.values());
        for (Map.Entry<String, Integer> entry : w.entrySet()) {
            if (entry.getValue() == max) {
                int index = -1;
                for (int i = 0; i < sReverse.length; i++) {
                    if (sReverse[i].equals(entry.getKey())) {
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