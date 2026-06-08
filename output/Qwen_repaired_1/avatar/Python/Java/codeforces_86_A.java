import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        long curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        long first = (long) Math.pow(10, s);
        long second = first / 2;
        long ans = -1;
        long[] numbers = { l, r, first, second };
        for (long i : numbers) {
            if (i >= l && i <= r) {
                String numStr = Long.toString(i);
                StringBuilder reversed = new StringBuilder();
                for (char c : numStr.toCharArray()) {
                    reversed.append(9 - Character.getNumericValue(c));
                }
                long revLong = Long.parseLong(reversed.toString());
                ans = Math.max(ans, revLong * i);
            }
        }
        System.out.println(ans);
    }
}