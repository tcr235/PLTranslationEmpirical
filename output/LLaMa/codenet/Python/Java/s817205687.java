import java.util.Scanner;

public class s817205687 {
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }

    public static int LCMList(int[] numbers) {
        int result = 1;
        for (int n : numbers) {
            result = LCM(result, n);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Aã®è¦ç´ ã¯åå¥ã¯1ã«ãªã£ãã¨ã
        for (int i = 0; i < N; i++) {
            while (A[i] % 2 == 0) {
                A[i] /= 2;
            }
        }

        // Aåå¥ã«ãã£ãã¦ããã¨ã
        int count_div_2 = A[0];
        for (int i = 1; i < N; i++) {
            if (count_div_2 != A[i]) {
                System.out.println(0);
                return;
            }
        }

        // Aåå¥ã«ãã£ã¿ã¦ããã¨ã
        int my_lcm = LCMList(A);
        if (my_lcm > M) {
            System.out.println(0);
            return;
        }

        int tmp = M / my_lcm;
        if (tmp % 2 == 1) {
            tmp++;
        }
        System.out.println(tmp / 2);
    }
}