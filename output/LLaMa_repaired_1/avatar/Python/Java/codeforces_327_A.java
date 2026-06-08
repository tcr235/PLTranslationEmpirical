import java.util.Arrays;
import java.util.Scanner;

public class codeforces_327_A {
    public static int[] find(String s, char ch) {
        int[] indices = new int[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indices[count++] = i;
            }
        }
        return Arrays.copyOf(indices, count);
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
                Arrays.sort(indices);
                for (int i = 0; i < indices.length - 2; i++) {
                    for (int j = i + 1; j < indices.length - 1; j++) {
                        for (int k = j + 1; k < indices.length; k++) {
                            int dist1 = Math.abs(indices[i] - indices[j]);
                            int dist2 = Math.abs(indices[j] - indices[k]);
                            if (dist1 > 0 && dist2 > 0) {
                                maximum = Math.max(maximum, 2 + 2 * (dist1 - 1) - (dist1 - 1) + 2 * (dist2 - 1) - (dist2 - 1));
                            } else if (dist1 > 0) {
                                maximum = Math.max(maximum, 2 + 2 * (dist1 - 1) - (dist1 - 1));
                            } else if (dist2 > 0) {
                                maximum = Math.max(maximum, 2 + 2 * (dist2 - 1) - (dist2 - 1));
                            }
                        }
                    }
                }
                System.out.println(s.chars().filter(c -> c == '1').count() + maximum);
            }
        }
    }
}