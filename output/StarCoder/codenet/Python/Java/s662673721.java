import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        input.close();

        long ans = (long) Math.pow(10, 18);

        for (long i = 1; i <= Math.sqrt(n) + 1; i++) {
            if (n % i != 0) {
                continue;
            }
            long j = n / i;
            ans = Math.min(ans, i + j - 2);
        }

        System.out.println(ans);
    }
}