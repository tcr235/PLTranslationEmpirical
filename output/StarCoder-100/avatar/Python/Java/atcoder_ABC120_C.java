import java.util.*;
import java.io.*;
public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        if (s.length() == 1) {
            System.out.println(0);
            return;
        }
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i : map.values()) {
            min = Math.min(min, i);
        }
        ans = min * 2;
        System.out.println(ans);
    }
}

