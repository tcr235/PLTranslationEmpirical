import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] s = {1, 2, 4, 8, 16, 32, 64};
        int ans = 0;
        
        for (int i = 1; i <= N; i++) {
            boolean found = false;
            for (int num : s) {
                if (i == num) {
                    found = true;
                    break;
                }
            }
            if (found) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}