import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s += 1;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        int[] numbers = { l, r, first, second };
        for (int i : numbers) {
            if (i >= l && i <= r) {
                String numStr = Integer.toString(i);
                StringBuilder reversed = new StringBuilder();
                for (char c : numStr.toCharArray()) {
                    reversed.append(9 - Character.getNumericValue(c));
                }
                int revInt = Integer.parseInt(reversed.toString());
                ans = Math.max(ans, revInt * i);
            }
        }
        System.out.println(ans);
    }
}