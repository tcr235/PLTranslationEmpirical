import java.util.*;

public class codeforces_327_A {
    public static int[] find(String s, char ch) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indices.add(i);
            }
        }
        return indices.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        String s = scanner.nextLine().replace("", "");
        scanner.close();

        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            int[] indices = find(s, '0');
            if (indices.length == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < indices.length; i++) {
                    for (int j = i + 1; j < indices.length; j++) {
                        int dist = Math.abs(indices[i] - indices[j]);
                        maximum = Math.max(maximum, 2 + 2 * (dist - 1) - (Math.abs(dist) - 1));
                    }
                }
                System.out.println(s.chars().filter(c -> c == '1').count() + maximum);
            }
        }
    }
}