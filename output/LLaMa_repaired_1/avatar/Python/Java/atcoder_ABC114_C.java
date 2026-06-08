import java.util.HashSet;
import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(aaa("0", N));
    }

    public static int aaa(String n, int limit) {
        int num = Integer.parseInt(n);
        if (num > limit) {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        if (set.size() != 3) return 0;
        for (char c : "753".toCharArray()) {
            if (!set.contains(c)) return 0;
        }
        int ans = 1;
        for (char c : "753".toCharArray()) {
            ans += aaa(String.valueOf(num) + c, limit);
        }
        return ans;
    }
}