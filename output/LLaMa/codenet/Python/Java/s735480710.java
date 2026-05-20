import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] a = scanner.nextLine().split(" ");
        String[] b = new String[n];

        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                b[i] = (i % 2 == 0) ? a[i / 2] : a[(n - 1 - i) / 2];
            }
        } else {
            for (int i = 0; i < n; i++) {
                b[i] = (i % 2 == 0) ? a[i / 2] : a[(n - 1 - i) / 2];
            }
            int lastIndex = b.length - 1;
            String temp = b[lastIndex];
            b[lastIndex] = b[0];
            b[0] = temp;
        }

        for (String str : b) {
            System.out.print(str + " ");
        }
    }
}