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

        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            int count_div_2 = 0;
            int a = A[i];
            while (a % 2 == 0) {
                a /= 2;
                count_div_2++;
            }
            temp[i] = count_div_2;
        }

        boolean flag = true;
        int count_div_2 = temp[0];
        for (int i = 1; i < N; i++) {
            if (count_div_2 != temp[i]) {
                System.out.println(0);
                flag = false;
                break;
            }
        }

        if (!flag) {
            return;
        }

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