import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_327_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next().replaceAll("", "");
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = find(s, '0');
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (List<Integer> comb : Collections.combinations(indices, 2)) {
                    maximum = Math.max(maximum, 2 + 2 * (Math.abs(comb.get(0) - comb.get(1)) - 1));
                }
                System.out.println(s.chars().filter(c -> c == '1').count() + maximum);
            }
        }
    }

    public static List<Integer> find(String s, char ch) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indices.add(i);
            }
        }
        return indices;
    }
}