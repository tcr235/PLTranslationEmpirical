import java.util.Scanner;

public class atcoder_ABC174_E {
    public static boolean check(int[] lis, int k, int mid) {
        int count = 0;
        for (int i : lis) {
            if (i % mid == 0) {
                count += 1;
            }
            count -= (i / mid);
        }
        return count >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = scanner.nextInt();
        }
        int a = 1;
        int b = findMax(lis);
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (check(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}