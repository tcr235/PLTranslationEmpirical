import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String input = scanner.next();
        char[] a = input.toCharArray();
        int[] c = new int[n];

        c[0] = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] == 'C' && a[i - 1] == 'A') {
                c[i] = c[i - 1] + 1;
            } else {
                c[i] = c[i - 1];
            }
        }

        for (int w = 0; w < k; w++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(c[r - 1] - c[l - 1]);
        }
    }
}