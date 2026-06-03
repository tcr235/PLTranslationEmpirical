import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        Set<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        boolean ans = set.size() == 3 && set.contains('7') && set.contains('5') && set.contains('3');
        int count = ans ? 1 : 0;
        for (char c : "753".toCharArray()) {
            count += aaa(String.valueOf(num) + c, limit);
        }
        return count;
    }
}