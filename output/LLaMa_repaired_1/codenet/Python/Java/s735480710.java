import java.util.Scanner;

public class s735480710 {
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
                b[i] = (i % 2 == 0) ? a[i / 2] : a[n - 1 - (i + 1) / 2];
            }
            int[] temp = new int[b.length];
            temp = b.clone();
            for (int i = 0; i < b.length; i++) {
                b[i] = temp[(b.length - 1) - i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str : b) {
            sb.append(str + " ");
        }
        System.out.println(sb);
    }
}