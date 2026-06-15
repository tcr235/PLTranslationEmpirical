import java.util.*;
public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int max = 0;
        char c = 'a';
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                c = key;
            }
        }
        System.out.println(c);
    }
}

