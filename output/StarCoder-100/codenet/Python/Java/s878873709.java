import java.util.Scanner;

public class s878873709 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i == 1 || i == 2 || i == 4 || i == 8 || i == 16 || i == 32 || i == 64) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
