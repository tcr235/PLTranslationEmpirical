import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt() / 2);
        }

        int countDiv2 = -1;
        for (int a : A) {
            int cnt = 0;
            while (a % 2 == 0) {
                a /= 2;
                cnt++;
            }
            if (countDiv2 == -1) {
                countDiv2 = cnt;
            } else if (cnt != countDiv2) {
                System.out.println(0);
                return;
            }
        }

        int result = A.stream().reduce(1, (x, y) -> x * y / gcd(x, y));
        if (result > M) {
            System.out.println(0);
            return;
        }

        int tmp = M / result;
        int ans = (tmp + 1) / 2;
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}