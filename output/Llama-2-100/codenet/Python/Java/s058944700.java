import java.util.Scanner;

public class s058944700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n > k) {
            int tmp = n % k;
            if (tmp >= k - tmp) {
                int ans = k - tmp;
            } else {
                int ans = tmp;
            }
        } else if (n < k) {
            if (n >= k - n) {
                int ans = k - n;
            } else {
                int ans = n;
            }
        } else {
            int ans = 0;
        }

        System.out.println(ans);
    }
}
