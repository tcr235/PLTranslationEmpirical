import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int l = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int digitCount = 0;
        int curr = r;
        while (curr != 0) {
            digitCount++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, digitCount);
        int second = first / 2;
        int ans = -1;
        for (int i : new int[]{l, r, first, second}) {
            if (i >= l && i <= r) {
                StringBuilder reverse = new StringBuilder();
                int num = i;
                while (num != 0) {
                    int digit = num % 10;
                    reverse.append(9 - digit);
                    num /= 10;
                }
                long reversedNum = Long.parseLong(reverse.reverse().toString());
                ans = Math.max(ans, reversedNum * i);
            }
        }
        System.out.println(ans);
    }
}