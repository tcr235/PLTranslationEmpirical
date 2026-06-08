import java.util.*;

public class codeforces_462_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        Arrays.sort(count);

        int res = 0;
        for (int i = 25; i >= 0 && count[i] > 0; i--) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                return;
            }
            int tempK = Math.min(k, count[i]);
            k -= tempK;
            res += tempK * tempK;
        }

        System.out.println(res);
    }
}